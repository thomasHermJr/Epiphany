package org.epiphany.Enums.Systems.Character.Battle;

public enum EBattleOverdrives {


    /*Weapon Overdrives*/

    /*Level 1 OD*/
    SPLICE("Splice", "None", 1, 120), // Sword OD
    CRACK("Crack", "Stunned", 1, 130), // Axe OD
    IMPALE("Impale", "None", 1, 160), // Polearm OD
    BULLSEYE("Bullseye", "None", 1, 140), // Bow OD

    /*Level 2 OD*/
    SLICE_AND_DICE("Slice and Dice", "None", 4, 115), // Sword OD
    HOOK_N_HACK("Hook-N-Hack", "Strength Down", 1, 150), // Axe OD
    WHIRLWIND("Whirlwind", "None", 4, 150), // polearm OD
    VOLLEY("Volley", "None", 4, 130), // Bow OD

    /*Level 3 OD*/
    MINCE("Mince", "Agility Down", 1, 175), // Sword OD
    LAMB_CHOP("Lamb Chop", "Defense Down", 1, 180), // Axe OD
    LIVER_PUDDING("Liver Pudding", "Max HP Down", 1, 220), // Polearm OD
    FLAMBE("Flambe", "Burned", 4, 160), // Bow OD

    /*Job Overdrives*/

    /*Acolyte job tree*/

    //insert acolyte job od here
    ZEN_YANG("Zen Yang", "Healthy", 4, 100), // Monk OD - buffs party
    KREUZ_AIDE("Kreuz Aide", "Healthy", 4, 200), // Priest OD - heals party

    /*Rogue job tree*/

    //insert rogue job od here
    SHADOW_DANCE("Shadow Dance", "Agility Down", 1, 120), // Thief OD
    PHOENIX_DANCE("Phoenix Dance", "Stat Up", 4, 200), // Dancer OD


    /*Knight job tree*/
    //insert knight job od here
    HOLY_RETRIBUTION("Holy Retribution", "None", 1, 150), // Crusader OD
    DIVINE_JUDGEMENT("Divine Judgement", "None", 1, 200),// Paladin OD


    /*Tactician job tree*/

    REFORMATION("Reformation", "Agility Up", 4, 100), // Tactician OD
    PINCER_ATTACK("Pincer Attack", "Strength Up", 4, 140), // Commander OD
    REVITALIZE_AND_PRESERVE("Revitalize and Preserve", "Defense Up", 4, 200); // General OD





    private final String overdriveName;
    private final String statusApplied; // default is "None", add status enum check later!
    private final int targetCount; // min 1, max 4
    private final int powerPercentage; // min 100, max 300


    EBattleOverdrives(String overdriveName, String statusApplied, int targetCount, int powerPercentage) { // start constructor

        this.overdriveName = overdriveName;

        if (targetCount < 1) { // start count validation
            targetCount = 1;
        } else if (targetCount > 4) {
            targetCount = 4;
        } // end count validation

        this.targetCount = targetCount;

        if (powerPercentage < 100) { // start power validation
            powerPercentage = 100;
        } else if (powerPercentage > 300) {
            powerPercentage = 300;
        } // end power validation

        this.powerPercentage = powerPercentage;

        // add status enum check later!

        this.statusApplied = statusApplied;

    } // end constructor

    /* Getters */

    public String getOverdriveName() {
        return overdriveName;
    }

    public String getStatusApplied() {
        return statusApplied;
    }

    public int getTargetCount() {
        return targetCount;
    }

    public int getPowerPercentage() {
        return powerPercentage;
    }

} // end enum
