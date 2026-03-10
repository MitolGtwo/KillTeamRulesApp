import teams from "../data/teams.json"

export function getAllTeams(){
    return teams
}

export function getTeamsByAlliance(alliance){
    return teams.filter(team => team.alliance === alliance)
}

export function getTeamById(id){
    return teams.find(team => team.id === id)
}