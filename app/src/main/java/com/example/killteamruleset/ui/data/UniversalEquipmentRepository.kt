package com.example.killteamruleset.ui.data

import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Equipment
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

object UniversalEquipmentRepository {

    private val universalEquipment = listOf(
        Equipment(
            id = "portable_barricade",
            name = "PORTABLE BARRICADE",
            description = "A portable barricade is light cover, Protective and Portable terrain," +
                    " except the feet which are Insignificant and Exposed. Before the battle," +
                    " you can set it up wholly within your territory, on the killzone floor and more" +
                    " than 2\" from other equipment terrain features, access points and Accessible terrain.\n" +
                    "**Protective:**While an Operative is in cover from this terrain feature, improve" +
                    " its Save stat by 1 (to a Maximum of 2+).\n**Portable:**This terrain feature only" +
                    " provides cover while an Operative is connected to it and if the shield is" +
                    " intervening (ignore its feet). Operatives connected to the inside of it can perform" +
                    " the following unique action during the battle.",
            ability = Ability(
                title = "MOVE WITH BARRICADE",
                usage = "1 APL",
                description = "The same as **Reposition** action, except the active Operative can move" +
                        " no more than its Move stat minus 2\" and cannot climb, drop, jump, or use any" +
                        " kill team´s rules that remove it and set it back up again (Ex Fly, Teleportation)" +
                        "\nBefore this operative moves, remove the portable barricade it´s connected to." +
                        " After it moves, set up the portable barricade so it´s connected again, but" +
                        " the portable barricade cannot be set up within 2\" of other equipment terrain" +
                        " feature, access points or Accessible terrain. If this is not possible, the" +
                        " portable barricade is not set up again.\n  \nThis action is treated as a **Reposition**" +
                        " action. An Operative cannot perform this action while within control range" +
                        " of an enemy Operative or during the same activation in which it performed" +
                        " the **Fall Back** or **Charge** action."
            )
        ),
        Equipment(
            id = "explosive_grenades",
            name = "EXPLOSIVE GRENADES",
            description ="When you select this equipment, select two explosive grenades\n-2 frag.\n" +
                    "-2 krak.\n-1 frag and 1 krak.\nEach selection is a unique action your Operatives" +
                    " can perform, but your kill team can only perform that action a total number of times" +
                    " during the battle equal to your election.",
            weapons = listOf(
                WeaponProfile(
                    name = "Frag grenade",
                    type = WeaponType.RANGED,
                    attacks = 4,
                    hit = "4+",
                    damage = "2/4",
                    keywords = listOf(
                        Range(6),
                        Blast(2),
                        Saturate)
                ),
                WeaponProfile(
                    name = "Krak grenade",
                    type = WeaponType.RANGED,
                    attacks = 4,
                    hit = "4+",
                    damage = "4/5",
                    keywords = listOf(
                        Range(6),
                        Piercing(1),
                        Saturate
                    )
                )
            )
        ),
        Equipment(
            id = "utility_grenades_smoke",
            name = "SMOKE GRENADE",
            description = "When you select this equipment, select two utility grenades\n-2 Smokes.\n" +
                    "-2 Stun.\n-1 Smoke and 1 Stun.\nEach selection is a unique action your Operatives" +
                    " can perform, but your kill team can only perform that action a total number of times" +
                    " during the battle equal to your election.",
            ability = Ability(
                title = "SMOKE GRENADE",
                usage = "1 APL",
                description = "Place one of your Smoke Grenade markers within 6\" of this Operative." +
                        " It must be visible to this Operative, or on Vantage terrain of a terrain feature" +
                        " that´s visible to this Operative. The marker creates an area of smoke 1\"" +
                        " horizontally and unlimited height vertically from (but not below) it.\n  \nWhile" +
                        " an Operative is wholly within an area of smoke, it´s **Obscured** to Operatives" +
                        " more than 2\" from it, and vice versa. In addition, whenever an Operative is" +
                        " shooting an enemy Operative wholly within an area of smoke, weapons with the" +
                        " **Piercing 2** or **Piercing Crits 2** weapon rule will have **Piercing 1**" +
                        " or **Piercing Crits 1** instead, unless they´re within 2\" of each other\n  \n" +
                        "In the Ready step of the next Strategy phase, roll one D3. Remove that Smoke" +
                        " Grenade marker after a number of activations equal to the result have been" +
                        " completed or at the end of the turning point (whichever comes first).\n\n" +
                        "An operative CANNOT perform this action while within control range of an" +
                        " enemy Operative, or if you have reached the total number of times you kill team" +
                        "can perform it."
            )

        ),
        Equipment(
            id = "utility_grenades_stun",
            name = "SMOKE GRENADE",
            description = "When you select this equipment, select two utility grenades\n-2 Smokes.\n" +
                    "-2 Stun.\n-1 Smoke and 1 Stun.\nEach selection is a unique action your Operatives" +
                    " can perform, but your kill team can only perform that action a total number of times" +
                    " during the battle equal to your election.",
            ability = Ability(
                title = "STUN GRENADE",
                usage = "1 APL",
                description = "Select one enemy Operative visible and within 6\" of this Operative" +
                        ". That operative and each other Operative within 1\" of it takes a stun test." +
                        " For an Operative to take a stun test, roll one D6: on a 3+, subtract 1 from" +
                        " its APL stat until the end of its next activation.\n\n" +
                        "An operative CANNOT perform this action while within control range of an" +
                        " enemy Operative, or if you have reached the total number of times you kill team" +
                        "can perform it."
            )
        ),
        Equipment(
            id = "ammo_cache",
            name = "1X AMMO CACHE",
            description = "Before the battle, you can set up one of your Ammo Cache markers wholly within" +
                    " your territory. Friendly Operatives can perform the following mission action" +
                    " during the battle.",
            ability = Ability(
                title = "AMMO RESUPPLY",
                usage = "0 APL",
                description = "One of your Ammo Cache markers the active Operative controls is used" +
                        " during this turning point.\nUntil the start of the next turning point," +
                        " whenever this Operative is shooting with a weapon from its datacard, you" +
                        " can re-roll one of your attack dice.\n\n" +
                        "An operative CANNOT perform this action while within control range of an" +
                        " enemy Operative, if that marker isn´t yours, or if that marker has been used" +
                        " during this turning point."
            )
        ),
        Equipment(
            id = "razor_wire",
            name = "1X RAZOR WIRE",
            description = "Razor wire is Exposed and Obstructing terrain. Before the battle, you can" +
                    " set it up wholly within your territory, on the killzone floor and more than 2\"" +
                    " from other equipment terrain features, access points and Accessible terrain.\n" +
                    "**Obstructing:** Whenever an Operative would cross over this terrain feature" +
                    " within 1\" of it, treat the distance as an additional 1\""
            ),
        Equipment(
            id = "comms_device",
            name = "1X COMMS DEVICE",
            description = "Before the battle, you can set up one of your Comms Device markers wholly" +
                    " within your territory. While a friendly operative controls this marker, add 3\"" +
                    " to the distance requirements of its **SUPPORT** rules that refer to friendly" +
                    " Operatives, improving the distance. Note that you cannot benefit from your" +
                    " opponent´s Comms Device markers."
        ),
        Equipment(
            id = "mines",
            name = "1X MINES",
            description = "Before the battle, you can set up one of your Mines Marker wholly within" +
                    " your territory and more than 2\" from other markers, access points and" +
                    " Accessible terrain. The first time that marker is within an Operative´s control" +
                    " range, remove that marker and inflict D3+3 damage on that Operative."
        ),
        Equipment(
            id = "light_barricades",
            name = "2X LIGHT BARRICADES",
            description = "Light barricades are Light terrain, except the feet, which are Insignificant" +
                    " and Exposed. Before the battle, you can set up one of your Mines Marker wholly" +
                    " within your territory and more than 2\" from other markers, access points and" +
                    " Accessible terrain. ."
        ),
        Equipment(
            id = "heavy_barricade",
            name = "1X HEAVY BARRICADE",
            description = "A heavy barricade is Heavy terrain. Before the battle, you can set it up" +
                    " wholly within 4\" of your drop zone, on the kill zone floor and more than 2\" " +
                    "from other markers, access points and Accessible terrain."
        ),
        Equipment(
            id = "ladder",
            name = "2X LADDERS",
            description = "Ladders are Insignificant and Exposed terrain. Before the battle, you can" +
                    " set up any of them as follows:\n*Wholly within your territory.\nUpright against" +
                    "a terrain that´s at least 2\" tall.\"More than 2\" from other equipment terrain" +
                    "features.\nMore than 1\" from doors and access points.\n \nOnce per action" +
                    ", whenever an Operative is climbing the terrain feature a ladder is placed against" +
                    ", treat the vertical distance as 1\" if the ladder is within that Operative´s" +
                    " control range during that entire climb."
        ),
        Equipment(
            id = "breaching_charge",
            name = "BREACHING CHARGE",
            description = "Once per battle, when a friendly Operative performs the **BREACH** action," +
                    " you can use this rule. If you do, that Operative can perform that action for 1" +
                    " less AP (to a minimum of 1AP) as though it had the word \"breach marker\" on its" +
                    "datacard."
        )
    )

    fun getAll(): List<Equipment> = universalEquipment
}