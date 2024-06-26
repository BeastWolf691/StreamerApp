package com.example.streamerapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.streamerapp.components.Filter

@Composable
fun FavoritesScreen(messageController: NavHostController, navController: NavController) {
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding()
        ) {
            IconButton(onClick = { navController.navigate("MainScreen") }) {
                Icon(Icons.Outlined.Home, "Home")
            }
            Spacer(modifier = Modifier.padding())// espace entre les parties

            Filter (onOptionSelected = {})
        }
        Box(modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray))
    }
}