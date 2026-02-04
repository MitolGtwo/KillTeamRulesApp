package com.example.killteamruleset.ui.model
import androidx.compose.ui.graphics.Color
enum class Archetypes(val displayName: String) {
    RECON("Recon"),
    SECURITY("Security"),
    INFILTRATION("Infiltration"),
    SEEK_AND_DESTROY("Seek and Destroy")
}



fun Archetypes.bannerColor(): Color =
    when (this) {
        Archetypes.SECURITY -> Color(0xFF1976D2)        // Blue
        Archetypes.RECON -> Color(0xFFF64747)           // Red
        Archetypes.SEEK_AND_DESTROY -> Color(0xFF790202) // Dark Red
        Archetypes.INFILTRATION -> Color(0xFF7B1FA2)    // Purple
    }