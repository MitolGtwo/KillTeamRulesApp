package com.example.killteamruleset

import android.content.Context
import android.content.ContextWrapper
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.killteamruleset.ui.components.MainScaffold
import com.example.killteamruleset.ui.localization.LocaleUtils
import com.example.killteamruleset.ui.localization.setAppLocale
import com.example.killteamruleset.ui.navigation.AppNavigation
import com.example.killteamruleset.ui.theme.KillTeamRuleSetTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 🔑 APPLY SAVED LANGUAGE BEFORE COMPOSE
        val lang = LocaleUtils.getSavedLanguage(this)
        setAppLocale(this, lang)

        setContent {
            KillTeamRuleSetTheme {
                val navController = rememberNavController()
                MainScaffold(navController = navController)
            }
        }
    }
}






@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KillTeamRuleSetTheme {
        Greeting("Android")
    }
}
