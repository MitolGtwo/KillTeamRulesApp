package com.example.killteamruleset.ui.components

import androidx.compose.foundation.layout.FlowRow
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.KeywordInfo
import com.example.killteamruleset.ui.model.KeywordRepository
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


// ---------- MAIN CARD ----------

@Composable
fun CharacterCard(
    operative: Operative,
    modifier: Modifier = Modifier
) {
    var selectedKeyword by remember { mutableStateOf<KeywordInfo?>(null) }

    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
            .navigationBarsPadding(),
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
        ) {

            CharacterHeader(
                name = operative.name,
                imageRes = operative.imageRes
            )

            Spacer(Modifier.height(12.dp))

            StatsRow(operative.stats)

            Spacer(Modifier.height(16.dp))

            // ✅ HEADER ONCE
            WeaponTableHeader()

            // ✅ WEAPON ROWS
            operative.weapons.forEach { weapon ->
                WeaponRow(
                    weapon = weapon,
                    onKeywordClick = { selectedKeyword = it }
                )
            }

            Spacer(Modifier.height(12.dp))

            AbilitiesSection(
                abilities = operative.abilities,
                onKeywordClick = { selectedKeyword = it }
            )

            Spacer(Modifier.height(12.dp))

            FooterKeywords(operative.keywords)
        }
    }

    // 🔥 KEYWORD POPUP
    selectedKeyword?.let {
        KeywordPopup(
            keyword = it,
            onDismiss = { selectedKeyword = null }
        )
    }
}


//----------- Header ---------

@Composable
fun CharacterHeader(
    name: String,
    imageRes: Int
) {
    Box(modifier = Modifier.fillMaxWidth()) {

        Text(
            text = name,
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(end = 110.dp)
        )

        AnimatedVisibility(
            visible = true,
            enter = slideInVertically(
                initialOffsetY = { it / 2 }
            ) + fadeIn(),
            modifier = Modifier.align(Alignment.TopEnd)
        ) {
            Image(
                painter = painterResource(imageRes),
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )
        }
    }
}


// ---------- STATS ----------

@Composable
fun StatsRow(stats: OperativeStats) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        StatItem("APL", stats.apl.toString())
        StatItem("MOVE", stats.move)
        StatItem("SAVE", stats.save)
        StatItem("WOUNDS", stats.wounds.toString())
    }
}

// ---------- WEAPON ROW ----------


@Composable
fun WeaponTableHeader() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "NAME / KEYWORDS",
                modifier = Modifier.weight(1f),
                style = MaterialTheme.typography.labelMedium,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.onSurface
            )

            Row(horizontalArrangement = Arrangement.spacedBy(20.dp)) {
                Text("ATK", fontWeight = FontWeight.SemiBold)
                Text("HIT", fontWeight = FontWeight.SemiBold)
                Text("DMG", fontWeight = FontWeight.SemiBold)
            }
        }

        Spacer(Modifier.height(6.dp))
        Divider(thickness = 1.dp)
    }
}

@Composable
fun WeaponRow(
    weapon: WeaponProfile,
    onKeywordClick: (KeywordInfo) -> Unit
) {
    Column {

        // 🔹 TOP LINE (NAME + STATS)
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = weapon.name,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f)
            )

            Row(horizontalArrangement = Arrangement.spacedBy(20.dp)) {
                Text(
                    text = weapon.attacks.toString(),
                    fontWeight = FontWeight.Bold
                )
                Text(weapon.hit)
                Text(weapon.damage)
            }
        }

        // 🔹 KEYWORDS LINE
        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier.padding(top = 4.dp)
        ) {
            weapon.keywords.forEach { keyword ->
                Text(
                    text = keyword.displayName,
                    style = MaterialTheme.typography.bodySmall.copy(
                        textDecoration = TextDecoration.Underline
                    ),
                    modifier = Modifier.clickable {
                        onKeywordClick(keyword)
                    }
                )
            }
        }

        Spacer(Modifier.height(10.dp))
    }
}
// ---------- ABILITIES ----------



// ---------- FOOTER ----------

@Composable
fun FooterKeywords(
    keywords: List<String>
) {
    FlowRow(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp) ,
        verticalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        keywords.forEach { keyword ->
            Text(
                text = keyword + ",",
                style = MaterialTheme.typography.labelSmall.copy(
                    fontWeight = FontWeight.Medium
                )
            )
        }
    }
}
/*@Preview(showBackground = true)
@Composable
fun CharacterCardPreview() {
    MaterialTheme {
        CharacterCard()
    }
}
*/