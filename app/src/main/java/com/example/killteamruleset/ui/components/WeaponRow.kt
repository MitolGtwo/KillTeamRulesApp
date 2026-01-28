package com.example.killteamruleset.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.model.KeywordInfo
import com.example.killteamruleset.ui.model.KeywordRepository


@Composable
fun WeaponRow(
    iconRes: Int,
    name: String,
    atk: Int,
    hit: String,
    dmg: String,
    keywords: List<KeywordInfo>,
    onKeywordClick: (KeywordInfo) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        // Weapon type icon (melee / ranged)
        Image(
            painter = painterResource(id = iconRes),
            contentDescription = null,
            modifier = Modifier
                .size(24.dp)
                .padding(end = 8.dp)
        )

        // Name
        Text(
            text = name,
            modifier = Modifier.weight(2f),
            fontWeight = FontWeight.SemiBold,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )

        StatCell(atk.toString())
        StatCell(hit)
        StatCell(dmg)

        // Keywords (clickable text)
        KeywordsText(
            keywords = keywords,
            onKeywordClick = onKeywordClick,
            modifier = Modifier.weight(3f)
        )
    }
}

@Composable
private fun StatCell(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .width(40.dp),
        textAlign = androidx.compose.ui.text.style.TextAlign.Center,
        style = MaterialTheme.typography.bodyMedium
    )
}

