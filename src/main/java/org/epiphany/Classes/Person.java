package org.epiphany.Classes;

import org.epiphany.Enums.Systems.Character.Attributes.EAttributesMain;

/*TODO: Experiment more with using Enums for stat management, in order to maintain one source of truth
*       Experiment with abstract classes for attributes (main --> derived --> prof --> person)*/

/**
 * Class representing a character with various attributes.
 * Each attribute has defined minimum and maximum bounds from EAttributesMain.
 * The class includes methods to get and set attributes, ensuring they stay within bounds.
 */


public class Person { // Changed class name from Character to Person to avoid conflict with java.lang.Character
    // Attributes
    private String name;

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    // Constructor
    public Person(String name, int strength, int dexterity, int constitution,
                      int intelligence, int wisdom, int charisma)
                     {
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public int verifyStatBounds(int stat, EAttributesMain attribute) {
        if (stat > attribute.getMaxValue()) {
            return attribute.getMaxValue();
        } else if (stat < attribute.getMinValue()) {
            return attribute.getMinValue();
        } else {
            return stat;
        }
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {

        strength = verifyStatBounds(strength, EAttributesMain.STRENGTH);
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {

        dexterity = verifyStatBounds(dexterity, EAttributesMain.DEXTERITY);
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {

        constitution = verifyStatBounds(constitution, EAttributesMain.CONSTITUTION);
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) { // Ensure intelligence stays within defined bounds

        intelligence = verifyStatBounds(intelligence, EAttributesMain.INTELLIGENCE);
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) { // Ensure wisdom stays within defined bounds

        wisdom = verifyStatBounds(wisdom, EAttributesMain.WISDOM);
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {

        charisma = verifyStatBounds(charisma, EAttributesMain.CHARISMA);
        this.charisma = charisma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Character Name: ").append(name).append("\n")
                .append("Strength: ").append(getStrength()).append("\n")
                .append("Dexterity: ").append(getDexterity()).append("\n")
                .append("Constitution: ").append(getConstitution()).append("\n")
                .append("Intelligence: ").append(getIntelligence()).append("\n")
                .append("Wisdom: ").append(getWisdom()).append("\n")
                .append("Charisma: ").append(getCharisma()).append("\n");
        return sb.toString();
    } // end toString

    public static void characterTest() {
        Person myCharacter = new Person("Drusyc", 10, 14, 12, 16, 13, 8);

        System.out.println("\nTesting Character class...\n");
        System.out.println("Initial character\n");
        System.out.println(myCharacter);

        myCharacter.setName("Arannis");
        myCharacter.setStrength(4);
        myCharacter.setDexterity(18);
        myCharacter.setConstitution(14);
        myCharacter.setIntelligence(12);
        myCharacter.setWisdom(10);
        myCharacter.setCharisma(20);

        System.out.println("After name change and attribute updates:\n");

        System.out.println(myCharacter);
} // end characterTest

    public static void statTest() {
        Person testCharacter = new Person("Test", 10, 10, 10, 10, 10, 10);

        System.out.println("\nTesting Character stat bounds...\n");
        System.out.println("Initial character:\n");
        System.out.println(testCharacter);

        // Test setting attributes below minimum
        testCharacter.setStrength(0);
        testCharacter.setDexterity(0);
        testCharacter.setConstitution(0);
        testCharacter.setIntelligence(0);
        testCharacter.setWisdom(0);
        testCharacter.setCharisma(0);

        System.out.println("After setting attributes below minimum:\n");
        System.out.println(testCharacter);

        // Test setting attributes above maximum
        testCharacter.setStrength(100);
        testCharacter.setDexterity(100);
        testCharacter.setConstitution(100);
        testCharacter.setIntelligence(100);
        testCharacter.setWisdom(100);
        testCharacter.setCharisma(100);

        System.out.println("After setting attributes above maximum:\n");
        System.out.println(testCharacter);
    } // end statTest

} // end Character class
