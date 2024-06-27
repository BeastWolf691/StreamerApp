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
fun Filter(onOptionSelected: (String) -> Unit) {
    var expandedone by remember { mutableStateOf(false) }
    var selectedOptionTextOne by remember { mutableStateOf(TextFieldValue("")) }
    var expanded by remember { mutableStateOf(false) }
    var selectedOptionTextTwo by remember { mutableStateOf(TextFieldValue("")) }

    Box {
        Row {
            ExposedDropdownMenuBox(
                expanded = expandedone,
                modifier = Modifier
                    .width(185.dp),
                onExpandedChange = { expandedone = !expandedone },
            ) {    val options = listOf("A - J", "K - T", "U - Z")

                TextField(
                    modifier = Modifier
                        .menuAnchor()
                        .onKeyEvent { keyEvent ->
                            if (keyEvent.type == KeyEventType.KeyDown && keyEvent.key == Key.Enter) {
                                onOptionSelected(selectedOptionTextOne.text)
                                expandedone = false
                                true
                            } else {
                                false
                            }
                        },
                    value = selectedOptionTextOne,
                    onValueChange = { selectedOptionTextOne = it },
                    label = { Text("Choix par lettre") },
                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expandedone) },
                    colors = ExposedDropdownMenuDefaults.textFieldColors(
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done)
                )
                DropdownMenu(
                    //en enlevant le filteroption cela permet de toujours pouvoir modifier la selection
                    modifier = Modifier
                        .background(Color.White)
                        .exposedDropdownSize(true),
                    properties = PopupProperties(focusable = false),
                    expanded = expandedone,
                    onDismissRequest = { expandedone = false },
                ) {
                    options.forEach { selectionOption ->
                        DropdownMenuItem(
                            text = { Text(selectionOption) },
                            onClick = {
                                selectedOptionTextOne = TextFieldValue(selectionOption)
                                expandedone = false
                                onOptionSelected(selectionOption)
                            },
                            contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding,
                        )
                    }
                }
            }
            ExposedDropdownMenuBox(
                expanded = expanded,
                modifier = Modifier
                    .padding(start = 10.dp)
                    .width(130.dp),
                onExpandedChange = { expanded = !expanded },
            ) { val options = listOf("50K - 100K", "100K - 200K", "300K - ++")
                TextField(
                    modifier = Modifier
                        .menuAnchor()
                        .onKeyEvent { keyEvent ->
                            if (keyEvent.type == KeyEventType.KeyDown && keyEvent.key == Key.Enter) {
                                onOptionSelected(selectedOptionTextTwo.text)
                                expanded = false
                                true
                            } else {
                                false
                            }
                        },
                    value = selectedOptionTextTwo,
                    onValueChange = { selectedOptionTextTwo = it },
                    label = { Text("Viewers") },
                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
                    colors = ExposedDropdownMenuDefaults.textFieldColors(
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done)
                )
                DropdownMenu(
                    //en enlevant le filteroption cela permet de toujours pouvoir modifier la selection
                    modifier = Modifier
                        .background(Color.White)
                        .exposedDropdownSize(true),
                    properties = PopupProperties(focusable = false),
                    expanded = expanded,
                    onDismissRequest = { expanded = false },
                ) {
                    options.forEach { selectionOption ->
                        DropdownMenuItem(
                            text = { Text(selectionOption) },
                            onClick = {
                                selectedOptionTextTwo = TextFieldValue(selectionOption)
                                expanded = false
                                onOptionSelected(selectionOption)
                            },
                            contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding,
                        )
                    }
                }
            }
        }
    }
}


