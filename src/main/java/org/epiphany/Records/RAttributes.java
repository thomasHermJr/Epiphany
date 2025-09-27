package org.epiphany.Records;

import org.epiphany.Interfaces.IAttributes;

public record RAttributes() implements IAttributes {

    /* base attributes */
    static byte strength;
    static byte dexterity;
    static byte constitution;
    static byte intelligence;
    static byte wisdom;
    static byte charisma;

    /* derived attributes */
    static short maxHealth;
    static short maxStamina;
    static short currentHealth;
    static short currentStamina;
    static byte physicalAttack;
    static byte physicalDefense;
    static byte speed;

    /* weapon proficiencies */
    static byte swordProficiency;
    static byte axeProficiency;
    static byte bowProficiency;
    static byte polearmProficiency;

    static short swordExperience;
    static short axeExperience;
    static short bowExperience;
    static short polearmExperience;

    /* armor proficiencies */
    static byte gambesonProficiency;
    static byte chainmailProficiency;
    static byte plateProficiency;

    static short gambesonExperience;
    static short chainmailExperience;
    static short plateExperience;

    /* skill proficiencies */
    static byte tacticalProficiency;
    static byte survivalProficiency;
    static byte medicalProficiency;

    static short tacticalExperience;
    static short survivalExperience;
    static short medicalExperience;

    /* life proficiencies */
    static byte smithingProficiency;
    static byte engineeringProficiency;
    static byte gadgetryProficiency;

    static short smithingExperience;
    static short engineeringExperience;
    static short gadgetryExperience;

    /* personal proficiencies */
    static byte leadershipProficiency;
    static byte barterProficiency;
    static byte oratoryProficiency;

    static short leadershipExperience;
    static short barterExperience;
    static short oratoryExperience;

    public static class BaseStatBuilder { // start base stat builder

        private byte strength = 0;
        private byte dexterity = 0;
        private byte constitution = 0;
        private byte intelligence = 0;
        private byte wisdom = 0;
        private byte charisma = 0;

        public BaseStatBuilder setStrength(byte strength) {
            this.strength = strength;
            return this;
        }

        public BaseStatBuilder setDexterity(byte dexterity) {
            this.dexterity = dexterity;
            return this;
        }

        public BaseStatBuilder setConstitution(byte constitution) {
            this.constitution = constitution;
            return this;
        }

        public BaseStatBuilder setIntelligence(byte intelligence) {
            this.intelligence = intelligence;
            return this;
        }

        public BaseStatBuilder setWisdom(byte wisdom) {
            this.wisdom = wisdom;
            return this;
        }

        public BaseStatBuilder setCharisma(byte charisma) {
            this.charisma = charisma;
            return this;
        }

        public RAttributes buildBase() {
            RAttributes.strength = this.strength;
            RAttributes.dexterity = this.dexterity;
            RAttributes.constitution = this.constitution;
            RAttributes.intelligence = this.intelligence;
            RAttributes.wisdom = this.wisdom;
            RAttributes.charisma = this.charisma;
            return new RAttributes();
        }

    } // end base stat builder subclass

    public static class DerivedStatBuilder { // start derived stat builder

        private short maxHealth = 0;
        private short maxStamina = 0;
        private short currentHealth = 0;
        private short currentStamina = 0;
        private byte physicalAttack = 0;
        private byte physicalDefense = 0;
        private byte speed = 0;

        public DerivedStatBuilder setMaxHealth(short maxHealth) {
            this.maxHealth = maxHealth;
            return this;
        }

        public DerivedStatBuilder setMaxStamina(short maxStamina) {
            this.maxStamina = maxStamina;
            return this;
        }

        public DerivedStatBuilder setCurrentHealth(short currentHealth) {
            this.currentHealth = currentHealth;
            return this;
        }

        public DerivedStatBuilder setCurrentStamina(short currentStamina) {
            this.currentStamina = currentStamina;
            return this;
        }

        public DerivedStatBuilder setPhysicalAttack(byte physicalAttack) {
            this.physicalAttack = physicalAttack;
            return this;
        }

        public DerivedStatBuilder setPhysicalDefense(byte physicalDefense) {
            this.physicalDefense = physicalDefense;
            return this;
        }

        public DerivedStatBuilder setSpeed(byte speed) {
            this.speed = speed;
            return this;
        }

        public RAttributes buildDerived() {
            RAttributes.maxHealth = this.maxHealth;
            RAttributes.maxStamina = this.maxStamina;
            RAttributes.currentHealth = this.currentHealth;
            RAttributes.currentStamina = this.currentStamina;
            RAttributes.physicalAttack = this.physicalAttack;
            RAttributes.physicalDefense = this.physicalDefense;
            RAttributes.speed = this.speed;
            return new RAttributes();
        }

    } // end derived stat builder subclass

    public static class WeaponProficiencyBuilder { // start weapon proficiency builder

        private byte swordProficiency = 0;
        private byte axeProficiency = 0;
        private byte bowProficiency = 0;
        private byte polearmProficiency = 0;

        private short swordExperience = 0;
        private short axeExperience = 0;
        private short bowExperience = 0;
        private short polearmExperience = 0;

        public WeaponProficiencyBuilder setSwordProficiency(byte swordProficiency) {
            this.swordProficiency = swordProficiency;
            return this;
        }

        public WeaponProficiencyBuilder setAxeProficiency(byte axeProficiency) {
            this.axeProficiency = axeProficiency;
            return this;
        }

        public WeaponProficiencyBuilder setBowProficiency(byte bowProficiency) {
            this.bowProficiency = bowProficiency;
            return this;
        }

        public WeaponProficiencyBuilder setPolearmProficiency(byte polearmProficiency) {
            this.polearmProficiency = polearmProficiency;
            return this;
        }

        public WeaponProficiencyBuilder setSwordExperience(short swordExperience) {
            this.swordExperience = swordExperience;
            return this;
        }

        public WeaponProficiencyBuilder setAxeExperience(short axeExperience) {
            this.axeExperience = axeExperience;
            return this;
        }

        public WeaponProficiencyBuilder setBowExperience(short bowExperience) {
            this.bowExperience = bowExperience;
            return this;
        }

        public WeaponProficiencyBuilder setPolearmExperience(short polearmExperience) {
            this.polearmExperience = polearmExperience;
            return this;
        }

        public RAttributes buildWeapon() {
            RAttributes.swordProficiency = this.swordProficiency;
            RAttributes.axeProficiency = this.axeProficiency;
            RAttributes.bowProficiency = this.bowProficiency;
            RAttributes.polearmProficiency = this.polearmProficiency;
            RAttributes.swordExperience = this.swordExperience;
            RAttributes.axeExperience = this.axeExperience;
            RAttributes.bowExperience = this.bowExperience;
            RAttributes.polearmExperience = this.polearmExperience;
            return new RAttributes();
        }

    } // end weapon proficiency builder subclass

    public static class ArmorProficiencyBuilder { // start armor proficiency builder

        private byte gambesonProficiency = 0;
        private byte chainmailProficiency = 0;
        private byte plateProficiency = 0;

        private short gambesonExperience = 0;
        private short chainmailExperience = 0;
        private short plateExperience = 0;

        public ArmorProficiencyBuilder setGambesonProficiency(byte gambesonProficiency) {
            this.gambesonProficiency = gambesonProficiency;
            return this;
        }

        public ArmorProficiencyBuilder setChainmailProficiency(byte chainmailProficiency) {
            this.chainmailProficiency = chainmailProficiency;
            return this;
        }

        public ArmorProficiencyBuilder setPlateProficiency(byte plateProficiency) {
            this.plateProficiency = plateProficiency;
            return this;
        }

        public ArmorProficiencyBuilder setGambesonExperience(short gambesonExperience) {
            this.gambesonExperience = gambesonExperience;
            return this;
        }

        public ArmorProficiencyBuilder setChainmailExperience(short chainmailExperience) {
            this.chainmailExperience = chainmailExperience;
            return this;
        }

        public ArmorProficiencyBuilder setPlateExperience(short plateExperience) {
            this.plateExperience = plateExperience;
            return this;
        }

        public RAttributes buildArmor() {
            RAttributes.gambesonProficiency = this.gambesonProficiency;
            RAttributes.chainmailProficiency = this.chainmailProficiency;
            RAttributes.plateProficiency = this.plateProficiency;
            RAttributes.gambesonExperience = this.gambesonExperience;
            RAttributes.chainmailExperience = this.chainmailExperience;
            RAttributes.plateExperience = this.plateExperience;
            return new RAttributes();
        }

    } // end armor proficiency builder subclass

    public static class SkillProficiencyBuilder { // start skill proficiency builder

        private byte tacticalProficiency = 0;
        private byte survivalProficiency = 0;
        private byte medicalProficiency = 0;

        private short tacticalExperience = 0;
        private short survivalExperience = 0;
        private short medicalExperience = 0;

        public SkillProficiencyBuilder setTacticalProficiency(byte tacticalProficiency) {
            this.tacticalProficiency = tacticalProficiency;
            return this;
        }

        public SkillProficiencyBuilder setSurvivalProficiency(byte survivalProficiency) {
            this.survivalProficiency = survivalProficiency;
            return this;
        }

        public SkillProficiencyBuilder setMedicalProficiency(byte medicalProficiency) {
            this.medicalProficiency = medicalProficiency;
            return this;
        }

        public SkillProficiencyBuilder setTacticalExperience(short tacticalExperience) {
            this.tacticalExperience = tacticalExperience;
            return this;
        }

        public SkillProficiencyBuilder setSurvivalExperience(short survivalExperience) {
            this.survivalExperience = survivalExperience;
            return this;
        }

        public SkillProficiencyBuilder setMedicalExperience(short medicalExperience) {
            this.medicalExperience = medicalExperience;
            return this;
        }

        public RAttributes buildSkill() {
            RAttributes.tacticalProficiency = this.tacticalProficiency;
            RAttributes.survivalProficiency = this.survivalProficiency;
            RAttributes.medicalProficiency = this.medicalProficiency;
            RAttributes.tacticalExperience = this.tacticalExperience;
            RAttributes.survivalExperience = this.survivalExperience;
            RAttributes.medicalExperience = this.medicalExperience;
            return new RAttributes();
        }

    } // end skill proficiency builder subclass

    public static class LifeProficiencyBuilder { // start life proficiency builder

        private byte smithingProficiency = 0;
        private byte engineeringProficiency = 0;
        private byte gadgetryProficiency = 0;

        private short smithingExperience = 0;
        private short engineeringExperience = 0;
        private short gadgetryExperience = 0;

        public LifeProficiencyBuilder setSmithingProficiency(byte smithingProficiency) {
            this.smithingProficiency = smithingProficiency;
            return this;
        }

        public LifeProficiencyBuilder setEngineeringProficiency(byte engineeringProficiency) {
            this.engineeringProficiency = engineeringProficiency;
            return this;
        }

        public LifeProficiencyBuilder setGadgetryProficiency(byte gadgetryProficiency) {
            this.gadgetryProficiency = gadgetryProficiency;
            return this;
        }

        public LifeProficiencyBuilder setSmithingExperience(short smithingExperience) {
            this.smithingExperience = smithingExperience;
            return this;
        }

        public LifeProficiencyBuilder setEngineeringExperience(short engineeringExperience) {
            this.engineeringExperience = engineeringExperience;
            return this;
        }

        public LifeProficiencyBuilder setGadgetryExperience(short gadgetryExperience) {
            this.gadgetryExperience = gadgetryExperience;
            return this;
        }

        public RAttributes buildLife() {
            RAttributes.smithingProficiency = this.smithingProficiency;
            RAttributes.engineeringProficiency = this.engineeringProficiency;
            RAttributes.gadgetryProficiency = this.gadgetryProficiency;
            RAttributes.smithingExperience = this.smithingExperience;
            RAttributes.engineeringExperience = this.engineeringExperience;
            RAttributes.gadgetryExperience = this.gadgetryExperience;
            return new RAttributes();
        }

    } // end life proficiency builder subclass

    public static class PersonalProficiencyBuilder { // start personal proficiency builder

        private byte leadershipProficiency = 0;
        private byte barterProficiency = 0;
        private byte oratoryProficiency = 0;

        private short leadershipExperience = 0;
        private short barterExperience = 0;
        private short oratoryExperience = 0;

        public PersonalProficiencyBuilder setLeadershipProficiency(byte leadershipProficiency) {
            this.leadershipProficiency = leadershipProficiency;
            return this;
        }

        public PersonalProficiencyBuilder setBarterProficiency(byte barterProficiency) {
            this.barterProficiency = barterProficiency;
            return this;
        }

        public PersonalProficiencyBuilder setOratoryProficiency(byte oratoryProficiency) {
            this.oratoryProficiency = oratoryProficiency;
            return this;
        }

        public PersonalProficiencyBuilder setLeadershipExperience(short leadershipExperience) {
            this.leadershipExperience = leadershipExperience;
            return this;
        }

        public PersonalProficiencyBuilder setBarterExperience(short barterExperience) {
            this.barterExperience = barterExperience;
            return this;
        }

        public PersonalProficiencyBuilder setOratoryExperience(short oratoryExperience) {
            this.oratoryExperience = oratoryExperience;
            return this;
        }

        public RAttributes buildPersonal() {
            RAttributes.leadershipProficiency = this.leadershipProficiency;
            RAttributes.barterProficiency = this.barterProficiency;
            RAttributes.oratoryProficiency = this.oratoryProficiency;
            RAttributes.leadershipExperience = this.leadershipExperience;
            RAttributes.barterExperience = this.barterExperience;
            RAttributes.oratoryExperience = this.oratoryExperience;
            return new RAttributes();
        }

    } // end personal proficiency builder subclass


}
