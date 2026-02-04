package com.example.killteamruleset.ui.screens


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.killteamruleset.R
import com.example.killteamruleset.ui.data.FavoritesRepository
import com.example.killteamruleset.ui.model.Archetypes
import com.example.killteamruleset.ui.model.Team
import kotlinx.coroutines.launch

@Composable
fun TeamDetailScreen(
    team: Team,
    onOperativesClick: () -> Unit,
    onOperativeSelectionClick: () -> Unit,
    onFactionRulesClick: () -> Unit,
    onEquipmentClick: () -> Unit,
    onPloysClick: () -> Unit,
    onBack: () -> Unit,
    onHobbyHelperClick: () -> Unit
) {

    val context = LocalContext.current
    val favorites by FavoritesRepository
        .favoritesFlow(context)
        .collectAsState(initial = emptySet())

    val isFavorite = team.id in favorites
    val scope = rememberCoroutineScope()

    Box(modifier = Modifier.fillMaxSize()) {

        // ─────────────────────────
        // 🖼 BACKGROUND (fixed)
        // ─────────────────────────
        Image(
            painter = painterResource(team.backgroundRes),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // 🌑 DARK OVERLAY (brightness control)
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.18f))
        )

        // ─────────────────────────
        // 📜 SCROLLABLE CONTENT
        // ─────────────────────────
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(bottom = 24.dp)
        ) {

            // 🔙 BACK
            TextButton(
                onClick = onBack,
                modifier = Modifier.padding(16.dp)
            ) {
                Text("← Back", color = Color.White)
            }

// ─────────────────────────
// 🏷 TITLE + FAVORITE STAR
// ─────────────────────────
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

                // TEAM NAME
                Text(
                    text = team.name.uppercase(),
                    fontSize = 32.sp,
                    fontWeight = FontWeight.ExtraBold,
                    letterSpacing = 1.5.sp,
                    color = Color.White,
                    modifier = Modifier.weight(1f)
                )

                // ⭐ FAVORITE STAR
                Image(
                    painter = painterResource(
                        if (isFavorite)
                            R.drawable.full_star
                        else
                            R.drawable.empty_star
                    ),
                    contentDescription = "Favorite team",
                    modifier = Modifier
                        .size(30.dp)
                        .clickable {
                            scope.launch {
                                FavoritesRepository.toggleFavorite(context, team.id)
                            }
                        },
                    colorFilter = ColorFilter.tint(
                        if (isFavorite) Color(0xFFFF6A00) else Color.White
                    )
                )
            }



            // 🏷 TEAM NAME
            /*Text(
                text = team.name.uppercase(),
                fontSize = 32.sp,
                fontWeight = FontWeight.ExtraBold,
                letterSpacing = 1.5.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(start = 16.dp)
            )
            Box(
                modifier = Modifier
                    .padding(start = 16.dp, top = 6.dp)
                    .height(3.dp)
                    .width(80.dp)
                    .background(Color(0xFFFF6A00))
            )*/
            Text(
                text = "“${team.quote}”",
                fontSize = 15.sp,
                fontStyle = FontStyle.Italic,
                letterSpacing = 0.6.sp,
                color = Color.White,
                style = MaterialTheme.typography.bodyMedium.copy(
                    shadow = Shadow(
                        color = Color.Black.copy(alpha = 0.85f),
                        offset = Offset(2f, 2f),
                        blurRadius = 6f
                    )
                ),
                modifier = Modifier
                    .padding(start = 16.dp, top = 10.dp)
            )

            Spacer(Modifier.height(250.dp)) // 👈 lets background breathe

            // ─────────────────────────
            // ⬇️ ACTION AREA
            // ─────────────────────────
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {

                // ── FIRST BUTTON + ICONS + DIFFICULTY ──
                Box(modifier = Modifier.fillMaxWidth()
                    .padding(top = 32.dp)) {

                    // 🧠 ARCHETYPE ICONS (OVERLAY)
                    Row(
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .offset(y = (-65).dp)
                            .zIndex(1f),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        team.archetypes.forEach { archetype ->
                            Image(
                                painter = painterResource(archetypeIconRes(archetype)),
                                contentDescription = archetype.name,
                                modifier = Modifier
                                    .size(60.dp)
                                    .alpha(0.95f)

                            )
                        }
                    }

                    // FIRST BUTTON
                    TeamActionButton(
                        text = "View Operatives",
                        onClick = onOperativesClick
                    )

                    // 🎯 DIFFICULTY BADGE

                    Column(
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .offset(y = (-42).dp),
                        horizontalAlignment = Alignment.End
                    ) {
                        Text(
                            text = team.type.name.lowercase()
                                .replaceFirstChar { it.uppercase() },
                            color = Color(0xFFFF6A00),
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.labelSmall
                        )

                        Text(
                            text = "Difficulty: ${team.difficulty}",
                            color = Color.White,
                            style = MaterialTheme.typography.labelSmall
                        )
                    }
                }

                TeamActionButton(
                    text = "Operatives Selection",
                    onClick = onOperativeSelectionClick
                )

                TeamActionButton(
                    text = "Faction Rules",
                    onClick = onFactionRulesClick
                )

                TeamActionButton(
                    text = "Equipment",
                    onClick = onEquipmentClick
                )

                TeamActionButton(
                    text = "Ploys",
                    onClick = onPloysClick
                )
                TeamActionButton(
                    text = "Hobby Helper",
                    onClick = onHobbyHelperClick
                )

                Spacer(Modifier.height(24.dp))
            }
        }
    }
}

// ─────────────────────────
// 🔘 BUTTON
// ─────────────────────────
@Composable
fun TeamActionButton(
    text: String,
    onClick: () -> Unit
)  {
    OutlinedButton(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(52.dp),
        shape = RoundedCornerShape(4.dp), // grimdark square
        border = BorderStroke(2.dp, Color(0xFFFF6A00)),
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = Color.Black,
            contentColor = Color.White
        )
    ) {
        Text(
            text = text.uppercase(),
            fontWeight = FontWeight.Bold,
            letterSpacing = 1.sp
        )
    }
}

// ─────────────────────────
// 🧠 ARCHETYPE ICON MAP
// ─────────────────────────
fun archetypeIconRes(archetype: Archetypes): Int =
    when (archetype) {
        Archetypes.SECURITY -> R.drawable.ic_security
        Archetypes.RECON -> R.drawable.ic_recon
        Archetypes.SEEK_AND_DESTROY -> R.drawable.ic_seek_destroy
        Archetypes.INFILTRATION -> R.drawable.ic_infiltration
    }