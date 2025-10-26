package org.epiphany.Enums.Systems.Character.Battle;

/**
 * Enum representing different target types in a battle system.
 * This can be used to specify whether an action targets an enemy, ally, self, any character, or all characters.
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
