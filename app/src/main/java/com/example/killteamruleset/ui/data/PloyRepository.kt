package com.example.killteamruleset.ui.data

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Ploy
import com.example.killteamruleset.ui.model.PloyType

object PloyRepository {

    private val ploysByTeam = mapOf(
        "angels_of_death" to listOf(
            // ── Aod STRATEGY ──
            Ploy(
                id = "combat_doctrine",
                name ="COMBAT DOCTRINE",
                type = PloyType.STRATEGY,
                lore = R.string.combat_doctrine_lore,
                description = R.string.combat_doctrine_description
            ),
            Ploy(
                id = "no_fear",
                name = "AND THEY SHALL KNOW NO FEAR",
                type = PloyType.STRATEGY,
                lore = R.string.no_fear_lore,
                description = R.string.no_fear_description
            ),
            Ploy(
                id = "adaptive_tactics",
                name = "ADAPTIVE TACTICS",
                type = PloyType.STRATEGY,
                lore = R.string.adaptive_tactics_lore,
                description = R.string.adaptive_tactics_description
            ),
            Ploy(
                id = "indomitus",
                name = "INDOMITUS",
                type = PloyType.STRATEGY,
                lore = R.string.indomitus_lore,
                description = R.string.indomitus_description
            ),


            // ── AOD FIREFIGHT ──
            Ploy(
                id = "adjust_doctrine",
                name = "ADJUST DOCTRINE",
                type = PloyType.FIREFIGHT,
                lore = R.string.adjust_doctrine_lore,
                description = R.string.adjust_doctrine_description
            ),
            Ploy(
            id = "transhuman_physiology",
            name = "TRANSHUMAN PHYSIOLOGY",
            type = PloyType.FIREFIGHT,
            lore = R.string.transhuman_physiology_lore,
            description = R.string.transhuman_physiology_description
            ),
            Ploy(
                id = "shock_assault",
                name = "SHOCK ASSAULT",
                type = PloyType.FIREFIGHT,
                lore = R.string.shock_assault_lore,
                description = R.string.shock_assault_description
            ),
            Ploy(
                id = "wrath_of_vengeance",
                name = "WRATH OF VENGEANCE",
                type = PloyType.FIREFIGHT,
                lore = R.string.wrath_of_vengeance_lore,
                description = R.string.wrath_of_vengeance_description
            )
        ),

        "battle_clade" to listOf(

            // ── BATTLECLADE STRATEGY ──
            Ploy(
                id = "noospheric_possession",
                name ="NOOSPHERIC POSSESION",
                type = PloyType.STRATEGY,
                lore = R.string.noospheric_possession_lore,
                description = R.string.noospheric_possession_description
            ),
            Ploy(
                id = "duty_of_reclamation",
                name = "DUTY OF RECLAMATION",
                type = PloyType.STRATEGY,
                lore = R.string.duty_of_reclamation_lore,
                description = R.string.duty_of_reclamation_description
            ),
            Ploy(
                id = "incantation_of_the_iron_soul",
                name = "INCANTATION OF THE IRON SOUL",
                type = PloyType.STRATEGY,
                lore = R.string.incantation_of_the_iron_soul_lore,
                description = R.string.incantation_of_the_iron_soul_description
            ),
            Ploy(
                id = "prioritised_acquisition",
                name = "PRIORITISED ACQUISITION",
                type = PloyType.STRATEGY,
                lore = R.string.prioritised_acquisition_lore,
                description = R.string.prioritised_acquisition_description
            ),


            // ── AOD FIREFIGHT ──
            Ploy(
                id = "system_exorcism",
                name = "SYSTEM EXORCISM",
                type = PloyType.FIREFIGHT,
                lore = R.string.system_exorcism_lore,
                description = R.string.system_exorcism_description
            ),
            Ploy(
                id = "remote_access",
                name = "REMOTE ACCESS",
                type = PloyType.FIREFIGHT,
                lore = R.string.remote_access_lore,
                description = R.string.remote_access_description
            ),
            Ploy(
                id = "autoferric_supplication",
                name = "AUTOFERRIC SUPPLICATION",
                type = PloyType.FIREFIGHT,
                lore = R.string.autoferric_supplication_lore,
                description = R.string.autoferric_supplication_description
            ),
            Ploy(
                id = "servile_surrogacy",
                name = "SERVILE SURROGACY",
                type = PloyType.FIREFIGHT,
                lore = R.string.servile_surrogacy_lore,
                description = R.string.servile_surrogacy_description
            )
        ),


         "celestian_insidiants" to listOf(
            // ── Celestian Insidiants STRATEGY ──
            Ploy(
                id = "suspect_eliminate",
                name ="SUSPECT & ELIMINATE",
                type = PloyType.STRATEGY,
                lore = R.string.suspect_eliminate_lore,
                description = R.string.suspect_eliminate_description
            ),
            Ploy(
                id = "wrathful_determination",
                name = "WRATHFUL DETERMINATION",
                type = PloyType.STRATEGY,
                lore = R.string.wrathful_determination_lore,
                description = R.string.wrathful_determination_description
            ),
             Ploy(
                id = "suffering_sacrifice",
                name = "SUFFERING & SACRIFICE",
                type = PloyType.STRATEGY,
                lore = R.string.suffering_sacrifice_lore,
                description = R.string.suffering_sacrifice_description
            ),
            Ploy(
                id = "holy_resilience",
                name = "HOLY RESILIENCE",
                type = PloyType.STRATEGY,
                lore = R.string.holy_resilience_lore,
                description = R.string.holy_resilience_description
            ),

            // ── CELESTIAN FIREFIGHT ──
            Ploy(
                id = "glory_to_the_martyrs",
                name = "GLORY TO THE MARTYRS",
                type = PloyType.FIREFIGHT,
                lore = R.string.glory_to_the_martyrs_lore,
                description = R.string.glory_to_the_martyrs_description
            ),
            Ploy(
            id = "faith_fury",
            name = "FAITH & FURY",
            type = PloyType.FIREFIGHT,
            lore = R.string.faith_fury_lore,
            description = R.string.faith_fury_description
            ),
            Ploy(
                id = "unshakeable_pursuit",
                name = "UNSHAKEABLE PURSUIT",
                type = PloyType.FIREFIGHT,
                lore = R.string.unshakeable_pursuit_lore,
                description = R.string.unshakeable_pursuit_description
            ),
            Ploy(
                id = "fervent_hate",
                name = "FERVENT HATE",
                type = PloyType.FIREFIGHT,
                lore = R.string.fervent_hate_lore,
                description = R.string.fervent_hate_description
            )
        ),

        "death_Korps" to listOf(
            // ── DEATH KORPS STRATEGY ──
            Ploy(
                id = "siege_warfare",
                name ="SIEGE WARFARE",
                type = PloyType.STRATEGY,
                lore = R.string.siege_warfare_lore,
                description = R.string.siege_warfare_description
            ),
            Ploy(
                id = "take_cover",
                name = "TAKE COVER",
                type = PloyType.STRATEGY,
                lore = R.string.take_cover_lore,
                description = R.string.take_cover_description
            ),
            Ploy(
                id = "clear_the_line",
                name = "CLEAR THE LINE",
                type = PloyType.STRATEGY,
                lore = R.string.clear_the_line_lore,
                description = R.string.clear_the_line_description
            ),
            Ploy(
                id = "regroup",
                name = "REGROUP",
                type = PloyType.STRATEGY,
                lore = R.string.regroup_lore,
                description = R.string.regroup_description
            ),


            // ── DEATH KORPS FIREFIGHT ──
            Ploy(
                id = "inspirational_leadership",
                name = "INSPIRATIONAL LEADERSHIP",
                type = PloyType.FIREFIGHT,
                lore = R.string.inspirational_leadership_lore,
                description = R.string.inspirational_leadership_description
            ),
            Ploy(
            id = "combined_arms",
            name = "COMBINED ARMS",
            type = PloyType.FIREFIGHT,
            lore = R.string.combined_arms_lore,
            description = R.string.combined_arms_description
            ),
            Ploy(
                id = "in_life_shame",
                name = "IN LIFE, SHAME",
                type = PloyType.FIREFIGHT,
                lore = R.string.in_life_shame_lore,
                description = R.string.in_life_shame_description
            ),
            Ploy(
                id = "in_death_atonement",
                name = "IN DEATH, ATONEMENT",
                type = PloyType.FIREFIGHT,
                lore = R.string.in_death_atonement_lore,
                description = R.string.in_death_atonement_description
            )
        ),


        "deathwatch" to listOf(
            // ── DeathWatch STRATEGY ──
            Ploy(
                id = "mission_tactics",
                name ="MISSION TACTICS",
                type = PloyType.STRATEGY,
                lore = R.string.mission_tactics_lore,
                description = R.string.mission_tactics_description
            ),
           
            Ploy(
                id = "the_long_vigil",
                name = "THE LONG VIGIL",
                type = PloyType.STRATEGY,
                lore = R.string.the_long_vigil_lore,
                description = R.string.the_long_vigil_description
            ),
            Ploy(
                id = "the_shield_that_slays",
                name = "THE SHIELD THAT SLAYS",
                type = PloyType.STRATEGY,
                lore = R.string.the_shield_that_slays_lore,
                description = R.string.the_shield_that_slays_description
            ),

             Ploy(
                id = "dw_no_fear",
                name = "AND THEY SHALL KNOW NO FEAR",
                type = PloyType.STRATEGY,
                lore = R.string.dw_no_fear_lore,
                description = R.string.dw_no_fear_description
            ),


            // ── DeathWatch FIREFIGHT ──
            Ploy(
                id = "suffer_not_the_alien",
                name = "SUFFER NOT THE ALIEN",
                type = PloyType.FIREFIGHT,
                lore = R.string.suffer_not_the_alien_lore,
                description = R.string.suffer_not_the_alien_description
            ),
           
            Ploy(
                id = "auspicator_tracking",
                name = "AUSPICATOR TRACKING",
                type = PloyType.FIREFIGHT,
                lore = R.string.auspicator_tracking_lore,
                description = R.string.auspicator_tracking_description
            ),
            Ploy(
                id = "advance_auspex_scan",
                name = "ADVANCE AUSPEX SCAN",
                type = PloyType.FIREFIGHT,
                lore = R.string.advance_auspex_scan_lore,
                description = R.string.advance_auspex_scan_description
            ),
       
         Ploy(
            id = "dw_transhuman_physiology",
            name = "TRANSHUMAN PHYSIOLOGY",
            type = PloyType.FIREFIGHT,
            lore = R.string.dw_transhuman_physiology_lore,
            description = R.string.dw_transhuman_physiology_description
            )
         ),

        "exaction_squad" to listOf(
            // ── Exaction STRATEGY ──
            Ploy(
                id = "guilt_reveals_itself",
                name ="GUILT REVEALS ITSELF",
                type = PloyType.STRATEGY,
                lore = R.string.guilt_reveals_itself_lore,
                description = R.string.guilt_reveals_itself_description
            ),
            Ploy(
                id = "inviolate_jurisdiction",
                name = "INVIOLATE JURISDICTION",
                type = PloyType.STRATEGY,
                lore = R.string.inviolate_jurisdiction_lore,
                description = R.string.inviolate_jurisdiction_description
            ),
            Ploy(
                id = "dispense_justice",
                name = "DISPENSE JUSTICE",
                type = PloyType.STRATEGY,
                lore = R.string.dispense_justice_lore,
                description = R.string.dispense_justice_description
            ),
            Ploy(
                id = "terminal_decree",
                name = "TERMINAL DECREE",
                type = PloyType.STRATEGY,
                lore = R.string.terminal_decree_lore,
                description = R.string.terminal_decree_description
            ),

            // ── Exaction FIREFIGHT ──
            Ploy(
                id = "long_arm_emperor_law",
                name = "LONG ARM OF THE EMPEROR'S LAW",
                type = PloyType.FIREFIGHT,
                lore = R.string.long_arm_emperor_law_lore,
                description = R.string.long_arm_emperor_law_description
            ),
            Ploy(
                id = "exact_punishment",
                name = "EXACT PUNISHMENT",
                type = PloyType.FIREFIGHT,
                lore = R.string.exact_punishment_lore,
                description = R.string.exact_punishment_description
            ),
            Ploy(
                id = "brutal_backup",
                name = "BRUTAL BACKUP",
                type = PloyType.FIREFIGHT,
                lore = R.string.brutal_backup_lore,
                description = R.string.brutal_backup_description
            ),
            Ploy(
                id = "execution_order",
                name = "EXECUTION ORDER",
                type = PloyType.FIREFIGHT,
                lore = R.string.execution_order_lore,
                description = R.string.execution_order_description
            ),
        ),

        "elucidian_star" to listOf(
            // ── Elucidian STRATEGY ──
            Ploy(
                id = "lethal_proximity",
                name ="LETHAL PROXIMITY",
                type = PloyType.STRATEGY,
                lore = R.string.lethal_proximity_lore,
                description = R.string.lethal_proximity_description
            ),
            Ploy(
                id = "elucidian_stake_claim",
                name = "STAKE CLAIM",
                type = PloyType.STRATEGY,
                lore = R.string.elucidian_stake_claim_lore,
                description = R.string.elucidian_stake_claim_description
            ),
            Ploy(
                id = "undaunted_explorers",
                name = "UNDAUNTED EXPLORERS",
                type = PloyType.STRATEGY,
                lore = R.string.undaunted_explorers_lore,
                description = R.string.undaunted_explorers_description
            ),
            Ploy(
                id = "quick_march",
                name = "QUICK MARCH",
                type = PloyType.STRATEGY,
                lore = R.string.quick_march_lore,
                description = R.string.quick_march_description
            ),

            // ── Elucidian FIREFIGHT ──
            Ploy(
            id = "elucidian_combined_arms",
            name = "COMBINED ARMS",
            type = PloyType.FIREFIGHT,
            lore = R.string.elucidian_combined_arms_lore,
            description = R.string.elucidian_combined_arms_description
            ),
            Ploy(
                id = "elucidian_survivalist",
                name = "SURVIVALIST",
                type = PloyType.FIREFIGHT,
                lore = R.string.elucidian_survivalist_lore,
                description = R.string.elucidian_survivalist_description
            ),
            Ploy(
                id = "great_endurance",
                name = "GREAT ENDURANCE",
                type = PloyType.FIREFIGHT,
                lore = R.string.great_endurance_lore,
                description = R.string.great_endurance_description
            ),
            Ploy(
                id = "well_drilled",
                name = "WELL-DRILLED",
                type = PloyType.FIREFIGHT,
                lore = R.string.well_drilled_lore,
                description = R.string.well_drilled_description
            ),
        ),

        "hunter_clade" to listOf(
            // ── HUNTERCLADE STRATEGY ──
            Ploy(
                id = "debilitating_irradiation",
                name ="DEBILITATING IRRADIATION",
                type = PloyType.STRATEGY,
                lore = R.string.debilitating_irradiation_lore,
                description = R.string.debilitating_irradiation_description
            ),
            Ploy(
                id = "neurostatic_interference",
                name = "NEUROSTATIC INTERFERENCE",
                type = PloyType.STRATEGY,
                lore = R.string.neurostatic_interference_lore,
                description = R.string.neurostatic_interference_description
            ),
            Ploy(
                id = "scouting_protocol",
                name = "SCOUTING PROTOCOL",
                type = PloyType.STRATEGY,
                lore = R.string.scouting_protocol_lore,
                description = R.string.scouting_protocol_description
            ),
            Ploy(
                id = "accelerant_agents",
                name = "ACCELERANT AGENTS",
                type = PloyType.STRATEGY,
                lore = R.string.accelerant_agents_lore,
                description = R.string.accelerant_agents_description
            ),

            // ── HUNTERCLADE  FIREFIGHT ──
            Ploy(
                id = "control_edict",
                name = "CONTROL EDICT",
                type = PloyType.FIREFIGHT,
                lore = R.string.control_edict_lore,
                description = R.string.control_edict_description
            ),
            Ploy(
                id = "scrapcode_overload",
                name = "SCRAPCODE OVERLOAD",
                type = PloyType.FIREFIGHT,
                lore = R.string.scrapcode_overload_lore,
                description = R.string.scrapcode_overload_description
            ),
            Ploy(
                id = "command_override",
                name = "COMMAND OVERRIDE",
                type = PloyType.FIREFIGHT,
                lore = R.string.command_override_lore,
                description = R.string.command_override_description
            ),
            Ploy(
                id = "omnssiah_imperative",
                name = "OMNISSIAH’S IMPERATIVE",
                type = PloyType.FIREFIGHT,
                lore = R.string.omnssiah_imperative_lore,
                description = R.string.omnssiah_imperative_description
            ),
        ),
        "imperial_navy_breachers" to listOf(
            // ── IMPERIAL NAVY STRATEGY ──
            Ploy(
                id = "attack_order",
                name ="ATTACK ORDER",
                type = PloyType.STRATEGY,
                lore = R.string.attack_order_lore,
                description = R.string.attack_order_description
            ),
            Ploy(
                id = "defence_order",
                name = "DEFENCE ORDER",
                type = PloyType.STRATEGY,
                lore = R.string.defence_order_lore,
                description = R.string.defence_order_description
            ),
            Ploy(
                id = "close_assault",
                name = "CLOSE ASSAULT",
                type = PloyType.STRATEGY,
                lore = R.string.close_assault_lore,
                description = R.string.close_assault_description
            ),
            Ploy(
                id = "brace_for_counteract",
                name = "BRACE FOR COUNTERATTACK",
                type = PloyType.STRATEGY,
                lore = R.string.brace_for_counteract_lore,
                description = R.string.brace_for_counteract_description
            ),

            // ── IMPERIAL NAVY  FIREFIGHT ──
            Ploy(
                id = "overwhelm_target",
                name = "OVERWHELM TARGET",
                type = PloyType.FIREFIGHT,
                lore = R.string.overwhelm_target_lore,
                description = R.string.overwhelm_target_description
            ),
            Ploy(
                id = "blitz",
                name = "BLITZ",
                type = PloyType.FIREFIGHT,
                lore = R.string.blitz_lore,
                description = R.string.blitz_description
            ),
            Ploy(
                id = "lock_it_down",
                name = "LOCK IT DOWN",
                type = PloyType.FIREFIGHT,
                lore = R.string.lock_it_down_lore,
                description = R.string.lock_it_down_description
            ),
            Ploy(
                id = "deck_hand",
                name = "DECK HAND",
                type = PloyType.FIREFIGHT,
                lore = R.string.deck_hand_lore,
                description = R.string.deck_hand_description
            ),
        ),

        "inquisitorial_agents" to listOf(
            // ── Inquisitorial STRATEGY ──
            Ploy(
                id = "denounce",
                name ="DENOUNCE",
                type = PloyType.STRATEGY,
                lore = R.string.denounce_lore,
                description = R.string.denounce_description
            ),
            Ploy(
                id = "intense_scrutiny",
                name = "INTENSE SCRUTINY",
                type = PloyType.STRATEGY,
                lore = R.string.intense_scrutiny_lore,
                description = R.string.intense_scrutiny_description
            ),
            Ploy(
                id = "quarry",
                name = "QUARRY",
                type = PloyType.STRATEGY,
                lore = R.string.quarry_lore,
                description = R.string.quarry_description
            ),
            Ploy(
                id = "irrefutable_jurisdiction",
                name = "IRREFUTABLE JURISDICTION",
                type = PloyType.STRATEGY,
                lore = R.string.irrefutable_jurisdiction_lore,
                description = R.string.irrefutable_jurisdiction_description
            ),


            // ── Inquisitorial FIREFIGHT ──
            Ploy(
                id = "absolute_authority",
                name = "ABSOLUTE AUTHORITY",
                type = PloyType.FIREFIGHT,
                lore = R.string.absolute_authority_lore,
                description = R.string.absolute_authority_description
            ),
            Ploy(
                id = "relentless_in_pursuit",
                name = "RELENTLESS IN PURSUIT",
                type = PloyType.FIREFIGHT,
                lore = R.string.relentless_in_pursuit_lore,
                description = R.string.relentless_in_pursuit_description
            ),
            Ploy(
                id = "the_emperor_will",
                name = "THE EMPEROR'S WILL",
                type = PloyType.FIREFIGHT,
                lore = R.string.the_emperor_will_lore,
                description = R.string.the_emperor_will_description
            ),
            Ploy(
                id = "intimidating_presence",
                name = "INTIMIDATING PRESENCE",
                type = PloyType.FIREFIGHT,
                lore = R.string.intimidating_presence_lore,
                description = R.string.intimidating_presence_description
            )
        ),

        "kasrkin" to listOf(
            // ── Kasrkin STRATEGY ──
            Ploy(
                id = "elimination_pattern",
                name ="ELIMINATION PATTERN",
                type = PloyType.STRATEGY,
                lore = R.string.elimination_pattern_lore,
                description = R.string.elimination_pattern_description
            ),
            Ploy(
                id = "engage_from_cover",
                name = "ENGAGE FROM COVER",
                type = PloyType.STRATEGY,
                lore = R.string.engage_from_cover_lore,
                description = R.string.engage_from_cover_description
            ),
            Ploy(
                id = "clearance_sweep",
                name = "CLEARANCE SWEEP",
                type = PloyType.STRATEGY,
                lore = R.string.clearance_sweep_lore,
                description = R.string.clearance_sweep_description
            ),
            Ploy(
                id = "relocate",
                name = "RELOCATE",
                type = PloyType.STRATEGY,
                lore = R.string.relocate_lore,
                description = R.string.relocate_description
            ),


            // ── Kasrkin FIREFIGHT ──
            Ploy(
                id = "seize_the_initiative",
                name = "SEIZE THE INITIATIVE",
                type = PloyType.FIREFIGHT,
                lore = R.string.seize_the_initiative_lore,
                description = R.string.seize_the_initiative_description
            ),
            Ploy(
                id = "cover_retreat",
                name = "COVER RETREAT",
                type = PloyType.FIREFIGHT,
                lore = R.string.cover_retreat_lore,
                description = R.string.cover_retreat_description
            ),
            Ploy(
                id = "neutralise_target",
                name = "NEUTRALISE TARGET",
                type = PloyType.FIREFIGHT,
                lore = R.string.neutralise_target_lore,
                description = R.string.neutralise_target_description
            ),
            Ploy(
                id = "give_no_ground",
                name = "GIVE NO GROUND",
                type = PloyType.FIREFIGHT,
                lore = R.string.give_no_ground_lore,
                description = R.string.give_no_ground_description
            )
        ),

        "novitiates" to listOf(
            // ── Novitiates STRATEGY ──
            Ploy(
                id = "ardent_vengeance",
                name ="ARDENT VENGEANCE",
                type = PloyType.STRATEGY,
                lore = R.string.ardent_vengeance_lore,
                description = R.string.ardent_vengeance_description
            ),
            Ploy(
                id = "defenders_of_faith",
                name = "DEFENDERS OF THE FAITH",
                type = PloyType.STRATEGY,
                lore = R.string.defenders_of_faith_lore,
                description = R.string.defenders_of_faith_description
            ),
            Ploy(
                id = "blessed_rejuvenation",
                name = "BLESSED REJUVENATION",
                type = PloyType.STRATEGY,
                lore = R.string.blessed_rejuvenation_lore,
                description = R.string.blessed_rejuvenation_description
            ),
            Ploy(
                id = "righteous_advance",
                name = "RIGHTEOUS ADVANCE",
                type = PloyType.STRATEGY,
                lore = R.string.righteous_advance_lore,
                description = R.string.righteous_advance_description
            ),


            // ── Novitiates FIREFIGHT ──
            Ploy(
                id = "glorious_martyrdoom",
                name = "GLORIOUS MARTYRDOM",
                type = PloyType.FIREFIGHT,
                lore = R.string.glorious_martyrdoom_lore,
                description = R.string.glorious_martyrdoom_description
            ),
            Ploy(
                id = "blazing_inferno",
                name = "BLAZING INFERNO",
                type = PloyType.FIREFIGHT,
                lore = R.string.blazing_inferno_lore,
                description = R.string.blazing_inferno_description
            ),
            Ploy(
                id = "blinding_aura",
                name = "BLINDING AURA",
                type = PloyType.FIREFIGHT,
                lore = R.string.blinding_aura_lore,
                description = R.string.blinding_aura_description
            ),
            Ploy(
                id = "guided_by_faith",
                name = "GUIDED BY FAITH",
                type = PloyType.FIREFIGHT,
                lore = R.string.guided_by_faith_lore,
                description = R.string.guided_by_faith_description
            )
        ),


        "phobos_strike_team" to listOf(
            // ── Phobos STRATEGY ──
            Ploy(
                id = "guerrilla_warfare",
                name = "GUERRILLA WARFARE",
                type = PloyType.STRATEGY,
                lore = R.string.guerrilla_warfare_lore,
                description = R.string.guerrilla_warfare_description,
                abilities = listOf(
                    Ability(
                        title = "Guerrilla Warfare ",
                        usage = R.string.guerrilla_warfare_usage,
                        description = R.string.guerrilla_warfare_description2
                    )
                )
            ),
            Ploy(
                id = "phobos_no_fear",
                name = "AND THEY SHALL KNOW NO FEAR",
                type = PloyType.STRATEGY,
                lore = R.string.phobos_no_fear_lore,
                description = R.string.phobos_no_fear_description
            ),
            Ploy(
                id = "deadly_shots",
                name = "DEADLY SHOTS",
                type = PloyType.STRATEGY,
                lore = R.string.deadly_shots_lore,
                description = R.string.deadly_shots_description
            ),
            Ploy(
                id = "lethal_assaults",
                name = "LETHAL ASSAULTS",
                type = PloyType.STRATEGY,
                lore = R.string.lethal_assaults_lore,
                description = R.string.lethal_assaults_description
            ),


            // ── Phobos FIREFIGHT ──
            Ploy(
                id = "patient_ambush",
                name = "PATIENT AMBUSH",
                type = PloyType.FIREFIGHT,
                lore = R.string.patient_ambush_lore,
                description = R.string.patient_ambush_description,
            ),
            Ploy(
                id = "critical_shot",
                name = "CRITICAL SHOT",
                type = PloyType.FIREFIGHT,
                lore = R.string.critical_shot_lore,
                description = R.string.critical_shot_description
            ),
            Ploy(
                id = "phobos_transhuman",
                name = "TRANSHUMAN PHYSIOLOGY",
                type = PloyType.FIREFIGHT,
                lore = R.string.phobos_transhuman_lore,
                description = R.string.phobos_transhuman_description
            ),
            Ploy(
                id = "stealth_assault",
                name = "STEALTH ASSAULT",
                type = PloyType.FIREFIGHT,
                lore = R.string.stealth_assault_lore,
                description = R.string.stealth_assault_description
            )
        ),

        "ratlings" to listOf(
            // ── Ratlings STRATEGY ──
            Ploy(
                id = "sniper_positions",
                name ="SNIPER POSITIONS",
                type = PloyType.STRATEGY,
                lore = R.string.sniper_positions_lore,
                description = R.string.sniper_positions_description
            ),
            Ploy(
                id = "crack_shots",
                name = "CRACK SHOTS",
                type = PloyType.STRATEGY,
                lore = R.string.crack_shots_lore,
                description = R.string.crack_shots_description
            ),
            Ploy(
                id = "shifty",
                name = "SHIFTY",
                type = PloyType.STRATEGY,
                lore = R.string.shifty_lore,
                description = R.string.shifty_description
            ),
            Ploy(
                id = "frontline_assault",
                name = "FRONTLINE ASSAULT",
                type = PloyType.STRATEGY,
                lore = R.string.frontline_assault_lore,
                description = R.string.frontline_assault_description
            ),


            // ── Ratlings FIREFIGHT ──
            Ploy(
                id = "survival_insticts",
                name = "SURVIVAL INSTINCTS",
                type = PloyType.FIREFIGHT,
                lore = R.string.survival_insticts_lore,
                description = R.string.survival_insticts_description
            ),
            Ploy(
                id = "sharpshot",
                name = "SHARPSHOT",
                type = PloyType.FIREFIGHT,
                lore = R.string.sharpshot_lore,
                description = R.string.sharpshot_description
            ),
            Ploy(
                id = "larcenous",
                name = "LARCENOUS",
                type = PloyType.FIREFIGHT,
                lore = R.string.larcenous_lore,
                description = R.string.larcenous_description
            ),
            Ploy(
                id = "shoot_and_hide",
                name = "SHOOT AND HIDE",
                type = PloyType.FIREFIGHT,
                lore = R.string.shoot_and_hide_lore,
                description = R.string.shoot_and_hide_description
            )
        ),

        "sanctifiers" to listOf(
            // ── sanctifiers STRATEGY ──
            Ploy(
                id = "sanctifiers_the_emperor_protects",
                name ="THE EMPEROR PROTECTS",
                type = PloyType.STRATEGY,
                lore = R.string.sanctifiers_the_emperor_protects_lore,
                description = R.string.sanctifiers_the_emperor_protects_description
            ),
            Ploy(
                id = "fervent_brawl",
                name = "FERVENT BRAWL",
                type = PloyType.STRATEGY,
                lore = R.string.fervent_brawl_lore,
                description = R.string.fervent_brawl_description
            ),
            Ploy(
                id = "zealous_persecution",
                name = "ZEALOUS PERSECUTION",
                type = PloyType.STRATEGY,
                lore = R.string.zealous_persecution_lore,
                description = R.string.zealous_persecution_description
            ),
            Ploy(
                id = "rally_the_flock",
                name = "RALLY THE FLOCK",
                type = PloyType.STRATEGY,
                lore = R.string.rally_the_flock_lore,
                description = R.string.rally_the_flock_description
            ),


            // ── sanctifiersFIREFIGHT ──
            Ploy(
                id = "rosarius",
                name = "ROSARIUS",
                type = PloyType.FIREFIGHT,
                lore = R.string.rosarius_lore,
                description = R.string.rosarius_description
            ),
            Ploy(
                id = "ardent_eradication",
                name = "ARDENT ERADICATION",
                type = PloyType.FIREFIGHT,
                lore = R.string.ardent_eradication_lore,
                description = R.string.ardent_eradication_description
            ),
            Ploy(
                id = "redeemed_through_fire",
                name = "REDEEMED THROUGH FIRE",
                type = PloyType.FIREFIGHT,
                lore = R.string.redeemed_through_fire_lore,
                description = R.string.redeemed_through_fire_description
            ),
            Ploy(
                id = "unwavering_devotion",
                name = "UNWAVERING DEVOTION",
                type = PloyType.FIREFIGHT,
                lore = R.string.unwavering_devotion_lore,
                description = R.string.unwavering_devotion_description
            )
        ),


        "scout_squat" to listOf(
            // ── scout squad STRATEGY ──
            Ploy(
                id = "guerrilla_engagement",
                name ="GUERRILLA ENGAGEMENT",
                type = PloyType.STRATEGY,
                lore = R.string.guerrilla_engagement_lore,
                description = R.string.guerrilla_engagement_description
            ),
            Ploy(
                id = "ambush",
                name = "AMBUSH",
                type = PloyType.STRATEGY,
                lore = R.string.ambush_lore,
                description = R.string.ambush_description
            ),
            Ploy(
                id = "adaptable_training",
                name = "ADAPTABLE TRAINING",
                type = PloyType.STRATEGY,
                lore = R.string.adaptable_training_lore,
                description = R.string.adaptable_training_description
            ),
            Ploy(
                id = "stealth_relocation",
                name = "STEALTH RELOCATION",
                type = PloyType.STRATEGY,
                lore = R.string.stealth_relocation_lore,
                description = R.string.stealth_relocation_description
            ),


            // ── scout squad IREFIGHT ──
            Ploy(
                id = "astartes_training",
                name = "ASTARTES TRAINING",
                type = PloyType.FIREFIGHT,
                lore = R.string.astartes_training_lore,
                description = R.string.astartes_training_description
            ),
            Ploy(
                id = "raw_physiology",
                name = "RAW PHYSIOLOGY",
                type = PloyType.FIREFIGHT,
                lore = R.string.raw_physiology_lore,
                description = R.string.raw_physiology_description
            ),
            Ploy(
                id = "emboldened_aspirant",
                name = "EMBOLDENED ASPIRANT",
                type = PloyType.FIREFIGHT,
                lore = R.string.emboldened_aspirant_lore,
                description = R.string.emboldened_aspirant_description
            ),
            Ploy(
                id = "covert_position",
                name = "COVERT POSITION",
                type = PloyType.FIREFIGHT,
                lore = R.string.covert_position_lore,
                description = R.string.covert_position_description
            )
        ),



        "tempestus_aquilon" to listOf(
            // ── Tempestus STRATEGY ──
            Ploy(
                id = "sudden_offensive",
                name ="SUDDEN OFFENSIVE",
                type = PloyType.STRATEGY,
                lore = R.string.sudden_offensive_lore,
                description = R.string.sudden_offensive_description
            ),
            Ploy(
                id = "maintain_momentum",
                name = "MAINTAIN MOMENTUM",
                type = PloyType.STRATEGY,
                lore = R.string.maintain_momentum_lore,
                description = R.string.maintain_momentum_description
            ),
            Ploy(
                id = "eye_above",
                name = "EYE ABOVE",
                type = PloyType.STRATEGY,
                lore = R.string.eye_above_lore,
                description = R.string.eye_above_description
            ),
            Ploy(
                id = "drop_secure",
                name = "DROP AND SECURE",
                type = PloyType.STRATEGY,
                lore = R.string.drop_secure_lore,
                description = R.string.drop_secure_description
            ),


            // ── Tempestus FIREFIGHT ──
            Ploy(
                id = "hot_drop",
                name = "HOT DROP",
                type = PloyType.FIREFIGHT,
                lore = R.string.hot_drop_lore,
                description = R.string.hot_drop_description
            ),
            Ploy(
                id = "adjust_coordinates",
                name = "ADJUST COORDINATES",
                type = PloyType.FIREFIGHT,
                lore = R.string.adjust_coordinates_lore,
                description = R.string.adjust_coordinates_description
            ),
            Ploy(
                id = "tempestus_exemplars",
                name = "TEMPESTUS EXEMPLARS",
                type = PloyType.FIREFIGHT,
                lore = R.string.tempestus_exemplars_lore,
                description = R.string.tempestus_exemplars_description
            ),
            Ploy(
                id = "progena",
                name = "PROGENA",
                type = PloyType.FIREFIGHT,
                lore = R.string.progena_lore,
                description = R.string.progena_description
            )
        ),


        "wolf_scout" to listOf(
            // ── Wolf STRATEGY ──
            Ploy(
                id = "cloaked_storm",
                name ="CLOAKED BY THE STORM",
                type = PloyType.STRATEGY,
                lore = R.string.cloaked_storm_lore,
                description = R.string.cloaked_storm_description
            ),
            Ploy(
                id = "tempestuous_wrath",
                name = "TEMPESTUOUS WRATH",
                type = PloyType.STRATEGY,
                lore = R.string.tempestuous_wrath_lore,
                description = R.string.tempestuous_wrath_description
            ),
            Ploy(
                id = "storm_bite",
                name = "STORM’S BITE",
                type = PloyType.STRATEGY,
                lore = R.string.storm_bite_lore,
                description = R.string.storm_bite_description
            ),
            Ploy(
                id = "savage_fighters",
                name = "SAVAGE FIGHTERS",
                type = PloyType.STRATEGY,
                lore = R.string.savage_fighters_lore,
                description = R.string.savage_fighters_description
            ),


            // ── Wolf IREFIGHT ──
            Ploy(
                id = "acute_senses",
                name = "ACUTE SENSES",
                type = PloyType.FIREFIGHT,
                lore = R.string.acute_senses_lore,
                description = R.string.acute_senses_description
            ),
            Ploy(
                id = "wolf_counterattack",
                name = "COUNTERATTACK",
                type = PloyType.FIREFIGHT,
                lore = R.string.wolf_counterattack_lore,
                description = R.string.wolf_counterattack_description
            ),
            Ploy(
                id = "touched_by_lokyar",
                name = "TOUCHED BY LOKYAR",
                type = PloyType.FIREFIGHT,
                lore = R.string.touched_by_lokyar_lore,
                description = R.string.touched_by_lokyar_description
            ),
            Ploy(
                id = "wolf_trans",
                name = "TRANSHUMAN PHYSIOLOGY",
                type = PloyType.FIREFIGHT,
                lore = R.string.wolf_trans_lore,
                description = R.string.wolf_trans_description
            )
        ),


        "blades_of_khaine" to listOf(
            // ── Blades STRATEGY ──
            Ploy(
                id = "forewarned",
                name ="FOREWARNED",
                type = PloyType.STRATEGY,
                lore = R.string.forewarned_lore,
                description = R.string.forewarned_description
            ),
            Ploy(
                id = "ruthless_poise",
                name = "RUTHLESS POISE",
                type = PloyType.STRATEGY,
                lore = R.string.ruthless_poise_lore,
                description = R.string.ruthless_poise_description
            ),
            Ploy(
                id = "khaine_vengeance",
                name = "KHAINE’S VENGEANCE",
                type = PloyType.STRATEGY,
                lore = R.string.khaine_vengeance_lore,
                description = R.string.khaine_vengeance_description
            ),
            Ploy(
                id = "dance_of_death",
                name = "DANCE OF DEATH",
                type = PloyType.STRATEGY,
                lore = R.string.dance_of_death_lore,
                description = R.string.dance_of_death_description
            ),


            // ── Blades FIREFIGHT ──
            Ploy(
                id = "bladewind",
                name = "BLADEWIND",
                type = PloyType.FIREFIGHT,
                lore = R.string.bladewind_lore,
                description = R.string.bladewind_description
            ),
            Ploy(
                id = "starfall",
                name = "STARFALL",
                type = PloyType.FIREFIGHT,
                lore = R.string.starfall_lore,
                description = R.string.starfall_description
            ),
            Ploy(
                id = "fading_light",
                name = "FADING LIGHT",
                type = PloyType.FIREFIGHT,
                lore = R.string.fading_light_lore,
                description = R.string.fading_light_description
            ),
            Ploy(
                id = "blades_contempt",
                name = "CONTEMPT",
                type = PloyType.FIREFIGHT,
                lore = R.string.blades_contempt_lore,
                description = R.string.blades_contempt_description
            )
        ),



        "brood_brothers" to listOf(
            // ── Brood STRATEGY ──
            Ploy(
                id = "pervasive",
                name ="PERVASIVE",
                type = PloyType.STRATEGY,
                lore = R.string.pervasive_lore,
                description = R.string.pervasive_description
            ),
            Ploy(
                id = "uprising",
                name = "UPRISING",
                type = PloyType.STRATEGY,
                lore = R.string.uprising_lore,
                description = R.string.uprising_description
            ),
            Ploy(
                id = "embedded",
                name = "EMBEDDED",
                type = PloyType.STRATEGY,
                lore = R.string.embedded_lore,
                description = R.string.embedded_description
            ),
            Ploy(
                id = "cult_devotion",
                name = "CULT DEVOTION",
                type = PloyType.STRATEGY,
                lore = R.string.cult_devotion_lore,
                description = R.string.cult_devotion_description
            ),


            // ── Brood FIREFIGHT ──
            Ploy(
                id = "ruthless_coordination",
                name = "RUTHLESS COORDINATION",
                type = PloyType.FIREFIGHT,
                lore = R.string.ruthless_coordination_lore,
                description = R.string.ruthless_coordination_description,
                abilities = listOf(
                    Ability(
                        title = "RUTHLESS COORDINATION",
                        usage = null,
                        description = null,
                        imageRes = R.drawable.ruthless_coordination
                    )
                )
            ),
            Ploy(
                id = "unquestioning_loyalty",
                name = "UNQUESTIONING LOYALTY",
                type = PloyType.FIREFIGHT,
                lore = R.string.unquestioning_loyalty_lore,
                description = R.string.unquestioning_loyalty_description
            ),
            Ploy(
                id = "idolisation",
                name = "IDOLISATION",
                type = PloyType.FIREFIGHT,
                lore = R.string.idolisation_lore,
                description = R.string.idolisation_description
            ),
            Ploy(
                id = "insidious",
                name = "INSIDIOUS",
                type = PloyType.FIREFIGHT,
                lore = R.string.insidious_lore,
                description = R.string.insidious_description
            )
        ),


        "wrecka_krew" to listOf(
            // ── WRECKAS STRATEGY ──
            Ploy(
                id = "wrecka_waaagh",
                name ="WAAAGH!",
                type = PloyType.STRATEGY,
                lore = R.string.wrecka_waaagh_lore,
                description = R.string.wrecka_waaagh_description
            ),
            Ploy(
                id = "wrecka_tuff_gitz",
                name = "TUFF GITZ",
                type = PloyType.STRATEGY,
                lore = R.string.wrecka_tuff_gitz_lore,
                description = R.string.wrecka_tuff_gitz_description
            ),
            Ploy(
                id = "wrecka_destruction",
                name = "DESTRUCTION",
                type = PloyType.STRATEGY,
                lore = R.string.wrecka_destruction_lore,
                description = R.string.wrecka_destruction_description
            ),
            Ploy(
                id = "wrecka_amped_up",
                name = "AMPED UP",
                type = PloyType.STRATEGY,
                lore = R.string.wrecka_amped_up_lore,
                description = R.string.wrecka_amped_up_description
            ),


            // ── Wreckas FIREFIGHT ──
            Ploy(
                id = "wrecka_jas_job",
                name = "JUST A SCRATCH",
                type = PloyType.FIREFIGHT,
                lore = R.string.wrecka_jas_lore,
                description = R.string.wrecka_jas_description
            ),
            Ploy(
            id = "wrecka_demolition_job",
            name = "DEMOLITION JOB",
            type = PloyType.FIREFIGHT,
            lore = R.string.wrecka_demolition_job_lore,
            description = R.string.wrecka_demolition_job_description
            ),
            Ploy(
                id = "wrecka_proppa_scrap",
                name = "PROPPA SCRAP",
                type = PloyType.FIREFIGHT,
                lore = R.string.wrecka_proppa_scrap_lore,
                description = R.string.wrecka_proppa_scrap_description
            ),
            Ploy(
                id = "wrecka_kaboom",
                name = "KABOOM!",
                type = PloyType.FIREFIGHT,
                lore = R.string.wrecka_kaboom_lore,
                description = R.string.wrecka_kaboom_description
            )
        ),



        "blooded" to listOf(
            // ── Blooded  STRATEGY ──
            Ploy(
                id = "glory_kill",
                name ="GLORY KILL",
                type = PloyType.STRATEGY,
                lore = R.string.glory_kill_lore,
                description = R.string.glory_kill_description
            ),
            Ploy(
                id = "reckless_aspirant",
                name = "RECKLESS ASPIRANT",
                type = PloyType.STRATEGY,
                lore = R.string.reckless_aspirant_lore,
                description = R.string.reckless_aspirant_description
            ),
            Ploy(
                id = "malevolent_grit",
                name = "MALEVOLENT GRIT",
                type = PloyType.STRATEGY,
                lore = R.string.malevolent_grit_lore,
                description = R.string.malevolent_grit_description
            ),
            Ploy(
                id = "bitter_demise",
                name = "BITTER DEMISE",
                type = PloyType.STRATEGY,
                lore = R.string.bitter_demise_lore,
                description = R.string.bitter_demise_description
            ),


            // ── Blooded FIREFIGHT ──
            Ploy(
                id = "callous_disregard",
                name = "CALLOUS DISREGARD",
                type = PloyType.FIREFIGHT,
                lore = R.string.callous_disregard_lore,
                description = R.string.callous_disregard_description
            ),
            Ploy(
                id = "moment_of_repute",
                name = "MOMENT OF REPUTE",
                type = PloyType.FIREFIGHT,
                lore = R.string.moment_of_repute_lore,
                description = R.string.moment_of_repute_description
            ),
            Ploy(
                id = "reward_earned",
                name = "REWARD EARNED",
                type = PloyType.FIREFIGHT,
                lore = R.string.reward_earned_lore,
                description = R.string.reward_earned_description
            ),
            Ploy(
                id = "dark_favour",
                name = "DARK FAVOUR",
                type = PloyType.FIREFIGHT,
                lore = R.string.dark_favour_lore,
                description = R.string.dark_favour_description
            )
        ),


        "chaos_cult" to listOf(
            // ── chaos cult  STRATEGY ──
            Ploy(
                id = "exaltation_in_pain",
                name ="EXALTATION IN PAIN",
                type = PloyType.STRATEGY,
                lore = R.string.exaltation_in_pain_lore,
                description = R.string.exaltation_in_pain_description
            ),
            Ploy(
                id = "fervent_onslaught",
                name = "FERVENT ONSLAUGHT",
                type = PloyType.STRATEGY,
                lore = R.string.fervent_onslaught_lore,
                description = R.string.fervent_onslaught_description
            ),
            Ploy(
                id = "creatures_of_nightmare",
                name = "CREATURES OF NIGHTMARE",
                type = PloyType.STRATEGY,
                lore = R.string.creatures_of_nightmare_lore,
                description = R.string.creatures_of_nightmare_description
            ),
            Ploy(
                id = "sickening_aura",
                name = "SICKENING AURA",
                type = PloyType.STRATEGY,
                lore = R.string.sickening_aura_lore,
                description = R.string.sickening_aura_description
            ),


            // ── chaos cult FIREFIGHT ──
            Ploy(
                id = "faithful_follower",
                name = "FAITHFUL FOLLOWER",
                type = PloyType.FIREFIGHT,
                lore = R.string.faithful_follower_lore,
                description = R.string.faithful_follower_description
            ),
            Ploy(
                id = "abhorrent_mutation",
                name = "ABHORRENT MUTATION",
                type = PloyType.FIREFIGHT,
                lore = R.string.abhorrent_mutation_lore,
                description = R.string.abhorrent_mutation_description
            ),
            Ploy(
                id = "frenzied_demise",
                name = "FRENZIED DEMISE",
                type = PloyType.FIREFIGHT,
                lore = R.string.frenzied_demise_lore,
                description = R.string.frenzied_demise_description
            ),
            Ploy(
                id = "unleash_the_daemon",
                name = "UNLEASH THE DAEMON",
                type = PloyType.FIREFIGHT,
                lore = R.string.unleash_the_daemon_lore,
                description = R.string.unleash_the_daemon_description
            )
        ),


        "fellgor_ravagers" to listOf(
            // ── fellgor  STRATEGY ──
            Ploy(
                id = "violent_temperament",
                name ="VIOLENT TEMPERAMENT",
                type = PloyType.STRATEGY,
                lore = R.string.violent_temperament_lore,
                description = R.string.violent_temperament_description
            ),
            Ploy(
                id = "fellgor_ambush",
                name = "AMBUSH",
                type = PloyType.STRATEGY,
                lore = R.string.fellgor_ambush_lore,
                description = R.string.fellgor_ambush_description
            ),
            Ploy(
                id = "pelting_firepower",
                name = "PELTING FIREPOWER",
                type = PloyType.STRATEGY,
                lore = R.string.pelting_firepower_lore,
                description = R.string.pelting_firepower_description
            ),
            Ploy(
                id = "reckless_determination",
                name = "RECKLESS DETERMINATION",
                type = PloyType.STRATEGY,
                lore = R.string.reckless_determination_lore,
                description = R.string.reckless_determination_description
            ),


            // ── fellgor FIREFIGHT ──
            Ploy(
                id = "ruthless_rampage",
                name = "RUTHLESS RAMPAGE",
                type = PloyType.FIREFIGHT,
                lore = R.string.ruthless_rampage_lore,
                description = R.string.ruthless_rampage_description
            ),
            Ploy(
                id = "wild_rage",
                name = "WILD RAGE",
                type = PloyType.FIREFIGHT,
                lore = R.string.wild_rage_lore,
                description = R.string.wild_rage_description
            ),
            Ploy(
                id = "animalistic_fury",
                name = "ANIMALISTIC FURY",
                type = PloyType.FIREFIGHT,
                lore = R.string.animalistic_fury_lore,
                description = R.string.animalistic_fury_description
            ),
            Ploy(
                id = "bloodsense",
                name = "BLOODSENSE",
                type = PloyType.FIREFIGHT,
                lore = R.string.bloodsense_lore,
                description = R.string.bloodsense_description
            )
        ),




        "gellepox_infected" to listOf(
            // ── Gellerpox  STRATEGY ──
            Ploy(
                id = "plagueridden_determination",
                name = "PLAGUERIDDEN DETERMINATION",
                type = PloyType.STRATEGY,
                lore = R.string.plagueridden_determination_lore,
                description = R.string.plagueridden_determination_description
            ),
            Ploy(
                id = "blessings_of_infection",
                name = "BLESSINGS OF INFECTION",
                type = PloyType.STRATEGY,
                lore = R.string.blessings_of_infection_lore,
                description = R.string.blessings_of_infection_description
            ),
            Ploy(
                id = "drawn_to_the_hum",
                name = "DRAWN TO THE HUM",
                type = PloyType.STRATEGY,
                lore = R.string.drawn_to_the_hum_lore,
                description = R.string.drawn_to_the_hum_description
            ),
            Ploy(
                id = "rust_emanations",
                name = "RUST EMANATIONS",
                type = PloyType.STRATEGY,
                lore = R.string.rust_emanations_lore,
                description = R.string.rust_emanations_description
            ),


            // ── Gellerpox  FIREFIGHT ──
            Ploy(
                id = "revolting_technology",
                name = "REVOLTING TECHNOLOGY",
                type = PloyType.FIREFIGHT,
                lore = R.string.revolting_technology_lore,
                description = R.string.revolting_technology_description
            ),
            Ploy(
                id = "barge",
                name = "BARGE",
                type = PloyType.FIREFIGHT,
                lore = R.string.barge_lore,
                description = R.string.barge_description
            ),
            Ploy(
                id = "putrescent_demise",
                name = "PUTRESCENT DEMISE",
                type = PloyType.FIREFIGHT,
                lore = R.string.putrescent_demise_lore,
                description = R.string.putrescent_demise_description
            ),
            Ploy(
                id = "frightening_onslaught",
                name = "BFRIGHTENING ONSLAUGHT",
                type = PloyType.FIREFIGHT,
                lore = R.string.frightening_onslaught_lore,
                description = R.string.frightening_onslaught_description
            )
        ),


        "goremongers" to listOf(
            // ── Goremongers STRATEGY ──
            Ploy(
                id = "enhance_violence",
                name = "ENHANCED VIOLENCE",
                type = PloyType.STRATEGY,
                lore = R.string.enhance_violence_lore,
                description = R.string.enhance_violence_description
            ),
            Ploy(
                id = "augmented_endurance",
                name = "AUGMENTED ENDURANCE",
                type = PloyType.STRATEGY,
                lore = R.string.augmented_endurance_lore,
                description = R.string.augmented_endurance_description
            ),
            Ploy(
                id = "gory_tenacity",
                name = "GORY TENACITY",
                type = PloyType.STRATEGY,
                lore = R.string.gory_tenacity_lore,
                description = R.string.gory_tenacity_description
            ),
            Ploy(
                id = "hunt_for_blood",
                name = "HUNT FOR BLOOD",
                type = PloyType.STRATEGY,
                lore = R.string.hunt_for_blood_lore,
                description = R.string.hunt_for_blood_description
            ),


            // ── Goremongers  FIREFIGHT ──
            Ploy(
                id = "unbridled_aggression",
                name = "UNBRIDLED AGGRESSION",
                type = PloyType.FIREFIGHT,
                lore = R.string.unbridled_aggression_lore,
                description = R.string.unbridled_aggression_description
            ),
            Ploy(
                id = "gorethirst",
                name = "GORETHIRST",
                type = PloyType.FIREFIGHT,
                lore = R.string.gorethirst_lore,
                description = R.string.gorethirst_description
            ),
            Ploy(
                id = "destructive_demise",
                name = "DESTRUCTIVE DEMISE",
                type = PloyType.FIREFIGHT,
                lore = R.string.destructive_demise_lore,
                description = R.string.destructive_demise_description
            ),
            Ploy(
                id = "lacerate_flesh",
                name = "LACERATE FLESH",
                type = PloyType.FIREFIGHT,
                lore = R.string.lacerate_flesh_lore,
                description = R.string.lacerate_flesh_description
            )
        ),



        "legionaries" to listOf(
            // ── Legionaries STRATEGY ──
            Ploy(
                id = "blood_for_the_blood_god",
                name = "BLOOD FOR THE BLOOD GOD",
                type = PloyType.STRATEGY,
                lore = R.string.blood_for_the_blood_god_lore,
                description = R.string.blood_for_the_blood_god_description
            ),
            Ploy(
                id = "legionarie_implacable",
                name = "IMPLACABLE",
                type = PloyType.STRATEGY,
                lore = R.string.legionarie_implacable_lore,
                description = R.string.legionarie_implacable_description
            ),
            Ploy(
                id = "quicksilver_speed",
                name = "QUICKSILVER SPEED",
                type = PloyType.STRATEGY,
                lore = R.string.quicksilver_speed_lore,
                description = R.string.quicksilver_speed_description
            ),
            Ploy(
                id = "fickle_fates",
                name = "FICKLE FATES",
                type = PloyType.STRATEGY,
                lore = R.string.fickle_fates_lore,
                description = R.string.fickle_fates_description
            ),


            // ── Legionaries  FIREFIGHT ──
            Ploy(
                id = "uneding_bloodshed",
                name = "UNENDING BLOODSHED",
                type = PloyType.FIREFIGHT,
                lore = R.string.uneding_bloodshed_lore,
                description = R.string.uneding_bloodshed_description
            ),
            Ploy(
                id = "mutability_and_change",
                name = "MUTABILITY AND CHANGE",
                type = PloyType.FIREFIGHT,
                lore = R.string.mutability_and_change_lore,
                description = R.string.mutability_and_change_description
            ),
            Ploy(
                id = "malignant_aura",
                name = "MALIGNANT AURA",
                type = PloyType.FIREFIGHT,
                lore = R.string.malignant_aura_lore,
                description = R.string.malignant_aura_description
            ),
            Ploy(
                id = "sickening_captivation",
                name = "SICKENING CAPTIVATION",
                type = PloyType.FIREFIGHT,
                lore = R.string.sickening_captivation_lore,
                description = R.string.sickening_captivation_description
            )
        ),



        "murderwing" to listOf(
            // ── Murderwing STRATEGY ──
            Ploy(
                id = "predators_above",
                name = "PREDATORS ABOVE",
                type = PloyType.STRATEGY,
                lore = R.string.predators_above_lore,
                description = R.string.predators_above_description
            ),
            Ploy(
                id = "cull_the_weak",
                name = "CULL THE WEAK",
                type = PloyType.STRATEGY,
                lore = R.string.cull_the_weak_lore,
                description = R.string.cull_the_weak_description
            ),
            Ploy(
                id = "nightmare_on_high",
                name = "NIGHTMARE ON HIGH",
                type = PloyType.STRATEGY,
                lore = R.string.nightmare_on_high_lore,
                description = R.string.nightmare_on_high_description
            ),
            Ploy(
                id = "instil_fear",
                name = "INSTIL FEAR",
                type = PloyType.STRATEGY,
                lore = R.string.instil_fear_lore,
                description = R.string.instil_fear_description
            ),


            // ── Murderwing  FIREFIGHT ──
            Ploy(
                id = "malicious_narcissism",
                name = "MALICIOUS NARCISSISM",
                type = PloyType.FIREFIGHT,
                lore = R.string.malicious_narcissism_lore,
                description = R.string.malicious_narcissism_description
            ),
            Ploy(
                id = "murderous_descent",
                name = "MURDEROUS DESCENT",
                type = PloyType.FIREFIGHT,
                lore = R.string.murderous_descent_lore,
                description = R.string.murderous_descent_description
            ),
            Ploy(
                id = "long_forgotten_honour",
                name = "LONG FORGOTTEN HONOUR",
                type = PloyType.FIREFIGHT,
                lore = R.string.long_forgotten_honour_lore,
                description = R.string.long_forgotten_honour_description
            ),
            Ploy(
                id = "wings_of_darkness",
                name = "WINGS OF DARKNESS",
                type = PloyType.FIREFIGHT,
                lore = R.string.wings_of_darkness_lore,
                description = R.string.wings_of_darkness_description
            )
        ),


        "nemesis_claw" to listOf(
            // ── Nemesis STRATEGY ──
            Ploy(
                id = "we_have_come_for_you",
                name = "WE HAVE COME FOR YOU",
                type = PloyType.STRATEGY,
                lore = R.string.we_have_come_for_you_lore,
                description = R.string.we_have_come_for_you_description
            ),
            Ploy(
                id = "the_black_hunt",
                name = "THE BLACK HUNT",
                type = PloyType.STRATEGY,
                lore = R.string.the_black_hunt_lore,
                description = R.string.the_black_hunt_description
            ),
            Ploy(
                id = "preysight",
                name = "PREYSIGHT",
                type = PloyType.STRATEGY,
                lore = R.string.preysight_lore,
                description = R.string.preysight_description
            ),
            Ploy(
                id = "return_to_darkness",
                name = "RETURN TO DARKNESS",
                type = PloyType.STRATEGY,
                lore = R.string.return_to_darkness_lore,
                description = R.string.return_to_darkness_description
            ),


            // ── Nemesis FIREFIGHT ──
            Ploy(
                id = "nemesis_vox_scream",
                name = "VOX SCREAM",
                type = PloyType.FIREFIGHT,
                lore = R.string.nemesis_vox_scream_lore,
                description = R.string.nemesis_vox_scream_description
            ),
            Ploy(
                id = "death_to_the_false_emperor",
                name = "DEATH TO THE FALSE EMPEROR",
                type = PloyType.FIREFIGHT,
                lore = R.string.death_to_the_false_emperor_lore,
                description = R.string.death_to_the_false_emperor_description
            ),
            Ploy(
                id = "proclivity_for_murder",
                name = "PROCLIVITY FOR MURDER",
                type = PloyType.FIREFIGHT,
                lore = R.string.proclivity_for_murder_lore,
                description = R.string.proclivity_for_murder_description
            ),
            Ploy(
                id = "dirty_fighter",
                name = "DIRTY FIGHTER",
                type = PloyType.FIREFIGHT,
                lore = R.string.dirty_fighter_lore,
                description = R.string.dirty_fighter_description
            )
        ),



        "warpcoven" to listOf(
            // ── Warpcoven STRATEGY ──
            Ploy(
                id = "aetherial_warding",
                name = "AETHERIAL WARDING",
                type = PloyType.STRATEGY,
                lore = R.string.aetherial_warding_lore,
                description = R.string.aetherial_warding_description
            ),
            Ploy(
                id = "fate_weapon",
                name = "FATE ITSELF IS MY WEAPON",
                type = PloyType.STRATEGY,
                lore = R.string.fate_weapon_lore,
                description = R.string.fate_weapon_description
            ),
            Ploy(
                id = "brotherhood_sorcerers",
                name = "BROTHERHOOD OF SORCERERS",
                type = PloyType.STRATEGY,
                lore = R.string.brotherhood_sorcerers_lore,
                description = R.string.brotherhood_sorcerers_description
            ),
            Ploy(
                id = "savage_herd",
                name = "SAVAGE HERD",
                type = PloyType.STRATEGY,
                lore = R.string.savage_herd_lore,
                description = R.string.savage_herd_description
            ),


            // ── Warpcoven FIREFIGHT ──
            Ploy(
                id = "all_is_dust",
                name = "ALL IS DUST",
                type = PloyType.FIREFIGHT,
                lore = R.string.all_is_dust_lore,
                description = R.string.all_is_dust_description
            ),
            Ploy(
                id = "capricious_plan",
                name = "CAPRICIOUS PLAN",
                type = PloyType.FIREFIGHT,
                lore = R.string.capricious_plan_lore,
                description = R.string.capricious_plan_description
            ),
            Ploy(
                id = "psychic_cabal",
                name = "PSYCHIC CABAL",
                type = PloyType.FIREFIGHT,
                lore = R.string.psychic_cabal_lore,
                description = R.string.psychic_cabal_description
            ),
            Ploy(
                id = "mutant_herd",
                name = "MUTANT HERD",
                type = PloyType.FIREFIGHT,
                lore = R.string.mutant_herd_lore,
                description = R.string.mutant_herd_description
            )
        ),


        "plague_marines" to listOf(
            // ── PLAGUE MARINES STRATEGY ──
            Ploy(
                id = "contagion",
                name ="CONTAGION",
                type = PloyType.STRATEGY,
                lore = R.string.plague_contagion_lore,
                description = R.string.plague_contagion_description
            ),
            Ploy(
                id = "lumbering_death",
                name = "LUMBERING DEATH",
                type = PloyType.STRATEGY,
                lore = R.string.plague_lumbering_lore,
                description = R.string.plague_lumbering_description
            ),
            Ploy(
                id = "cloud_flies",
                name = "CLOUD OF FLIES",
                type = PloyType.STRATEGY,
                lore = R.string.plague_cloud_flies_lore,
                description = R.string.plague_cloud_flies_description
            ),
            Ploy(
                id = "nurglins",
                name = "NURGLINGS",
                type = PloyType.STRATEGY,
                lore = R.string.plague_nurglings_lore,
                description = R.string.plague_nurglings_description
            ),


            // ── PLAGUE MARINES FIREFIGHT ──
            Ploy(
                id = "virulent_poison",
                name = "VIRULENT POISON",
                type = PloyType.FIREFIGHT,
                lore = R.string.plague_virulent_poison_lore,
                description = R.string.plague_virulent_poison_description
            ),
            Ploy(
                id = "poisonous_demise",
                name = "POISONUS DEMISE",
                type = PloyType.FIREFIGHT,
                lore = R.string.plague_poisonous_demise_lore,
                description = R.string.plague_poisonous_demise_description
            ),
            Ploy(
                id = "sickening_resilience",
                name = "SICKENING RESILIENCE",
                type = PloyType.FIREFIGHT,
                lore = R.string.plague_sickening_resilence_lore,
                description = R.string.plague_sickening_resilence_description
            ),
            Ploy(
                id = "curse_of_rot",
                name = "CURSE OF ROT",
                type = PloyType.FIREFIGHT,
                lore = R.string.plague_curse_rot_lore,
                description = R.string.plague_curse_rot_description
            )
        )
    )

    fun getForTeam(teamId: String): List<Ploy> =
        ploysByTeam[teamId].orEmpty()
}
