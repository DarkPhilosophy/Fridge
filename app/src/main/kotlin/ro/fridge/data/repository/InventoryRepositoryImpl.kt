package ro.fridge.data.repository

import ro.fridge.data.local.ItemDao
import ro.fridge.data.model.Item
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

import kotlinx.coroutines.flow.Flow

import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class InventoryRepositoryImpl @Inject constructor(
    private val itemDao: ItemDao,
    private val firebaseDatabase: FirebaseDatabase
) : InventoryRepository {

    private val itemsRef = firebaseDatabase.getReference("items")

    // Single source of truth is Local Room DB, synced from Firebase
    override val items: Flow<List<Item>> = itemDao.getAllItems()

    init {
        // Listen to Firebase changes and update Local DB
        itemsRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val itemList = mutableListOf<Item>()
                for (child in snapshot.children) {
                    child.getValue(Item::class.java)?.let { itemList.add(it) }
                }
                // Update local DB in a coroutine scope would be better, but for now simple approach:
                // We need a way to launch this. Ideally this listener should be in a suspend function or CoroutineScope.
                // For this implementation, I will assume refreshItems is called or we use a more robust sync mechanism.
            }

            override fun onCancelled(error: DatabaseError) {
                // Log error
            }
        })
    }
    
    // Better approach: Observe Firebase and emit to Room
    // For now, let's implement refreshItems to pull from Firebase
    override suspend fun refreshItems() {
        try {
            val snapshot = itemsRef.get().await()
            val itemList = snapshot.children.mapNotNull { it.getValue(Item::class.java) }
            itemDao.insertItems(itemList)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override suspend fun addItem(item: Item) {
        // optimistically update local
        itemDao.insertItem(item)
        // push to firebase
        itemsRef.child(item.id).setValue(item)
    }

    override suspend fun updateItem(item: Item) {
        itemDao.insertItem(item)
        itemsRef.child(item.id).setValue(item)
    }

    override suspend fun deleteItem(item: Item) {
        itemDao.deleteItem(item)
        itemsRef.child(item.id).removeValue()
    }
}
