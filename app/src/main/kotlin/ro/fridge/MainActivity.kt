package ro.fridge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ro.fridge.ui.theme.FridgeTheme
import ro.fridge.ui.auth.AuthScreen
import ro.fridge.ui.inventory.InventoryScreen
import ro.fridge.ui.item.ItemDetailScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FridgeTheme {
                val navController = rememberNavController()
                
                NavHost(navController = navController, startDestination = "auth") {
                    composable("auth") {
                        AuthScreen(onNavigateToInventory = {
                            navController.navigate("inventory") {
                                popUpTo("auth") { inclusive = true }
                            }
                        })
                    }
                    composable("inventory") {
                        InventoryScreen(onNavigateToDetail = { itemId ->
                            if (itemId != null) {
                                navController.navigate("item/$itemId")
                            } else {
                                navController.navigate("item/new")
                            }
                        })
                    }
                    composable("item/{itemId}") { backStackEntry ->
                        // Pass argument if needed or ViewModel handles SavedStateHandle
                        ItemDetailScreen(onNavigateBack = { navController.popBackStack() })
                    }
                }
            }
        }
    }
}
