package com.example.killteamruleset.ui.components

import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import com.example.killteamruleset.ui.model.KeywordInfo
import com.example.killteamruleset.ui.model.KeywordRepository

@Composable
fun AbilityDescriptionText(
    text: String,
    onKeywordClick: (KeywordInfo) -> Unit,
    modifier: Modifier = Modifier
) {
    val annotatedString = buildAnnotatedString {

        var index = 0
        val keywords = KeywordRepository.allKeywords

        while (index < text.length) {

            val match = keywords
                .mapNotNull { keyword ->
                    val name = keyword.displayName
                    val start = text.indexOf(name, index, ignoreCase = true)
                    if (start >= 0) keyword to start else null
                }
                .minByOrNull { it.second }

            if (match == null) {
                append(text.substring(index))
                break
            }

            val (keyword, start) = match

            append(text.substring(index, start))

            pushStringAnnotation(
                tag = "KEYWORD",
                annotation = keyword.name   // 🔥 FIX
            )

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

            index = start + keyword.displayName.length
        }
    }

    ClickableText(
        text = annotatedString,
        modifier = modifier,
        style = MaterialTheme.typography.bodySmall,
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