package com.example.killteamruleset.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.R

@Composable
fun FavoriteStarButton(
    isFavorite: Boolean,
    onToggle: () -> Unit,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(
            id = if (isFavorite)
                R.drawable.full_star
            else
                R.drawable.empty_star
        ),
        contentDescription = "Favorite",
        modifier = modifier
            .size(32.dp)
            .clickable { onToggle() },
        colorFilter = ColorFilter.tint(
            if (isFavorite) androidx.compose.ui.graphics.Color(0xFFFF6A00)
            else androidx.compose.ui.graphics.Color.White
        )
    )
}