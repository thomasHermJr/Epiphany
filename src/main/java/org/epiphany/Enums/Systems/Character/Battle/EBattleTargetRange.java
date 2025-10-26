package org.epiphany.Enums.Systems.Character.Battle;

/**
 * Enum representing different target ranges in battle. <br>
 * Each range has a name and a corresponding size value. <br>
 * <br>
 * Ranges include: <br>
 * - SINGLE (1),<br>
 * - SMALL (2),<br>
 * - MEDIUM (3),<br>
 * - PARTY (4),<br>
 * - FIELD (8)
 */

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
