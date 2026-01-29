package com.example.killteamruleset.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
    onKeywordClick: (KeywordInfo) -> Unit,
    modifier: Modifier = Modifier
) {
    val paragraphs = text.split("\n\n")

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        paragraphs.forEachIndexed { index, paragraph ->

            val isRestriction = index == 1 // second paragraph = restriction ❌

            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {

                // ICON
                Icon(
                    painter = painterResource(
                        id = if (isRestriction)
                            R.drawable.cross
                        else
                            R.drawable.arrow
                    ),
                    contentDescription = null,
                    tint = if (isRestriction)
                        Color.Red
                    else
                        Color(0xFF4CAF50), // green
                    modifier = Modifier
                        .size(16.dp)
                        .padding(top = 2.dp)
                )

                // TEXT (clickable + keywords)
                KeywordClickableText(
                    text = paragraph,
                    onKeywordClick = onKeywordClick
                )
            }
        }
    }
}

@Composable
fun KeywordClickableText(
    text: String,
    onKeywordClick: (KeywordInfo) -> Unit
) {
    val annotatedString = buildAnnotatedString {
        var index = 0
        val keywords = KeywordRepository.allKeywords

        while (index < text.length) {

            val match = keywords
                .mapNotNull { keyword ->
                    val start = text.indexOf(keyword.displayName, index, ignoreCase = true)
                    if (start >= 0) keyword to start else null
                }
                .minByOrNull { it.second }

            if (match == null) {
                append(text.substring(index))
                break
            }

            val (keyword, start) = match
            append(text.substring(index, start))

            pushStringAnnotation("KEYWORD", keyword.name)
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