package org.epiphany.Classes.Character;

import org.epiphany.Classes.Attributes.Proficiencies;
import org.epiphany.Enums.Systems.Character.ECharacterJobs;
import org.epiphany.Interfaces.IEntity;

/**
 * <p>
 * Class representing a character with various attributes. <br>
 * Each attribute has defined minimum and maximum bounds from EAttributesMain. <br>
 * The class includes methods to get and set attributes, ensuring they stay within bounds. <br>
 *<br>
 * Class chain: <br>
 * Levels --> MainAttributes --> DerivedAttributes --> Proficiencies --> Entity <br>
 * <br>
 * Methods: <br>
 * - getName(): Returns the character's name. <br>
 * - setName(String name): Sets the character's name. <br>
 * - getJob(): Returns the character's job. <br>
 * - setJob(ECharacterJobs job): Sets the character's job. <br>
 * - toString(): Returns a string representation of the character's attributes. <br>
 * <br>
 * Testing: <br>
 * - characterTest(): Tests the Character class functionality.  <br>
 * - statTest(): Tests the attribute bounds enforcement.  <br>
 * - levelTest(): Tests the leveling up functionality.  <br>
 * </p>
 */


public class Entity extends Proficiencies implements IEntity { // Changed class name from Character to Entity to avoid conflict with java.lang.Character

    private String name;
    private ECharacterJobs job;

    // Constructor
    public Entity(String name,
                  ECharacterJobs job,
                  byte characterLevel,
                  byte jobLevel,
                  short characterExperience,
                  short jobExperience,
                  byte strength,
                  byte dexterity,
                  byte constitution,
                  byte intelligence,
                  byte wisdom,
                  byte charisma)
                     {
        this.name = name;
        this.job = job;

        // superclass setters ensure bounds are checked
        super.setCharacterLevel(characterLevel);
        super.setJobLevel(jobLevel);
        super.setCharacterExperience(characterExperience);
        super.setJobExperience(jobExperience);
        super.setStrength(strength);
        super.setDexterity(dexterity);
        super.setConstitution(constitution);
        super.setIntelligence(intelligence);
        super.setWisdom(wisdom);
        super.setCharisma(charisma);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ECharacterJobs getJob() {
        return job;
    }

    public void setJob(ECharacterJobs job) {
        this.job = job;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Character Name: ").append(name).append("\n")
                .append("Job: ").append(job.getJobName()).append("\n")
                .append(super.toString());
        return sb.toString();
    } // end toString

} // end Character class
