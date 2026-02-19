package com.example.killteamruleset.ui.data.Empire.list.DeathKorps

import com.example.killteamruleset.ui.model.OperativeSelectionRule

val DeathKorpsOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = "1 DEATH KORPS WATCHMASTER Operative with one of the following:"
    ),

    OperativeSelectionRule(
        text = "*Boltgun; Bayonet"
        indent = 1
    ),
      OperativeSelectionRule(
        text = "Or one option from each of the following"
    ),

      OperativeSelectionRule(
        text = "*Bolt Pistol, Plasma Pistol or Relic Laspistol"
        indent = 1
    ),
      OperativeSelectionRule(
        text = "*Chainsword or Power Weapon"
        indent = 1
    ),

      OperativeSelectionRule(
        text = "4 TROOPER Operatives*",
    ),
  
    OperativeSelectionRule(
        text = "9 DEATH KORPS Operatives selected from the following list:",
    ),
    OperativeSelectionRule(
        text = "BRUISER",
        indent = 1
    ),
      OperativeSelectionRule(
        text = "CONFIDANT with one of the following options:",
        indent = 1
    ),

      OperativeSelectionRule(
        text = "Boltgun or Lasgun; Bayonet",
        indent = 2
    ),
        OperativeSelectionRule(
        text = "Bolt Pistol or Relic Laspistol; Chainsword",
        indent = 2
    ),
  
      OperativeSelectionRule(
        text = "GUNNER with Bayonet and Flamer",
        indent = 1
    ),
      OperativeSelectionRule(
        text = "GUNNER with Bayonet and Grenade Launcher",
        indent = 1
    ),
      OperativeSelectionRule(
        text = "GUNNER with Bayonet and Meltagun",
        indent = 1
    ),
      OperativeSelectionRule(
        text = "GUNNER with Bayonet and Plasma Gun",
        indent = 1
    ),
      OperativeSelectionRule(
        text = "MEDIC",
        indent = 1
    ),
        OperativeSelectionRule(
        text = "SAPPER",
        indent = 1
    ),
      OperativeSelectionRule(
        text = "SNIPER",
        indent = 1
    ),
        OperativeSelectionRule(
        text = "SPOTTER",
        indent = 1
    ),
      OperativeSelectionRule(
        text = "TROOPER",
        indent = 1
    ),
        OperativeSelectionRule(
        text = "VETERAN",
        indent = 1
    ),
      OperativeSelectionRule(
        text = "VOX-OPERATOR",
        indent = 1
    ),
        OperativeSelectionRule(
        text = "ZEALOT",
        indent = 1
    ),


    OperativeSelectionRule(
        text = "Other than TROOPER Operatives, you kill team can only include each Operative on this list once.\n\n
      
      *Up to four times, instead of selecting one of these TROOPER Operatives, you can select one DEATH KORPS ploy to cost you 0CP for the battle.",
        isFooter = true
    )
)
