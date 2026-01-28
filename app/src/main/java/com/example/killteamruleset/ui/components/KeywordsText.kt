package com.example.killteamruleset.ui.components

import android.R
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.example.killteamruleset.ui.model.KeywordInfo

private const val KEYWORD_TAG = "KEYWORD"

@Composable
fun KeywordsText(
    keywords: List<KeywordInfo>,
    onKeywordClick: (KeywordInfo) -> Unit,
    modifier: Modifier = Modifier
) {
    val annotatedString = buildAnnotatedString {
        keywords.forEachIndexed { index, keyword ->

            pushStringAnnotation(
                tag = KEYWORD_TAG,
                annotation = index.toString()
            )

            withStyle(
                style = SpanStyle(
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.Medium
                )
            ) {
                append(keyword.displayName)
            }

            pop()

            if (index < keywords.lastIndex) {
                append(", ")
            }
        }
    }

    ClickableText(
        text = annotatedString,
        modifier = modifier,
        style = MaterialTheme.typography.bodySmall,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis,
        onClick = { offset ->
            annotatedString
                .getStringAnnotations(KEYWORD_TAG, offset, offset)
                .firstOrNull()
                ?.let { annotation ->
                    annotation.item.toIntOrNull()
                        ?.let { index ->
                            keywords.getOrNull(index)
                        }
                        ?.let(onKeywordClick)
                }
        }
    )
}