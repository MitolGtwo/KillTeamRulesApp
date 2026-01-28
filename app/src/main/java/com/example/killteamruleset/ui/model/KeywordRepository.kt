package com.example.killteamruleset.ui.model

import androidx.compose.ui.input.key.Key
import kotlin.collections.mapOf
import kotlin.jvm.java
import kotlin.reflect.KClass

object KeywordRepository {

    // STATIC KEYWORDS ONLY

    val allKeywords: List<KeywordInfo> = listOf(
        Accurate,
        Balanced,
        Brutal,
        Ceaseless,
        Concealed_Position,
        Detonate,
        Explosive,
        Hot,
        Obscure,
        Psychic,
        Punishing,
        Poison,
        Pulsa,
        Relentless,
        Rending,
        Salvo,
        Saturate,
        Seek,
        Seek_light,
        Severe,
        Shock,
        Silent,
        Smash,
        Stun,
        Toxic
    )

    // DESCRIPTIONS (BY CLASS)
    private val descriptions: Map<KClass<out KeywordInfo>, String> = mapOf(

        Accurate::class to
                "You can retain X Accurate results as normal successful before rolling dice.",

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

        Detonate::class to
                "The first time you would inflict damage on an enemy operative with this weapon profile" +
                " during the battle, on a normal success, inflict D6+6 damage on that enemy operative " +
                " and each other operative,on a critical do the same but for 2D6+6(Roll separately for each)" +
                " Then the action ends and you gain 1 Wrecka point + 1 for each operative that was " +
                " incapacitated during this action. Damage from this weapon cannot be reduced or ignored.",

        Devastating::class to
                "Critical hits inflict immediate damage equal to the Devastating value, the dice are " +
                " not discarded. If there´s Range associate with the keyword, inflict that damage each other operative in that" +
                " distance.",

        Explosive::class to
                "This operative can perform the Shoot action with this weapon while being in control" +
                " range of an enemy operative, Don´t select a valid target. Instead, this operative is always" +
                " the primary target and cannot be in cover or Obscured.",

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
                "After an operative uses this weapon x value number of times, it no longer" +
                " has this weapon, if it hits multiple targets, Ex: Blast/Torrent. still treat it " +
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

        Pulsa::class to
                "Don´t select a valid target, place your Pulsa marker visible to this operative, or" +
                " on Vantage terrain of a terrain feature that is visible to this operative. That marker" +
                " gains 1 Pulsa point, then roll attack dice as normal.\n It gains 1 additional Pulsa" +
                " point for each success(up to 3 additional points). \n This token has an area of effect" +
                " equal to its pulsa points, every point is 1\" of additional distance (To a max of 4\")." +
                "\n Deal D3 damage on each operative wholly within your Pulsa marker range(Roll for each).",

        Punishing::class to
                "If you retain any critical successes, you can change one failed dice into one" +
                " success normal attack.",

        Range::class to
                "Only operatives within X inches can be targeted.",

        Relentless::class to
                "You can re-roll all attack dice.",

        Rending::class to
                "Convert one normal hit into a critical when retaining a critical.",

        Salvo::class to
                "Select up to Two different valid targets that aren´t within control range of friendly" +
                " Operatives. Shoot with this weapon against both primary targets in an order of your" +
                " choice, then against all remaining secondary targets if any. Each target (primary " +
                "and secondary) cannot be shot more than once during the action.",

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

        Smash::class to
                "Whenever you strike, you can move the enemy operative in a straight line increment" +
                " of up to 1\". If you do, it must end the move further away from this Operative and" +
                " in a location it can be placed. Then move this operative in a straight line the same" +
                " distance, but it must end that move within that enemy Operative´s control range" +
                "(If neither is possible, you cannot move them).",

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
    )

    // LOOKUP FUNCTIONS
    fun findByName(name: String): KeywordInfo? =
        allKeywords.firstOrNull { it.name.equals(name, ignoreCase = true) }

    fun getDescription(keyword: KeywordInfo): String =
        descriptions[keyword::class]
            ?: "No rules text available for this keyword."
}





