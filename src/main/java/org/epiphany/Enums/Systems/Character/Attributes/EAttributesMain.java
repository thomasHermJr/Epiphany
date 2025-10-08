package org.epiphany.Enums.Systems.Character.Attributes;

/**
 * Enum representing the main attributes of a character.
 * Each attribute has a name, description, minimum value, current value, maximum value,
 * derived bonus (affecting derived attributes), and proficiency bonus (affecting proficiency gain).
 *
 * NOTE: Current values can be modified during gameplay, while min and max values are fixed.
 *
 * Attributes:
 * - Strength: Physical power, affects physical attack and heavy weapon proficiency.
 * - Dexterity: Agility and reflexes, affects ranged attack and light weapon proficiency.
 * - Intelligence: Reasoning and memory, affects skill proficiency gain.
 * - Wisdom: Perception and insight, affects life proficiency gain.
 * - Constitution: Endurance and health, affects max health, stamina, and plate proficiency.
 * - Charisma: Force of personality, affects personal proficiency gain.
 */

public enum EAttributesMain {

    STRENGTH("Strength",
            "Measures physical power; bonus to physical attack, heavy weapon proficiency gain, and chainmail proficiency gain.",
            1,
            5,
            50,
            1.5,
            1.25),

    DEXTERITY("Dexterity",
            "Measures agility and reflexes; bonus to ranged attack, light weapon proficiency gain, and gambeson proficiency gain.",
            1,
            5,
            50,
            1.5,
            1.25),

    INTELLIGENCE("Intelligence",
            "Measures reasoning and memory; bonus to skill proficiency gain.",
            1,
            5,
            50,
            1.5,
            1.25),

    WISDOM("Wisdom",
            "Measures perception and insight; bonus to life proficiency gain.",
            1,
            5,
            50,
            1.5,
            1.25),

    CONSTITUTION("Constitution",
            "Measures endurance and health; bonus to max health, stamina, and plate proficiency gain.",
            1,
            5,
            50,
            1.5,
            1.25),

    CHARISMA("Charisma",
            "Measures force of personality; bonus to personal proficiency gain.",
            1,
            5,
            50,
            1.5,
            1.25);


    private final String attributeName;
    private final String description;
    private final int minValue;
    private int currentValue;
    private final int maxValue;
    private double derivedBonus; // bonus to derived attributes
    private double proficiencyBonus; // bonus to proficiency gain

    /* getters */

    public String getAttributeName() {
        return attributeName;
    }

    public String getDescription() {
        return description;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getCurrentValue() {
        return currentValue; // default starting value for all attributes
    }
    public void setCurrentValue(int newValue) {
        if (newValue < minValue) {
            this.currentValue = minValue;
        } else if (newValue > maxValue) {
            this.currentValue = maxValue;
        } else {
            this.currentValue = newValue;
        }
    }

    public int getMaxValue() {
        return maxValue;
    }

    public double getDerivedBonus() {
        return derivedBonus;
    }

    public double getProficiencyBonus() {
        return proficiencyBonus;
    }

    EAttributesMain(String attributeName, String description, int minValue, int currentValue, int maxValue, double derivedBonus, double proficiencyBonus) {

        this.attributeName = attributeName;
        this.description = description;
        this.minValue = minValue;
        this.currentValue = currentValue;
        this.maxValue = maxValue;
        this.derivedBonus = derivedBonus;
        this.proficiencyBonus = proficiencyBonus;
        this.derivedBonus = derivedBonus;
        this.proficiencyBonus = proficiencyBonus;

    } // end constructor

} // end enum
