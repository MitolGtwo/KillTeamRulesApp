package com.example.killteamruleset.ui.data

import android.content.Context
import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*
import kotlin.reflect.KClass
object KeywordRepository {

    val allKeywords: List<KeywordInfo> = listOf(
        Accurate,
        Balanced,
        Brutal,
        Ceaseless,
        Concealed_Position,
        Hot,
        Obscure,
        Psychic,
        Punishing,
        Relentless,
        Rending,
        Saturate,
        Seek,
        Seek_light,
        Severe,
        Shock,
        Silent,
        Stun,
        Toxic
    )

    private val descriptions = mapOf(
        "Accurate" to R.string.keyword_accurate,
        "Balanced" to R.string.keyword_balanced,
        "Blast" to R.string.keyword_blast,
        "Brutal" to R.string.keyword_brutal,
        "Ceaseless" to R.string.keyword_ceaseless,
        "Concealed Position" to R.string.keyword_concealed_position,
        "Devastating" to R.string.keyword_devastating,
        "Heavy" to R.string.keyword_heavy,
        "Hot" to R.string.keyword_hot,
        "Lethal" to R.string.keyword_lethal,
        "Limited" to R.string.keyword_limited,
        "Obscure" to R.string.keyword_obscure,
        "Psychic" to R.string.keyword_psychic,
        "Piercing" to R.string.keyword_piercing,
        "Piercing Crits" to R.string.keyword_piercing_Crits,
        "Punishing" to R.string.keyword_punishing,
        "Range" to R.string.keyword_range,
        "Relentless" to R.string.keyword_relentless,
        "Rending" to R.string.keyword_rending,
        "Saturate" to R.string.keyword_saturate,
        "Seek" to R.string.keyword_seek,
        "Seek Light" to R.string.keyword_seek_light,
        "Severe" to R.string.keyword_severe,
        "Shock" to R.string.keyword_shock,
        "Silent" to R.string.keyword_silent,
        "Stun" to R.string.keyword_stun,
        "Torrent" to R.string.keyword_torrent

    )

    fun getDescription(context: Context, keyword: KeywordInfo): String {
        val resId = descriptions[keyword.baseKey]
            ?: return "Missing keyword description"

        return context.getString(resId)
    }
    fun findByName(name: String): KeywordInfo? =
        allKeywords.firstOrNull {
            it.name.equals(name, ignoreCase = true)
        }

}