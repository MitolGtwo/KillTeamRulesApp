package com.example.killteamruleset.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.example.killteamruleset.ui.data.OperativeRepository
import com.example.killteamruleset.ui.data.TeamRepository
import com.example.killteamruleset.ui.model.Alliance
import com.example.killteamruleset.ui.model.Archetypes
import com.example.killteamruleset.ui.screens.AllianceSelectionScreen
import com.example.killteamruleset.ui.screens.ColorSchemesScreen
import com.example.killteamruleset.ui.screens.EquipmentScreen
import com.example.killteamruleset.ui.screens.FactionRulesScreen
import com.example.killteamruleset.ui.screens.HobbyHelperScreen
import com.example.killteamruleset.ui.screens.OperativeSelectionScreen
import com.example.killteamruleset.ui.screens.OperativesListScreen
import com.example.killteamruleset.ui.screens.PloysScreen
import com.example.killteamruleset.ui.screens.TacOpScreen
import com.example.killteamruleset.ui.screens.TeamDetailScreen
import com.example.killteamruleset.ui.screens.TeamsScreen
import com.example.killteamruleset.ui.screens.ColorSchemesScreen
import com.example.killteamruleset.ui.screens.AssemblyGuideScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "alliances"
    ) {

        composable("alliances") {
            AllianceSelectionScreen(
                onTeamSelected = { team ->
                    navController.navigate("team/${team.id}")
                }
            )
        }

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

        // ✅ TEAM DETAIL (ONLY ONCE)
        composable("team/{teamId}") { backStack ->
            val teamId = backStack.arguments?.getString("teamId")!!
            val team = TeamRepository.getTeamById(teamId)

            TeamDetailScreen(
                team = team,
                onOperativesClick = {
                    navController.navigate("operatives/${team.id}")
                },
                onOperativeSelectionClick = {
                    navController.navigate("operativeSelection/${team.id}")
                },
                onFactionRulesClick = {
                    navController.navigate("factionRules/${team.id}")
                },
                onEquipmentClick = {
                    navController.navigate("equipment/${team.id}")
                },
                onPloysClick = {
                    navController.navigate("ploys/${team.id}")
                },
                onHobbyHelperClick = {
                    navController.navigate("hobbyHelper/${team.id}")
                },

                onBack = {
                    navController.popBackStack()
                }
            )
        }

        composable("operatives/{teamId}") { backStack ->
            val teamId = backStack.arguments?.getString("teamId")!!
            val operatives = OperativeRepository.getOperativesForTeam(teamId)

            OperativesListScreen(
                operatives = operatives,
                onBack = { navController.popBackStack() }
            )
        }

        composable("operativeSelection/{teamId}") { backStack ->
            val teamId = backStack.arguments?.getString("teamId")!!

            OperativeSelectionScreen(
                teamId = teamId,
                navController = navController,
                onBack = { navController.popBackStack() }
            )
        }

        composable("tacops/{archetype}") { backStack ->
            val archetype = Archetypes.valueOf(
                backStack.arguments?.getString("archetype")!!
            )

            TacOpScreen(
                initialArchetype = archetype,
                onBack = { navController.popBackStack() }
            )
        }

        composable("factionRules/{teamId}") { backStack ->
            val teamId = backStack.arguments?.getString("teamId")!!

            FactionRulesScreen(
                teamId = teamId,
                onBack = { navController.popBackStack() }
            )
        }

        composable("equipment/{teamId}") { backStack ->
            val teamId = backStack.arguments?.getString("teamId")!!

            EquipmentScreen(
                teamId = teamId,
                onBack = { navController.popBackStack() }
            )
        }

        composable("ploys/{teamId}") { backStack ->
            val teamId = backStack.arguments?.getString("teamId")!!

            PloysScreen(
                teamId = teamId,
                onBack = { navController.popBackStack() }
            )


        }
        composable("hobbyHelper/{teamId}") { backStack ->
            val teamId = backStack.arguments?.getString("teamId")!!

            HobbyHelperScreen(
                teamId = teamId,
                onBack = { navController.popBackStack() },
                onColorSchemesClick = {
                    navController.navigate("colorSchemes/$teamId")
                },
                onAssemblyGuideClick = {
                    navController.navigate("assemblyGuide/$teamId")
                }
            )

        }
        composable("colorSchemes/{teamId}") { backStack ->
            val teamId = backStack.arguments?.getString("teamId")!!
            ColorSchemesScreen(
                teamId = teamId,
                onBack = { navController.popBackStack() }
            )
        }

        composable("assemblyGuide/{teamId}") { backStack ->
            val teamId = backStack.arguments?.getString("teamId")!!

            AssemblyGuideScreen(
                teamId = teamId,
                onBack = { navController.popBackStack() }
            )
        }


    }
}