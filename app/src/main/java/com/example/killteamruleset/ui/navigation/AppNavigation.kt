package com.example.killteamruleset.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.killteamruleset.state.BattleRepository
import com.example.killteamruleset.state.BattleUIState
import com.example.killteamruleset.ui.components.MainDashboard
import com.example.killteamruleset.ui.screens.MapsScreen
import com.example.killteamruleset.ui.data.OperativeRepository
import com.example.killteamruleset.ui.data.ProfileRepository
import com.example.killteamruleset.ui.data.TeamRepository
import com.example.killteamruleset.ui.model.Alliance
import com.example.killteamruleset.ui.model.Archetypes
import com.example.killteamruleset.ui.model.TeamScreen
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
import com.example.killteamruleset.ui.screens.BattleSetupStep2Screen
import com.example.killteamruleset.ui.screens.BattleSummaryScreen

import com.example.killteamruleset.ui.screens.BattleTrackerScreen
import com.example.killteamruleset.ui.screens.BattleTrackerScreenV2
import com.example.killteamruleset.ui.screens.CritOpsScreen
import com.example.killteamruleset.ui.screens.GeneralRulesScreen
import com.example.killteamruleset.ui.screens.KeywordsScreen
import com.example.killteamruleset.ui.screens.MainScreen
import com.example.killteamruleset.ui.screens.MapsCritOpsScreen
import com.example.killteamruleset.ui.screens.ProfileScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "main"
    ) {

        // ─────────────────────────────
        // 🏠 MAIN SHELL (BOTTOM BAR + DRAWER)
        // ─────────────────────────────
        composable(route = "main") {
            MainScreen(navController = navController) {
                MainDashboard()
            }
        }

        // ─────────────────────────────
        // 📚 RESOURCES FLOW
        // ─────────────────────────────
        composable(route = "maps_critops") {
            MapsCritOpsScreen(
                onMapsClick = { navController.navigate("maps") },
                onCritOpsClick = { navController.navigate("critops") }
            )
        }

        composable("maps") {
            MapsScreen(
                onBack = { navController.popBackStack() }
            )
        }

        composable("critops") {
            CritOpsScreen(
                onBack = { navController.popBackStack() },
                onKeywordClick = {}
            )
        }

        // ─────────────────────────────
        // 🧬 ALLIANCES & TEAMS
        // ─────────────────────────────
        composable("alliances/{isPlayer}") { backStack ->

            val isPlayer = backStack.arguments
                ?.getString("isPlayer")
                ?.toBoolean() ?: true

            AllianceSelectionScreen(
                onTeamSelected = { team ->

                    if (isPlayer) {
                        BattleUIState.playerTeam.value = team
                    } else {
                        BattleUIState.opponentTeam.value = team
                    }

                    navController.popBackStack()
                }
            )
        }
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

        // ─────────────────────────────
        // ⚔️ OPERATIVES
        // ─────────────────────────────
        composable("operatives/{teamId}") { backStack ->
            val teamId = backStack.arguments?.getString("teamId")!!
            val operatives = OperativeRepository.getOperativesForTeam(teamId)

            OperativesListScreen(
                teamId = teamId,
                operatives = operatives,
                onBack = { navController.popBackStack() },
                onNavigate = { screen ->

                    when (screen) {
                        TeamScreen.OPERATIVES -> {
                            navController.navigate("operatives/$teamId")
                        }
                        TeamScreen.SELECTION -> {
                            navController.navigate("operativeSelection/$teamId")
                        }
                        TeamScreen.RULES -> {
                            navController.navigate("factionRules/$teamId")
                        }
                        TeamScreen.EQUIPMENT -> {
                            navController.navigate("equipment/$teamId")
                        }
                        TeamScreen.PLOYS -> {
                            navController.navigate("ploys/$teamId")
                        }
                    }
                }
            )
        }

        composable("operativeSelection/{teamId}") { backStack ->
            val teamId = backStack.arguments?.getString("teamId")!!

            OperativeSelectionScreen(
                teamId = teamId,
                navController = navController,
                onBack = { navController.popBackStack() },
                onNavigate = { screen ->
                    when (screen) {
                        TeamScreen.OPERATIVES -> {
                            navController.navigate("operatives/$teamId") {
                                popUpTo("team/$teamId")
                                launchSingleTop = true
                            }
                        }

                        TeamScreen.SELECTION -> {
                            navController.navigate("operativeSelection/$teamId") {
                                popUpTo("team/$teamId")
                                launchSingleTop = true
                            }
                        }

                        TeamScreen.RULES -> {
                            navController.navigate("factionRules/$teamId") {
                                popUpTo("team/$teamId")
                                launchSingleTop = true
                            }
                        }

                        TeamScreen.EQUIPMENT -> {
                            navController.navigate("equipment/$teamId") {
                                popUpTo("team/$teamId")
                                launchSingleTop = true
                            }
                        }

                        TeamScreen.PLOYS -> {
                            navController.navigate("ploys/$teamId") {
                                popUpTo("team/$teamId")
                                launchSingleTop = true
                            }
                        }
                    }
                }
            )
        }

        // ─────────────────────────────
        // 🎯 TAC OPS
        // ─────────────────────────────
        composable("tacops/{archetype}") { backStack ->
            val archetype = Archetypes.valueOf(
                backStack.arguments?.getString("archetype")!!
            )

            TacOpScreen(
                initialArchetype = archetype,
                onBack = { navController.popBackStack() }
            )
        }
        composable("tacops") {
            TacOpScreen(
                initialArchetype = null, // 👈 show ALL tac ops
                onBack = { navController.popBackStack() }
            )
        }




        // ─────────────────────────────
        // 📜 RULES & EQUIPMENT
        // ─────────────────────────────
        composable("factionRules/{teamId}") { backStack ->
            val teamId = backStack.arguments?.getString("teamId")!!

            FactionRulesScreen(
                teamId = teamId,
                onBack = { navController.popBackStack() },
                onNavigate = { screen ->
                    when (screen) {
                        TeamScreen.OPERATIVES -> {
                            navController.navigate("operatives/$teamId") {
                                popUpTo("team/$teamId")
                                launchSingleTop = true
                            }
                        }
                        TeamScreen.SELECTION -> {
                            navController.navigate("operativeSelection/$teamId") {
                                popUpTo("team/$teamId")
                                launchSingleTop = true
                            }
                        }
                        TeamScreen.RULES -> {
                            navController.navigate("factionRules/$teamId") {
                                popUpTo("team/$teamId")
                                launchSingleTop = true
                            }
                        }
                        TeamScreen.EQUIPMENT -> {
                            navController.navigate("equipment/$teamId") {
                                popUpTo("team/$teamId")
                                launchSingleTop = true
                            }
                        }
                        TeamScreen.PLOYS -> {
                            navController.navigate("ploys/$teamId") {
                                popUpTo("team/$teamId")
                                launchSingleTop = true
                            }
                        }
                    }
                }
            )
        }

        composable("equipment/{teamId}") { backStack ->
            val teamId = backStack.arguments?.getString("teamId")!!

            EquipmentScreen(
                teamId = teamId,
                onBack = { navController.popBackStack() },
                onNavigate = { screen ->
                    when (screen) {
                        TeamScreen.OPERATIVES -> {
                            navController.navigate("operatives/$teamId") {
                                popUpTo("team/$teamId")
                                launchSingleTop = true
                            }
                        }
                        TeamScreen.SELECTION -> {
                            navController.navigate("operativeSelection/$teamId") {
                                popUpTo("team/$teamId")
                                launchSingleTop = true
                            }
                        }
                        TeamScreen.RULES -> {
                            navController.navigate("factionRules/$teamId") {
                                popUpTo("team/$teamId")
                                launchSingleTop = true
                            }
                        }
                        TeamScreen.EQUIPMENT -> {
                            navController.navigate("equipment/$teamId") {
                                popUpTo("team/$teamId")
                                launchSingleTop = true
                            }
                        }
                        TeamScreen.PLOYS -> {
                            navController.navigate("ploys/$teamId") {
                                popUpTo("team/$teamId")
                                launchSingleTop = true
                            }
                        }
                    }
                }
            )
        }

        composable("ploys/{teamId}") { backStack ->
            val teamId = backStack.arguments?.getString("teamId")!!

            PloysScreen(
                teamId = teamId,
                onBack = { navController.popBackStack() },
                onNavigate = { screen ->
                    when (screen) {
                        TeamScreen.OPERATIVES -> {
                            navController.navigate("operatives/$teamId") {
                                popUpTo("team/$teamId")
                                launchSingleTop = true
                            }
                        }
                        TeamScreen.SELECTION -> {
                            navController.navigate("operativeSelection/$teamId") {
                                popUpTo("team/$teamId")
                                launchSingleTop = true
                            }
                        }
                        TeamScreen.RULES -> {
                            navController.navigate("factionRules/$teamId") {
                                popUpTo("team/$teamId")
                                launchSingleTop = true
                            }
                        }
                        TeamScreen.EQUIPMENT -> {
                            navController.navigate("equipment/$teamId") {
                                popUpTo("team/$teamId")
                                launchSingleTop = true
                            }
                        }
                        TeamScreen.PLOYS -> {
                            navController.navigate("ploys/$teamId") {
                                popUpTo("team/$teamId")
                                launchSingleTop = true
                            }
                        }
                    }
                }
            )
        }

        composable(route = "keywords") {
            KeywordsScreen(
                onBack = { navController.popBackStack() }
            )
        }

        // ─────────────────────────────
        // 🎨 HOBBY
        // ─────────────────────────────
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


        composable("general_rules") {
            GeneralRulesScreen(
                onBack = { navController.popBackStack() }
            )
        }

        composable("profile") {
            ProfileScreen()
        }

        composable("battleTracker") {
            BattleTrackerScreen(
                onSelectTeam = { isPlayer ->
                    navController.navigate("alliances/$isPlayer")
                },
                onNext = {
                    navController.navigate("battleSetupStep2")
                }
            )

        }

        composable("battleSetupStep2") {
            BattleSetupStep2Screen(
                onBack = { navController.popBackStack() },
                onNext = {
                    navController.navigate("battleSetupStep3") // 👈 next step
                }
            )
        }

        composable("battleSetupStep3") {

            val context = LocalContext.current

            val playerName by ProfileRepository
                .getNameFlow(context)
                .collectAsState(initial = "")

            val opponentName by BattleUIState.opponentName
            val playerTeam by BattleUIState.playerTeam
            val opponentTeam by BattleUIState.opponentTeam

            BattleTrackerScreenV2(
                navController = navController,
                playerName = playerName,
                opponentName = opponentName,
                playerTeam = playerTeam,
                opponentTeam = opponentTeam
            )
        }

        composable("teamPloys/{teamId}") { backStackEntry ->

            val teamId = backStackEntry.arguments?.getString("teamId") ?: return@composable

            PloysScreen(
                teamId = teamId,
                onBack = { navController.popBackStack() },
                onNavigate = { screen ->
                    navController.navigate("team/${teamId}") // fallback if needed
                }
            )
        }

        composable("battle_summary") {

            val context = LocalContext.current
            val battle by BattleRepository.loadCurrentBattle(context)
                .collectAsState(initial = null)

            battle?.let {

                val playerVP = it.turns.sumOf { t ->
                    t.playerCrit + t.playerTac + t.playerKill
                }

                val opponentVP = it.turns.sumOf { t ->
                    t.opponentCrit + t.opponentTac + t.opponentKill
                }

                val playerIcon =
                    TeamRepository.getTeamById(it.playerTeamId)?.iconRes ?: 0

                val opponentIcon =
                    TeamRepository.getTeamById(it.opponentTeamId)?.iconRes ?: 0

                BattleSummaryScreen(
                    playerVP = playerVP,
                    opponentVP = opponentVP,
                    playerTeamIcon = playerIcon,
                    opponentTeamIcon = opponentIcon
                )
            }
        }



    }

}