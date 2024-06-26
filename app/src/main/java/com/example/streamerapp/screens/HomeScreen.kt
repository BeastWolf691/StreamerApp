package com.example.streamerapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.streamerapp.components.MainHeaderBar

@Composable
fun HomeScreen(navController: NavHostController, messageController: NavHostController) {
    Scaffold() { safeArea ->
        Column {
            MainHeaderBar(navController = navController)

            NavHost(
                navController = navController,
                startDestination = "MainScreen",
                modifier = Modifier.padding(safeArea),
            ) {
                composable("MainScreen") {
                    MainScreen(messageController, navController)
                }
                composable("FavoritesScreen") {
                    FavoritesScreen(messageController,  navController)
                }
            }
        }
    }
}