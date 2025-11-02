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

    public static void characterTest() {
        Entity myCharacter = new Entity("Drusyc", ECharacterJobs.PLACEHOLDER_JOB, // entity data
                (byte) 5, (byte) 5, // levels
                (short) 200, (short) 200, // experience
                (byte) 10, (byte) 14, (byte) 12, (byte) 16, (byte) 13, (byte) 8); // main attributes

        StringBuilder intro = new StringBuilder();
        intro.append("\n--- Entity Class setter Test ---\n\n")
                .append("Initial character:\n\n")
                .append(myCharacter);
        System.out.println(intro);

        myCharacter.setName("Arannis");
        myCharacter.setStrength((byte) 4);
        myCharacter.setDexterity((byte) 18);
        myCharacter.setConstitution((byte) 14);
        myCharacter.setIntelligence((byte) 12);
        myCharacter.setWisdom((byte) 10);
        myCharacter.setCharisma((byte) 20);
        myCharacter.setCharacterLevel((byte) 6);
        myCharacter.setJobLevel((byte) 6);
        myCharacter.setCharacterExperience((short) 300);
        myCharacter.setJobExperience((short) 300);

        StringBuilder afterChanges = new StringBuilder();
        afterChanges.append("\n--- After Changes ---\n\n")
                .append(myCharacter);
        System.out.println(afterChanges);

} // end characterTest

    public static void statTest() {

        Entity testCharacter = new Entity("Test", ECharacterJobs.PLACEHOLDER_JOB, // entity data
                (byte) 10, (byte) 10, // levels
                (short) 100, (short) 100, // experience
                (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10); // main attributes

        StringBuilder intro = new StringBuilder();
        intro.append("\n--- Stat Bounds Test ---\n\n")
                .append("Initial character:\n\n")
                .append(testCharacter);
        System.out.println(intro);

        // Test setting attributes below minimum
        testCharacter.setCharacterLevel((byte)0);
        testCharacter.setCharacterExperience((short)-50);
        testCharacter.setJobExperience((short)-50);
        testCharacter.setJobLevel((byte)0);
        testCharacter.setStrength((byte)0);
        testCharacter.setDexterity((byte)0);
        testCharacter.setConstitution((byte)0);
        testCharacter.setIntelligence((byte)0);
        testCharacter.setWisdom((byte)0);
        testCharacter.setCharisma((byte)0);

        StringBuilder afterMinTest = new StringBuilder();
        afterMinTest.append("\n--- After setting attributes below minimum ---\n\n")
                .append(testCharacter);
        System.out.println(afterMinTest);

        // Test setting attributes above maximum
        testCharacter.setCharacterLevel((byte)100);
        testCharacter.setCharacterExperience((short)31000);
        testCharacter.setJobExperience((short)31000);
        testCharacter.setJobLevel((byte)100);
        testCharacter.setStrength((byte)100);
        testCharacter.setDexterity((byte)100);
        testCharacter.setConstitution((byte)100);
        testCharacter.setIntelligence((byte)100);
        testCharacter.setWisdom((byte)100);
        testCharacter.setCharisma((byte)100);

        StringBuilder afterMaxTest = new StringBuilder();
        afterMaxTest.append("\n--- After setting attributes above maximum ---\n\n")
                .append(testCharacter);
        System.out.println(afterMaxTest);

    } // end statTest

    public static void levelTest() {
        Entity testCharacter = new Entity("LevelTest", ECharacterJobs.PLACEHOLDER_JOB, // entity data
                (byte) 1, (byte) 1, // levels
                (short) 0, (short) 0, // experience
                (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10); // main attributes

        StringBuilder intro = new StringBuilder();
        intro.append("\n--- Level Up Test ---\n\n")
                .append("Initial character:\n\n")
                .append(testCharacter);
        System.out.println(intro);

        // Simulate gaining experience and leveling up

        short addCharacterExperience = 5000;
        short addJobExperience = 3000;

        testCharacter.addCharacterExperience(addCharacterExperience);
        testCharacter.setJobExperience(addJobExperience);
        testCharacter.characterLevelUp();
        testCharacter.jobLevelUp();

        StringBuilder afterLevelUp = new StringBuilder();
        afterLevelUp.append("\n--- After Level Ups (+ ")
                .append(addCharacterExperience).append(" character experience + ")
                .append(addJobExperience).append(" job experience) ---\n\n")
                .append(testCharacter);
        System.out.println(afterLevelUp);

        // test leveling beyond max level
        testCharacter.addCharacterExperience((short) 25000);
        testCharacter.addJobExperience((short)25000);
        testCharacter.characterLevelUp();
        testCharacter.jobLevelUp();
        testCharacter.addCharacterExperience((short) 25000);
        testCharacter.addJobExperience((short)30000);
        testCharacter.characterLevelUp();
        testCharacter.jobLevelUp();
        testCharacter.addCharacterExperience((short)400);
        testCharacter.characterLevelUp();

        StringBuilder afterMaxLevelUp = new StringBuilder();
        afterMaxLevelUp.append("\n--- After Beyond Max Level Up Attempt ---\n\n")
                .append(testCharacter);
        System.out.println(afterMaxLevelUp);

    } // end levelTest

} // end Character class
