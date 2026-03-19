package com.example.killteamruleset.ui.data

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.map

private val Context.dataStore by preferencesDataStore("profile_prefs")

object ProfileRepository {

    private val NAME_KEY = stringPreferencesKey("player_name")

    fun getNameFlow(context: Context) =
        context.dataStore.data.map { prefs ->
            prefs[NAME_KEY] ?: ""
        }

    suspend fun saveName(context: Context, name: String) {
        context.dataStore.edit { prefs ->
            prefs[NAME_KEY] = name
        }
    }
}