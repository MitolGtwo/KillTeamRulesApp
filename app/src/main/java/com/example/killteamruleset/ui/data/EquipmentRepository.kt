package com.example.killteamruleset.ui.data

import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Equipment

object EquipmentRepository {

    private val equipmentByTeam = mapOf(

        "wrecka_krew" to listOf(

            Equipment(
                id = "drill_rokkits",
                name = "DRILL ROKKITS",
                lore ="Mek ingenuity knows few bounds. Drill rokkits are designed to strike a target" +
                        " and bore through thick armour before exploding(Like 3+ Saves).",
                description = "Once per turning point, when a friendly **WRECKA KREW** Operative is" +
                        " performing the **Shoot** action and you select a **Rokkit launcha** or" +
                        " **´Eavy rokkit launcha**, you can use this rule. If you do, until the end" +
                        " of that action, that weapon loses the Blast weapon rule but has the Piercing 1" +
                        " weapon rule (You cant combine this with the **Kaboom** Firefight ploy)."
            ),
            Equipment(
                id = "drill_rokkits",
                name = "EXTRA ARMOUR",
                lore ="Scrap metal Ork armour may appear haphazard, but it is no less effective for" +
                        " its simple construction",
                description = "Subtract 1\" from the Move stat of friendly **WRECKA KREW** Operatives" +
                        " and improve their Save stat by 1. This excludes **BOMB SQUIG** Operatives" +
                        " and isn´t cumulative with the Protective rule of a Portable Barricade from" +
                        " universal equipment."
            ),
            Equipment(
                id = "drill_rokkits",
                name = "ENGINE OIL",
                lore ="Wrecka Krews are known yo ingest the oils of vehicles they have destroyed." +
                        " The intoxicating fluid bolsters their natural resilience.",
                description = "Once per turning point, when a friendly **WRECKA KREW** Operative" +
                        " (Excluding **BOMB SQUIG**) is activated, you can use this rule. If you do" +
                        ", until the end of that activation, you can ignore any changes to that " +
                        "Operative´s from being injured (including its weapons´ stats)."
            ),
            Equipment(
                id = "drill_rokkits",
                name = "GLYPHS",
                lore ="Back-banners, crude markings and glyph-scrawled armour proudly display the" +
                        " Wrecka Krew´s favoured method of destruction.",
                description = "When this equipment is selected, also select between the ploys" +
                        " **Waaagh!** or **Destruction**. The first time you would use that ploy" +
                        " during the battle, it costs you 0CP; whenever you would use it thereafter," +
                        " it costs you 0CP if you have any Wrecka points."
            )
        )
    )

    fun getForTeam(teamId: String): List<Equipment> =
        equipmentByTeam[teamId].orEmpty()
}
