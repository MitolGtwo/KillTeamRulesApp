package com.example.killteamruleset.ui.data.Empire.list.Sanctifiers


import com.example.killteamruleset.ui.model.OperativeSelectionRule

val SanctifiersOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = "1 SANCTIFIER CONFESSOR Operative"
    ),

    OperativeSelectionRule(
        text = "1 SANCTIFIER CHERUB Operative"
    ),


    OperativeSelectionRule(
        text = "9 RATLING Operatives selected from the following list:",
    ),
    OperativeSelectionRule(
        text = "CONFLAGRATOR",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "DEATH CULT ASSASSIN",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "DRILL ABBOT",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "MIRACULIST",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "MISSIONARY with one of the Following options:",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "○ Ministorum flamer; brazier of holy fire *",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "○ Ministorum flamer; gun butt; holy relic",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "MISSIONARY with one of the Following options:",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "○ Meltagun; chainsword; holy relic",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "○ Plasma gun; chainsword; brazier of holy fire*",
        indent = 2
    ),


    OperativeSelectionRule(
        text = "PERSECUTOR",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "PREACHER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "RELIQUANT",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "SALVATIONIST",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "Other than PREACHER Operatives, your kill team can only include each Operative" +
                " on this list once. Your kill team can only include up to four PREACHER Operatives.\n" +
                "You cannot select an option that includes a * Brazier of Holy fire more than once" +
                " per battle",
        isFooter = true
    )
)