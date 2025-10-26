package org.epiphany.Classes.Attributes;

import org.epiphany.Enums.Systems.Character.Attributes.EAttributesLevels;
import org.epiphany.Interfaces.IAttributes;

/** <p>
 * Levels class represents the levels and experience of a character, job, and proficiency. <br>
 * It provides methods to verify and set levels and experience within defined bounds. <br>
 * <br>
 * Class chain: <br>
 * Levels --> MainAttributes --> DerivedAttributes --> Proficiencies --> Entity <br>
 * <br>
 * Attributes: <br>
 * - characterLevel <br>
 * - jobLevel <br>
 * - proficiencyLevel <br>
 * - characterExperience <br>
 * - jobExperience <br>
 * - proficiencyExperience <br>
 * <br>
 * Methods: <br>
 * - verifyLevelBounds(byte level, EAttributesLevels type): Ensures the level is within min and max bounds. <br>
 * - verifyExperienceBounds(short experience, EAttributesLevels type): Ensures the experience is within min and max bounds. <br>
 * - Getters and setters for each attribute with bounds checking. <br>
 * - toString(): Returns a string representation of the levels and experience. <br>
 * </p>
 */

public abstract class Levels implements IAttributes {

    private byte characterLevel;
    private byte jobLevel;
    private byte proficiencyLevel;
    private short characterExperience;
    private short jobExperience;
    private short proficiencyExperience;


    public byte verifyLevelBounds(byte level, EAttributesLevels type) {// start verifyLevelBounds
        if (level < type.getMinLevel()) {
            level = type.getMinLevel();
        } else if (level > type.getMaxLevel()) {
            level = type.getMaxLevel();
        }
        return level;

    } // end verifyLevelBounds

    public short verifyExperienceBounds(short experience, EAttributesLevels type) { // start verifyExperienceBounds
        if (experience < type.getMinExperience()) {
            experience = type.getMinExperience();
        } else if (experience > type.getMaxExperience()) {
            experience = type.getMaxExperience();
        }
            return experience;

    } // end verifyExperienceBounds

    public byte getCharacterLevel() {
        return characterLevel;
    }

    public void setCharacterLevel(byte characterLevel) {
        characterLevel = verifyLevelBounds(characterLevel, EAttributesLevels.CHARACTER);
        this.characterLevel = characterLevel;
    }

    public byte getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(byte jobLevel) {
        jobLevel = verifyLevelBounds(jobLevel, EAttributesLevels.JOB);
        this.jobLevel = jobLevel;
    }

    public byte getProficiencyLevel() {
        return proficiencyLevel;
    }

    public void setProficiencyLevel(byte proficiencyLevel) {
        proficiencyLevel = verifyLevelBounds(proficiencyLevel, EAttributesLevels.PROFICIENCY);
        this.proficiencyLevel = proficiencyLevel;
    }

    public short getCharacterExperience() {
        return characterExperience;
    }

    public void setCharacterExperience(short characterExperience) {
        characterExperience = verifyExperienceBounds(characterExperience, EAttributesLevels.CHARACTER);
        this.characterExperience = characterExperience;
    }

    public short getJobExperience() {
        return jobExperience;
    }

    public void setJobExperience(short jobExperience) {
        jobExperience = verifyExperienceBounds(jobExperience, EAttributesLevels.JOB);
        this.jobExperience = jobExperience;
    }

    public short getProficiencyExperience() {
        return proficiencyExperience;
    }

    public void setProficiencyExperience(short proficiencyExperience) {
        proficiencyExperience = verifyExperienceBounds(proficiencyExperience, EAttributesLevels.PROFICIENCY);
        this.proficiencyExperience = proficiencyExperience;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
         sb.append("Character Level: ").append(getCharacterLevel()).append("\t\t")
                .append("Experience: ").append(getCharacterExperience()).append("\n")
                .append("Job Level: ").append(getJobLevel()).append("\t\t\t")
                .append("Experience: ").append(getJobExperience()).append("\n");
        return sb.toString();
    }


} // end Levels class
