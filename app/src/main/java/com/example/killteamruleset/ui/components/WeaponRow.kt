package com.example.killteamruleset.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.KeywordInfo
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


@Composable
fun WeaponRow(
    weapon: WeaponProfile,
    onKeywordClick: (KeywordInfo) -> Unit,
    forceBlackText: Boolean = false
) {
    val textColor =
        if (forceBlackText) Color.Black
        else MaterialTheme.colorScheme.onSurface

    Column {

        // ─── NAME + STATS ─────────────────────
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(id = weaponIconRes(weapon.type)),
                contentDescription = null,
                modifier = Modifier
                    .size(20.dp)
                    .padding(end = 8.dp)
            )

            Text(
                text = weapon.name,
                fontWeight = FontWeight.Bold,
                color = textColor,
                modifier = Modifier.weight(1f)
            )

            Row(horizontalArrangement = Arrangement.spacedBy(20.dp)) {
                Text(
                    text = weapon.attacks.toString(),
                    fontWeight = FontWeight.Bold,
                    color = textColor
                )
                Text(weapon.hit, color = textColor)
                Text(weapon.damage, color = textColor)
            }
        }

        // ─── KEYWORDS ─────────────────────────
        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier.padding(top = 4.dp)
        ) {
            weapon.keywords.forEach { keyword ->
                Text(
                    text = keyword.displayName,
                    style = MaterialTheme.typography.bodySmall.copy(
                        textDecoration = TextDecoration.Underline,
                        color = textColor
                    ),
                    modifier = Modifier.clickable {
                        onKeywordClick(keyword)
                    }
                )
            }

            weapon.extraRules.forEach { rule ->
                Text(
                    text = rule,
                    style = MaterialTheme.typography.bodySmall,
                    color = textColor
                )
            }
        }

        Spacer(Modifier.height(8.dp))

        Divider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.4f)
        )
    }

}
@Composable
private fun weaponIconRes(type: WeaponType): Int {
    return when (type) {
        WeaponType.RANGED -> R.drawable.ic_ranged
        WeaponType.MELEE -> R.drawable.ic_melee
    }
}