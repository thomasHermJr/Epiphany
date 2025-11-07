package org.epiphany.Classes.Attributes;

import org.epiphany.Enums.Systems.Character.Attributes.EAttributesMain;

/**
 * MainAttributes class represents the primary attributes of a character. <br>
 * <br>
 * Each attribute has defined minimum and maximum bounds from EAttributesMain. <br>
 * <br>
 * It includes methods to get and set each attribute while ensuring they
 * remain within defined bounds. <br>
 * <br>
 * Class chain: <br>
 * Levels --> MainAttributes --> DerivedAttributes --> Proficiencies --> Entity <br>
 * <br>
 * Attributes: <ul> <br>
 * strength <br>
 * dexterity <br>
 * constitution <br>
 * intelligence <br>
 * wisdom <br>
 * charisma <br>
 * </ul>
 * <br>
 * Bonuses: <ul> <br>
 * derivedBonus: Boosts to derived stats <br>
 * <br>
 * proficiencyBonus: Boosts to related proficiencies <br>
 * </ul>
 * <br>
 * Methods: <ul> <br>
 * verifyStatBounds(byte stat, EAttributesMain attribute): Ensures the stat is within min and max bounds. <br>
 * <br>
 * getters and setters for each attribute and bonus. <br>
 * <br>
 * - toString(): Returns a string representation of the main attributes. <br>
 */

public abstract class MainAttributes extends Levels{

    private byte strength;
    private byte dexterity;
    private byte constitution;
    private byte intelligence;
    private byte wisdom;
    private byte charisma;

    private double derivedBonus;
    private double proficiencyBonus;

    public byte verifyStatBounds(byte stat, EAttributesMain attribute) { // start verifyStatBounds

        if (stat > attribute.getMaxValue()) { // verify upper bound
            return attribute.getMaxValue();
        } else if (stat < attribute.getMinValue()) { // verify lower bound
            return attribute.getMinValue();
        } else { // within bounds
            return stat;
        } // end if-else

    } // end verifyStatBounds

    // Getters and Setters

    public byte getStrength() {
        return strength;
    }

    public void setStrength(byte strength) {
        strength = verifyStatBounds(strength, EAttributesMain.STRENGTH);
        this.strength = strength;
    }

    public byte getDexterity() {
        return dexterity;
    }

    public void setDexterity(byte dexterity) {
        dexterity = verifyStatBounds(dexterity, EAttributesMain.DEXTERITY);
        this.dexterity = dexterity;
    }

    public byte getConstitution() {
        return constitution;
    }

    public void setConstitution(byte constitution) {
        constitution = verifyStatBounds(constitution, EAttributesMain.CONSTITUTION);
        this.constitution = constitution;
    }

    public byte getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(byte intelligence) {
        intelligence = verifyStatBounds(intelligence, EAttributesMain.INTELLIGENCE);
        this.intelligence = intelligence;
    }

    public byte getWisdom() {
        return wisdom;
    }

    public void setWisdom(byte wisdom) {
        wisdom = verifyStatBounds(wisdom, EAttributesMain.WISDOM);
        this.wisdom = wisdom;
    }

    public byte getCharisma() {
        return charisma;
    }

    public void setCharisma(byte charisma) {
        charisma = verifyStatBounds(charisma, EAttributesMain.CHARISMA);
        this.charisma = charisma;
    }

    public double getDerivedBonus() {
        return derivedBonus;
    }

    public void setDerivedBonus(double derivedBonus) {
        this.derivedBonus = derivedBonus;
    }

    public double getProficiencyBonus() {
        return proficiencyBonus;
    }

    public void setProficiencyBonus(double proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

    @Override
    public String toString() { // start toString
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("Strength: ").append(getStrength()).append("\n")
                .append("Dexterity: ").append(getDexterity()).append("\n")
                .append("Constitution: ").append(getConstitution()).append("\n")
                .append("Intelligence: ").append(getIntelligence()).append("\n")
                .append("Wisdom: ").append(getWisdom()).append("\n")
                .append("Charisma: ").append(getCharisma()).append("\n");
        return sb.toString();
    } // end toString

} // end MainAttributes class
