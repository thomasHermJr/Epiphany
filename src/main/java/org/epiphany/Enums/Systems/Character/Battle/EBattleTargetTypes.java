package org.epiphany.Enums.Systems.Character.Battle;

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
