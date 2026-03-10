package com.example.killteamruleset.ui.util


import android.app.Activity
import android.content.Context
import java.util.Locale

object LocaleManager {

    fun setLocale(context: Context, languageCode: String) {

        val locale = Locale(languageCode)
        Locale.setDefault(locale)

        val config = context.resources.configuration
        config.setLocale(locale)

        context.resources.updateConfiguration(
            config,
            context.resources.displayMetrics
        )

        if (context is Activity) {
            context.recreate()
        }
    }
}