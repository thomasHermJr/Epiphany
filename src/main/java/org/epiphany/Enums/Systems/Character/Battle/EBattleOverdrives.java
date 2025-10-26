package org.epiphany.Enums.Systems.Character.Battle;

import org.epiphany.Enums.Systems.Character.ECharacterStatuses;

public enum EBattleOverdrives {


    /*Weapon Overdrives*/

    /*Level 1 OD*/
    SPLICE("Splice", ECharacterStatuses.NONE, EBattleTargetRange.SINGLE, EBattleTargetTypes.ENEMY, 120), // Sword OD
    CRACK("Crack", ECharacterStatuses.STUNNED, EBattleTargetRange.SINGLE, EBattleTargetTypes.ENEMY, 130), // Axe OD
    IMPALE("Impale", ECharacterStatuses.NONE, EBattleTargetRange.SINGLE, EBattleTargetTypes.ENEMY, 160), // Polearm OD
    BULLSEYE("Bullseye", ECharacterStatuses.NONE, EBattleTargetRange.SINGLE, EBattleTargetTypes.ENEMY, 140), // Bow OD

    /*Level 2 OD*/
    SLICE_AND_DICE("Slice and Dice", ECharacterStatuses.NONE, EBattleTargetRange.PARTY, EBattleTargetTypes.ENEMY, 115), // Sword OD
    HOOK_N_HACK("Hook-N-Hack", ECharacterStatuses.ATTACK_DOWN, EBattleTargetRange.SINGLE, EBattleTargetTypes.ENEMY, 150), // Axe OD
    WHIRLWIND("Whirlwind", ECharacterStatuses.NONE, EBattleTargetRange.PARTY, EBattleTargetTypes.ENEMY, 150), // polearm OD
    VOLLEY("Volley", ECharacterStatuses.NONE, EBattleTargetRange.PARTY, EBattleTargetTypes.ENEMY, 130), // Bow OD

    /*Level 3 OD*/
    MINCE("Mince", ECharacterStatuses.AGILITY_DOWN, EBattleTargetRange.SINGLE, EBattleTargetTypes.ENEMY, 175), // Sword OD
    LAMB_CHOP("Lamb Chop", ECharacterStatuses.DEFENSE_DOWN, EBattleTargetRange.SINGLE, EBattleTargetTypes.ENEMY, 180), // Axe OD
    LIVER_PUDDING("Liver Pudding", ECharacterStatuses.MAX_HP_DOWN, EBattleTargetRange.SINGLE, EBattleTargetTypes.ENEMY, 220), // Polearm OD
    FLAMBE("Flambe", ECharacterStatuses.BURNED, EBattleTargetRange.PARTY, EBattleTargetTypes.ENEMY, 160), // Bow OD

    /*Job Overdrives*/

    /*Acolyte job tree*/

    //insert acolyte job od here
    ZEN_YANG("Zen Yang", ECharacterStatuses.HEALTHY, EBattleTargetRange.PARTY, EBattleTargetTypes.ALLY, 100), // Monk OD - buffs party
    KREUZ_AIDE("Kreuz Aide", ECharacterStatuses.HEALTHY, EBattleTargetRange.PARTY, EBattleTargetTypes.ALLY, 200), // Priest OD - heals party

    /*Rogue job tree*/

    //insert rogue job od here
    SHADOW_DANCE("Shadow Dance", ECharacterStatuses.AGILITY_DOWN, EBattleTargetRange.SINGLE, EBattleTargetTypes.ENEMY, 120), // Thief OD
    PHOENIX_DANCE("Phoenix Dance", ECharacterStatuses.STAT_UP, EBattleTargetRange.SINGLE, EBattleTargetTypes.ALLY, 150), // Dancer OD


    /*Knight job tree*/
    //insert knight job od here
    HOLY_RETRIBUTION("Holy Retribution", ECharacterStatuses.NONE, EBattleTargetRange.SINGLE, EBattleTargetTypes.ENEMY, 150), // Crusader OD
    DIVINE_JUDGEMENT("Divine Judgement", ECharacterStatuses.NONE, EBattleTargetRange.SINGLE, EBattleTargetTypes.ENEMY, 200),// Paladin OD


    /*Tactician job tree*/

    REFORMATION("Reformation", ECharacterStatuses.AGILITY_UP, EBattleTargetRange.PARTY, EBattleTargetTypes.ALLY, 100), // Tactician OD
    PINCER_ATTACK("Pincer Attack", ECharacterStatuses.ATTACK_UP, EBattleTargetRange.PARTY, EBattleTargetTypes.ALLY, 140), // Commander OD
    REVITALIZE_AND_PRESERVE("Revitalize and Preserve", ECharacterStatuses.STAT_UP, EBattleTargetRange.PARTY, EBattleTargetTypes.ALLY, 200); // General OD





    private final String overdriveName;
    private final ECharacterStatuses statusApplied; // default is "None", add status enum check later!
    private final EBattleTargetRange targetCount; // min 1, max 4
    private final EBattleTargetTypes targetType; // Enemy, Ally, Self, Any, All
    private final int powerPercentage; // min 100, max 300


    EBattleOverdrives(String overdriveName,
                      ECharacterStatuses statusApplied,
                      EBattleTargetRange targetCount,
                      EBattleTargetTypes targetType,
                      int powerPercentage) { // start constructor

        this.overdriveName = overdriveName;
        this.statusApplied = statusApplied;
        this.targetCount = targetCount;
        this.targetType = targetType;

        if (powerPercentage < 100) { // start power validation
            powerPercentage = 100;
        } else if (powerPercentage > 300) {
            powerPercentage = 300;
        } // end power validation

        this.powerPercentage = powerPercentage;

    } // end constructor

    /* Getters */

    public String getOverdriveName() {
        return overdriveName;
    }

    public String getStatusApplied() {
        return statusApplied.getStatusName();
    }

    public String getTargetArea() {
        return targetCount.getSizeName();
    }

    public int getTargetCount() {
        return targetCount.getSize();
    }

    public String getTargetType() {
        return targetType.getTargetType();
    }

    public int getPowerPercentage() {
        return powerPercentage;
    }

} // end enum
