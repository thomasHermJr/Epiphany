package org.epiphany.Interfaces;

public interface IAttributes extends ICharacter{ // open IAttributes interface

    /*Base Attributes*/

    byte strength = 0; // bonus to physical attack, heavy weapon proficiency gain, and leather proficiency gain
    byte dexterity = 0; // bonus to speed, ranged and light weapon proficiency gain, and gambeson proficiency gain
    byte intelligence = 0; // bonus to skill proficiency gain
    byte wisdom = 0; // small bonus to both skill and personal proficiency gain
    byte constitution = 0; // bonus to max health, stamina, and plate proficiency gain
    byte charisma = 0; // bonus to personal proficiency gain

    /*Derived Attributes*/

    short maxHealth = 0;
    short maxStamina = 0;
    short currentHealth = 0;
    short currentStamina = 0;
    byte physicalAttack = 0;
    byte physicalDefense = 0;
    byte speed = 0;
    byte luck = 0;

    /*Weapon Proficiencies*/

    byte swordProficiency = 0; // balanced weapon (light and heavy)
    byte axeProficiency = 0; // heavy weapon
    byte bowProficiency = 0; // ranged weapon
    byte polearmProficiency = 0; // heavy weapon

    /*Armor Proficiencies*/

    byte gambesonsProficiency = 0;
    byte leatherProficiency = 0;
    byte chainmailProficiency = 0;
    byte plateProficiency = 0;

    /*Skill Proficiencies*/

    byte tacticalProficiency = 0;
    byte survivalProficiency = 0;
    byte medicalProficiency = 0;

    /*Personal Proficiencies*/
    byte smithingProficiency = 0;
    byte focusProficiency = 0;
    byte gadgetryProficiency = 0;


} // end IAttributes interface
