package com.example.killteamruleset.ui.data

import com.example.killteamruleset.R
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

        "wrecka_krew" to listOf(
            // ── Wreckas STRATEGY ──
            Ploy(
                id = "waaagh",
                name ="WAAAAGH!",
                type = PloyType.STRATEGY,
                lore = R.string.wrecka_waaagh_lore,
                description = R.string.wrecka_waaagh_description
            ),
            Ploy(
                id = "tuff_gitz",
                name = "TUFF GITZ",
                type = PloyType.STRATEGY,
                lore = R.string.wrecka_tuff_gitz_lore,
                description = R.string.wrecka_tuff_gitz_description
            ),
            Ploy(
                id = "destruction",
                name = "DESTRUCTION",
                type = PloyType.STRATEGY,
                lore = R.string.wrecka_destruction_lore,
                description = R.string.wrecka_destruction_description
            ),
            Ploy(
                id = "amped_up",
                name = "AMPED UP",
                type = PloyType.STRATEGY,
                lore = R.string.wrecka_amped_up_lore,
                description = R.string.wrecka_amped_up_description
            ),


            // ── Wreckas FIREFIGHT ──
            Ploy(
                id = "demolition_job",
                name = "DEMOLITION JOB",
                type = PloyType.FIREFIGHT,
                lore = R.string.wrecka_demolition_job_lore,
                description = R.string.wrecka_demolition_job_description
            ),
            Ploy(
            id = "proppa_scrap",
            name = "PROPPA SCRAP",
            type = PloyType.FIREFIGHT,
            lore = R.string.wrecka_proppa_scrap_lore,
            description = R.string.wrecka_proppa_scrap_description
            ),
            Ploy(
                id = "kaboom",
                name = "KABOOM",
                type = PloyType.FIREFIGHT,
                lore = R.string.wrecka_kaboom_lore,
                description = R.string.wrecka_kaboom_description
            ),
            Ploy(
                id = "just_a_scratch",
                name = "JUST A SCRATCH",
                type = PloyType.FIREFIGHT,
                lore = R.string.wrecka_jas_lore,
                description = R.string.wrecka_jas_description
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
