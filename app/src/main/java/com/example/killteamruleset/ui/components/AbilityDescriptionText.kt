package com.example.killteamruleset.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.model.KeywordInfo
import com.example.killteamruleset.ui.model.KeywordRepository
import com.example.killteamruleset.R

@Composable
fun AbilityDescriptionText(
    text: String,
    modifier: Modifier = Modifier,
    enableKeywords: Boolean = true,
    arrowColor: Color = Color(0xFF4CAF50),
    crossColor: Color = Color.Red,
    backgroundColor: Color? = null,
    textColor: Color = MaterialTheme.colorScheme.onSurfaceVariant,
    onKeywordClick: (KeywordInfo) -> Unit = {}
) {
    val paragraphs = text.split("\n\n")

    val content: @Composable () -> Unit = {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            paragraphs.forEachIndexed { index, paragraph ->

                val isRestriction = index == 1

                Row(
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    Icon(
                        painter = painterResource(
                            if (isRestriction) R.drawable.cross else R.drawable.arrow
                        ),
                        contentDescription = null,
                        tint = if (isRestriction) crossColor else arrowColor,
                        modifier = Modifier
                            .size(16.dp)
                            .padding(top = 2.dp)
                    )

                    RichText(
                        text = paragraph,
                        /*style = MaterialTheme.typography.bodySmall,*/
                        color = textColor
                    )
                }
            }
        }
    }

    if (backgroundColor != null) {
        Surface(
            color = MaterialTheme.colorScheme.surface,
            shape = RoundedCornerShape(8.dp),
            modifier = modifier
        ) {
            Column(Modifier.padding(12.dp)) {
                content()
            }
        }
    } else {
        content()
    }
}
@Composable
fun KeywordClickableText(
    text: String,
    onKeywordClick: (KeywordInfo) -> Unit
) {
    val annotatedString = buildAnnotatedString {

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

            pushStringAnnotation("KEYWORD", keyword.displayName)
            withStyle(
                SpanStyle(
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.Medium,
                    textDecoration = TextDecoration.Underline
                )
            ) {
                append(keyword.displayName)
            }
            pop()

            currentIndex = start + keyword.displayName.length
        }

        if (currentIndex < text.length) {
            append(text.substring(currentIndex))
        }
    }

    ClickableText(
        text = annotatedString,
        style = MaterialTheme.typography.bodySmall.copy(
            color = MaterialTheme.colorScheme.onSurfaceVariant
        ),
        onClick = { offset ->
            annotatedString
                .getStringAnnotations("KEYWORD", offset, offset)
                .firstOrNull()
                ?.let { annotation ->
                    KeywordRepository.findByName(annotation.item)
                        ?.let(onKeywordClick)
                }
        }
    )
}