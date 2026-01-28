package com.example.killteamruleset.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.killteamruleset.ui.data.OperativeRepository
import com.example.killteamruleset.ui.data.TeamRepository
import com.example.killteamruleset.ui.model.Alliance
import com.example.killteamruleset.ui.screens.AllianceSelectionScreen
import com.example.killteamruleset.ui.screens.OperativeScreen
import com.example.killteamruleset.ui.screens.OperativesListScreen
import com.example.killteamruleset.ui.screens.TeamDetailScreen
import com.example.killteamruleset.ui.screens.TeamsScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "alliances"
    ) {

        // ─────────────────────────
        // ALLIANCES
        // ─────────────────────────
        composable("alliances") {
            AllianceSelectionScreen(
                onAllianceSelected = { alliance ->
                    navController.navigate("teams/${alliance.name}")
                }
            )
        }

        // ─────────────────────────
        // TEAMS BY ALLIANCE
        // ─────────────────────────
        composable("teams/{alliance}") { backStack ->
            val alliance = Alliance.valueOf(
                backStack.arguments?.getString("alliance")!!
            )

            TeamsScreen(
                alliance = alliance,
                onTeamClick = { team ->
                    navController.navigate("team/${team.id}")
                },
                onBack = { navController.popBackStack() }
            )
        }

        // ─────────────────────────
        // TEAM DETAIL  ✅ THIS WAS MISSING
        // ─────────────────────────
        composable("team/{teamId}") { backStack ->
            val teamId = backStack.arguments?.getString("teamId")!!
            val team = TeamRepository.getTeamById(teamId)

            TeamDetailScreen(
                team = team,
                onOperativesClick = {
                    navController.navigate("operatives/${team.id}")
                },
                onBack = { navController.popBackStack() }
            )
        }

        // ─────────────────────────
        // OPERATIVES LIST
        // ─────────────────────────
        composable("operatives/{teamId}") { backStack ->
            val teamId = backStack.arguments?.getString("teamId")!!
            val operatives = OperativeRepository.getOperativesForTeam(teamId)

            OperativesListScreen(
                operatives = operatives,
                onBack = { navController.popBackStack() }
            )
        }
    }
}