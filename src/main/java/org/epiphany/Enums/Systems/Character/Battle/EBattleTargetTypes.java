package org.epiphany.Enums.Systems.Character.Battle;

/**
 * Enum representing different target types in a battle system. <br>
 * Each target type defines who can be targeted by abilities or actions during combat. <br>
 * <br>
 * Target types include: <br>
 * - ENEMY: Targets opposing characters. <br>
 * - ALLY: Targets friendly characters. <br>
 * - SELF: Targets the character performing the action. <br>
 * - ANY: Targets any character, regardless of affiliation. <br>
 * - ALL: Targets all characters in the battle. <br>
 */

public enum EBattleTargetTypes {

    ENEMY("Enemy"),
    ALLY("Ally"),
    SELF("Self"),
    ANY("Any"),
    ALL("All");

    private final String targetType;

    EBattleTargetTypes(String targetType) {
        this.targetType = targetType;
    }

    public String getTargetType() {
        return targetType;
    }

}
