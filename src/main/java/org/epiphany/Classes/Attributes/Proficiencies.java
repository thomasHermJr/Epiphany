package org.epiphany.Classes.Attributes;

public abstract class Proficiencies extends DerivedAttributes {

    /*TODO:
    *      Consider using generics for proficiencies to reduce similar code*/

    /*Weapon Proficiencies*/

    private byte swordProficiency; // balanced weapon (light and heavy)
    private byte axeProficiency; // heavy weapon
    private byte bowProficiency; // ranged weapon
    private byte polearmProficiency; // heavy weapon

    private short swordExperienceRequired;
    private short axeExperienceRequired;
    private short bowExperienceRequired;
    private short polearmExperienceRequired;


    private short swordExperience;
    private short axeExperience;
    private short bowExperience;
    private short polearmExperience;

    /*Armor Proficiencies*/

    private byte gambesonProficiency;
    private byte chainmailProficiency;
    private byte plateProficiency;

    private short gambesonExperienceRequired;
    private short chainmailExperienceRequired;
    private short plateExperienceRequired;

    private short gambesonExperience;
    private short chainmailExperience;
    private short plateExperience;

    /*Skill Proficiencies*/

    private byte tacticalProficiency;
    private byte survivalProficiency;
    private byte medicalProficiency;

    private short tacticalExperienceRequired;
    private short survivalExperienceRequired;
    private short medicalExperienceRequired;

    private short tacticalExperience;
    private short survivalExperience;
    private short medicalExperience;

    /*Life Proficiencies*/

    private byte smithingProficiency;
    private byte engineeringProficiency;
    private byte gadgetryProficiency;

    private short smithingExperienceRequired;
    private short engineeringExperienceRequired;
    private short gadgetryExperienceRequired;


    private short smithingExperience;
    private short engineeringExperience;
    private short gadgetryExperience;

    /*Personal Proficiencies*/

    private byte leadershipProficiency;
    private byte barterProficiency;
    private byte oratoryProficiency;

    private short leadershipExperienceRequired;
    private short barterExperienceRequired;
    private short oratoryExperienceRequired;

    private short leadershipExperience;
    private short barterExperience;
    private short oratoryExperience;

} // end of Proficiencies class
