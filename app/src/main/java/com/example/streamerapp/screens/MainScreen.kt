package com.example.streamerapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.streamerapp.components.ElevatedCardExample
import com.example.streamerapp.components.Filter

@Composable
fun MainScreen(messageController: NavHostController, navController: NavController) {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp)
        ) {
            IconButton(onClick = { navController.navigate("FavoritesScreen") }) {
                Icon(Icons.Outlined.Favorite, "Coeur")
            }
            Spacer(modifier = Modifier.padding(start = 20.dp))// espace entre les parties

            Filter (onOptionSelected = {})
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Gray)
        )
        {

            Spacer(modifier = Modifier.padding(start = 20.dp))// espace entre les parties

            CardList()
        }
    }
}


@Composable
fun CardList() {
    //permet de définir le nb de fois où des memes
    // informations seront répétées et ainsi ne pas les passer manuellement
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        repeat(15) {
            ElevatedCardExample()
            Spacer(modifier = Modifier.height(15.dp))
        }
    }
}