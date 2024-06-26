package com.example.streamerapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Filter(onOptionSelected: () -> Unit) {
    var expandedOne by remember { mutableStateOf(false) }
    var expandedTwo by remember { mutableStateOf(false) }
    var selectedOptionTextOne by remember { mutableStateOf(TextFieldValue("")) }
    var selectedOptionTextTwo by remember { mutableStateOf(TextFieldValue("")) }

    Box {
        Row {
            // Filter by letter range
            ExposedDropdownMenuBox(
                expanded = expandedOne,
                modifier = Modifier.width(185.dp),
                onExpandedChange = { expandedOne = !expandedOne },
            ) {
                val options = listOf("A - J", "K - T", "U - Z")

                TextField(
                    modifier = Modifier
                        .menuAnchor()
                        .onKeyEvent { keyEvent ->
                            if (keyEvent.type == KeyEventType.KeyDown && keyEvent.key == Key.Enter) {
                                onOptionSelected()
                                expandedOne = false
                                true
                            } else {
                                false
                            }
                        },
                    value = selectedOptionTextOne,
                    onValueChange = { selectedOptionTextOne = it },
                    label = { Text("Choix par lettre") },
                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expandedOne) },
                    colors = ExposedDropdownMenuDefaults.textFieldColors(
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done)
                )
                DropdownMenu(
                    modifier = Modifier
                        .background(Color.White)
                        .exposedDropdownSize(true),
                    properties = PopupProperties(focusable = false),
                    expanded = expandedOne,
                    onDismissRequest = { expandedOne = false },
                ) {
                    options.forEach { selectionOption ->
                        DropdownMenuItem(
                            text = { Text(selectionOption) },
                            onClick = {
                                selectedOptionTextOne = TextFieldValue(selectionOption)
                                expandedOne = false
                                onOptionSelected()
                            },
                            contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding,
                        )
                    }
                }
            }

            // Filter by viewers range
            ExposedDropdownMenuBox(
                expanded = expandedTwo,
                modifier = Modifier
                    .padding(start = 10.dp)
                    .width(185.dp),
                onExpandedChange = { expandedTwo = !expandedTwo },
            ) {
                val options = listOf("50K - 100K", "100K - 200K", "300K - ++")

                TextField(
                    modifier = Modifier
                        .menuAnchor()
                        .onKeyEvent { keyEvent ->
                            if (keyEvent.type == KeyEventType.KeyDown && keyEvent.key == Key.Enter) {
                                onOptionSelected()
                                expandedTwo = false
                                true
                            } else {
                                false
                            }
                        },
                    value = selectedOptionTextTwo,
                    onValueChange = { selectedOptionTextTwo = it },
                    label = { Text("Viewers") },
                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expandedTwo) },
                    colors = ExposedDropdownMenuDefaults.textFieldColors(
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done)
                )
                DropdownMenu(
                    modifier = Modifier
                        .background(Color.White)
                        .exposedDropdownSize(true),
                    properties = PopupProperties(focusable = false),
                    expanded = expandedTwo,
                    onDismissRequest = { expandedTwo = false },
                ) {
                    options.forEach { selectionOption ->
                        DropdownMenuItem(
                            text = { Text(selectionOption) },
                            onClick = {
                                selectedOptionTextTwo = TextFieldValue(selectionOption)
                                expandedTwo = false
                                onOptionSelected()
                            },
                            contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding,
                        )
                    }
                }
            }
        }
    }
}
