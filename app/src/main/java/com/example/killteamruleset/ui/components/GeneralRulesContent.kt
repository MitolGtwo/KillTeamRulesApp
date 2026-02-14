package com.example.killteamruleset.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.model.GeneralRulesPage

@Composable
fun GeneralRulesContent(page: GeneralRulesPage) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        when (page) {
            GeneralRulesPage.WHAT_YOU_NEED -> GeneralRulesWhatYouNeed()
            GeneralRulesPage.BATTLEFLOW -> GeneralRulesBattleflow()
            GeneralRulesPage.POINTING -> GeneralRulesPointing()
            GeneralRulesPage.OPSTATUS -> GeneralRulesOpStatus()
            GeneralRulesPage.SHOOTING -> GeneralRulesShooting()
            GeneralRulesPage.FIGHTING -> GeneralRulesFighting()
            GeneralRulesPage.KILLZONE -> GeneralRulesKillzones()
            GeneralRulesPage.FAQ -> GeneralRulesFAQ()
        }
    }
}