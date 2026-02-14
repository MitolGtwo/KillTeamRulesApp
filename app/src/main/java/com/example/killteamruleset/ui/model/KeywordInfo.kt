package com.example.killteamruleset.ui.model

import com.example.killteamruleset.R
import kotlinx.coroutines.Job

sealed class KeywordInfo {
    abstract val name: String

    // ✅ default for static keywords
    open val displayName: String get() = name

    // 🔑 used to fetch rule text
    open val baseKey: String get() = name
}

data class Blast(val range: Int) : KeywordInfo() {
    override val name = "Blast"
    override val displayName = "Blast $range\""
}

data class Devastating(val value: Int) : KeywordInfo() {
    override val name = "Devastating"
    override val displayName = "Devastating $value"
}

data class Limited(val value: Int) : KeywordInfo() {
    override val name = "Limited"
    override val displayName = "Limited $value"
}

data class Lethal(val value: Int) : KeywordInfo() {
    override val name = "Lethal"
    override val displayName = "Lethal $value+"
}

data class Range(val inches: Int) : KeywordInfo() {
    override val name = "Range"
    override val displayName = "Range $inches\""
}

data class Piercing(val value: Int) : KeywordInfo() {
    override val name = "Piercing"
    override val displayName = "Piercing $value"
}

data class Piercing_Crits(val value: Int) : KeywordInfo() {
    override val name = "Piercing Crits"
    override val displayName = "Piercing Crits $value"
}

data class Heavy(val restriction: String) : KeywordInfo() {
    override val name = "Heavy"
    override val displayName = "Heavy ($restriction)"
}

data class Torrent(val inches: Int) : KeywordInfo() {
    override val name = "Torrent"
    override val displayName = "Torrent $inches\""
}

object Accurate : KeywordInfo() {
    override val name = "Accurate"
}

object Balanced : KeywordInfo() {
    override val name = "Balanced"
}

object Brutal : KeywordInfo() {
    override val name = "Brutal"
}

object Ceaseless : KeywordInfo() {
    override val name = "Ceaseless"
}

object Concealed_Position : KeywordInfo() {
    override val name = "Concealed Position"
}

object Hot : KeywordInfo() {
    override val name = "Hot"
}

object Obscure : KeywordInfo() {
    override val name = "Obscure"
}

object Psychic : KeywordInfo() {
    override val name = "Psychic"
}

object Punishing : KeywordInfo() {
    override val name = "Punishing"
}

object Poison : KeywordInfo() {
    override val name = "Poison"
}


object Relentless : KeywordInfo() {
    override val name = "Relentless"
}

object Rending : KeywordInfo() {
    override val name = "Rending"
}

object Saturate : KeywordInfo() {
    override val name = "Saturate"
}

object Seek_light : KeywordInfo() {
    override val name = "Seek Light"
}

object Seek : KeywordInfo() {
    override val name = "Seek"
}

object Severe : KeywordInfo() {
    override val name = "Severe"
}

object Shock : KeywordInfo() {
    override val name = "Shock"
}

object Silent : KeywordInfo() {
    override val name = "Silent"
}

object Stun : KeywordInfo() {
    override val name = "Stun"
}

object Toxic : KeywordInfo() {
    override val name = "Toxic"
}


///

object BlastBase : KeywordInfo() {
    override val name = "Blast"
    override val displayName = "Blast"
}

object DevastatingBase : KeywordInfo() {
    override val name = "Devastating"
    override val displayName = "Devastating"
}

object LimitedBase : KeywordInfo() {
    override val name = "Limited"
    override val displayName = "Limited"
}

object LethalBase : KeywordInfo() {
    override val name = "Lethal"
    override val displayName = "Lethal"
}

object RangeBase : KeywordInfo() {
    override val name = "Range"
    override val displayName = "Range"
}

object PiercingBase : KeywordInfo() {
    override val name = "Piercing"
    override val displayName = "Piercing"
}

object PiercingCritsBase : KeywordInfo() {
    override val name = "Piercing Crits"
    override val displayName = "Piercing Crits"
}

object HeavyBase : KeywordInfo() {
    override val name = "Heavy"
    override val displayName = "Heavy"
}

object TorrentBase : KeywordInfo() {
    override val name = "Torrent"
    override val displayName = "Torrent"
}

