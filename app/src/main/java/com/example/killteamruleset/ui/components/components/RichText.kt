package com.example.killteamruleset.ui.components.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle

@Composable
fun RichText(
    text: String,
    color: Color = Color.Black,
    fontWeight: FontWeight = FontWeight.Normal,
    modifier: Modifier = Modifier
) {
    val annotated = parseRichText(text, color)

    Text(
        text = annotated,
        style = MaterialTheme.typography.bodyMedium,
        color = color
    )
}

fun parseRichText(text: String, defaultColor: Color): AnnotatedString {
    return buildAnnotatedString {
        var i = 0

        while (i < text.length) {

            // 🔵 BLUE TAG [[blue]]...[[/blue]]
            if (text.startsWith("[[blue]]", i)) {
                val end = text.indexOf("[[/blue]]", i)

                if (end != -1) {
                    val content = text.substring(i + 8, end)

                    withStyle(SpanStyle(color = Color(0xFF6E9CE6))
                    ) {
                        append(parseRichText(content, defaultColor)
                        )
                    }

                    if (text.startsWith("**", i)) {
                        val end = text.indexOf("**", i + 2)

                        if (end != -1) {
                            val content = text.substring(i + 2, end)

                            withStyle(
                                SpanStyle(
                                    fontWeight = FontWeight.Bold,
                                )
                            ) {
                                append(content)
                            }

                            i = end + 2
                            continue
                        }
                    }
                    i = end + 9
                    continue
                }
            }

            if (text.startsWith("[[red]]", i)) {
                val end = text.indexOf("[[/red]]", i)

                if (end != -1) {
                    val content = text.substring(i + 7, end)

                    withStyle(SpanStyle(color = Color(0xFFA1232D),
                        textDecoration = TextDecoration.Underline)
                    ) {
                        append(parseRichText(content, defaultColor)
                        )
                    }

                    i = end + 8
                    continue
                }
            }

            // **BOLD**
            if (text.startsWith("**", i)) {
                val end = text.indexOf("**", i + 2)

                if (end != -1) {
                    val content = text.substring(i + 2, end)

                    withStyle(
                        SpanStyle(
                            fontWeight = FontWeight.Bold,
                            color = defaultColor
                        )
                    ) {
                        append(content)
                    }

                    i = end + 2
                    continue
                }
            }

            // Normal text
            append(text[i])
            i++
        }
    }
}