package org.epiphany.Classes.Character;

import org.epiphany.Classes.Attributes.Proficiencies;
import org.epiphany.Enums.Systems.Character.Attributes.EAttributesMain;

/*TODO:
*       Experiment with abstract classes for attributes (main --> derived --> prof --> Entity)*/

/**
 * Class representing a character with various attributes.
 * Each attribute has defined minimum and maximum bounds from EAttributesMain.
 * The class includes methods to get and set attributes, ensuring they stay within bounds.
 */


public class Entity extends Proficiencies { // Changed class name from Character to Entity to avoid conflict with java.lang.Character

    private String name;

    // Constructor
    public Entity(String name, byte strength, byte dexterity, byte constitution,
                  byte intelligence, byte wisdom, byte charisma)
                     {
        this.name = name;
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
        Entity myCharacter = new Entity("Drusyc", (byte) 10, (byte) 14, (byte) 12, (byte) 16, (byte) 13, (byte) 8);

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

        System.out.println("After name change and attribute updates:\n");

        System.out.println(myCharacter);

} // end characterTest

    public static void statTest() {

        Entity testCharacter = new Entity("Test", (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10);

        System.out.println("\nTesting Character stat bounds...\n");
        System.out.println("Initial character:\n");
        System.out.println(testCharacter);

        // Test setting attributes below minimum

        testCharacter.setStrength((byte)0);
        testCharacter.setDexterity((byte)0);
        testCharacter.setConstitution((byte)0);
        testCharacter.setIntelligence((byte)0);
        testCharacter.setWisdom((byte)0);
        testCharacter.setCharisma((byte)0);

        System.out.println("After setting attributes below minimum:\n");
        System.out.println(testCharacter);

        // Test setting attributes above maximum
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
