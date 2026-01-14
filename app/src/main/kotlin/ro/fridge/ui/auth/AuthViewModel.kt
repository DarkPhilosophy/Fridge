package ro.fridge.ui.auth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val firebaseAuth: FirebaseAuth
) : ViewModel() {

    private val _authState = MutableStateFlow<AuthState>(AuthState.Loading)
    val authState: StateFlow<AuthState> = _authState

    init {
        checkUser()
    }

    private fun checkUser() {
        if (firebaseAuth.currentUser != null) {
            _authState.value = AuthState.Authenticated
        } else {
            _authState.value = AuthState.Unauthenticated
        }
    }

    fun signIn(email: String, pass: String) {
        viewModelScope.launch {
            _authState.value = AuthState.Loading
            firebaseAuth.signInWithEmailAndPassword(email, pass)
                .addOnSuccessListener {
                    _authState.value = AuthState.Authenticated
                }
                .addOnFailureListener {
                    _authState.value = AuthState.Error(it.message ?: "Login Failed")
                }
        }
    }

    fun signUp(email: String, pass: String) {
        viewModelScope.launch {
            _authState.value = AuthState.Loading
            firebaseAuth.createUserWithEmailAndPassword(email, pass)
                .addOnSuccessListener {
                    _authState.value = AuthState.Authenticated
                }
                .addOnFailureListener {
                    _authState.value = AuthState.Error(it.message ?: "Sign Up Failed")
                }
        }
    }

    fun signOut() {
        firebaseAuth.signOut()
        _authState.value = AuthState.Unauthenticated
    }
}

sealed class AuthState {
    object Loading : AuthState()
    object Authenticated : AuthState()
    object Unauthenticated : AuthState()
    data class Error(val message: String) : AuthState()
}
