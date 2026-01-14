package ro.fridge.ui.inventory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ro.fridge.data.model.Item
import ro.fridge.data.repository.InventoryRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import javax.inject.Inject

@HiltViewModel
class InventoryViewModel @Inject constructor(
    private val repository: InventoryRepository
) : ViewModel() {

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery

    val items: StateFlow<List<ItemUiState>> = combine(repository.items, _searchQuery) { items, query ->
        items.filter {
            it.name.contains(query, ignoreCase = true) || it.description.contains(query, ignoreCase = true)
        }.map { item ->
            ItemUiState(item, calculateDaysLeft(item.expirationDate))
        }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    fun onSearchQueryChanged(query: String) {
        _searchQuery.value = query
    }

    fun deleteItem(item: Item) {
        viewModelScope.launch {
            repository.deleteItem(item)
        }
    }
    
    fun refresh() {
        viewModelScope.launch {
            repository.refreshItems()
        }
    }

    private fun calculateDaysLeft(expirationDate: String): Long {
        if (expirationDate.isEmpty()) return Long.MAX_VALUE
        return try {
            val formatter = DateTimeFormatter.ISO_LOCAL_DATE
            val exp = LocalDate.parse(expirationDate, formatter)
            val today = LocalDate.now()
            ChronoUnit.DAYS.between(today, exp)
        } catch (e: Exception) {
            Long.MAX_VALUE
        }
    }
}

data class ItemUiState(
    val item: Item,
    val daysLeft: Long
)
