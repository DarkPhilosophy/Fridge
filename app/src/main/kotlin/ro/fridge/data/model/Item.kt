package ro.fridge.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "items")
data class Item(
    @PrimaryKey
    val id: String = UUID.randomUUID().toString(),
    val name: String = "",
    val quantity: Int = 1,
    val expirationDate: String = "", // Format: YYYY-MM-DD
    val description: String = "",
    val timestamp: Long = System.currentTimeMillis()
)
