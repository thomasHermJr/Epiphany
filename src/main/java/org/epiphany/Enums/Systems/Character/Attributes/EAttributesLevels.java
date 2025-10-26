package org.epiphany.Enums.Systems.Character.Attributes;

/**
 * Enum representing different levels for a character. <br>
 */

public enum EAttributesLevels {

    CHARACTER("character level", (byte) 1, (byte) 50),
    JOB("job level", (byte) 1, (byte) 80),
    PROFICIENCY("proficiency level", (byte) 0, (byte) 100);

    private final String levelType;
    private final byte minLevel;
    private final byte maxLevel;

    EAttributesLevels(String levelType, byte minLevel, byte maxLevel) {
        this.levelType = levelType;
        this.minLevel = minLevel;
        this.maxLevel = maxLevel;
    }

    public String getLevelType() {
        return levelType;
    }

    public byte getMinLevel() {
        return minLevel;
    }

    public byte getMaxLevel() {
        return maxLevel;
    }

    public byte getMinExperience() {
        return (byte) 0;
    }

    public short getMaxExperience() {
        return (short) 30000;
    }

}
