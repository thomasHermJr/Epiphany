package org.epiphany.Classes.Attributes;

import org.epiphany.Enums.Systems.Character.Attributes.EAttributesMain;
import org.epiphany.Interfaces.IAttributes;

public abstract class MainAttributes implements IAttributes {

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
}
