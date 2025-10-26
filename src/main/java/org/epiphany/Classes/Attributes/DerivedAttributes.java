package org.epiphany.Classes.Attributes;

public abstract class DerivedAttributes extends MainAttributes {

    // derived from strength
    private byte physicalAttack;
    private byte physicalDefense;

    // derived from dexterity
    private byte agility;
    private byte rangedAttack;
    private byte rangedDefense;

    // derived from constitution
    private short maxHealth;
    private short maxStamina;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        return sb.toString();
    }

}
