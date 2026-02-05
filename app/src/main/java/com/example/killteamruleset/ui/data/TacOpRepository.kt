package com.example.killteamruleset.ui.data

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Archetypes
import com.example.killteamruleset.ui.model.TacOp

object TacOpRepository {

    val allTacOps = listOf(
        // RECON
        TacOp(
            id = "recon_01",
            title = R.string.recon_01_title,
            archetype = Archetypes.RECON,
            reveal = R.string.recon_01_reveal,
            missionAction = Ability(
                title = R.string.recon_01_atitle,
                usage = R.string.recon_01_usage,
                description =R.string.recon_01_description),
            additionalRules = null,

            victoryPoints = R.string.recon_01_victory,
        ),
        TacOp(
            id = "recon_02",
            title =R.string.recon_02_title,
            archetype = Archetypes.RECON,
            reveal =R.string.recon_02_reveal,
            missionAction = Ability(
                title = R.string.recon_02_atitle,
                usage = R.string.recon_02_usage,
                description =R.string.recon_02_description),
            additionalRules = null,

            victoryPoints = R.string.recon_02_victory
        ),
        TacOp(
            id = "recon_03",
            title = R.string.recon_03_title,
            archetype = Archetypes.RECON,
            reveal = R.string.recon_03_reveal,
            additionalRules = R.string.recon_03_additional,

            victoryPoints = R.string.recon_03_victory
        ),
        // SECURITY

        TacOp(
            id = "security_01",
            title = R.string.security_01_title,
            archetype = Archetypes.SECURITY,
            reveal = R.string.security_01_reveal,
            missionAction = Ability(
                title = R.string.security_01_atitle,
                usage = R.string.security_01_reveal,
                description =R.string.security_01_description),
            additionalRules = null,

            victoryPoints = R.string.security_01_victory
        ),
        TacOp(
            id = "security_02",
            title = R.string.security_02_title,
            archetype = Archetypes.SECURITY,
            reveal = R.string.security_02_reveal,
            additionalRules = R.string.security_02_additional,

            victoryPoints = R.string.security_02_victory
        ),
        TacOp(
            id = "security_03",
            title = R.string.security_03_title,
            archetype = Archetypes.SECURITY,
            reveal = R.string.security_03_reveal,
            additionalRules = R.string.security_03_additional,

            victoryPoints = R.string.security_03_victory
        ),
        TacOp(
            id = "seek_and_destroy_01",
            title = R.string.seek_and_destroy_01_title,
            archetype = Archetypes.SEEK_AND_DESTROY,
            reveal = R.string.seek_and_destroy_01_reveal,
            missionAction = Ability(
                title = R.string.seek_and_destroy_01_atitle,
                usage = R.string.seek_and_destroy_01_usage,
                description =R.string.seek_and_destroy_01_description),
            additionalRules = R.string.seek_and_destroy_01_additional,
            victoryPoints = R.string.seek_and_destroy_01_victory
        ),
        TacOp(
            id = "seek_and_destroy_02",
            title = R.string.seek_and_destroy_02_title,
            archetype = Archetypes.SEEK_AND_DESTROY,
            reveal = R.string.seek_and_destroy_02_reveal,
            additionalRules = null,
            victoryPoints = R.string.seek_and_destroy_02_victory
        ),
        TacOp(
            id = "seek_and_destroy_03",
            title = R.string.seek_and_destroy_03_title,
            archetype = Archetypes.SEEK_AND_DESTROY,
            reveal = R.string.seek_and_destroy_03_reveal,
            additionalRules = R.string.seek_and_destroy_03_additional,
            victoryPoints = R.string.seek_and_destroy_03_victory
        ),
        TacOp(
            id = "infiltration_01",
            title =R.string.infiltration_01_title,
            archetype = Archetypes.INFILTRATION,
            reveal = R.string.infiltration_02_reveal,
            additionalRules = R.string.infiltration_01_additional,
            victoryPoints = R.string.infiltration_01_victory
        ),
        TacOp(
            id = "infiltration_02",
            title = R.string.infiltration_02_title,
            archetype = Archetypes.INFILTRATION,
            reveal = R.string.infiltration_02_reveal,
            additionalRules = R.string.infiltration_02_additional,
            victoryPoints = R.string.infiltration_02_victory,
        ),
        TacOp(
            id = "infiltration_03",
            title = R.string.infiltration_03_title,
            archetype = Archetypes.INFILTRATION,
            reveal = R.string.infiltration_03_reveal,
            missionAction = Ability(
                title = R.string.infiltration_03_atitle,
                usage = R.string.infiltration_03_usage,
                description =R.string.infiltration_03_description),
            additionalRules = null,
            victoryPoints = R.string.infiltration_03_victory
        ),
    )







        fun getAll(): List<TacOp> = allTacOps

        fun getByArchetype(archetype: Archetypes): List<TacOp> =
            allTacOps.filter { it.archetype == archetype }
    }

