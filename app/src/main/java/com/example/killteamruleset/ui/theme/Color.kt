package com.example.killteamruleset.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.ui.graphics.Color

val DarkBlueBackground = Color(0xFF2B2C2C)
val DarkBlueSurface = Color(0xFF1B263B)
val Black = Color(0xFF020202)

val Cream = Color(0xFFECE2E2)
val Orange = Color(0xFFF53907)

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
    surface = Cream,
    onSurface = Color.White,
    onBackground = Color.White,
    primary = Orange,
    onPrimary = Color.White,
)