package org.epiphany.Enums.Systems.Battle;

public enum EBattleOverdrives {


    /*Weapon Overdrives*/

    /*Level 1 OD*/
    SPLICE("Splice"), // Sword OD
    CRACK("Crack"), // Axe OD
    IMPALE("Impale"), // Polearm OD
    BULLSEYE("Bullseye"), // Bow OD

    /*Level 2 OD*/
    SLICE_AND_DICE("Slice and Dice"), // Sword OD
    HOOK_N_HACK("Hook-N-Hack"), // Axe OD
    WHIRLWIND("Whirlwind"), // polearm OD
    VOLLEY("Volley"), // Bow OD

    /*Level 3 OD*/
    LAMB_CHOP("Lamb Chop"), // Axe OD
    LIVER_PUDDING("Liver Pudding"), // Polearm OD
    MINCE("Mince"), // Sword OD
    FLAMBE("Flambe"), // Bow OD

    /*Job Overdrives*/

    /*Acolyte job tree*/

    //insert acolyte job od here
    ZEN_YANG("Zen Yang"), // Monk OD
    KREUZ_AIDE("Kreuz Aide"), // Priest OD

    /*Rogue job tree*/

    //insert rogue job od here
    SHADOW_DANCE("Shadow Dance"), // Thief OD
    PHOENIX_DANCE("Phoenix Dance"), // Dancer OD


    /*Knight job tree*/
    //insert knight job od here
    HOLY_RETRIBUTION("Holy Retribution"), // Crusader OD
    DIVINE_JUDGEMENT("Divine Judgement"),// Paladin OD


    /*Tactician job tree*/

    REFORMATION("Reformation"), // Tactician OD
    PINCER_ATTACK("Pincer Attack"), // Commander OD
    REVITALIZE_AND_PRESERVE("Revitalize and Preserve"); // General OD





    private final String overdriveName;

    EBattleOverdrives(String overdriveName) {
        this.overdriveName = overdriveName;
    }

    public String getOverdriveName() {
        return overdriveName;
    }

}
