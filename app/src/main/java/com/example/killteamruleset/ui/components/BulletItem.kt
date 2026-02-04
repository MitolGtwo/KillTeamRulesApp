package com.example.killteamruleset.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp

private val TeamNameTerms = listOf("WRECKA KREW")

private val OperativeNameTerms = listOf(
    "BOSS NOB",
    "BOMB SQUIG",
    "BREAKA BOY DEMOLISHA",
    "BREAKA BOY FIGHTER",
    "BREAKA BOY KRUSHA",
    "TANKBUSTA GUNNER",
    "TANKBUSTA ROKKITEER"
)

@Composable
fun BulletItem(
    text: String,
    indent: Int = 0
) {
    Row(
        modifier = Modifier.padding(start = (indent * 12).dp),
        verticalAlignment = Alignment.Top
    ) {
        Text(
            text = "•",
            modifier = Modifier.padding(end = 6.dp),
            fontWeight = FontWeight.Bold
        )

        OperativeSelectionText(text = text)
    }
}

@Composable
private fun OperativeSelectionText(text: String) {
    val annotated = buildAnnotatedString {
        var index = 0
        val allTerms = TeamNameTerms + OperativeNameTerms

        while (index < text.length) {
            val match = allTerms
                .mapNotNull { term ->
                    val start = text.indexOf(term, index, ignoreCase = true)
                    if (start >= 0) term to start else null
                }
                .minByOrNull { it.second }

            if (match == null) {
                append(text.substring(index))
                break
            }

            val (term, start) = match
            append(text.substring(index, start))

            val isTeam = TeamNameTerms.any { it.equals(term, true) }

            withStyle(
                SpanStyle(
                    fontWeight = FontWeight.Bold,
                    color = if (isTeam)
                        MaterialTheme.colorScheme.primary
                    else
                        MaterialTheme.colorScheme.onBackground
                )
            ) {
                append(term)
            }

            index = start + term.length
        }
    }

    Text(
        text = annotated,
        style = MaterialTheme.typography.bodyMedium
    )
}