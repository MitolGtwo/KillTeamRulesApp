package com.example.killteamruleset.ui.localization

import android.app.Activity
import android.content.Context
import android.content.res.Configuration
import java.util.Locale

object LocaleUtils {

    private const val PREFS_NAME = "app_prefs"
    private const val KEY_LANGUAGE = "language"

    fun getSavedLanguage(context: Context): String {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        return prefs.getString(KEY_LANGUAGE, "en") ?: "en"
    }

    fun saveLanguage(context: Context, language: String) {
        context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            .edit()
            .putString(KEY_LANGUAGE, language)
            .apply()
    }
}