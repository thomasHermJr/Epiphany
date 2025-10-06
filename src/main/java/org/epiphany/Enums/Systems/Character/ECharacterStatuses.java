package org.epiphany.Enums.Systems.Character;

public enum ECharacterStatuses {

    NONE("None"), // No status effect
    HEALTHY("Healthy"), // Recover all negative status effects, immune to new ones
    STUNNED("Stunned"), // Cannot act for one turn
    POISONED("Poisoned"), // Takes damage over time
    ASLEEP("Asleep"), // Cannot act until woken up
    SHOCKED("Shocked"), // Chance to force a default attack
    FAITHLESS("Faithless"), // Cannot use Overdrives
    DEPRIVED("Deprived"), // Cannot use items
    APATHETIC("Apathetic"), // Cannot be healed
    BURNED("Burned"); // Takes damage over time, reduced attack power

    /*Add stat down effects, turn duration, damage in heath%*/
    private final String statusName;

    ECharacterStatuses(String StatusName) {
        this.statusName = StatusName;
    }

    public String getStatusName() {
        return statusName;
    }


}
