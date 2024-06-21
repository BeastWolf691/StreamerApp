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
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.streamerapp.components.ElevatedCardExample
import com.example.streamerapp.components.Filter
import com.example.streamerapp.components.Header
import com.example.streamerapp.components.NavGraph
import com.example.streamerapp.ui.theme.StreamerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StreamerAppTheme {
                Scaffold(
                    modifier = Modifier

                ) { innerPadding ->

                    Column(
                        modifier = Modifier.padding(innerPadding),
                    ) {
                        Header()

                        Filter(onOptionSelected = {})

                        Column (
                            modifier = Modifier
                                .padding(innerPadding)
                                .verticalScroll(state = rememberScrollState())
                        ){
                            ElevatedCardExample()

                            Spacer(
                                modifier = Modifier
                                    .height(15.dp)
                            )
                            ElevatedCardExample()

                            Spacer(
                                modifier = Modifier
                                    .height(15.dp)
                            )

                            ElevatedCardExample()

                            Spacer(
                                modifier = Modifier
                                    .height(15.dp)
                            )

                            ElevatedCardExample()

                            Spacer(
                                modifier = Modifier
                                    .height(15.dp)
                            )

                            ElevatedCardExample()

                            Spacer(
                                modifier = Modifier
                                    .height(15.dp)
                            )

                            ElevatedCardExample()

                            Spacer(
                                modifier = Modifier
                                    .height(15.dp)
                            )

                            ElevatedCardExample()

                            Spacer(
                                modifier = Modifier
                                    .height(15.dp)
                            )

                            ElevatedCardExample()

                            Spacer(
                                modifier = Modifier
                                    .height(15.dp)
                            )

                            ElevatedCardExample()

                            Spacer(
                                modifier = Modifier
                                    .height(15.dp)
                            )

                            ElevatedCardExample()
                        }
                    }
                }
            }
        }
    }
}
