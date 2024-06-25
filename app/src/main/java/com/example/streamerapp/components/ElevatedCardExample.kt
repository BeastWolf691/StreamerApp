package com.example.streamerapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ElevatedCardExample() {

    Box (//équivaut a un container
        Modifier.height(800.dp)
    ){
        Column(
            modifier = Modifier
                .fillMaxSize() // Prend toute la taille disponible
                .padding(16.dp) // Ajoute un padding global
        ) {

            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier
                    .fillMaxWidth() // La carte prend toute la largeur disponible
                    .padding(start = 15.dp, end = 15.dp) // Ajoute un padding autour de la carte
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp), // Ajoute un padding interne à la colonne
                ) {
                    Row(
                        modifier = Modifier
                            .background(Color.Green)
                            .height(25.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Text(
                            text = "Bel Air",
                        )
            
                        Spacer(modifier = Modifier.padding(start = 175.dp))// espace entre les parties

                        Icon(
                            imageVector = Icons.Filled.AddCircle,
                            contentDescription = "",
                        )

                        Spacer(modifier = Modifier.padding(start = 10.dp))// espace entre les parties

                        Icon(
                            imageVector = Icons.Filled.Delete,
                            contentDescription = "",
                        )
                    }

                    Spacer(modifier = Modifier.height(25.dp))// espace entre les parties

                    Text(
                        text = "imageUrl",
                    )

                    Text(
                        text = "catégories",
                    )

                    Text(
                        text = "lien twitch"
                    )

                    Spacer(modifier = Modifier.height(25.dp))// espace entre les parties

                    Text(
                        text = "il a différentes catégories, ce streameur de twitch ne se content pas de simplement jouer aux jeux du genre horreur/paranormal" +
                                "mais il consacre également beaucoup de son temps aux genres de simulations/gestions comme les sims, City Skylines," +
                                "vous pourriez croire que cela s'arrete à ces deux catégories mais non, il continue aussi avec des jeux plus connus/emblématique comme WoW, LoL",
                        Modifier
                            .background(Color.LightGray)
                            .height(375.dp)
                            .padding(15.dp)
                    )

                    Spacer(modifier = Modifier.height(25.dp))// espace entre les parties

                    Text(
                        text = "parties youtube (historique)",
                        Modifier
                            .background(Color.Cyan)
                            .height(75.dp)
                            .padding(15.dp)
                    )

                    Spacer(modifier = Modifier.height(25.dp))// espace entre les parties

                    Text(
                        text = "mise en place des 3vignettes (dernieres vidéos youtubes par API)",
                        Modifier
                            .background(Color.Yellow)
                            .height(125.dp)
                            .padding(15.dp)
                    )
                }
            }

        }
    }
}
