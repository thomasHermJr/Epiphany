package org.epiphany.Enums.Systems.Character.Attributes;

public enum EAttributesMain {

    STRENGTH("Strength",
            "Measures physical power; bonus to physical attack, heavy weapon proficiency gain, and chainmail proficiency gain.",
            1,
            1,
            20),

    DEXTERITY("Dexterity",
            "Measures agility and reflexes; bonus to ranged attack, light weapon proficiency gain, and gambeson proficiency gain.",
            1,
            1,
            20),

    INTELLIGENCE("Intelligence",
            "Measures reasoning and memory; bonus to skill proficiency gain.",
            1,
            1,
            20),

    WISDOM("Wisdom",
            "Measures perception and insight; bonus to life proficiency gain.",
            1,
            1,
            20),

    CONSTITUTION("Constitution",
            "Measures endurance and health; bonus to max health, stamina, and plate proficiency gain.",
            1,
            1,
            20),

    CHARISMA("Charisma",
            "Measures force of personality; bonus to personal proficiency gain.",
            1,
            1,
            20);


    private String attributeName;
    private String description;
    private int minValue;
    private int currentValue;
    private int maxValue;

    EAttributesMain(String attributeName, String description, int minValue, int currentValue, int maxValue) {
        this.attributeName = attributeName;
        this.description = description;
        this.minValue = minValue;
        this.currentValue = currentValue;
        this.maxValue = maxValue;
    } // end constructor

} // end enum
