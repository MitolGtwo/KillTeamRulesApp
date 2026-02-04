package com.example.killteamruleset.ui.data

import com.example.killteamruleset.ui.model.Alliance
import com.example.killteamruleset.ui.model.Archetypes
import com.example.killteamruleset.ui.model.Team
import com.example.killteamruleset.R


object TeamRepository {

    private val teams = listOf(
        Team(
            id = "hunter_clade",
            name = "Hunter Clade",
            alliance = Alliance.IMPERIUM,
            difficulty = "Hard",
            archetypes = listOf(Archetypes.RECON,Archetypes.SEEK_AND_DESTROY),
            factionRulesBackgroundRes = R.drawable.wrecka_krew_bg,
            backgroundRes = R.drawable.wrecka_bg,
            assemblyPdfAsset = "pdf/wrecka_assembly.pdf"
        ),
        Team(
            id = "death_Korps",
            name = "Death Korps",
            alliance = Alliance.IMPERIUM,
            difficulty = "Hard",
            archetypes =listOf(Archetypes.RECON,Archetypes.SEEK_AND_DESTROY),
            factionRulesBackgroundRes = R.drawable.wrecka_krew_bg,
            backgroundRes = R.drawable.wrecka_bg,
            assemblyPdfAsset = "pdf/wrecka_assembly.pdf"
        ),
        Team(
            id = "plague_marines",
            name = "Plague Marines",
            alliance = Alliance.CHAOS,
            difficulty = "Easy",
            archetypes =listOf(Archetypes.RECON,Archetypes.SEEK_AND_DESTROY),
            factionRulesBackgroundRes = R.drawable.wrecka_krew_bg,
            backgroundRes = R.drawable.wrecka_bg,
            assemblyPdfAsset = "pdf/wrecka_assembly.pdf"
        ),
        Team(
            id = "wrecka_krew",
            name = "Wrecka Krew",
            alliance = Alliance.XENOS,
            difficulty = "Easy",
            archetypes = listOf(Archetypes.SECURITY, Archetypes.SEEK_AND_DESTROY),
            factionRulesBackgroundRes = R.drawable.wrecka_krew_bg,
            backgroundRes = R.drawable.wrecka_bg,
            assemblyPdfAsset = "pdfs/wrecka_assembly.pdf"
        )
    )

    fun getTeamsByAlliance(alliance: Alliance): List<Team> {
        return teams.filter { it.alliance == alliance }
    }

    fun getTeamById(id: String): Team {
        return teams.first { it.id == id }
    }
}