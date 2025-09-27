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

    /* overdrive attributes */

    static byte overdriveMeter; // max 100, min 0
    static boolean overdriveActive;

    /* weapon proficiencies */
    static byte swordProficiency;
    static byte axeProficiency;
    static byte bowProficiency;
    static byte polearmProficiency;

    static short swordExperienceRequired = 100;
    static short axeExperienceRequired = 100;
    static short bowExperienceRequired = 100;
    static short polearmExperienceRequired = 100;

    static short swordGrowthRate = 120; // percentage change to needed experience per level
    static short axeGrowthRate = 120; // percentage change to needed experience per level
    static short bowGrowthRate = 120; // percentage change to needed experience per level
    static short polearmGrowthRate = 120; // percentage change to needed experience per

    static byte weaponChangeRatePerLevel; // percentage change to growth rate per level, min 1 max 10

    static short swordExperience;
    static short axeExperience;
    static short bowExperience;
    static short polearmExperience;

    /* armor proficiencies */
    static byte gambesonProficiency;
    static byte chainmailProficiency;
    static byte plateProficiency;

    static short gambesonExperienceRequired = 100;
    static short chainmailExperienceRequired = 100;
    static short plateExperienceRequired = 100;

    static short gambesonGrowthRate = 120; // percentage change to needed experience per level
    static short chainmailGrowthRate = 120; // percentage change to needed experience per level
    static short plateGrowthRate = 120; // percentage change to needed experience per

    static byte armorChangeRatePerLevel; // percentage change to growth rate per level, min 1 max 10

    static short gambesonExperience;
    static short chainmailExperience;
    static short plateExperience;

    /* skill proficiencies */
    static byte tacticalProficiency;
    static byte survivalProficiency;
    static byte medicalProficiency;

    static short tacticalExperienceRequired = 100;
    static short survivalExperienceRequired = 100;
    static short medicalExperienceRequired = 100;

    static byte baseTacticalExperienceRequired = 100;
    static byte baseSurvivalExperienceRequired = 100;
    static byte baseMedicalExperienceRequired = 100;

    static double skillChangeRatePerLevel = 1.05; // percentage change to growth rate per level, min 1 max 10
    static double baseSkillGrowthRate = 1.20; // percentage change to needed experience per level

    static double tacticalGrowthRate = baseSkillGrowthRate * skillChangeRatePerLevel * tacticalProficiency; // percentage change to needed experience per level
    static double survivalGrowthRate = baseSkillGrowthRate * skillChangeRatePerLevel * survivalProficiency; // percentage change to needed experience per level
    static double medicalGrowthRate = baseSkillGrowthRate * skillChangeRatePerLevel * medicalProficiency; // percentage change to needed experience per level

    static short tacticalExperience;
    static short survivalExperience;
    static short medicalExperience;

    /* life proficiencies */
    static byte smithingProficiency;
    static byte engineeringProficiency;
    static byte gadgetryProficiency;

    static short smithingExperienceRequired = 100;
    static short engineeringExperienceRequired = 100;
    static short gadgetryExperienceRequired = 100;

    static short smithingGrowthRate = 120; // percentage change to needed experience per level
    static short engineeringGrowthRate = 120; // percentage change to needed experience per level
    static short gadgetryGrowthRate = 120; // percentage change to needed experience per level

    static byte lifeChangeRatePerLevel; // percentage change to growth rate per level, min 1 max 10

    static short smithingExperience;
    static short engineeringExperience;
    static short gadgetryExperience;

    /* personal proficiencies */
    static byte leadershipProficiency;
    static byte barterProficiency;
    static byte oratoryProficiency;

    static short leadershipExperienceRequired = 100;
    static short barterExperienceRequired = 100;
    static short oratoryExperienceRequired = 100;

    static short leadershipGrowthRate = 120; // percentage change to needed experience per level
    static short barterGrowthRate = 120; // percentage change to needed experience per level
    static short oratoryGrowthRate = 120; // percentage change to needed experience per level

    static byte personalChangeRatePerLevel; // percentage change to growth rate per level, min 1 max 10

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

    public static class OverdriveStatBuilder { // start overdrive stat builder

        private byte overdriveMeter = 0; // max 100, min 0
        private boolean overdriveActive = false;

        public OverdriveStatBuilder setOverdriveMeter(byte overdriveMeter) {
            if (overdriveMeter < 0) {
                overdriveMeter = 0;
            } else if (overdriveMeter > 100) {
                overdriveMeter = 100;
            }
            this.overdriveMeter = overdriveMeter;
            return this;
        }

        public OverdriveStatBuilder setOverdriveActive(boolean overdriveActive) {
            this.overdriveActive = overdriveActive;
            return this;
        }

        public RAttributes buildOverdrive() {
            RAttributes.overdriveMeter = this.overdriveMeter;
            RAttributes.overdriveActive = this.overdriveActive;
            return new RAttributes();
        }

    } // end overdrive stat builder subclass

    public static class WeaponProficiencyBuilder { // start weapon proficiency builder

        private byte swordProficiency = 0;
        private byte axeProficiency = 0;
        private byte bowProficiency = 0;
        private byte polearmProficiency = 0;

        private short swordExperienceRequired = 100;
        private short axeExperienceRequired = 100;
        private short bowExperienceRequired = 100;
        private short polearmExperienceRequired = 100;

        private short swordGrowthRate = 120; // percentage change to needed experience per level
        private short axeGrowthRate = 120; // percentage change to needed experience per level
        private short bowGrowthRate = 120; // percentage change to needed experience per level
        private short polearmGrowthRate = 120; // percentage change to needed experience per level

        private byte weaponChangeRatePerLevel = 5; // percentage change to growth rate per level, min 1 max 10

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

        public WeaponProficiencyBuilder setSwordExperienceRequired(short swordExperienceRequired) {
            this.swordExperienceRequired = swordExperienceRequired;
            return this;
        }

        public WeaponProficiencyBuilder setAxeExperienceRequired(short axeExperienceRequired) {
            this.axeExperienceRequired = axeExperienceRequired;
            return this;
        }

        public WeaponProficiencyBuilder setBowExperienceRequired(short bowExperienceRequired) {
            this.bowExperienceRequired = bowExperienceRequired;
            return this;
        }

        public WeaponProficiencyBuilder setPolearmExperienceRequired(short polearmExperienceRequired) {
            this.polearmExperienceRequired = polearmExperienceRequired;
            return this;
        }

        public WeaponProficiencyBuilder setSwordGrowthRate(short swordGrowthRate) {
            this.swordGrowthRate = swordGrowthRate;
            return this;
        }

        public WeaponProficiencyBuilder setAxeGrowthRate(short axeGrowthRate) {
            this.axeGrowthRate = axeGrowthRate;
            return this;
        }

        public WeaponProficiencyBuilder setBowGrowthRate(short bowGrowthRate) {
            this.bowGrowthRate = bowGrowthRate;
            return this;
        }

        public WeaponProficiencyBuilder setPolearmGrowthRate(short polearmGrowthRate) {
            this.polearmGrowthRate = polearmGrowthRate;
            return this;
        }

        public WeaponProficiencyBuilder setWeaponChangeRatePerLevel(byte weaponChangeRatePerLevel) {
            this.weaponChangeRatePerLevel = weaponChangeRatePerLevel;
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
            RAttributes.swordExperienceRequired = this.swordExperienceRequired;
            RAttributes.axeExperienceRequired = this.axeExperienceRequired;
            RAttributes.bowExperienceRequired = this.bowExperienceRequired;
            RAttributes.polearmExperienceRequired = this.polearmExperienceRequired;
            RAttributes.swordGrowthRate = this.swordGrowthRate;
            RAttributes.axeGrowthRate = this.axeGrowthRate;
            RAttributes.bowGrowthRate = this.bowGrowthRate;
            RAttributes.polearmGrowthRate = this.polearmGrowthRate;
            RAttributes.weaponChangeRatePerLevel = this.weaponChangeRatePerLevel;
            return new RAttributes();
        }

    } // end weapon proficiency builder subclass

    public static class ArmorProficiencyBuilder { // start armor proficiency builder

        private byte gambesonProficiency = 0;
        private byte chainmailProficiency = 0;
        private byte plateProficiency = 0;

        private short gambesonExperienceRequired = 100;
        private short chainmailExperienceRequired = 100;
        private short plateExperienceRequired = 100;

        private short gambesonGrowthRate = 120; // percentage change to needed experience per level
        private short chainmailGrowthRate = 120; // percentage change to needed experience per level
        private short plateGrowthRate = 120; // percentage change to needed experience per level

        private byte armorChangeRatePerLevel = 5; // percentage change to growth rate per level, min 1 max 10

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

        public ArmorProficiencyBuilder setGambesonExperienceRequired(short gambesonExperienceRequired) {
            this.gambesonExperienceRequired = gambesonExperienceRequired;
            return this;
        }

        public ArmorProficiencyBuilder setChainmailExperienceRequired(short chainmailExperienceRequired) {
            this.chainmailExperienceRequired = chainmailExperienceRequired;
            return this;
        }

        public ArmorProficiencyBuilder setPlateExperienceRequired(short plateExperienceRequired) {
            this.plateExperienceRequired = plateExperienceRequired;
            return this;
        }

        public ArmorProficiencyBuilder setGambesonGrowthRate(short gambesonGrowthRate) {
            this.gambesonGrowthRate = gambesonGrowthRate;
            return this;
        }

        public ArmorProficiencyBuilder setChainmailGrowthRate(short chainmailGrowthRate) {
            this.chainmailGrowthRate = chainmailGrowthRate;
            return this;
        }

        public ArmorProficiencyBuilder setPlateGrowthRate(short plateGrowthRate) {
            this.plateGrowthRate = plateGrowthRate;
            return this;
        }

        public ArmorProficiencyBuilder setArmorChangeRatePerLevel(byte armorChangeRatePerLevel) {
            this.armorChangeRatePerLevel = armorChangeRatePerLevel;
            return this;
        }

        public RAttributes buildArmor() {
            RAttributes.gambesonProficiency = this.gambesonProficiency;
            RAttributes.chainmailProficiency = this.chainmailProficiency;
            RAttributes.plateProficiency = this.plateProficiency;
            RAttributes.gambesonExperience = this.gambesonExperience;
            RAttributes.chainmailExperience = this.chainmailExperience;
            RAttributes.plateExperience = this.plateExperience;
            RAttributes.gambesonExperienceRequired = this.gambesonExperienceRequired;
            RAttributes.chainmailExperienceRequired = this.chainmailExperienceRequired;
            RAttributes.plateExperienceRequired = this.plateExperienceRequired;
            RAttributes.gambesonGrowthRate = this.gambesonGrowthRate;
            RAttributes.chainmailGrowthRate = this.chainmailGrowthRate;
            RAttributes.plateGrowthRate = this.plateGrowthRate;
            RAttributes.armorChangeRatePerLevel = this.armorChangeRatePerLevel;
            return new RAttributes();
        }

    } // end armor proficiency builder subclass

    public static class SkillProficiencyBuilder { // start skill proficiency builder

        private byte tacticalProficiency = 1;
        private byte survivalProficiency = 1;
        private byte medicalProficiency = 1;

        private byte baseTacticalExperienceRequired = 100;
        private byte baseSurvivalExperienceRequired = 100;
        private byte baseMedicalExperienceRequired = 100;

        private double skillChangeRatePerLevel = 1.05; // percentage change to growth rate per level, min 1 max 10
        private final double baseSkillGrowthRate = 1.20; // percentage change to needed experience per level
        private final double totalGrowthRate = skillChangeRatePerLevel * baseSkillGrowthRate;


        private double tacticalGrowthRate = totalGrowthRate * tacticalProficiency; // percentage change to needed experience per level
        private double survivalGrowthRate = totalGrowthRate * survivalProficiency; // percentage change to needed experience per level
        private double medicalGrowthRate =  totalGrowthRate * medicalProficiency; // percentage change to needed experience per level

        private short tacticalExperienceRequired = 100;
        private short survivalExperienceRequired = 100;
        private short medicalExperienceRequired = (short) (baseMedicalExperienceRequired * medicalGrowthRate * medicalProficiency);

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

        public SkillProficiencyBuilder setBaseTacticalExperienceRequired(byte baseTacticalExperienceRequired) {
            this.baseTacticalExperienceRequired = baseTacticalExperienceRequired;
            return this;
        }

        public SkillProficiencyBuilder setBaseSurvivalExperienceRequired(byte baseSurvivalExperienceRequired) {
            this.baseSurvivalExperienceRequired = baseSurvivalExperienceRequired;
            return this;
        }

        public SkillProficiencyBuilder setBaseMedicalExperienceRequired(byte baseMedicalExperienceRequired) {
            this.baseMedicalExperienceRequired = baseMedicalExperienceRequired;
            return this;
        }

        public SkillProficiencyBuilder setTacticalExperienceRequired(short tacticalExperienceRequired) {
            this.tacticalExperienceRequired = tacticalExperienceRequired;
            return this;
        }

        public SkillProficiencyBuilder setSurvivalExperienceRequired(short survivalExperienceRequired) {
            this.survivalExperienceRequired = survivalExperienceRequired;
            return this;
        }

        public SkillProficiencyBuilder setMedicalExperienceRequired(short medicalExperienceRequired) {
            this.medicalExperienceRequired = medicalExperienceRequired;
            return this;
        }



        public SkillProficiencyBuilder setTacticalGrowthRate(double tacticalGrowthRate) {
            this.tacticalGrowthRate = tacticalGrowthRate;
            return this;
        }

        public SkillProficiencyBuilder setSurvivalGrowthRate(double survivalGrowthRate) {
            this.survivalGrowthRate = survivalGrowthRate;
            return this;
        }

        public SkillProficiencyBuilder setMedicalGrowthRate(double medicalGrowthRate) {
            this.medicalGrowthRate = medicalGrowthRate;
            return this;
        }

        public SkillProficiencyBuilder setSkillChangeRatePerLevel(double skillChangeRatePerLevel) {
            this.skillChangeRatePerLevel = skillChangeRatePerLevel;
            return this;
        }

        public RAttributes buildSkill() {
            RAttributes.tacticalProficiency = this.tacticalProficiency;
            RAttributes.survivalProficiency = this.survivalProficiency;
            RAttributes.medicalProficiency = this.medicalProficiency;
            RAttributes.tacticalExperience = this.tacticalExperience;
            RAttributes.survivalExperience = this.survivalExperience;
            RAttributes.medicalExperience = this.medicalExperience;
            RAttributes.baseTacticalExperienceRequired = this.baseTacticalExperienceRequired;
            RAttributes.baseSurvivalExperienceRequired = this.baseSurvivalExperienceRequired;
            RAttributes.baseMedicalExperienceRequired = this.baseMedicalExperienceRequired;
            RAttributes.tacticalExperienceRequired = this.tacticalExperienceRequired;
            RAttributes.survivalExperienceRequired = this.survivalExperienceRequired;
            RAttributes.medicalExperienceRequired = this.medicalExperienceRequired;
            RAttributes.tacticalGrowthRate = this.tacticalGrowthRate;
            RAttributes.survivalGrowthRate = this.survivalGrowthRate;
            RAttributes.medicalGrowthRate = this.medicalGrowthRate;
            RAttributes.skillChangeRatePerLevel = this.skillChangeRatePerLevel;
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
