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

    static byte overdriveMeter = 0; // max 100, min 0
    static boolean overdriveActive = false;

    /*Proficiency utilities*/

    static final double baseExperienceRequired = 100; // base experience required for level up
    static final double baseProficiencyGrowthRate = 1.20; // multiplier change to needed
    static final double proficiencyChangeRatePerLevel = 1.05; // multiplier change to growth rate per level, min 1 max 10
    static final double totalProficiencyGrowthRate = baseProficiencyGrowthRate * proficiencyChangeRatePerLevel;

    /* weapon proficiencies */
    static byte swordProficiency = 1;
    static byte axeProficiency = 1;
    static byte bowProficiency = 1;
    static byte polearmProficiency = 1;

    static double swordGrowthRate = totalProficiencyGrowthRate * swordProficiency; // multiplier change to needed experience per level
    static double axeGrowthRate = totalProficiencyGrowthRate * axeProficiency; // multiplier change to needed experience per level
    static double bowGrowthRate = totalProficiencyGrowthRate * bowProficiency; // multiplier change to needed experience per level
    static double polearmGrowthRate = totalProficiencyGrowthRate * polearmProficiency; // multiplier change to needed experience per

    static short swordExperienceRequired = (short) (baseExperienceRequired * swordGrowthRate * swordProficiency);
    static short axeExperienceRequired = (short) (baseExperienceRequired * axeGrowthRate * axeProficiency);
    static short bowExperienceRequired = (short) (baseExperienceRequired * bowGrowthRate * bowProficiency);
    static short polearmExperienceRequired = (short) (baseExperienceRequired * polearmGrowthRate * polearmProficiency);

    static short swordExperience = 0;
    static short axeExperience = 0;
    static short bowExperience = 0;
    static short polearmExperience = 0;

    /* armor proficiencies */
    static byte gambesonProficiency = 1;
    static byte chainmailProficiency = 1;
    static byte plateProficiency = 1;

    static double gambesonGrowthRate = totalProficiencyGrowthRate * gambesonProficiency; // multiplier change to needed experience per level
    static double chainmailGrowthRate = totalProficiencyGrowthRate * chainmailProficiency; // multiplier change to needed experience per level
    static double plateGrowthRate = totalProficiencyGrowthRate * plateProficiency; // multiplier change to needed experience per

    static short gambesonExperienceRequired = (short) (baseExperienceRequired * gambesonGrowthRate * gambesonProficiency);
    static short chainmailExperienceRequired = (short) (baseExperienceRequired * chainmailGrowthRate * chainmailProficiency);
    static short plateExperienceRequired = (short) (baseExperienceRequired * plateGrowthRate * plateProficiency);


    static short gambesonExperience = 0;
    static short chainmailExperience = 0;
    static short plateExperience = 0;

    /* skill proficiencies */
    static byte tacticalProficiency = 1;
    static byte survivalProficiency = 1;
    static byte medicalProficiency = 1;

    static double tacticalGrowthRate = totalProficiencyGrowthRate * tacticalProficiency; // multiplier change to needed experience per level
    static double survivalGrowthRate = totalProficiencyGrowthRate * survivalProficiency; // multiplier change to needed experience per level
    static double medicalGrowthRate = totalProficiencyGrowthRate * medicalProficiency; // multiplier change to needed experience per level

    static short tacticalExperienceRequired = (short) (baseExperienceRequired * tacticalGrowthRate * tacticalProficiency);
    static short survivalExperienceRequired = (short) (baseExperienceRequired * survivalGrowthRate * survivalProficiency);
    static short medicalExperienceRequired = (short) (baseExperienceRequired * medicalGrowthRate * medicalProficiency);

    static short tacticalExperience = 0;
    static short survivalExperience = 0;
    static short medicalExperience = 0;

    /* life proficiencies */
    static byte smithingProficiency = 1;
    static byte engineeringProficiency = 1;
    static byte gadgetryProficiency = 1;

    static double smithingGrowthRate = totalProficiencyGrowthRate * smithingProficiency; // multiplier change to needed experience per level
    static double engineeringGrowthRate =  totalProficiencyGrowthRate * engineeringProficiency; // multiplier change to needed experience per level
    static double gadgetryGrowthRate = totalProficiencyGrowthRate * gadgetryProficiency; // multiplier change to needed experience per level

    static short smithingExperienceRequired = (short) (baseExperienceRequired * smithingGrowthRate * smithingProficiency);
    static short engineeringExperienceRequired = (short) (baseExperienceRequired * engineeringGrowthRate * engineeringProficiency);
    static short gadgetryExperienceRequired = (short) (baseExperienceRequired * gadgetryGrowthRate * gadgetryProficiency);

    static short smithingExperience = 0;
    static short engineeringExperience = 0;
    static short gadgetryExperience = 0;

    /* personal proficiencies */
    static byte leadershipProficiency = 1;
    static byte barterProficiency = 1;
    static byte oratoryProficiency = 1;

    static double leadershipGrowthRate = totalProficiencyGrowthRate * leadershipProficiency; // multiplier change to needed experience per level
    static double barterGrowthRate = totalProficiencyGrowthRate * barterProficiency; // multiplier change to needed experience per level
    static double oratoryGrowthRate = totalProficiencyGrowthRate * oratoryProficiency; // multiplier change to needed experience per level

    static short leadershipExperienceRequired = (short) (baseExperienceRequired * leadershipGrowthRate * leadershipProficiency);
    static short barterExperienceRequired = (short) (baseExperienceRequired * barterGrowthRate * barterProficiency);
    static short oratoryExperienceRequired = (short) (baseExperienceRequired * oratoryGrowthRate * oratoryProficiency);

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

        private byte swordProficiency = 1;
        private byte axeProficiency = 1;
        private byte bowProficiency = 1;
        private byte polearmProficiency = 1;

        private double swordGrowthRate = totalProficiencyGrowthRate * swordProficiency; // multiplier change to needed experience per level
        private double axeGrowthRate = totalProficiencyGrowthRate * axeProficiency; // multiplier change to needed experience per level
        private double bowGrowthRate = totalProficiencyGrowthRate * bowProficiency; // multiplier change to needed experience per level
        private double polearmGrowthRate = totalProficiencyGrowthRate * polearmProficiency; // multiplier change to needed experience per level

        private short swordExperienceRequired = (short) (baseExperienceRequired * swordGrowthRate * swordProficiency);
        private short axeExperienceRequired = (short) (baseExperienceRequired * axeGrowthRate * axeProficiency);
        private short bowExperienceRequired = (short) (baseExperienceRequired * bowGrowthRate * bowProficiency);
        private short polearmExperienceRequired = (short) (baseExperienceRequired * polearmGrowthRate * polearmProficiency);

        private short swordExperience = 0;
        private short axeExperience = 0;
        private short bowExperience = 0;
        private short polearmExperience = 0;

        public WeaponProficiencyBuilder setSwordProficiency(byte swordProficiency) {
            if (swordProficiency < 1) { // start min/max validation
                swordProficiency = 1;
            } // end min validation -- check for max later, when max levels are set
            this.swordProficiency = swordProficiency;
            return this;
        }

        public WeaponProficiencyBuilder setAxeProficiency(byte axeProficiency) {
            if (axeProficiency < 1) { // start min/max validation
                axeProficiency = 1;
            } // end min validation -- check for max later, when max levels are set
            this.axeProficiency = axeProficiency;
            return this;
        }

        public WeaponProficiencyBuilder setBowProficiency(byte bowProficiency) {
            if (bowProficiency < 1) { // start min/max validation
                bowProficiency = 1;
            } // end min validation -- check for max later, when max levels are set
            this.bowProficiency = bowProficiency;
            return this;
        }

        public WeaponProficiencyBuilder setPolearmProficiency(byte polearmProficiency) {
            if (polearmProficiency < 1) { // start min/max validation
                polearmProficiency = 1;
            } // end min validation -- check for max later, when max levels are set
            this.polearmProficiency = polearmProficiency;
            return this;
        }

        public WeaponProficiencyBuilder setSwordExperience(short swordExperience) {
            if (swordExperience < 0) { // start min/max validation
                swordExperience = 0;
            } else if (swordExperience > swordExperienceRequired) {
                swordExperience = swordExperienceRequired;
            } // end min/max validation
            this.swordExperience = swordExperience;
            return this;
        }

        public WeaponProficiencyBuilder setAxeExperience(short axeExperience) {
            if (axeExperience < 0) { // start min/max validation
                axeExperience = 0;
            } else if (axeExperience > axeExperienceRequired) {
                axeExperience = axeExperienceRequired;
            } // end min/max validation
            this.axeExperience = axeExperience;
            return this;
        }

        public WeaponProficiencyBuilder setBowExperience(short bowExperience) {
            if (bowExperience < 0) { // start min/max validation
                bowExperience = 0;
            } else if (bowExperience > bowExperienceRequired) {
                bowExperience = bowExperienceRequired;
            } // end min/max validation
            this.bowExperience = bowExperience;
            return this;
        }

        public WeaponProficiencyBuilder setPolearmExperience(short polearmExperience) {
            if (polearmExperience < 0) { // start min/max validation
                polearmExperience = 0;
            } else if (polearmExperience > polearmExperienceRequired) {
                polearmExperience = polearmExperienceRequired;
            } // end min/max validation
            this.polearmExperience = polearmExperience;
            return this;
        }

        public WeaponProficiencyBuilder setSwordExperienceRequired(short swordExperienceRequired) {
            if (swordExperienceRequired < 100) { // start min/max validation
                swordExperienceRequired = 100;
            } else if (swordExperienceRequired > 32000) {
                swordExperienceRequired = 32000;
            } // end min/max validation
            this.swordExperienceRequired = swordExperienceRequired;
            return this;
        }

        public WeaponProficiencyBuilder setAxeExperienceRequired(short axeExperienceRequired) {
            if (axeExperienceRequired < 100) { // start min/max validation
                axeExperienceRequired = 100;
            } else if (axeExperienceRequired > 32000) {
                axeExperienceRequired = 32000;
            } // end min/max validation
            this.axeExperienceRequired = axeExperienceRequired;
            return this;
        }

        public WeaponProficiencyBuilder setBowExperienceRequired(short bowExperienceRequired) {
            if (bowExperienceRequired < 100) { // start min/max validation
                bowExperienceRequired = 100;
            } else if (bowExperienceRequired > 32000) {
                bowExperienceRequired = 32000;
            } // end min/max validation
            this.bowExperienceRequired = bowExperienceRequired;
            return this;
        }

        public WeaponProficiencyBuilder setPolearmExperienceRequired(short polearmExperienceRequired) {
            if (polearmExperienceRequired < 100) { // start min/max validation
                polearmExperienceRequired = 100;
            } else if (polearmExperienceRequired > 32000) {
                polearmExperienceRequired = 32000;
            } // end min/max validation
            this.polearmExperienceRequired = polearmExperienceRequired;
            return this;
        }

        public WeaponProficiencyBuilder setSwordGrowthRate(double swordGrowthRate) {
            if (swordGrowthRate < totalProficiencyGrowthRate) { // start min/max validation
                swordGrowthRate = totalProficiencyGrowthRate;
            } else if (swordGrowthRate > totalProficiencyGrowthRate * 10) {
                swordGrowthRate = (totalProficiencyGrowthRate * 10);
            } // end min/max validation
            this.swordGrowthRate = swordGrowthRate;
            return this;
        }

        public WeaponProficiencyBuilder setAxeGrowthRate(double axeGrowthRate) {
            if (axeGrowthRate < totalProficiencyGrowthRate) { // start min/max validation
                axeGrowthRate = totalProficiencyGrowthRate;
            } else if (axeGrowthRate > totalProficiencyGrowthRate * 10) {
                axeGrowthRate = (totalProficiencyGrowthRate * 10);
            } // end min/max validation
            this.axeGrowthRate = axeGrowthRate;
            return this;
        }

        public WeaponProficiencyBuilder setBowGrowthRate(double bowGrowthRate) {
            if (bowGrowthRate < totalProficiencyGrowthRate) { // start min/max validation
                bowGrowthRate = totalProficiencyGrowthRate;
            } else if (bowGrowthRate > totalProficiencyGrowthRate * 10) {
                bowGrowthRate = (totalProficiencyGrowthRate * 10);
            } // end min/max validation
            this.bowGrowthRate = bowGrowthRate;
            return this;
        }

        public WeaponProficiencyBuilder setPolearmGrowthRate(double polearmGrowthRate) {
            if (polearmGrowthRate < totalProficiencyGrowthRate) { // start min/max validation
                polearmGrowthRate = totalProficiencyGrowthRate;
            } else if (polearmGrowthRate > totalProficiencyGrowthRate * 10) {
                polearmGrowthRate = (totalProficiencyGrowthRate * 10);
            } // end min/max validation
            this.polearmGrowthRate = polearmGrowthRate;
            return this;
        }


        public RAttributes buildWeapon() {
            RAttributes.swordProficiency = this.swordProficiency;
            RAttributes.axeProficiency = this.axeProficiency;
            RAttributes.bowProficiency = this.bowProficiency;
            RAttributes.polearmProficiency = this.polearmProficiency;
            RAttributes.swordExperienceRequired = this.swordExperienceRequired;
            RAttributes.axeExperienceRequired = this.axeExperienceRequired;
            RAttributes.bowExperienceRequired = this.bowExperienceRequired;
            RAttributes.polearmExperienceRequired = this.polearmExperienceRequired;
            RAttributes.swordExperience = this.swordExperience;
            RAttributes.axeExperience = this.axeExperience;
            RAttributes.bowExperience = this.bowExperience;
            RAttributes.polearmExperience = this.polearmExperience;
            RAttributes.swordGrowthRate = this.swordGrowthRate;
            RAttributes.axeGrowthRate = this.axeGrowthRate;
            RAttributes.bowGrowthRate = this.bowGrowthRate;
            RAttributes.polearmGrowthRate = this.polearmGrowthRate;
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

        private double tacticalGrowthRate = totalProficiencyGrowthRate * tacticalProficiency; // percentage change to needed experience per level
        private double survivalGrowthRate = totalProficiencyGrowthRate * survivalProficiency; // percentage change to needed experience per level
        private double medicalGrowthRate =  totalProficiencyGrowthRate * medicalProficiency; // percentage change to needed experience per level

        private short tacticalExperienceRequired = (short) (baseTacticalExperienceRequired * tacticalGrowthRate * tacticalProficiency);
        private short survivalExperienceRequired = (short) (baseSurvivalExperienceRequired * survivalGrowthRate * survivalProficiency);
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
