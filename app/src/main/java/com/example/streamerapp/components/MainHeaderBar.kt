package com.example.streamerapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.streamerapp.components.HeaderBar.HeaderBarIcon

@Composable
fun MainHeaderBar(modifier: Modifier = Modifier, navController: NavHostController) {
    Row(
//        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.fillMaxWidth()
        .height(0.dp)
    ) {
        HeaderBarIcon(
            Icons.Filled.Home,
            route = "FavoritesScreen",
            navController = navController,
        )
    }
}

