package ro.fridge.ui.item

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ro.fridge.data.model.Item
import ro.fridge.data.repository.InventoryRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ItemDetailViewModel @Inject constructor(
    private val repository: InventoryRepository,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val itemId: String? = savedStateHandle["itemId"]

    private val _uiState = MutableStateFlow(ItemUiState())
    val uiState: StateFlow<ItemUiState> = _uiState

    init {
        if (itemId != null) {
            // Load item logic. For flow simplicity, we might need a getItem in repo or filter from cache.
            // Since repo.items is a Flow<List<Item>>, we can just observer that.
            // Or add getItem(id) to repo.
            // For now, let's just use default empty info if id is null, or dummy functionality if id exists but we rely on list.
            // Ideally Repo should have getItem.
            viewModelScope.launch {
                 repository.items.collect { list ->
                     val item = list.find { it.id == itemId }
                     if (item != null) {
                         _uiState.value = ItemUiState(
                             name = item.name,
                             quantity = item.quantity.toString(),
                             expirationDate = item.expirationDate,
                             description = item.description,
                             id = item.id
                         )
                     }
                 }
            }
        }
    }

    fun saveItem() {
        val state = _uiState.value
        if (state.name.isBlank()) return // validation

        val item = Item(
            id = state.id ?: java.util.UUID.randomUUID().toString(),
            name = state.name,
            quantity = state.quantity.toIntOrNull() ?: 1,
            expirationDate = state.expirationDate,
            description = state.description
        )

        viewModelScope.launch {
            if (state.id == null) {
                repository.addItem(item)
            } else {
                repository.updateItem(item)
            }
        }
    }

    fun updateName(name: String) { _uiState.value = _uiState.value.copy(name = name) }
    fun updateQuantity(qty: String) { _uiState.value = _uiState.value.copy(quantity = qty) }
    fun updateDate(date: String) { _uiState.value = _uiState.value.copy(expirationDate = date) }
    fun updateDescription(desc: String) { _uiState.value = _uiState.value.copy(description = desc) }
}

data class ItemUiState(
    val id: String? = null,
    val name: String = "",
    val quantity: String = "1",
    val expirationDate: String = "",
    val description: String = ""
)
