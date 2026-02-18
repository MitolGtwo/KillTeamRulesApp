package com.example.killteamruleset.ui.data

import com.example.killteamruleset.R
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
            name ="PORTABLE BARRICADE",
            description = R.string.portable_barricade_description,
            ability = Ability(
                title = "MOVE WITH BARRICADE",
                usage =R.string.portable_barricade_usage ,
                description =R.string.portable_barricade_ability_description
            )
        ),
        Equipment(
            id = "explosive_grenades",
            name = "EXPLOSIVE GRENADES",
            description =R.string.explosive_grenades_description,
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
            name ="SMOKE GRENADES",
            description = R.string.smoke_grenade_description,
            ability = Ability(
                title = "SMOKE GRENADE",
                usage = R.string.smoke_grenade_usage,
                description = R.string.smoke_grenade_ability_description
            )

        ),
        Equipment(
            id = "utility_grenades_stun",
            name ="STUN GRENADES",
            description = R.string.stun_grenade_description ,
            ability = Ability(
                title = "STUN GRENADE" ,
                usage = R.string.stun_grenade_usage ,
                description = R.string.stun_grenade_ability_description
            )
        ),
        Equipment(
            id = "ammo_cache",
            name ="AMMO CACHE" ,
            description = R.string.ammo_cache_description,
            ability = Ability(
                title = "AMMO CACHE",
                usage = R.string.ammo_cache_usage,
                description = R.string.ammo_cache_ability_description
            )
        ),
        Equipment(
            id = "razor_wire",
            name = "RAZON WIRE",
            description = R.string.razor_wire_description
            ),
        Equipment(
            id = "comms_device",
            name = "COMMS DEVICE",
            description = R.string.comms_device_description
        ),
        Equipment(
            id = "mines",
            name = "MINES",
            description = R.string.mines_description
        ),
        Equipment(
            id = "light_barricades",
            name = "LIGHT BARRICADES",
            description = R.string.light_barricades_description
        ),
        Equipment(
            id = "heavy_barricade",
            name = "HEAVY BARRICADES",
            description = R.string.heavy_barricade_description
        ),
        Equipment(
            id = "ladder",
            name = "LADDERS",
            description = R.string.ladder_description
        ),
        Equipment(
            id = "breaching_charge",
            name = "BREACHING CHARGE",
            description = R.string.breaching_charge_description
        )
    )

    fun getAll(): List<Equipment> = universalEquipment
}