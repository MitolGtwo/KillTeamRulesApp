package com.example.killteamruleset.ui.data

import com.example.killteamruleset.ui.model.Alliance
import com.example.killteamruleset.ui.model.Team


object TeamRepository {

    private val teams = listOf(
        Team(
            id = "hunter_clade",
            name = "Hunter Clade",
            alliance = Alliance.IMPERIUM,
            difficulty = "Hard",
            archetype ="Recon/Seek and Destroy"
        ),
        Team(
            id = "plague_marines",
            name = "Plague Marines",
            alliance = Alliance.CHAOS,
            difficulty = "Easy",
            archetype ="Security/Seek and Destroy"
        ),
        Team(
            id = "wrecka_krew",
            name = "Wrecka Krew",
            alliance = Alliance.XENOS,
            difficulty = "Easy",
            archetype ="Recon/Seek and Destroy"
        )
    )

    fun getTeamsByAlliance(alliance: Alliance): List<Team> {
        return teams.filter { it.alliance == alliance }
    }

    fun getTeamById(id: String): Team {
        return teams.first { it.id == id }
    }
}