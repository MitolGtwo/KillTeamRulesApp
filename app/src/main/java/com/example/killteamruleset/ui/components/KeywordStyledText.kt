package com.example.killteamruleset.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import com.example.killteamruleset.ui.model.KeywordInfo
import com.example.killteamruleset.ui.data.KeywordRepository

@Composable
fun KeywordStyledText(
    text: String,
    modifier: Modifier = Modifier,
    baseStyle: TextStyle = MaterialTheme.typography.bodySmall,
    keywordColor: Color = MaterialTheme.colorScheme.primary
) {
    val annotated = buildAnnotatedString {

        var currentIndex = 0
        val matches = mutableListOf<Pair<Int, KeywordInfo>>()

        KeywordRepository.allKeywords.forEach { keyword ->
            val regex = Regex(
                "\\b${Regex.escape(keyword.displayName)}\\b",
                RegexOption.IGNORE_CASE
            )

            regex.findAll(text).forEach { match ->
                matches.add(match.range.first to keyword)
            }
        }

        matches.sortBy { it.first }

        for ((start, keyword) in matches) {
            if (start < currentIndex) continue

            append(text.substring(currentIndex, start))

            withStyle(
                SpanStyle(
                    color = keywordColor,
                    fontWeight = FontWeight.Medium,
                    textDecoration = TextDecoration.Underline
                )
            ) {
                append(keyword.displayName)
            }

            currentIndex = start + keyword.displayName.length
        }

        if (currentIndex < text.length) {
            append(text.substring(currentIndex))
        }
    }

    Text(
        text = annotated,
        modifier = modifier,
        style = baseStyle,
        color = MaterialTheme.colorScheme.onSurfaceVariant
    )
}
