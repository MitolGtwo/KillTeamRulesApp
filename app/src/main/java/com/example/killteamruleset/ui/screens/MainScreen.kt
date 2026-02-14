package com.example.killteamruleset.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.killteamruleset.ui.components.BattleDiamond
import com.example.killteamruleset.ui.components.BottomMenu
import com.example.killteamruleset.ui.components.MainDashboard
import com.example.killteamruleset.ui.components.ResourcesDrawerContent
import com.example.killteamruleset.ui.localization.setAppLocale
import com.example.killteamruleset.ui.navigation.AppNavigation
import kotlinx.coroutines.launch

@Composable
fun MainScreen(
    navController: NavController,
    content: @Composable () -> Unit

) {
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ResourcesDrawerContent(
                drawerState = drawerState,
                onItemClick = { item ->
                    scope.launch { drawerState.close() }

                    when (item.id) {
                        "maps_critops" -> navController.navigate("maps_critops")
                        "tacops" -> navController.navigate("tacops")
                        "keywords" -> navController.navigate("keywords")
                        "general_rules" -> navController.navigate("general_rules")

                    }
                }
            )
        }
    ) {
        Scaffold(
            bottomBar = {
                BottomMenu(
                    onResourcesClick = {
                        scope.launch { drawerState.open() }
                    },
                    onBattleClick = { },
                    onKillTeamsClick = {
                        navController.navigate("alliances")
                    }
                )
            }
        ) { padding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
            ) {
                content() // 👈 THIS IS THE KEY
            }
        }
    }
}

@Composable
fun MainScaffold(navController: NavHostController) {
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val context = LocalContext.current

    // 🔁 language state (kept here)
    var isSpanish by rememberSaveable { mutableStateOf(false) }

    ModalNavigationDrawer(
        drawerState = drawerState,
        scrimColor = Color.Black.copy(alpha = 1.0f),
        drawerContent = {
            ResourcesDrawerContent(
                drawerState = drawerState,
                onItemClick = { item ->
                    scope.launch { drawerState.close() }

                    when (item.id) {
                        "maps_critops" -> navController.navigate("maps_critops")
                        "tacops" -> navController.navigate("tacops")
                        "keywords" -> navController.navigate("keywords")
                        "battleflow" -> navController.navigate("battleflow")
                        "profile" -> navController.navigate("profile")

                        // ✅ 👇 THIS IS WHERE IT GOES
                        "language" -> {
                            isSpanish = !isSpanish

                            setAppLocale(
                                context = context,
                                language = if (isSpanish) "es" else "en"
                            )
                        }
                    }
                }
            )
        }
    ) {
        AppNavigation(navController)
    }
}

