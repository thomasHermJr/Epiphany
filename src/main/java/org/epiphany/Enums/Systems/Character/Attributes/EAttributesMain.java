package org.epiphany.Enums.Systems.Character.Attributes;

/**
 * Enum representing the main attributes of a character. <br>
 * Each attribute has a name, description, minimum value, starting, maximum value,
 * derived bonus (affecting derived attributes), and proficiency bonus (affecting proficiency gain). <br>
 * <br>
 * NOTE: Current values should be modified in classes, while these are fixed definitions. <br>
 * <br>
 * Attributes: <br> <ul>
 * Strength: Physical power, affects physical attack and heavy weapon proficiency. <br>
 * <br>
 * Dexterity: Agility and reflexes, affects ranged attack and light weapon proficiency. <br>
 * <br>
 * Intelligence: Reasoning and memory, affects skill proficiency gain. <br>
 * <br>
 * Wisdom: Perception and insight, affects life proficiency gain. <br>
 * <br>
 * Constitution: Endurance and health, affects max health, stamina, and plate proficiency. <br>
 * <br>
 * Charisma: Force of personality, affects personal proficiency gain. <br>
 * </ul>
 * <br>
 */

public enum EAttributesMain {

    STRENGTH("Strength",
            "Measures physical power; bonus to physical attack and defense, heavy weapon proficiency gain, and chainmail proficiency gain.",
            (byte)1,
            (byte)5,
            (byte)50,
            1.5,
            1.25),

    DEXTERITY("Dexterity",
            "Measures agility and reflexes; bonus to ranged attack and defense, light weapon proficiency gain, and gambeson proficiency gain.",
            (byte)1,
            (byte)5,
            (byte)50,
            1.5,
            1.25),

    INTELLIGENCE("Intelligence",
            "Measures reasoning and memory; bonus to skill proficiency gain.",
            (byte)1,
            (byte)5,
            (byte)50,
            1.5,
            1.25),

    WISDOM("Wisdom",
            "Measures perception and insight; bonus to life proficiency gain.",
            (byte)1,
            (byte)5,
            (byte)50,
            1.5,
            1.25),

    CONSTITUTION("Constitution",
            "Measures endurance and health; bonus to max health, stamina, and plate proficiency gain.",
            (byte)1,
            (byte)5,
            (byte)50,
            1.5,
            1.25),

    CHARISMA("Charisma",
            "Measures force of personality; bonus to personal proficiency gain.",
            (byte)1,
            (byte)5,
            (byte)50,
            1.5,
            1.25);


    private final String attributeName;
    private final String description;
    private final byte minValue;
    private final byte startingValue;
    private final byte maxValue;
    private final double derivedBonus; // bonus to derived attributes
    private final double proficiencyBonus; // bonus to proficiency gain

    EAttributesMain(String attributeName,
                    String description,
                    byte minValue,
                    byte startingValue,
                    byte maxValue,
                    double derivedBonus,
                    double proficiencyBonus) {

        this.attributeName = attributeName;
        this.description = description;
        this.minValue = minValue;
        this.startingValue = startingValue;
        this.maxValue = maxValue;
        this.derivedBonus = derivedBonus;
        this.proficiencyBonus = proficiencyBonus;

    } // end constructor

    /* getters */

    public String getAttributeName() {
        return attributeName;
    }

    public String getDescription() {
        return description;
    }

    public byte getMinValue() {
        return minValue;
    }

    public byte getStartingValue() {
        return startingValue; // default starting value for all attributes
    }

    public byte getMaxValue() {
        return maxValue;
    }

    public double getDerivedBonus() {
        return derivedBonus;
    }

    public double getProficiencyBonus() {
        return proficiencyBonus;
    }

} // end enum
