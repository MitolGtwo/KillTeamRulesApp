package com.example.killteamruleset.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun RulesImageRow(
    @DrawableRes leftImage: Int,
    @DrawableRes rightImage: Int,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        Image(
            painter = painterResource(leftImage),
            contentDescription = null,
            modifier = Modifier
                .weight(1f)
                .height(140.dp) // 👈 controls row height
                .clip(RoundedCornerShape(8.dp)),
            contentScale = ContentScale.Fit
        )

        Image(
            painter = painterResource(rightImage),
            contentDescription = null,
            modifier = Modifier
                .weight(1f)
                .height(140.dp)
                .clip(RoundedCornerShape(8.dp)),
            contentScale = ContentScale.Fit
        )
    }
}