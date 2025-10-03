package org.epiphany.Enums.Systems.Character.Attributes;

public enum EAttributesMain {

    STRENGTH("Strength",
            "Measures physical power; bonus to physical attack, heavy weapon proficiency gain, and chainmail proficiency gain.",
            1,
            1,
            20,
            1.5,
            1.25),

    DEXTERITY("Dexterity",
            "Measures agility and reflexes; bonus to ranged attack, light weapon proficiency gain, and gambeson proficiency gain.",
            1,
            1,
            20,
            1.5,
            1.25),

    INTELLIGENCE("Intelligence",
            "Measures reasoning and memory; bonus to skill proficiency gain.",
            1,
            1,
            20,
            1.5,
            1.25),

    WISDOM("Wisdom",
            "Measures perception and insight; bonus to life proficiency gain.",
            1,
            1,
            20,
            1.5,
            1.25),

    CONSTITUTION("Constitution",
            "Measures endurance and health; bonus to max health, stamina, and plate proficiency gain.",
            1,
            1,
            20,
            1.5,
            1.25),

    CHARISMA("Charisma",
            "Measures force of personality; bonus to personal proficiency gain.",
            1,
            1,
            20,
            1.5,
            1.25);


    private String attributeName;
    private String description;
    private int minValue;
    private int currentValue;
    private int maxValue;
    private double derivedBonus; // bonus to derived attributes
    private double proficiencyBonus; // bonus to proficiency gain

    EAttributesMain(String attributeName, String description, int minValue, int currentValue, int maxValue, double derivedBonus, double proficiencyBonus) {
        this.attributeName = attributeName;
        this.description = description;
        this.minValue = minValue;
        this.currentValue = currentValue;
        this.maxValue = maxValue;
        this.derivedBonus = derivedBonus;
        this.proficiencyBonus = proficiencyBonus;
        if (currentValue <= 1) {
            derivedBonus = 1;
            proficiencyBonus = 1;
        } else {
            derivedBonus = currentValue * 1.5;
            proficiencyBonus = currentValue * 1.25;
        }
            this.derivedBonus = derivedBonus;
            this.proficiencyBonus = proficiencyBonus;
    } // end constructor

} // end enum
