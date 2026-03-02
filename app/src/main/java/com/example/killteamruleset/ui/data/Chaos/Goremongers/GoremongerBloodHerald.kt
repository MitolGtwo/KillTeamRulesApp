
import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Seek_light
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val GoremongerBloodHerald: Operative
    get() = Operative(
        name = "Goremonger Blood Herald",
        imageRes = R.drawable.technoarqueologist,
        stats = OperativeStats(
            apl = 2,
            move = "7\"",
            save = "5+",
            wounds = 11
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Icon of Khorne",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "2+",
                damage = "4/4",
                keywords = listOf(
                    Range(8),
                    Saturate
                )
            ),
            WeaponProfile(
                name = "Chainblade",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "3+",
                damage = "4/5",
                keywords = listOf(
                    Rending
                )
            ),
        ),

        abilities = listOf(
            Ability(
                title = "Khorne’s Favour",
                usage = R.string.khorne_favour_usage,
                description = R.string.khorne_favour_description
            ),
            Ability(
                title = "Impending Apotheosis",
                usage = R.string.impending_apotheosis_usage,
                description = R.string.impending_apotheosis_description
            )
        ),

        keywords = listOf(
            "GOREMONGER",
            "CHAOS",
            "LEADER",
            "BLOOD HERALD",
            "32MM"
        )
    )

