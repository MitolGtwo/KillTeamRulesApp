package com.example.killteamruleset.ui.data

import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Archetypes
import com.example.killteamruleset.ui.model.TacOp

object TacOpRepository {

    val allTacOps = listOf(
        // RECON
        TacOp(
            id = "recon_01",
            title = "SCOUT ENEMY MOVEMENT",
            archetype = Archetypes.RECON,
            reveal = "The first time a friendly Operative performs the Scout action.",
            missionAction = Ability(
                title = "SCOUT",
                usage = "1 APL / Firefight Phase",
                description ="Select one ready enemy Operative visible to and more than 6\" from" +
                        " the active Operative. That enemy Operative is now monitored until the" +
                        " Ready step of the next Strategy phase.\n\nAn Operative CANNOT perform this" +
                        " action while it has an Engage order, during the first turning point, or" +
                        " while within control range of an enemy Operative."),
            additionalRules = null,

            victoryPoints = "At the end of each turning point after the first for each monitored" +
                    " enemy Operative that´s visible to any friendly Operative, you score 1VP.\nYou" +
                    " Cannot socre more than 2VP from this TacOp per turning point."
        ),
        TacOp(
            id = "recon_02",
            title = "Retrieval",
            archetype = Archetypes.RECON,
            reveal = "The first time you score VP from this TacOp.",
            missionAction = Ability(
                title = "RETRIEVE",
                usage = "1 APL / Firefight Phase",
                description ="If the active Operative controls an objective marker, that hasn´t been" +
                        " been searched by friendly Operatives, that Operative is now carrying one of" +
                        " your Retrieval mission markers and that objective marker is now searched." +
                        " Friendly Operatives can perform the Pick Up Marker action on your Retrieval" +
                        " mission markers.\n\nAn Operative CANNOT perform this action during the first" +
                        "turning point, or while within control range of an enemy Operative, or if" +
                        " it´s already carrying a marker."),
            additionalRules = null,

            victoryPoints = "The first time each objective marked is searched by a friendly Operative" +
                    " you score 1VP.\nAt the end of the battle, for each of your Retrieval mission markers" +
                    " fiendly Operatives are carrying, you score 1VP."
        ),
        TacOp(
            id = "recon_03",
            title = "FLANK",
            archetype = Archetypes.RECON,
            reveal = "As a STRATEGIC GAMBIT.",
            additionalRules = "Divide the killzone into two flanks(left and right) by drawing an" +
                    " imaginary line that´s just like the centreline but vertical from each player" +
                    " kill zone edge. An Operative contests a flank while is wholly within that side" +
                    "(left or right) and wholly within the enemy the opponents territory. Friendly" +
                    " Operatives control a flank if the total APL stat of those contesting that side" +
                    " is greater than that of enemy Operatives.\n(Ex Your opponent has to follow these" +
                    " rules to contest the flank and denied you point, his operatives must be on one" +
                    " of the flanks and have a total APL in your territory greater than the total" +
                    " APL you have in his territory and flank.)",

            victoryPoints = "After you reveal this op, at the end of each turning point after the" +
                    " first, for each flank friendly Operatives control, you score 1VP." +
                    " In the fourth turning point, if friendly Operatives also controlled that flank" +
                    " at the end of end of the third turning point, you score 2VP instead"
        ),
        // SECURITY

        TacOp(
            id = "security_01",
            title = "PLANT BANNER",
            archetype = Archetypes.SECURITY,
            reveal = "When you perform the Plant Banner action.",
            missionAction = Ability(
                title = "PLANT BANNER",
                usage = "1 APL / Firefight Phase",
                description ="Place your Banner mission marker within the active Operative´s control" +
                        " range, wholly within your opponent´s territory and more than 5\" from a neutral" +
                        " killzone edge. Operatives can perform the Pick Up Marker action on your" +
                        " Banner mission marker.\n\nAn Operative CANNOT perform this action" +
                        " during the first turning point, while within control range of an enemy " +
                        "Operative, or if a friendly Operative has already performed this action" +
                        " during the battle."),
            additionalRules = null,

            victoryPoints = "At the end of each turning point after the first, if you Banner mission" +
                    " marker is wholly within you opponent´s territory and friendly operatives control" +
                    " it, you score 1VP; if that´s true and no enemy Operatives contest it, you score" +
                    " 2VP instead. Your Banner mission marker must be in the killzone to score(not" +
                    " being carried)."
        ),
        TacOp(
            id = "security_02",
            title = "MARTYRS",
            archetype = Archetypes.SECURITY,
            reveal = "The first time a friendly Operative is incapacitated while contesting an objective" +
                    " marker.",
            additionalRules = "Whenever a friendly Operative is incapacitated while contesting an " +
                    "objective marker, that marker gains one of your Martyr tokens",

            victoryPoints = "At the end of each turning point after the first, if a friendly Operative" +
                    " contest an objective marker that has one or more of your Martyr tokens, you can" +
                    " remove any of those tokens. For each token you remove this way, you score 1VP;" +
                    "if friendly operatives also control that marker, you score 2VP instead.\nYou" +
                    " cannot score more than 2VP from this TacOp per turning point."
        ),
        TacOp(
            id = "security_03",
            title = "ENVOY",
            archetype = Archetypes.SECURITY,
            reveal = "The first time you select an envoy.",
            additionalRules = "As a STRATEGIC GAMBIT in each turning point after the first, select" +
                    " one friendly Operative to be your Envoy until the Ready step of the next" +
                    " Strategy phase. You cannot select an Operative you selected during a previous" +
                    " turning point.",

            victoryPoints = "At the end of each turning point after the first, if your Envoy is wholly" +
                    " within enemy territory and not within control range of enemy Operatives, you score" +
                    " 1VP; if this is true and your Envoy has not lost any wounds during that turning" +
                    " point, you score 2VP instead."
        ),
        TacOp(
            id = "seek_and_destroy_01",
            title = "SWEEP & CLEAR",
            archetype = Archetypes.SEEK_AND_DESTROY,
            reveal = "The first time an enemy Operative is incapacitated while contesting an objective" +
                    " marker, or the first time a friendly Operative performs the Clear action(whichever" +
                    " comes first).",
            missionAction = Ability(
                title = "CLEAR",
                usage = "1 APL / Firefight Phase",
                description ="An objective marker the active Operative controls is cleared for the" +
                        " turning point.\n\nAn Operative CANNOT perform this action" +
                        " during the first turning point, while within control range of an enemy " +
                        "Operative."),
            additionalRules = "When an enemy Operative that contests an objective marker is incapacitated," +
                    " that objective marker gains one of your Swept tokens(if it doesn´t have one already)" +
                    " until the Ready step of the next Strategy phase.",

            victoryPoints = "At the end of each turning point after the first, if friendly operatives" +
                    " control any objective markers that have one of your Swept tokens, you score 1VP." +
                    " If this is true and any of those objective markers are also cleared, you score" +
                    " 2VP instead. You cannot score more than 2VP from this TacOp per turning point."
        ),
        TacOp(
            id = "seek_and_destroy_02",
            title = "ROUTE",
            archetype = Archetypes.SEEK_AND_DESTROY,
            reveal = "The first time you score VP from this TacOp",

            additionalRules = null,

            victoryPoints = "Whenever a friendly Operative is incapacitates an enemy Operative, if" +
                    " that friendly Operative is within 6\" of your opponent´s drop zone, you score" +
                    " 1VP; if this is true and the enemy Operative had a Wounds stat of 12 or more," +
                    " you score 2 VP instead.\nYou cannot score more than 2VP from this TacOp per" +
                    " turning point."
        ),
        TacOp(
            id = "seek_and_destroy_03",
            title = "DOMINATE",
            archetype = Archetypes.SEEK_AND_DESTROY,
            reveal = "The first time an enemy Operative is incapacitated by a friendly Operative.",

            additionalRules = "Each time a friendly Operative incapacitates an enemy Operative, that" +
                    " friendly Operative gains one of your Dominate tokens.",

            victoryPoints = "At the end of the third and fourth turning point, you can remove Dominate" +
                    " tokens from friendly Operatives that aren´t incapacitated. For each you remove," +
                    " you score 1VP.\nYou cannot score more than 3VP from this op per turning point."
        ),
        TacOp(
            id = "infiltration_01",
            title = "TRACK ENEMY",
            archetype = Archetypes.INFILTRATION,
            reveal = "The first time you score VP from this TacOp.",

            additionalRules = "An enemy Operative is being tracked if it´s a valid target for a" +
                    " friendly Operative within 6\" of it. That friendly operative must have a Conceal" +
                    " order, cannot be a valid target for the enemy Operative it´s attempting to Track" +
                    ", and cannot be within control range of enemy Operatives.",

            victoryPoints = "At the end of each turning point after the first:\n*If one enemy Operative" +
                    " is being tracked, you score 1VP, or 2VP instead if it´s the fourth turning point.\n" +
                    "*If two or more enemy Operatives are being tracked, you score 2VP.\nYou cannot" +
                    " score more than 2VP from this TacOp per turning point."
        ),
        TacOp(
            id = "infiltration_02",
            title = "STEAL INTELLIGENCE",
            archetype = Archetypes.INFILTRATION,
            reveal = "The first time an enemy Operative is incapacitated.",

            additionalRules = "Whenever an enemy Operative is incapacitated, before it´s removed from" +
                    " the killzone, place one of your Intelligence mission markers within its control" +
                    " range.\nFriendly Operatives can perform the Pick Up Marker action on your Intelligence" +
                    " mission markers, and for the purpose of that action´s conditions, an Operative can" +
                    " carry 2 Intelligence markers, or one other marker and one Intelligence marker.",

            victoryPoints = "At the end of each turning point after the first, if any friendly Operative" +
                    " are carrying any of your Intelligence mission markers, you score 1VP.\nAt the" +
                    " end of the battle, for each of your Intelligence mission markers friendly " +
                    " Operatives are carrying, you score 1VP."
        ),
        TacOp(
            id = "infiltration_03",
            title = "PLANT DEVICES",
            archetype = Archetypes.INFILTRATION,
            reveal = "The first time a friendly Operative performs the Plant Device action.",
            missionAction = Ability(
                title = "PLANT DEVICE",
                usage = "1 APL / Firefight Phase",
                description ="One objective marker the active operative controls gains one of your" +
                        " Device tokens.\n\nAn Operative CANNOT perform this action" +
                        " during the first turning point, while within control range of an enemy " +
                        "Operative, or if that objective marker already has one of your Device tokens."),

            additionalRules = null,

            victoryPoints = "At the end of each turning point after the first:\n*If your opponent´s" +
                    " objective marker has one of your Device tokens, you score 1VP.\n*For each other" +
                    " objective marker enemy Operatives contest that has one of your Device tokens" +
                    ", you score 1VP.\nYou cannot score more than 2VP from this TacOp per turning point."
        ),
    )







        fun getAll(): List<TacOp> = allTacOps

        fun getByArchetype(archetype: Archetypes): List<TacOp> =
            allTacOps.filter { it.archetype == archetype }
    }