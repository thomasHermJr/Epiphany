package org.epiphany.Enums.Systems.Character.Battle;

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
