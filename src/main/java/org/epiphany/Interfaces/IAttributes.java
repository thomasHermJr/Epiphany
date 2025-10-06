package org.epiphany.Interfaces;

public interface IAttributes extends ICharacter{ // open IAttributes interface

    /*Base Attributes*/

    byte strength = 0; // bonus to physical attack, heavy weapon proficiency gain, and chainmail proficiency gain
    byte dexterity = 0; // bonus to speed, ranged and light weapon proficiency gain, and gambeson proficiency gain
    byte intelligence = 0; // bonus to skill proficiency gain
    byte wisdom = 0; // bonus to life proficiency gain
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

    /*Overdrive Attributes*/

    byte overdriveMeter = 0; // max 100, min 0
    boolean overdriveActive = false;

    /*Weapon Proficiencies*/

    byte swordProficiency = 0; // balanced weapon (light and heavy)
    byte axeProficiency = 0; // heavy weapon
    byte bowProficiency = 0; // ranged weapon
    byte polearmProficiency = 0; // heavy weapon

    short swordExperienceRequired = 100;
    short axeExperienceRequired = 100;
    short bowExperienceRequired = 100;
    short polearmExperienceRequired = 100;


    short swordExperience = 0;
    short axeExperience = 0;
    short bowExperience = 0;
    short polearmExperience = 0;

    /*Armor Proficiencies*/

    byte gambesonProficiency = 0;
    byte chainmailProficiency = 0;
    byte plateProficiency = 0;

    short gambesonExperienceRequired = 100;
    short chainmailExperienceRequired = 100;
    short plateExperienceRequired = 100;

    short gambesonExperience = 0;
    short chainmailExperience = 0;
    short plateExperience = 0;

    /*Skill Proficiencies*/

    byte tacticalProficiency = 0;
    byte survivalProficiency = 0;
    byte medicalProficiency = 0;

    short tacticalExperienceRequired = 100;
    short survivalExperienceRequired = 100;
    short medicalExperienceRequired = 100;

    short tacticalExperience = 0;
    short survivalExperience = 0;
    short medicalExperience = 0;

    /*Life Proficiencies*/

    byte smithingProficiency = 0;
    byte engineeringProficiency = 0;
    byte gadgetryProficiency = 0;

    short smithingExperienceRequired = 100;
    short engineeringExperienceRequired = 100;
    short gadgetryExperienceRequired = 100;


    short smithingExperience = 0;
    short engineeringExperience = 0;
    short gadgetryExperience = 0;

    /*Personal Proficiencies*/

    byte leadershipProficiency = 0;
    byte barterProficiency = 0;
    byte oratoryProficiency = 0;

    short leadershipExperienceRequired = 100;
    short barterExperienceRequired = 100;
    short oratoryExperienceRequired = 100;

    short leadershipExperience = 0;
    short barterExperience = 0;
    short oratoryExperience = 0;


} // end IAttributes interface
