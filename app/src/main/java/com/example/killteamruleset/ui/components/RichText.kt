package com.example.killteamruleset.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle

@Composable
fun RichText(
    text: String,
    color: Color = Color.Black
) {
    val annotated = buildAnnotatedString {
        val regex = Regex("\\*\\*(.*?)\\*\\*")
        var lastIndex = 0

        regex.findAll(text).forEach { match ->
            append(text.substring(lastIndex, match.range.first))

            withStyle(
                SpanStyle(
                    fontWeight = FontWeight.Bold,
                    color = color
                )
            ) {
                append(match.groupValues[1])
            }

            lastIndex = match.range.last + 1
        }

        if (lastIndex < text.length) {
            append(text.substring(lastIndex))
        }
    }

    Text(
        text = annotated,
        style = MaterialTheme.typography.bodyMedium,
        color = color
    )
}