package org.epiphany.Classes.Attributes;

import org.epiphany.Enums.Systems.Character.Attributes.EAttributesExperience;
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
    private short characterExperienceNeeded = EAttributesExperience.CHARACTER.getExperienceNeeded();
    private short jobExperienceNeeded = EAttributesExperience.JOB.getExperienceNeeded();
    private short proficiencyExperienceNeeded = EAttributesExperience.PROFICIENCY.getExperienceNeeded();


    public byte verifyLevelBounds(byte level, EAttributesLevels type) {// start verifyLevelBounds
        if (level < type.getMinLevel()) {
            level = type.getMinLevel();
        } else if (level > type.getMaxLevel()) {
            level = type.getMaxLevel();
        }
        return level;

    } // end verifyLevelBounds

    public short verifyExperienceBounds(short experience, EAttributesExperience type) { // start verifyExperienceBounds
        if (experience < type.getMinExperience()) {
            experience = type.getMinExperience();
        } else if (experience > type.getMaxExperience()) {
            experience = type.getMaxExperience();
        }


        return experience;

    } // end verifyExperienceBounds


    public short calculateExperienceNeeded(EAttributesExperience type) {
        double experienceNeeded = type.getExperienceNeeded() * type.getExperienceMultiplier() * type.getMultiplierDelta();
        return (short) experienceNeeded;
    }

    public short calculateNewExperience(short currentExperience, EAttributesExperience type) {
        currentExperience = (short) (currentExperience - type.getExperienceNeeded());
        return currentExperience;
    }

    public byte calculateLevel(byte level) {
        level++;
        return level;
    }

    public Levels characterLevelUp() { // start characterLevelUp

        while (characterExperience >= calculateExperienceNeeded(EAttributesExperience.CHARACTER)) { // start while

            characterExperienceNeeded = calculateExperienceNeeded(EAttributesExperience.CHARACTER);
            characterExperience = calculateNewExperience(characterExperience, EAttributesExperience.CHARACTER);
            characterLevel = calculateLevel(characterLevel);

        } // end while

        // verify bounds after leveling up
        characterExperience = verifyExperienceBounds(characterExperience, EAttributesExperience.CHARACTER);
        characterExperienceNeeded = verifyExperienceBounds(characterExperienceNeeded, EAttributesExperience.CHARACTER);
        characterLevel = verifyLevelBounds(characterLevel, EAttributesLevels.CHARACTER);

        return this;

    } // end characterLevelUp

    public Levels jobLevelUp() { // start jobLevelUp

        while (jobExperience >= calculateExperienceNeeded(EAttributesExperience.JOB)) { // start while

            jobExperienceNeeded = calculateExperienceNeeded(EAttributesExperience.JOB);
            jobExperience = calculateNewExperience(jobExperience, EAttributesExperience.JOB);
            jobLevel = calculateLevel(jobLevel);

        } // end while

        // verify bounds after leveling up
        jobExperience = verifyExperienceBounds(jobExperience, EAttributesExperience.JOB);
        jobExperienceNeeded = verifyExperienceBounds(jobExperienceNeeded, EAttributesExperience.JOB);
        jobLevel = verifyLevelBounds(jobLevel, EAttributesLevels.JOB);

        return this;

    } // end jobLevelUp

    public Levels proficiencyLevelUp() { // start proficiencyLevelUp

        while (proficiencyExperience >= calculateExperienceNeeded(EAttributesExperience.PROFICIENCY)) { // start while

            proficiencyExperienceNeeded = calculateExperienceNeeded(EAttributesExperience.PROFICIENCY);
            proficiencyExperience = calculateNewExperience(proficiencyExperience, EAttributesExperience.PROFICIENCY);
            proficiencyLevel = calculateLevel(proficiencyLevel);

        } // end while

        // verify bounds after leveling up
        proficiencyExperience = verifyExperienceBounds(proficiencyExperience, EAttributesExperience.PROFICIENCY);
        proficiencyExperienceNeeded = verifyExperienceBounds(proficiencyExperienceNeeded, EAttributesExperience.PROFICIENCY);
        proficiencyLevel = verifyLevelBounds(proficiencyLevel, EAttributesLevels.PROFICIENCY);

        return this;

    } // end proficiencyLevelUp

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
        characterExperience = verifyExperienceBounds(characterExperience, EAttributesExperience.CHARACTER);
        this.characterExperience = characterExperience;
    }

    public short getJobExperience() {
        return jobExperience;
    }

    public void setJobExperience(short jobExperience) {
        jobExperience = verifyExperienceBounds(jobExperience, EAttributesExperience.JOB);
        this.jobExperience = jobExperience;
    }

    public short getProficiencyExperience() {
        return proficiencyExperience;
    }

    public void setProficiencyExperience(short proficiencyExperience) {
        proficiencyExperience = verifyExperienceBounds(proficiencyExperience, EAttributesExperience.PROFICIENCY);
        this.proficiencyExperience = proficiencyExperience;
    }

    public short getCharacterExperienceNeeded() {
        return characterExperienceNeeded;
    }

    public short getJobExperienceNeeded() {
        return jobExperienceNeeded;
    }

    public short getProficiencyExperienceNeeded() {
        return proficiencyExperienceNeeded;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
         sb.append("Character Level: ").append(getCharacterLevel()).append("\t\t")
                .append("Character Experience: ").append(getCharacterExperience()).append("\t\t")
                 .append("Experience Needed: ").append(getCharacterExperienceNeeded()).append("\n")
                .append("Job Level: ").append(getJobLevel()).append("\t\t\t")
                .append("Experience: ").append(getJobExperience()).append("\t\t")
                 .append("Experience Needed: ").append(getJobExperienceNeeded()).append("\n");
        return sb.toString();
    }


} // end Levels class
