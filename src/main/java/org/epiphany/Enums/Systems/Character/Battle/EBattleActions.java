package org.epiphany.Enums.Systems.Character.Battle;

/**
 * Enumeration representing different battle actions available to characters.
 */

public enum EBattleActions {

    ATTACK("Attack"),
    SKILL("Skill"),
    DEFEND("Defend"),
    OVERDRIVE("Overdrive"),
    ITEM("Item"),
    ESCAPE("Escape");

    private final String actionName;

    EBattleActions(String actionName) {
        this.actionName = actionName;
    }
}
