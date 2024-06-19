package com.example.streamerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.streamerapp.components.ElevatedCardExample
import com.example.streamerapp.components.Header
import com.example.streamerapp.ui.theme.StreamerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StreamerAppTheme {
                Scaffold(
                    modifier = Modifier
                        .height(900.dp)

                ) { innerPadding ->

                    Column(
                        modifier = Modifier.padding(innerPadding),
                    ) {
                        Header()

                        Spacer(
                            modifier = Modifier
                                .height(100.dp)
                        )
//rajouter colums + scroll dans modifier et renseigner hauteur (dans parent scaffold) qui permet de délimiter dimension où l'on peut scroll.
                        Column (
                            modifier = Modifier.padding(innerPadding)
                                .verticalScroll(state = rememberScrollState())
                        ){


                            ElevatedCardExample()

                            Spacer(
                                modifier = Modifier
                                    .height(800.dp)
                            )

                            ElevatedCardExample()
                        }
                    }
                }
            }
        }
    }
}
