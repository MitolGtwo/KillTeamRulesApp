package com.example.killteamruleset.ui.data

import com.example.killteamruleset.ui.model.TalentReference
import com.example.killteamruleset.R


object TalentReferenceRepository {

    fun getForTeam(teamId: String): List<TalentReference> =
        when (teamId) {
            "wrecka_krew" -> listOf(
                TalentReference(
                    id = "wrecka_talent_1",
                    imageRes = R.drawable.wreckaart1
                ),
                TalentReference(
                    id = "wrecka_talent_3",
                    imageRes = R.drawable.wreckaart1
                )
            )

            "goremongers" -> listOf(
                TalentReference(
                    id = "gore_talent1",
                    imageRes = R.drawable.goremonger_justin1
                ),
            )


            "raveners" -> listOf(
            TalentReference(
                id = "ravener_talent1",
                imageRes = R.drawable.ravener_talent_andres1
            ),
                TalentReference(
                    id = "ravener_talent2",
                    imageRes = R.drawable.ravener_talent_andres2
                ),
        )

            "mandrakes" -> listOf(
                TalentReference(
                    id = "mandrake_talent_andres1",
                    imageRes = R.drawable.mandrake_talent_andres1
                ),
                TalentReference(
                    id = "mandrake_talent_andres2",
                    imageRes = R.drawable.mandrake_talent_andres2
                )
            )

            "nemesis_claw"  -> listOf(
                TalentReference(
                    id = "nemesis_miguel2",
                    imageRes = R.drawable.nemesis_miguel1
                ),
                TalentReference(
                    id = "nemesis_miguel2",
                    imageRes = R.drawable.nemesis_miguel2
                )
            )

            "canoptek_circle" -> listOf(
                TalentReference(
                    id = "canoptek_talent_andres1",
                    imageRes = R.drawable.canoptek_talent_andres1
                ),
                TalentReference(
                    id = "canoptek_talent_andres2",
                    imageRes = R.drawable.canoptek_talent_andres2
                )
            )

            "hearthkyn_salvager" -> listOf(
                TalentReference(
                    id = "salvager_talent_miguel1",
                    imageRes = R.drawable.salvager_talent_miguel1
                ),
                TalentReference(
                    id = "salvager_talent_miguel2",
                    imageRes = R.drawable.salvager_talent_miguel2
                ),
                TalentReference(
                    id = "salvager_talent_andres1",
                    imageRes = R.drawable.salvager_talent_andres1
                ),
                TalentReference(
                    id = "salvager_talent_andres2",
                    imageRes = R.drawable.salvager_talent_andres2
                ),

            )

            "hernkyn_yaegirs" -> listOf(
                TalentReference(
                    id = "yaegir_talent_andres1",
                    imageRes = R.drawable.yaegir_talent_andres1
                ),
                TalentReference(
                    id = "yaegir_talent_andres2",
                    imageRes = R.drawable.yaegir_talent_andres2
                )
            )

            "wolf_scout" -> listOf(
                TalentReference(
                    id = "wolf_talent_andres1",
                    imageRes = R.drawable.wolf_talent_andres1
                ),
                TalentReference(
                    id = "wolf_talent_andres2",
                    imageRes = R.drawable.wolf_talent_andres2
                )
            )

            "exaction_squad" -> listOf(
                TalentReference(
                    id = "exaction_talent_andres1",
                    imageRes = R.drawable.exaction_talent_andres1
                ),
            )

            "deathwatch" -> listOf(
                TalentReference(
                    id = "deathwatch_talent_andres1",
                    imageRes = R.drawable.deathwatch_talent_andres1
                ),
                TalentReference(
                    id = "deathwatch_talent_andres2",
                    imageRes = R.drawable.deathwatch_talent_andres2
                )
            )

            "plague_marines" -> listOf(
                TalentReference(
                    id = "plague_talent_miguel1",
                    imageRes = R.drawable.plague_talent_miguel1
                ),
                TalentReference(
                    id = "plague_talent_miguel2",
                    imageRes = R.drawable.plague_talent_miguel2
                )
            )





            else -> emptyList()
        }
}