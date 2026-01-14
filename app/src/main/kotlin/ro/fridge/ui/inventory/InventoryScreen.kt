package ro.fridge.ui.inventory


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import ro.fridge.data.model.Item
import ro.fridge.ui.theme.Error

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InventoryScreen(
    onNavigateToDetail: (String?) -> Unit,
    viewModel: InventoryViewModel = hiltViewModel()
) {
    val items by viewModel.items.collectAsState()
    val searchQuery by viewModel.searchQuery.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("My Fridge") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary
                )
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { onNavigateToDetail(null) }) {
                Icon(Icons.Default.Add, contentDescription = "Add Item")
            }
        }
    ) { padding ->
        Column(modifier = Modifier.padding(padding)) {
            OutlinedTextField(
                value = searchQuery,
                onValueChange = { viewModel.onSearchQueryChanged(it) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                placeholder = { Text("Search items...") }
            )

            LazyColumn(
                contentPadding = PaddingValues(bottom = 80.dp)
            ) {
                items(items) { uiState ->
                    InventoryItemRow(
                        item = uiState.item,
                        daysLeft = uiState.daysLeft,
                        onItemClick = { onNavigateToDetail(uiState.item.id) },
                        onDeleteClick = { viewModel.deleteItem(uiState.item) }
                    )
                }
            }
        }
    }
}

@Composable
fun InventoryItemRow(
    item: Item,
    daysLeft: Long,
    onItemClick: () -> Unit,
    onDeleteClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .clickable(onClick = onItemClick),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(text = item.name, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
                if (item.description.isNotEmpty()) {
                    Text(text = item.description, style = MaterialTheme.typography.bodySmall)
                }
                Text(text = "Qty: ${item.quantity}", style = MaterialTheme.typography.bodyMedium)
            }
            
            Column(horizontalAlignment = Alignment.End) {
                val color = when {
                    daysLeft < 0 -> Error
                    daysLeft <= 3 -> Color(0xFFFFA000) // Orange
                    else -> Color(0xFF388E3C) // Green
                }
                Text(
                    text = if (daysLeft == Long.MAX_VALUE) "" else "$daysLeft days",
                    color = color,
                    fontWeight = FontWeight.Bold
                )
                IconButton(onClick = onDeleteClick) {
                    Icon(Icons.Default.Delete, contentDescription = "Delete", tint = Color.Gray)
                }
            }
        }
    }
}
