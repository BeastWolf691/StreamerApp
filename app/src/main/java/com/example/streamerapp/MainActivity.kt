package com.example.streamerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.streamerapp.components.ElevatedCardExample
import com.example.streamerapp.components.Header
import com.example.streamerapp.ui.theme.StreamerAppTheme
import java.util.jar.Attributes.Name

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StreamerAppTheme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize(),
                ) { innerPadding ->
                            Header(name = "")

                            Spacer(modifier = Modifier.height(200.dp).padding(innerPadding))// espace entre les parties

                            ElevatedCardExample()



                        }
                    }
                }
            }
        }
