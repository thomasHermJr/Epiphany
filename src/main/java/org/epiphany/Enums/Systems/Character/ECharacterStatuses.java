package org.epiphany.Enums.Systems.Character;

public enum ECharacterStatuses {

    /*TODO:
       Add more statuses, add stat down effects, add damage in heath%
       Make health down effects distinct from one another
         - Consider making all health down effects inflict an additional effect to accomplish this.*/

    /* Base */
    NONE("None"), // No status effect

    /* Positive*/
    HEALTHY("Healthy"), // Recover all negative status effects, immune to new ones

    // stat ups

    ATTACK_UP("Attack Up"), // Increased physical attack power
    AGILITY_UP("Agility Up"), // Increased speed and evasion
    DEFENSE_UP("Defense Up"), // Increased physical defense
    MAX_HP_UP("Max HP Up"), // Increased maximum health
    STAT_UP("Stat Up"), // Increases all stats slightly

    /* Negative */
    STUNNED("Stunned"), // Cannot act for one turn
    POISONED("Poisoned"), // Takes damage over time, reduced attack
    ASLEEP("Asleep"), // Cannot act until woken up
    SHOCKED("Shocked"), // Chance to force a default attack
    FAITHLESS("Faithless"), // Cannot use Overdrives
    DEPRIVED("Deprived"), // Cannot use items
    APATHETIC("Apathetic"), // Cannot be healed
    BURNED("Burned"), // Takes damage over time, reduced defense

    // stat downs

    ATTACK_DOWN("Attack Down"), // Reduced physical attack power
    AGILITY_DOWN("Agility Down"), // Reduced speed and evasion
    DEFENSE_DOWN("Defense Down"), // Reduced physical defense
    MAX_HP_DOWN("Max HP Down"), // Reduced maximum health
    STAT_DOWN("Stat Down"); // Decreases all stats slightly



    private final String statusName;

    ECharacterStatuses(String StatusName) {
        this.statusName = StatusName;
    }

    public String getStatusName() {
        return statusName;
    }


}
