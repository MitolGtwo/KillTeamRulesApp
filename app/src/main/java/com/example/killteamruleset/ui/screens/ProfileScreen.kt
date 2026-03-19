package com.example.killteamruleset.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.components.KillTeamBackground
import com.example.killteamruleset.ui.data.ProfileRepository
import kotlinx.coroutines.launch

import com.example.killteamruleset.R

@Composable
fun ProfileScreen() {

    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    val savedName by ProfileRepository
        .getNameFlow(context)
        .collectAsState(initial = "")

    var text by remember { mutableStateOf("") }
    var isEditing by remember { mutableStateOf(false) }

    LaunchedEffect(savedName) {
        text = savedName
    }

    KillTeamBackground {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .statusBarsPadding(),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {

            Text(
                text = stringResource(R.string.profile_title),
                style = MaterialTheme.typography.titleLarge,
                color = Color.White
            )

            // 🔥 NAME DISPLAY
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {

                Text(
                    text = if (savedName.isEmpty()) "NO NAME" else savedName.uppercase(),
                    style = MaterialTheme.typography.headlineMedium,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )

                TextButton(onClick = { isEditing = true }) {
                    Text("Edit", color = Color(0xFFFF6A00))
                }
            }

            // ✏️ EDIT MODE
            AnimatedVisibility(visible = isEditing) {

                Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {

                    OutlinedTextField(
                        value = text,
                        onValueChange = {
                            if (it.length <= 15) text = it
                        },
                        label = {
                            Text(stringResource(R.string.your_name))
                        },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth()
                    )

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {

                        Button(
                            onClick = {
                                scope.launch {
                                    ProfileRepository.saveName(context, text)
                                }
                                isEditing = false
                            },
                            modifier = Modifier.weight(1f)
                        ) {
                            Text(stringResource(R.string.save))
                        }

                        OutlinedButton(
                            onClick = {
                                text = savedName
                                isEditing = false
                            },
                            modifier = Modifier.weight(1f)
                        ) {
                            Text("Cancel")
                        }
                    }
                }
            }
        }
    }
}