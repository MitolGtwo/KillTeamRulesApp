package com.example.killteamruleset.ui.data

import com.example.killteamruleset.ui.model.Alliance
import com.example.killteamruleset.ui.model.Archetypes
import com.example.killteamruleset.ui.model.Team
import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.TeamType


object TeamRepository {

    private val teams = listOf(
        Team(
            id = "hunter_clade",
            name = "Hunter Clade",
            alliance = Alliance.IMPERIUM,
            type = TeamType.HORDE,
            difficulty = "Hard",
            archetypes = listOf(Archetypes.RECON, Archetypes.SEEK_AND_DESTROY),
            factionRulesBackgroundRes = R.drawable.wrecka_krew_bg,
            backgroundRes = R.drawable.wrecka_bg,
            assemblyPdfAsset = "pdf/wrecka_assembly.pdf",
            iconRes = R.drawable.wrecka_logo,
            quote = "True and sacred might his knowledge be"
        ),
        Team(
            id = "death_Korps",
            name = "Death Korps",
            alliance = Alliance.IMPERIUM,
            type = TeamType.HORDE,
            difficulty = "Hard",
            archetypes = listOf(Archetypes.RECON, Archetypes.SEEK_AND_DESTROY),
            factionRulesBackgroundRes = R.drawable.wrecka_krew_bg,
            backgroundRes = R.drawable.wrecka_bg,
            assemblyPdfAsset = "pdf/wrecka_assembly.pdf",
            iconRes = R.drawable.wrecka_logo,
            quote = "In life, shame.\nIn death, atonement."
        ),
        Team(
            id = "plague_marines",
            name = "Plague Marines",
            alliance = Alliance.CHAOS,
            type = TeamType.ELITE,
            difficulty = "Easy",
            archetypes = listOf(Archetypes.RECON, Archetypes.SEEK_AND_DESTROY),
            factionRulesBackgroundRes = R.drawable.wrecka_krew_bg,
            backgroundRes = R.drawable.wrecka_bg,
            assemblyPdfAsset = "pdf/wrecka_assembly.pdf",
            iconRes = R.drawable.wrecka_logo,
            quote = "The rotted brotherhood"
        ),
        Team(
            id = "wrecka_krew",
            name = "Wrecka Krew",
            alliance = Alliance.XENOS,
            type = TeamType.ELITE,
            difficulty = "Easy",
            archetypes = listOf(Archetypes.SECURITY, Archetypes.SEEK_AND_DESTROY),
            factionRulesBackgroundRes = R.drawable.wrecka_krew_bg,
            backgroundRes = R.drawable.wrecka_bg,
            assemblyPdfAsset = "pdfs/wrecka_assembly.pdf",
            iconRes = R.drawable.wrecka_logo,
            quote = "Show ´em a proppa scrap"
        )
    )

    fun getTeamsByAlliance(alliance: Alliance): List<Team> =
        teams.filter { it.alliance == alliance }

    fun getTeamById(id: String): Team =
        teams.first { it.id == id }

    // ✅ ADD THIS
    fun getAllTeams(): List<Team> = teams
}