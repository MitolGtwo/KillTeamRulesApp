package com.example.killteamruleset.ui.data

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringSetPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.dataStore by preferencesDataStore("favorites")

object FavoritesRepository {

    private val FAVORITES_KEY = stringSetPreferencesKey("favorite_teams")

    fun favoritesFlow(context: Context): Flow<Set<String>> =
        context.dataStore.data.map { prefs ->
            prefs[FAVORITES_KEY] ?: emptySet()
        }

    suspend fun toggleFavorite(context: Context, teamId: String) {
        context.dataStore.edit { prefs ->
            val current = prefs[FAVORITES_KEY] ?: emptySet()
            prefs[FAVORITES_KEY] =
                if (teamId in current) current - teamId else current + teamId
        }
    }
}