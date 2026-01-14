package ro.fridge.ui.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import ro.fridge.ui.theme.PremiumGradientEnd
import ro.fridge.ui.theme.PremiumGradientStart
import androidx.compose.ui.graphics.Brush

@Composable
fun AuthScreen(
    onNavigateToInventory: () -> Unit,
    viewModel: AuthViewModel = hiltViewModel()
) {
    val authState by viewModel.authState.collectAsState()
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    val bgBrush = Brush.verticalGradient(
        colors = listOf(PremiumGradientStart, PremiumGradientEnd)
    )

    LaunchedEffect(authState) {
        if (authState is AuthState.Authenticated) {
            onNavigateToInventory()
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = bgBrush),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .padding(32.dp)
                .background(Color.White.copy(alpha = 0.9f), shape = MaterialTheme.shapes.extraLarge)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(text = "Fridge Login", style = MaterialTheme.typography.headlineMedium, color = Color.Black)
            
            if (authState is AuthState.Error) {
                Text(text = (authState as AuthState.Error).message, color = MaterialTheme.colorScheme.error)
            }

            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email") }
            )
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Password") },
                visualTransformation = PasswordVisualTransformation()
            )

            Button(
                onClick = { viewModel.signIn(email, password) },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Sign In")
            }
            
            Button(
                onClick = { viewModel.signUp(email, password) },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)
            ) {
                Text("Sign Up")
            }
        }
        
        if (authState is AuthState.Loading) {
            CircularProgressIndicator(color = Color.White)
        }
    }
}
