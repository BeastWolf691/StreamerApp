package com.example.streamerapp.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun ElevatedCardExample() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize() // Prend toute la taille disponible
            .verticalScroll(scrollState) // Ajoute le défilement vertical
            .padding(16.dp) // Ajoute un padding global
    ) {
        ElevatedCard(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
            modifier = Modifier
                .fillMaxWidth() // La carte prend toute la largeur disponible
                .height(800.dp) // La carte a une hauteur fixe
                .padding(start = 15.dp, end = 15.dp, top = 150.dp) // Ajoute un padding autour de la carte
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp), // Ajoute un padding interne à la colonne
            ) {
                Row (
                    modifier = Modifier,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(
                        text = "Elevated",
                    )
                    Icon(
                        imageVector = Icons.Filled.AddCircle,
                        contentDescription = "",
                    )
                    Icon(
                        imageVector = Icons.Filled.Delete,
                        contentDescription = "",
                    )
                }

            }
        }

    }
}
