package com.example.killteamruleset.ui.data

import com.example.killteamruleset.ui.model.CritOp
import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability

object CritOpsRepository {

    val allCritOps = listOf(

        CritOp(
            id = "critop_1",
            number = 1,
            title = "Secure",
            missionActions = listOf(
                Ability(
                title = null,
                usage = R.string.crit_op_1_atitle,
                description = R.string.crit_op_1_usage
                )
            ),
            additionalRules = null,
            victoryPoints = R.string.crit_op_1_victory
        ),

        CritOp(
            id = "critop_2",
            number = 2,
            title = "Loot",
            missionActions = listOf(
                Ability(
                title = null,
                usage = R.string.crit_op_2_atitle,
                description = R.string.crit_op_2_usage
                )
            ),
            additionalRules = null,
            victoryPoints = R.string.crit_op_2_victory
        ),

        CritOp(
            id = "critop_3",
            number = 3,
            title = "Transmission",
            missionActions = listOf(
                Ability(
                title = null,
                usage = R.string.crit_op_3_atitle,
                description = R.string.crit_op_3_usage
                )
            ),
            additionalRules = null,
            victoryPoints = R.string.crit_op_3_victory
        ),

        CritOp(
            id = "critop_4",
            number = 4,
            title = "Orb",
            missionActions = listOf(
                Ability(
                title = null,
                usage = R.string.crit_op_4_atitle,
                description = R.string.crit_op_4_usage
                )
            ),
            additionalRules = R.string.crit_op_4_aditional,
            victoryPoints = R.string.crit_op_4_victory
        ),

        CritOp(
            id = "critop_5",
            number = 5,
            title = "Stake Claim",
            additionalRules = R.string.crit_op_5_aditional,
            victoryPoints = R.string.crit_op_5_victory
        ),

        CritOp(
            id = "critop_6",
            number = 6,
            title = "Energy Cells",
            additionalRules = R.string.crit_op_6_aditional,
            victoryPoints = R.string.crit_op_6_victory
        ),

        CritOp(
            id = "critop_7",
            number = 7,
            title = "Download",
            missionActions =listOf(
                Ability(
                title = null,
                usage = R.string.crit_op_7_atitle,
                description = R.string.crit_op_7_usage
                )
            ),
            victoryPoints = R.string.crit_op_7_victory
        ),

        CritOp(
            id = "critop_8",
            number = 8,
            title = "Data",
            missionActions = listOf(
                Ability(
                    title = null,
                    usage = R.string.crit_op_8_atitle,
                    description = R.string.crit_op_8_usage
                ),
                Ability(
                    title = null,
                    usage = R.string.crit_op_8_atitle2,
                    description = R.string.crit_op_8_usage2
                )
            ),
            victoryPoints = R.string.crit_op_8_victory
        ),

        CritOp(
            id = "critop_9",
            number = 9,
            title = "Reboot",
            missionActions =listOf(
                Ability(
                title = null,
                usage = R.string.crit_op_9_atitle,
                description = R.string.crit_op_9_usage
            )
            ),
            additionalRules = R.string.crit_op_9_aditional,
            victoryPoints = R.string.crit_op_9_victory
        ),
    )
}