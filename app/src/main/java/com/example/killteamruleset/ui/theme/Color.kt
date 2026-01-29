package com.example.killteamruleset.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.ui.graphics.Color

val DarkBlueBackground = Color(0xFF2B2C2C)
val DarkBlueSurface = Color(0xFF1B263B)
val Orange = Color(0xFFC53939)
val Black = Color(0xFF000000)


val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val KillTeamDarkColorScheme = darkColorScheme(
    surfaceVariant = Black,
    outline=Orange,
    background = DarkBlueBackground,
    surface = Black,
    onSurface = Color.White,
    onBackground = Color.White,
    primary = Orange
)