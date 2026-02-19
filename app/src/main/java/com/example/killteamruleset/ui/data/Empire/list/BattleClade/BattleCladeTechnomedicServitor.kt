
import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val BattleCladeTechnomedicServitor = Operative(
    name = "Battleclade Technomedic Servitor",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Servo-chirugic-claw",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Rending
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Mechanosuture Array",
            usage = R.string.battleclade_autoproxy_eye_usage,
            description = R.string.battleclade_autoproxy_eye_description
        ),

        Ability(
            title = "Expedient Repair",
            usage = R.string.battleclade_autoproxy_gaze_usage,
            description = R.string.battleclade_autoproxy_gaze_description
        )
    ),


    keywords = listOf(
        "BATTLE CLADE",
        "IMPERIUM",
        "ADEPTUS MECHANICUS",
        "MEDIC",
        "TECHNOMEDIC",
        "SERVITOR",
        "25MM"
    )
)
