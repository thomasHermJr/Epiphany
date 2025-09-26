package org.epiphany.Enums.Systems.Battle;

public enum EBattleOverdrives {


    /*Weapon Overdrives*/

    /*Level 1 OD*/
    SPLICE("Splice", 1, 120), // Sword OD
    CRACK("Crack", 1, 130), // Axe OD
    IMPALE("Impale", 1, 160), // Polearm OD
    BULLSEYE("Bullseye", 1, 140), // Bow OD

    /*Level 2 OD*/
    SLICE_AND_DICE("Slice and Dice", 4, 115), // Sword OD
    HOOK_N_HACK("Hook-N-Hack", 1, 150), // Axe OD
    WHIRLWIND("Whirlwind", 4, 150), // polearm OD
    VOLLEY("Volley", 4, 130), // Bow OD

    /*Level 3 OD*/
    LAMB_CHOP("Lamb Chop", 1, 180), // Axe OD
    LIVER_PUDDING("Liver Pudding", 1, 220), // Polearm OD
    MINCE("Mince", 1, 175), // Sword OD
    FLAMBE("Flambe", 4, 160), // Bow OD

    /*Job Overdrives*/

    /*Acolyte job tree*/

    //insert acolyte job od here
    ZEN_YANG("Zen Yang", 4, 100), // Monk OD - buffs party
    KREUZ_AIDE("Kreuz Aide", 4, 200), // Priest OD - heals party

    /*Rogue job tree*/

    //insert rogue job od here
    SHADOW_DANCE("Shadow Dance", 1, 120), // Thief OD
    PHOENIX_DANCE("Phoenix Dance", 4, 200), // Dancer OD


    /*Knight job tree*/
    //insert knight job od here
    HOLY_RETRIBUTION("Holy Retribution", 1, 150), // Crusader OD
    DIVINE_JUDGEMENT("Divine Judgement", 1, 200),// Paladin OD


    /*Tactician job tree*/

    REFORMATION("Reformation", 4, 100), // Tactician OD
    PINCER_ATTACK("Pincer Attack", 4, 140), // Commander OD
    REVITALIZE_AND_PRESERVE("Revitalize and Preserve", 4, 200); // General OD





    private final String overdriveName;
    private final int targetCount; // min 1, max 4
    private final int powerPercentage; // min 100, max 300


    EBattleOverdrives(String overdriveName, int targetCount, int powerPercentage) { // start constructor

        this.overdriveName = overdriveName;

        if (targetCount < 1) { // start count validation
            targetCount = 1;
        } else if (targetCount > 4) {
            targetCount = 4;
        } // end count validation

        this.targetCount = targetCount;

        if (powerPercentage < 100) { // start power valldation
            powerPercentage = 100;
        } else if (powerPercentage > 300) {
            powerPercentage = 300;
        } // end power validation

        this.powerPercentage = powerPercentage;

    } // end constructor

    public String getOverdriveName() {
        return overdriveName;
    }

    public int getTargetCount() {
        return targetCount;
    }

    public int getPowerPercentage() {
        return powerPercentage;
    }

} // end enum
