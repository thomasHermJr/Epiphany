package org.epiphany.Classes.Attributes;

import org.epiphany.Enums.Systems.Character.Attributes.EAttributesMain;

/** <p>
 * MainAttributes class represents the primary attributes of a character. <br>
 * It includes methods to get and set each attribute while ensuring they
 * remain within defined bounds. <br>
 * <br>
 * Class chain: <br>
 * Levels --> MainAttributes --> DerivedAttributes --> Proficiencies --> Entity <br>
 * <br>
 * Attributes: <br>
 * - strength <br>
 * - dexterity <br>
 * - constitution <br>
 * - intelligence <br>
 * - wisdom <br>
 * - charisma <br>
 *  <br>
 *  min and max bounds are defined in EAttributesMain <br>
 * <br>
 * Bonuses: <br>
 * - derivedBonus <br>
 * - proficiencyBonus <br>
 * <br>
 * Methods: <br>
 * - verifyStatBounds(byte stat, EAttributesMain attribute): Ensures the stat is within min and max bounds. <br>
 * - getStrength(): Returns the strength attribute. <br>
 * - setStrength(byte strength): Sets the strength attribute with bounds checking. <br>
 * - getDexterity(): Returns the dexterity attribute. <br>
 * - setDexterity(byte dexterity): Sets the dexterity attribute with bounds checking. <br>
 * - getConstitution(): Returns the constitution attribute. <br>
 * - setConstitution(byte constitution): Sets the constitution attribute with bounds checking. <br>
 * - getIntelligence(): Returns the intelligence attribute. <br>
 * - setIntelligence(byte intelligence): Sets the intelligence attribute with bounds checking. <br>
 * - getWisdom(): Returns the wisdom attribute. <br>
 * - setWisdom(byte wisdom): Sets the wisdom attribute with bounds checking. <br>
 * - getCharisma(): Returns the charisma attribute. <br>
 * - setCharisma(byte charisma): Sets the charisma attribute with bounds checking. <br>
 * - getDerivedBonus(): Returns the derived bonus. <br>
 * - setDerivedBonus(double derivedBonus): Sets the derived bonus. <br>
 * - getProficiencyBonus(): Returns the proficiency bonus. <br>
 * - setProficiencyBonus(double proficiencyBonus): Sets the proficiency bonus. <br>
 * - toString(): Returns a string representation of the main attributes. <br>
 * </p>
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

    public byte verifyStatBounds(byte stat, EAttributesMain attribute) {
        if (stat > attribute.getMaxValue()) {
            return attribute.getMaxValue();
        } else if (stat < attribute.getMinValue()) {
            return attribute.getMinValue();
        } else {
            return stat;
        }
    }

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
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("Strength: ").append(getStrength()).append("\n")
                .append("Dexterity: ").append(getDexterity()).append("\n")
                .append("Constitution: ").append(getConstitution()).append("\n")
                .append("Intelligence: ").append(getIntelligence()).append("\n")
                .append("Wisdom: ").append(getWisdom()).append("\n")
                .append("Charisma: ").append(getCharisma()).append("\n");
        return sb.toString();
    }
}
