package com.example.streamerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.streamerapp.components.ElevatedCardExample
import com.example.streamerapp.components.Filter
import com.example.streamerapp.components.Header
import com.example.streamerapp.ui.theme.StreamerAppTheme

@Composable
fun CardList() {
    //permet de définir le nb de fois où des memes
    // informations sont répétées et ainsi ne pas les passer manuellement
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        repeat(10) {
            ElevatedCardExample()
            Spacer(modifier = Modifier.height(15.dp))
        }
    }
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StreamerAppTheme {
                Scaffold { innerPadding ->
                    Column(
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        Header()
                        Filter(onOptionSelected = {})
                        CardList()
                    }
                }
            }
        }
    }
}


