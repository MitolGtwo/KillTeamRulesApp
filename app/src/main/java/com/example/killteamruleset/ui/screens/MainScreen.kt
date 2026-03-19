package com.example.killteamruleset.ui.screens

import android.app.Activity
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
import androidx.compose.runtime.remember
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
import com.example.killteamruleset.R
import com.example.killteamruleset.ui.localization.LocaleUtils

@Composable
fun MainScreen(
    navController: NavController,
    content: @Composable () -> Unit

) {
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val context = LocalContext.current

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
                        "profile" -> navController.navigate("profile")
                        "language" -> {
                            val current = LocaleUtils.getSavedLanguage(context)
                            val next = if (current == "es") "en" else "es"

                            LocaleUtils.saveLanguage(context, next)
                            setAppLocale(context, next)
                            (context as? Activity)?.recreate()
                        }
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
                    onBattleClick = {
                        navController.navigate("battleTracker")
                    },
                    onKillTeamsClick = {
                        navController.navigate("alliances") // ✅ NORMAL FLOW
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
    var currentLang by remember {
        mutableStateOf(LocaleUtils.getSavedLanguage(context))
    }

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
                        "profile" -> {
                            navController.navigate("profile")
                        }

                        // ✅ 👇 THIS IS WHERE IT GOES
                        "language" -> {
                            val newLang = if (currentLang == "es") "en" else "es"

                            LocaleUtils.saveLanguage(context, newLang)

                            currentLang = newLang

                            setAppLocale(
                                context = context,
                                language = newLang
                            )
                            (context as? Activity)?.recreate()
                        }
                    }
                }
            )
        }
    ) {
        AppNavigation(navController)
    }
}

