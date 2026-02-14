package com.example.killteamruleset.ui.components

import android.app.Activity
import com.example.killteamruleset.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.killteamruleset.ui.localization.LocaleUtils
import com.example.killteamruleset.ui.localization.setAppLocale
import com.example.killteamruleset.ui.model.AppLanguage
import com.example.killteamruleset.ui.model.ResourceMenuItem
import com.example.killteamruleset.ui.navigation.AppNavigation
import kotlinx.coroutines.launch

@Composable
fun ResourcesDrawerContent(
    drawerState: DrawerState,
    onItemClick: (ResourceMenuItem) -> Unit
) {
    val context = LocalContext.current

    // 🔁 THIS makes Compose re-read after recreation
    val currentLang = LocaleUtils.getSavedLanguage(context)

    val flagRes = if (currentLang == "es")
        R.drawable.colombia_flag
    else
        R.drawable.uk_flag

    val items = listOf(
        ResourceMenuItem("maps_critops", "Map / CritOps"),
        ResourceMenuItem("tacops", "Tac Ops"),
        ResourceMenuItem("keywords", "Keywords"),
        ResourceMenuItem("general_rules", "General Rules"),
        ResourceMenuItem("profile", "Profile"),
        ResourceMenuItem("language", "Language")
    )

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .width(280.dp)
            .background(
                color = MaterialTheme.colorScheme.surfaceVariant,
                shape = RoundedCornerShape(topEnd = 16.dp, bottomEnd = 16.dp)
            )
            .padding(16.dp)
    ) {

        Text(
            text = stringResource(R.string.resources),
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        items.forEach { item ->
            if (item.id == "language") {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { onItemClick(item) }
                        .padding(vertical = 12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(flagRes),
                        contentDescription = null,
                        tint = Color.Unspecified,
                        modifier = Modifier.size(20.dp)
                    )

                    Spacer(Modifier.width(8.dp))

                    Text(
                        color = Color.White,
                        text = stringResource(R.string.language),
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            } else {
                Text(
                    text = item.title,
                    color = Color.White ,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 12.dp)
                        .clickable { onItemClick(item) },
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
    }
}

@Composable
fun MainScaffold(navController: NavHostController) {
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val context = LocalContext.current
    var isSpanish by rememberSaveable { mutableStateOf(false) }

    ModalNavigationDrawer(
        drawerState = drawerState,
        scrimColor = Color.Black.copy(alpha = 1.0f), // 🔥 darker overlay
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

                            // 🔁 Recreate ONLY HERE
                            (context as Activity).recreate()


                        }
                    }
                }
            )
        }
    ) {
        AppNavigation(navController)
    }
}

