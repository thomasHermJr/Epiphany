package org.epiphany.Enums.Systems.Character.Attributes;

public enum EAttributesExperience {

    CHARACTER("character experience", (short) 200, 1.5, 1.3),
    JOB("job experience", (short) 100, 1.7, 1.2),
    PROFICIENCY("proficiency experience", (short) 50, 1.2, 1.1);

    private final String experienceType;
    private final short experienceNeeded;
    private final double experienceMultiplier;
    private final double multiplierDelta;

    EAttributesExperience(String experienceType, short experienceNeeded, double experienceMultiplier, double multiplierDelta) {
        this.experienceType = experienceType;
        this.experienceNeeded = experienceNeeded;
        this.experienceMultiplier = experienceMultiplier;
        this.multiplierDelta = multiplierDelta;
    }

    public String getExperienceType() {
        return experienceType;
    }

    public short getExperienceNeeded() {
        return experienceNeeded;
    }

    public double getExperienceMultiplier() {
        return experienceMultiplier;
    }

    public double getMultiplierDelta() {
        return multiplierDelta;
    }

    public byte getMinExperience() {
        return (byte) 0;
    }

    public short getMaxExperience() {
        return (short) 30000;
    }

}
