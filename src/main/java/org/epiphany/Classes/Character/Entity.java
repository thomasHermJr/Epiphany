package org.epiphany.Classes.Character;

import org.epiphany.Classes.Attributes.Proficiencies;
import org.epiphany.Enums.Systems.Character.Attributes.EAttributesMain;
import org.epiphany.Enums.Systems.Character.ECharacterJobs;
import org.epiphany.Interfaces.IEntity;

/*TODO:
*       Change job attribute type to ECharacterJobs*/

/**
 * Class representing a character with various attributes.
 * Each attribute has defined minimum and maximum bounds from EAttributesMain.
 * The class includes methods to get and set attributes, ensuring they stay within bounds.
 *
 * Class chain:
 * Levels --> MainAttributes --> DerivedAttributes --> Proficiencies --> Entity
 *
 * Methods:
 * - getName(): Returns the character's name.
 * - setName(String name): Sets the character's name.
 * - toString(): Returns a string representation of the character's attributes.
 * - characterTest(): Tests the Character class functionality.
 * - statTest(): Tests the attribute bounds enforcement.
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
        Entity myCharacter = new Entity("Drusyc", ECharacterJobs.PLACEHOLDER_JOB, (byte) 5, (byte) 5, (short) 200, (short) 200, (byte) 10, (byte) 14, (byte) 12, (byte) 16, (byte) 13, (byte) 8);

        System.out.println("\nTesting Character class...\n");
        System.out.println("Initial character\n");
        System.out.println(myCharacter);

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

        System.out.println("After name change and attribute updates:\n");

        System.out.println(myCharacter);

} // end characterTest

    public static void statTest() {

        Entity testCharacter = new Entity("Test", ECharacterJobs.PLACEHOLDER_JOB, (byte) 10, (byte) 10, (short) 100, (short) 100, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10);

        System.out.println("\nTesting Character stat bounds...\n");
        System.out.println("Initial character:\n");
        System.out.println(testCharacter);

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

        System.out.println("After setting attributes below minimum:\n");
        System.out.println(testCharacter);

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

        System.out.println("After setting attributes above maximum:\n");
        System.out.println(testCharacter);
    } // end statTest

} // end Character class
