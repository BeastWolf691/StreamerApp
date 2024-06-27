package com.example.streamerapp.components.HeaderBar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun HeaderBarIcon(
    icon: ImageVector = Icons.Rounded.Info,
    route: String,
    navController: NavHostController,
) {
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp.dp
    val desiredHeight = (screenHeight / 10)

    Box(
        modifier = Modifier
            .height(desiredHeight)
    ) {
        IconButton(
            onClick = { navController.navigate(route) },
            modifier = Modifier
                .fillMaxHeight()
        ) {
            Icon(
                imageVector = icon,
                contentDescription = "Favoris"
            )
        }
    }
}




