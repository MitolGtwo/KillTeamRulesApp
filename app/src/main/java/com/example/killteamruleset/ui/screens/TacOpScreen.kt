package com.example.killteamruleset.ui.screens


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.components.ArchetypeDropdown
import com.example.killteamruleset.ui.components.KillTeamBackground
import com.example.killteamruleset.ui.components.KillTeamWhiteBackground
import com.example.killteamruleset.ui.components.TacOpCard
import com.example.killteamruleset.ui.components.TacOpsSection
import com.example.killteamruleset.ui.data.TacOpRepository
import com.example.killteamruleset.ui.model.Archetypes
import com.example.killteamruleset.ui.model.KeywordInfo
import com.example.killteamruleset.ui.theme.Black

@Composable
fun TacOpScreen(
    initialArchetype: Archetypes? = null,
    onBack: () -> Unit
) {
    var selectedArchetype by remember {
        mutableStateOf(initialArchetype)
    }

    val tacOps = remember(selectedArchetype) {
        if (selectedArchetype == null)
            TacOpRepository.getAll()
        else
            TacOpRepository.getByArchetype(selectedArchetype!!)
    }

    KillTeamWhiteBackground {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .verticalScroll(rememberScrollState())
                .navigationBarsPadding()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            // BACK
            Text(
                text = "← Back",
                modifier = Modifier.clickable { onBack() },
                color = MaterialTheme.colorScheme.primary
            )

            // HEADER
            Text(
                text = "TAC OPS",
                style = MaterialTheme.typography.titleLarge,
                color = Black,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            // FILTER DROPDOWN 👇
            ArchetypeDropdown(
                selected = selectedArchetype,
                onSelected = { selectedArchetype = it }
            )

            Spacer(Modifier.height(8.dp))

            TacOpsSection(tacOps = tacOps)
        }
    }
}