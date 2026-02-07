package com.example.killteamruleset.ui.data

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*
import kotlin.reflect.KClass
object KeywordRepository {

    // STATIC KEYWORDS ONLY

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
            Poison,
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

    // DESCRIPTIONS (BY CLASS)
    private val descriptions: Map<KClass<out KeywordInfo>, Int> = mapOf(

        Accurate::class to R.string.keyword_accurate,
        Balanced::class to R.string.keyword_balanced,
        Blast::class to R.string.keyword_blast,
        Brutal::class to R.string.keyword_brutal,
        Ceaseless::class to R.string.keyword_ceaseless,
        Concealed_Position::class to R.string.keyword_concealed_position,
        Devastating::class to R.string.keyword_devastating,
        Heavy::class to R.string.keyword_heavy,
        Hot::class to R.string.keyword_hot,
        Lethal::class to R.string.keyword_lethal,
        Limited::class to R.string.keyword_limited,
        Obscure::class to R.string.keyword_obscure,
        Psychic::class to R.string.keyword_psychic,
        Piercing::class to R.string.keyword_piercing,
        Piercing_Crits::class to R.string.keyword_piercing_Crits,
        Punishing::class to R.string.keyword_punishing,
        Range::class to R.string.keyword_range,
        Relentless::class to R.string.keyword_relentless,
        Rending::class to R.string.keyword_rending,
        Saturate::class to R.string.keyword_saturate,
        Seek_light::class to R.string.keyword_seek_light,
        Seek::class to R.string.keyword_seek,
        Severe::class to R.string.keyword_severe,
        Shock::class to R.string.keyword_shock,
        Silent::class to R.string.keyword_silent,
        Stun::class to R.string.keyword_stun,
        Torrent::class to R.string.keyword_torrent



        /*
        Balanced::class to
                "You can re-roll one attack die.",

        Blast::class to
                "The target you select for a shoot action becomes the Primary target, and every other operative" +
                " within X Blast distance and visible to the Primary Target becomes the Secondary targets(Regardless of their order). Resolve " +
                " the shoot action for the Primary target, then roll another shoot action for every Secondary Target" +
                " (You have to roll dice for every valid target) if the Primary target was Obscure and/or in cover," +
                " the Secondary targets will have those modifiers as well. ",

        Brutal::class to
                "Your opponent can only parry with critical successes.",

        Ceaseless::class to
                "You can re-roll all attack dice showing the same result(Ex: all dice with a result of 2).",

        Concealed_Position::class to
                "This weapon can be used once while Concealed without changing order.",

        Devastating::class to
                "Critical hits inflict immediate damage equal to the Devastating value, the dice are " +
                " not discarded. If there´s Range associate with the keyword, inflict that damage each other operative in that" +
                " distance.",
        Heavy::class to
                "An operative cannot use this weapon if it moved during its activation, " +
                "and it cannot move after performing a Shoot action with this weapon.\n\n" +
                "If marked Heavy (Reposition), Reposition is the only movement action " +
                "allowed that still permits shooting in the same activation.\n\n" +
                "An operative cannot use Guard with a Heavy weapon if these conditions are not met.",

        Hot::class to
                "After an operative shoots with this weapon, roll one D6, if the result" +
                " is equal or greater than the Hit stat nothing happens, if the roll is less than" +
                " the Hit stat, duplicate the value and deal that amount of damage to the friendly " +
                "operative who made the shoot action." +
                " If you hit multiple targets, Ex: Blast. Still roll only one D6.",

        Lethal::class to
                "Your successes equal or greater to Lethal x value are Critical successes.",

        Limited::class to
                "After an operative uses this weapon x number of times, it cannot use this weapon" +
                " again, if it hits multiple targets, Ex: Blast/Torrent. still treat it " +
                "as only one use.",

        Obscure::class to
                "Whenever an Operative Shoot another Opeative while this is Obscure, all Critical " +
                "successes will become Normal successes, any rule around Critical success is ignored" +
                "(Ex: Devastating, Piercing Crits, Punishing ) .",

        Psychic::class to
                "This action or weapon is a psychic attack.",

        Piercing::class to
                "The defender picks one less dice based on the Piercing X value.",

        Piercing_Crits::class to
                "The defender picks one less dice based on the Piercing Crits X value, If you score" +
                " a Critical success.",

        Poison::class to
                "In the Resolve Attack Dice step, if you inflict damage with any successes, the " +
                "operative this weapon is being used against (excluding friendly PLAGUE MARINE " +
                "operatives) gains one of your Poison tokens (if it doesn’t already have one). " +
                "Whenever an operative that has one of your Poison tokens is activated, inflict 1 " +
                "damage on it.",

        Punishing::class to
                "If you retain any critical successes, you can change one failed dice into one" +
                " success normal attack.",

        Range::class to
                "Only operatives within X inches can be targeted.",

        Relentless::class to
                "You can re-roll all attack dice.",

        Rending::class to
                "Convert one normal hit into a critical when retaining a critical.",

        Saturate::class to
                "The defender cannot retain cover saves.",

        Seek_light::class to
                "For the purpose of selecting a valid target for a shoot action, you can" +
                " select operatives in Conceal if they are being cover by light terrain. This" +
                " doesn´t prevent Cover Saves if any.",

        Seek::class to
                "For the purpose of selecting a valid target for a shoot action, you can" +
                " select operatives in Conceal. This doesn´t prevent any Cover Saves if any.",

        Severe::class to
                "If you don´t make any Critical success, you can change one Normal success" +
                " into a Critical success, any rule such as Devastating or Piercing Crits X is " +
                "applied accordingly, but it cannot be combine in any way with the rules Punishing" +
                " or Rending, Ex: You cant just have 2 free Crits lmao.",

        Shock::class to
                "The first time you strike with a Critical success, discard one of your" +
                " opponent´s unresolved Normal success, if the opponent has no more Normal" +
                " Successes, discard one of it´s Critical successes if any.",

        Silent::class to
                "This weapon can be used while having a Conceal order.",

        Stun::class to
                "If you retain any Critical success with this weapon, the enemy operative" +
                " loses 1 Apl until the start of it´s next activation.",

        Torrent::class to
                "Select one valid target, this will be the Primary target, then select any" +
                " number of secondary targets if they are valid as well and, if they are within" +
                " Torrent X value range of the Primary objective. You cant select enemy targets " +
                " in Control range of a friendly operative." +
                "Shoot this weapon against all of them, roll separately for each.",

        Toxic::class to
                "Whenever this Operative is using this weapon against an enemy operative that has one of" +
                " your Poison tokens, add 1 to both Dmg stats of this weapon."

         */
    )

    // LOOKUP FUNCTIONS
    fun findByName(name: String): com.example.killteamruleset.ui.model.KeywordInfo? =
        allKeywords.firstOrNull { it.name.equals(name, ignoreCase = true) }

    fun getDescription(
        context: android.content.Context,
        keyword: com.example.killteamruleset.ui.model.KeywordInfo
    ): String {
        val resId = descriptions[keyword::class] ?: return ""
        return context.getString(resId)
    }
}