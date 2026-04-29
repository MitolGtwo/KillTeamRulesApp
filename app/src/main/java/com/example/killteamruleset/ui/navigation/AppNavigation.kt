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
import com.example.killteamruleset.state.OpponentPrimaryOpState
import com.example.killteamruleset.state.OpponentScoreState
import com.example.killteamruleset.state.PlayerPrimaryOpState
import com.example.killteamruleset.state.PlayerScoreState
import com.example.killteamruleset.ui.components.MainDashboard
import com.example.killteamruleset.ui.components.applyPrimaryOpBonus
import com.example.killteamruleset.ui.screens.MapsScreen
import com.example.killteamruleset.ui.data.OperativeRepository
import com.example.killteamruleset.ui.data.ProfileRepository
import com.example.killteamruleset.ui.data.TacOpRepository.getTacOpTitle
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
        composable(route = "main") {
            MainScreen(navController = navController) {
                MainDashboard(navController)
            }
        }

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


        // 🧬 ALLIANCES & TEAMS

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

            fun calculatePrimaryBonus(base: Int): Pair<Int, Int> {
                val bonus = kotlin.math.ceil(base / 2.0).toInt()
                val total = base + bonus
                return Pair(bonus, total)
            }


            fun getPrimaryBaseValue(
                primary: String?,
                crit: Int,
                tac: Int,
                kill: Int
            ): Int {
                return when (primary) {
                    "CRIT" -> crit
                    "TAC" -> tac
                    "KILL" -> kill
                    else -> 0
                }
            }




            val context = LocalContext.current
            val battle by BattleRepository.loadCurrentBattle(context)
                .collectAsState(initial = null)

            battle?.let { currentBattle ->

                val playerName by ProfileRepository
                    .getNameFlow(context)
                    .collectAsState(initial = "")
                val opponentName = currentBattle.opponentName

                val playerTeam =
                    TeamRepository.getTeamById(currentBattle.playerTeamId)

                val opponentTeam =
                    TeamRepository.getTeamById(currentBattle.opponentTeamId)



                val baseCrit = PlayerScoreState.critOp.value
                val baseTac = PlayerScoreState.tacOp.value
                val baseKill = PlayerScoreState.killOp.value

                val (finalCrit, finalTac, finalKill) =
                    applyPrimaryOpBonus(
                        baseCrit,
                        baseTac,
                        baseKill,
                        PlayerPrimaryOpState.selectedOp.value
                    )

                val playerVP = finalCrit + finalTac + finalKill

                val baseCritO = OpponentScoreState.critOp.value
                val baseTacO = OpponentScoreState.tacOp.value
                val baseKillO = OpponentScoreState.killOp.value

                val (finalCritO, finalTacO, finalKillO) =
                    applyPrimaryOpBonus(
                        baseCritO,
                        baseTacO,
                        baseKillO,
                        OpponentPrimaryOpState.selectedOp.value
                    )

                val opponentVP = finalCritO + finalTacO + finalKillO

                val playerIcon: Int =
                    TeamRepository.getTeamById(currentBattle.playerTeamId)?.iconRes ?: 0

                val opponentIcon: Int =
                    TeamRepository.getTeamById(currentBattle.opponentTeamId)?.iconRes ?: 0


                val lastTurn = currentBattle.turns.lastOrNull()

                val playerCrit = lastTurn?.playerCrit ?: 0
                val playerTac = lastTurn?.playerTac ?: 0
                val playerKill = lastTurn?.playerKill ?: 0

                val opponentCrit = lastTurn?.opponentCrit ?: 0
                val opponentTac = lastTurn?.opponentTac ?: 0
                val opponentKill = lastTurn?.opponentKill ?: 0

                val playerTacOpName = getTacOpTitle(lastTurn?.playerTacOp)
                val opponentTacOpName = getTacOpTitle(lastTurn?.opponentTacOp)

                val playerPrimaryOp =
                    PlayerPrimaryOpState.selectedOp.value?.type?.name

                val opponentPrimaryOp =
                    OpponentPrimaryOpState.selectedOp.value?.type?.name


                val playerPrimaryBase = getPrimaryBaseValue(
                    playerPrimaryOp,
                    playerCrit,
                    playerTac,
                    playerKill
                )

                val (playerBonus, playerTotalPrimary) =
                    calculatePrimaryBonus(playerPrimaryBase)


                val opponentPrimaryBase = getPrimaryBaseValue(
                    opponentPrimaryOp,
                    opponentCrit,
                    opponentTac,
                    opponentKill
                )

                val (opponentBonus, opponentTotalPrimary) =
                    calculatePrimaryBonus(opponentPrimaryBase)


                BattleSummaryScreen(


                    playerPrimaryBonus = playerBonus,
                    opponentPrimaryBonus = opponentBonus,

                    mapType = currentBattle.mapType,
                    mapNumber = currentBattle.mapNumber,
                    critOpNumber = currentBattle.critOpNumber,
                    critOpName = currentBattle.critOpName,

                    playerName = playerName,
                    opponentName = currentBattle.opponentName,
                    playerTeamName = playerTeam?.name ?: "Unknown",
                    opponentTeamName = opponentTeam?.name ?: "Unknown",

                    playerVP = playerVP,
                    opponentVP = opponentVP,
                    playerTeamIcon = playerIcon,
                    opponentTeamIcon = opponentIcon,


                    playerCrit = playerCrit,
                    playerTac = playerTac,
                    playerKill = playerKill,
                    opponentCrit = opponentCrit,
                    opponentTac = opponentTac,
                    opponentKill = opponentKill,

                    playerTacOpName = playerTacOpName,
                    opponentTacOpName = opponentTacOpName,
                    playerPrimaryOp = playerPrimaryOp,
                    opponentPrimaryOp = opponentPrimaryOp,
                    navController = navController,
                )


            }
        }



    }

}
