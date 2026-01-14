package ro.fridge.data.repository

import ro.fridge.data.model.Item
import kotlinx.coroutines.flow.Flow

interface InventoryRepository {
    val items: Flow<List<Item>>

    suspend fun addItem(item: Item)
    suspend fun updateItem(item: Item)
    suspend fun deleteItem(item: Item)
    suspend fun refreshItems()
}
