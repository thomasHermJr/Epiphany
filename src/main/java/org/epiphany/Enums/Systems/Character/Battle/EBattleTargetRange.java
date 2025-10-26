package org.epiphany.Enums.Systems.Character.Battle;

public enum EBattleTargetRange {

    SINGLE("Single", 1),
    SMALL("Small", 2),
    MEDIUM("Medium", 3),
    PARTY("Party",4),
    FIELD("Field", 8);

    private final String sizeName;
    private final int size;

    EBattleTargetRange(String sizeName, int size) {
        this.sizeName = sizeName;
        this.size = size;
    }

    public String getSizeName() {
        return sizeName;
    }

    public int getSize() {
        return size;
    }
}
