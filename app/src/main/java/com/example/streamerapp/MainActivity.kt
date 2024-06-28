package com.example.streamerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.streamerapp.screens.FavoritesScreen
import com.example.streamerapp.screens.HomeScreen
import com.example.streamerapp.ui.theme.StreamerAppTheme
import com.google.firebase.firestore.ktx.firestore

//interface mobile sur model pixel 8pro API30
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val db = com.google.firebase.ktx.Firebase.firestore
        enableEdgeToEdge()
        setContent {
            StreamerAppTheme {
                val navController = rememberNavController();
                val messageController = rememberNavController();
                NavHost(navController = messageController, startDestination = "Home") {
                    composable("Home") {
                        HomeScreen(
                            navController = navController,
                            messageController = messageController
                        )
                    }
                    composable("Favoris") {
                        FavoritesScreen(
                            navController = navController,
                            messageController = messageController
                        )
                    }
                }
            }

        }
    }
}