package com.example.killteamruleset.ui.components

import com.example.killteamruleset.state.OpType
import com.example.killteamruleset.state.SelectedOp

fun applyPrimaryOpBonus(
    crit: Int,
    tac: Int,
    kill: Int,
    selected: SelectedOp?
): Triple<Int, Int, Int> {

    if (selected == null) return Triple(crit, tac, kill)

    return when (selected.type) {

        OpType.CRIT -> {
            val bonus = kotlin.math.ceil(crit / 2.0).toInt()
            Triple(crit + bonus, tac, kill)
        }

        OpType.TAC -> {
            val bonus = kotlin.math.ceil(tac / 2.0).toInt()
            Triple(crit, tac + bonus, kill)
        }

        OpType.KILL -> {
            val bonus = kotlin.math.ceil(kill / 2.0).toInt()
            Triple(crit, tac, kill + bonus)
        }
    }
}