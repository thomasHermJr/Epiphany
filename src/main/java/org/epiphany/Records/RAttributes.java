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

        private byte gambesonProficiency = 1;
        private byte chainmailProficiency = 1;
        private byte plateProficiency = 1;

        private double gambesonGrowthRate = totalProficiencyGrowthRate * gambesonProficiency; // multiplier change to needed experience per level
        private double chainmailGrowthRate = totalProficiencyGrowthRate * chainmailProficiency; // multiplier change to needed experience per level
        private double plateGrowthRate = totalProficiencyGrowthRate * plateProficiency; // multiplier change to needed experience per level

        private short gambesonExperienceRequired = 100;
        private short chainmailExperienceRequired = 100;
        private short plateExperienceRequired = 100;

        private short gambesonExperience = 0;
        private short chainmailExperience = 0;
        private short plateExperience = 0;

        public ArmorProficiencyBuilder setGambesonProficiency(byte gambesonProficiency) {
            if (gambesonProficiency < 1) { // start min/max validation
                gambesonProficiency = 1;
            } // end min validation -- check for max later, when max levels are set
            this.gambesonProficiency = gambesonProficiency;
            return this;
        }

        public ArmorProficiencyBuilder setChainmailProficiency(byte chainmailProficiency) {
            if (chainmailProficiency < 1) { // start min/max validation
                chainmailProficiency = 1;
            } // end min validation -- check for max later, when max levels are set
            this.chainmailProficiency = chainmailProficiency;
            return this;
        }

        public ArmorProficiencyBuilder setPlateProficiency(byte plateProficiency) {
            if (plateProficiency < 1) { // start min/max validation
                plateProficiency = 1;
            } // end min validation -- check for max later, when max levels are set
            this.plateProficiency = plateProficiency;
            return this;
        }

        public ArmorProficiencyBuilder setGambesonExperience(short gambesonExperience) {
            if (gambesonExperience < 0) { // start min/max validation
                gambesonExperience = 0;
            } else if (gambesonExperience > gambesonExperienceRequired) {
                gambesonExperience = gambesonExperienceRequired;
            } // end min/max validation
            this.gambesonExperience = gambesonExperience;
            return this;
        }

        public ArmorProficiencyBuilder setChainmailExperience(short chainmailExperience) {
            if (chainmailExperience < 0) { // start min/max validation
                chainmailExperience = 0;
            } else if (chainmailExperience > chainmailExperienceRequired) {
                chainmailExperience = chainmailExperienceRequired;
            } // end min/max validation
            this.chainmailExperience = chainmailExperience;
            return this;
        }

        public ArmorProficiencyBuilder setPlateExperience(short plateExperience) {
            if (plateExperience < 0) { // start min/max validation
                plateExperience = 0;
            } else if (plateExperience > plateExperienceRequired) {
                plateExperience = plateExperienceRequired;
            } // end min/max validation
            this.plateExperience = plateExperience;
            return this;
        }

        public ArmorProficiencyBuilder setGambesonExperienceRequired(short gambesonExperienceRequired) {
            if (gambesonExperienceRequired < 100) { // start min/max validation
                gambesonExperienceRequired = 100;
            } else if (gambesonExperienceRequired > 32000) {
                gambesonExperienceRequired = 32000;
            } // end min/max validation
            this.gambesonExperienceRequired = gambesonExperienceRequired;
            return this;
        }

        public ArmorProficiencyBuilder setChainmailExperienceRequired(short chainmailExperienceRequired) {
            if (chainmailExperienceRequired < 100) { // start min/max validation
                chainmailExperienceRequired = 100;
            } else if (chainmailExperienceRequired > 32000) {
                chainmailExperienceRequired = 32000;
            } // end min/max validation
            this.chainmailExperienceRequired = chainmailExperienceRequired;
            return this;
        }

        public ArmorProficiencyBuilder setPlateExperienceRequired(short plateExperienceRequired) {
            if (plateExperienceRequired < 100) { // start min/max validation
                plateExperienceRequired = 100;
            } else if (plateExperienceRequired > 32000) {
                plateExperienceRequired = 32000;
            } // end min/max validation
            this.plateExperienceRequired = plateExperienceRequired;
            return this;
        }

        public ArmorProficiencyBuilder setGambesonGrowthRate(double gambesonGrowthRate) {
            if (gambesonGrowthRate < totalProficiencyGrowthRate) { // start min/max validation
                gambesonGrowthRate = totalProficiencyGrowthRate;
            } else if (gambesonGrowthRate > totalProficiencyGrowthRate * 10) {
                gambesonGrowthRate = (totalProficiencyGrowthRate * 10);
            } // end min/max validation
            this.gambesonGrowthRate = gambesonGrowthRate;
            return this;
        }

        public ArmorProficiencyBuilder setChainmailGrowthRate(double chainmailGrowthRate) {
            if (chainmailGrowthRate < totalProficiencyGrowthRate) { // start min/max validation
                chainmailGrowthRate = totalProficiencyGrowthRate;
            } else if (chainmailGrowthRate > totalProficiencyGrowthRate * 10) {
                chainmailGrowthRate = (totalProficiencyGrowthRate * 10);
            } // end min/max validation
            this.chainmailGrowthRate = chainmailGrowthRate;
            return this;
        }

        public ArmorProficiencyBuilder setPlateGrowthRate(double plateGrowthRate) {
            if (plateGrowthRate < totalProficiencyGrowthRate) { // start min/max validation
                plateGrowthRate = totalProficiencyGrowthRate;
            } else if (plateGrowthRate > totalProficiencyGrowthRate * 10) {
                plateGrowthRate = (totalProficiencyGrowthRate * 10);
            } // end min/max validation
            this.plateGrowthRate = plateGrowthRate;
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
            return new RAttributes();
        }

    } // end armor proficiency builder subclass

    public static class SkillProficiencyBuilder { // start skill proficiency builder

        private byte tacticalProficiency = 1;
        private byte survivalProficiency = 1;
        private byte medicalProficiency = 1;

        private double tacticalGrowthRate = totalProficiencyGrowthRate * tacticalProficiency; // multiplier change to needed experience per level
        private double survivalGrowthRate = totalProficiencyGrowthRate * survivalProficiency; // multiplier change to needed experience per level
        private double medicalGrowthRate =  totalProficiencyGrowthRate * medicalProficiency; // multiplier change to needed experience per level

        private short tacticalExperienceRequired = (short) (baseExperienceRequired * tacticalGrowthRate * tacticalProficiency);
        private short survivalExperienceRequired = (short) (baseExperienceRequired * survivalGrowthRate * survivalProficiency);
        private short medicalExperienceRequired = (short) (baseExperienceRequired * medicalGrowthRate * medicalProficiency);

        private short tacticalExperience = 0;
        private short survivalExperience = 0;
        private short medicalExperience = 0;

        public SkillProficiencyBuilder setTacticalProficiency(byte tacticalProficiency) {
            if (tacticalProficiency < 1) { // start min/max validation
                tacticalProficiency = 1;
            } // end min validation -- check for max later, when max levels are set
            this.tacticalProficiency = tacticalProficiency;
            return this;
        }

        public SkillProficiencyBuilder setSurvivalProficiency(byte survivalProficiency) {
            if (survivalProficiency < 1) { // start min/max validation
                survivalProficiency = 1;
            } // end min validation -- check for max later, when max levels are set
            this.survivalProficiency = survivalProficiency;
            return this;
        }

        public SkillProficiencyBuilder setMedicalProficiency(byte medicalProficiency) {
            if (medicalProficiency < 1) { // start min/max validation
                medicalProficiency = 1;
            } // end min validation -- check for max later, when max levels are set
            this.medicalProficiency = medicalProficiency;
            return this;
        }

        public SkillProficiencyBuilder setTacticalExperience(short tacticalExperience) {
            if (tacticalExperience < 0) { // start min/max validation
                tacticalExperience = 0;
            } else if (tacticalExperience > tacticalExperienceRequired) {
                tacticalExperience = tacticalExperienceRequired;
            } // end min/max validation
            this.tacticalExperience = tacticalExperience;
            return this;
        }

        public SkillProficiencyBuilder setSurvivalExperience(short survivalExperience) {
            if (survivalExperience < 0) { // start min/max validation
                survivalExperience = 0;
            } else if (survivalExperience > survivalExperienceRequired) {
                survivalExperience = survivalExperienceRequired;
            } // end min/max validation
            this.survivalExperience = survivalExperience;
            return this;
        }

        public SkillProficiencyBuilder setMedicalExperience(short medicalExperience) {
            if (medicalExperience < 0) { // start min/max validation
                medicalExperience = 0;
            } else if (medicalExperience > medicalExperienceRequired) {
                medicalExperience = medicalExperienceRequired;
            } // end min/max validation
            this.medicalExperience = medicalExperience;
            return this;
        }

        public SkillProficiencyBuilder setTacticalExperienceRequired(short tacticalExperienceRequired) {
            if (tacticalExperienceRequired < 100) { // start min/max validation
                tacticalExperienceRequired = 100;
            } else if (tacticalExperienceRequired > 32000) {
                tacticalExperienceRequired = 32000;
            } // end min/max validation
            this.tacticalExperienceRequired = tacticalExperienceRequired;
            return this;
        }

        public SkillProficiencyBuilder setSurvivalExperienceRequired(short survivalExperienceRequired) {
            if (survivalExperienceRequired < 100) { // start min/max validation
                survivalExperienceRequired = 100;
            } else if (survivalExperienceRequired > 32000) {
                survivalExperienceRequired = 32000;
            } // end min/max validation
            this.survivalExperienceRequired = survivalExperienceRequired;
            return this;
        }

        public SkillProficiencyBuilder setMedicalExperienceRequired(short medicalExperienceRequired) {
            if (medicalExperienceRequired < 100) { // start min/max validation
                medicalExperienceRequired = 100;
            } else if (medicalExperienceRequired > 32000) {
                medicalExperienceRequired = 32000;
            } // end min/max validation
            this.medicalExperienceRequired = medicalExperienceRequired;
            return this;
        }



        public SkillProficiencyBuilder setTacticalGrowthRate(double tacticalGrowthRate) {
            if (tacticalGrowthRate < totalProficiencyGrowthRate) { // start min/max validation
                tacticalGrowthRate = totalProficiencyGrowthRate;
            } else if (tacticalGrowthRate > totalProficiencyGrowthRate * 10) {
                tacticalGrowthRate = (totalProficiencyGrowthRate * 10);
            } // end min/max validation
            this.tacticalGrowthRate = tacticalGrowthRate;
            return this;
        }

        public SkillProficiencyBuilder setSurvivalGrowthRate(double survivalGrowthRate) {
            if (survivalGrowthRate < totalProficiencyGrowthRate) { // start min/max validation
                survivalGrowthRate = totalProficiencyGrowthRate;
            } else if (survivalGrowthRate > totalProficiencyGrowthRate * 10) {
                survivalGrowthRate = (totalProficiencyGrowthRate * 10);
            } // end min/max validation
            this.survivalGrowthRate = survivalGrowthRate;
            return this;
        }

        public SkillProficiencyBuilder setMedicalGrowthRate(double medicalGrowthRate) {
            if (medicalGrowthRate < totalProficiencyGrowthRate) { // start min/max validation
                medicalGrowthRate = totalProficiencyGrowthRate;
            } else if (medicalGrowthRate > totalProficiencyGrowthRate * 10) {
                medicalGrowthRate = (totalProficiencyGrowthRate * 10);
            } // end min/max validation
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

        private byte smithingProficiency = 1;
        private byte engineeringProficiency = 1;
        private byte gadgetryProficiency = 1;

        private double smithingGrowthRate = totalProficiencyGrowthRate * smithingProficiency; // multiplier change to needed experience per level
        private double engineeringGrowthRate = totalProficiencyGrowthRate * engineeringProficiency; // multiplier change to needed experience per level
        private double gadgetryGrowthRate = totalProficiencyGrowthRate * gadgetryProficiency; // multiplier change to needed experience per level

        private short smithingExperienceRequired = (short) (baseExperienceRequired * smithingGrowthRate * smithingProficiency);
        private short engineeringExperienceRequired = (short) (baseExperienceRequired * engineeringGrowthRate * engineeringProficiency);
        private short gadgetryExperienceRequired = (short) (baseExperienceRequired * gadgetryGrowthRate * gadgetryProficiency);

        private short smithingExperience = 0;
        private short engineeringExperience = 0;
        private short gadgetryExperience = 0;

        public LifeProficiencyBuilder setSmithingProficiency(byte smithingProficiency) {
            if (smithingProficiency < 1) { // start min/max validation
                smithingProficiency = 1;
            } // end min validation -- check for max later, when max levels are set
            this.smithingProficiency = smithingProficiency;
            return this;
        }

        public LifeProficiencyBuilder setEngineeringProficiency(byte engineeringProficiency) {
            if (engineeringProficiency < 1) { // start min/max validation
                engineeringProficiency = 1;
            } // end min validation -- check for max later, when max levels are set
            this.engineeringProficiency = engineeringProficiency;
            return this;
        }

        public LifeProficiencyBuilder setGadgetryProficiency(byte gadgetryProficiency) {
            if (gadgetryProficiency < 1) { // start min/max validation
                gadgetryProficiency = 1;
            } // end min validation -- check for max later, when max levels are set
            this.gadgetryProficiency = gadgetryProficiency;
            return this;
        }

        public LifeProficiencyBuilder setSmithingGrowthRate(double smithingGrowthRate) {
            if (smithingGrowthRate < totalProficiencyGrowthRate) { // start min/max validation
                smithingGrowthRate = totalProficiencyGrowthRate;
            } else if (smithingGrowthRate > totalProficiencyGrowthRate * 10) {
                smithingGrowthRate = (totalProficiencyGrowthRate * 10);
            } // end min/max validation
            this.smithingGrowthRate = smithingGrowthRate;
            return this;
        }

        public LifeProficiencyBuilder setEngineeringGrowthRate(double engineeringGrowthRate) {
            if (engineeringGrowthRate < totalProficiencyGrowthRate) { // start min/max validation
                engineeringGrowthRate = totalProficiencyGrowthRate;
            } else if (engineeringGrowthRate > totalProficiencyGrowthRate * 10) {
                engineeringGrowthRate = (totalProficiencyGrowthRate * 10);
            } // end min/max validation
            this.engineeringGrowthRate = engineeringGrowthRate;
            return this;
        }

        public LifeProficiencyBuilder setGadgetryGrowthRate(double gadgetryGrowthRate) {
            if (gadgetryGrowthRate < totalProficiencyGrowthRate) { // start min/max validation
                gadgetryGrowthRate = totalProficiencyGrowthRate;
            } else if (gadgetryGrowthRate > totalProficiencyGrowthRate * 10) {
                gadgetryGrowthRate = (totalProficiencyGrowthRate * 10);
            } // end min/max validation
            this.gadgetryGrowthRate = gadgetryGrowthRate;
            return this;
        }

        public LifeProficiencyBuilder setSmithingExperienceRequired(short smithingExperienceRequired) {
            if (smithingExperienceRequired < 100) { // start min/max validation
                smithingExperienceRequired = 100;
            } else if (smithingExperienceRequired > 32000) {
                smithingExperienceRequired = 32000;
            } // end min/max validation
            this.smithingExperienceRequired = smithingExperienceRequired;
            return this;
        }

        public LifeProficiencyBuilder setEngineeringExperienceRequired(short engineeringExperienceRequired) {
            if (engineeringExperienceRequired < 100) { // start min/max validation
                engineeringExperienceRequired = 100;
            } else if (engineeringExperienceRequired > 32000) {
                engineeringExperienceRequired = 32000;
            } // end min/max validation
            this.engineeringExperienceRequired = engineeringExperienceRequired;
            return this;
        }

        public LifeProficiencyBuilder setGadgetryExperienceRequired(short gadgetryExperienceRequired) {
            if (gadgetryExperienceRequired < 100) { // start min/max validation
                gadgetryExperienceRequired = 100;
            } else if (gadgetryExperienceRequired > 32000) {
                gadgetryExperienceRequired = 32000;
            } // end min/max validation
            this.gadgetryExperienceRequired = gadgetryExperienceRequired;
            return this;
        }

        public LifeProficiencyBuilder setSmithingExperience(short smithingExperience) {
            if (smithingExperience < 0) { // start min/max validation
                smithingExperience = 0;
            } else if (smithingExperience > smithingExperienceRequired) {
                smithingExperience = smithingExperienceRequired;
            } // end min/max validation
            this.smithingExperience = smithingExperience;
            return this;
        }

        public LifeProficiencyBuilder setEngineeringExperience(short engineeringExperience) {
            if (engineeringExperience < 0) { // start min/max validation
                engineeringExperience = 0;
            } else if (engineeringExperience > engineeringExperienceRequired) {
                engineeringExperience = engineeringExperienceRequired;
            } // end min/max validation
            this.engineeringExperience = engineeringExperience;
            return this;
        }

        public LifeProficiencyBuilder setGadgetryExperience(short gadgetryExperience) {
            if (gadgetryExperience < 0) { // start min/max validation
                gadgetryExperience = 0;
            } else if (gadgetryExperience > gadgetryExperienceRequired) {
                gadgetryExperience = gadgetryExperienceRequired;
            } // end min/max validation
            this.gadgetryExperience = gadgetryExperience;
            return this;
        }

        public RAttributes buildLife() {
            RAttributes.smithingProficiency = this.smithingProficiency;
            RAttributes.engineeringProficiency = this.engineeringProficiency;
            RAttributes.gadgetryProficiency = this.gadgetryProficiency;
            RAttributes.smithingGrowthRate = this.smithingGrowthRate;
            RAttributes.engineeringGrowthRate = this.engineeringGrowthRate;
            RAttributes.gadgetryGrowthRate = this.gadgetryGrowthRate;
            RAttributes.smithingExperienceRequired = this.smithingExperienceRequired;
            RAttributes.engineeringExperienceRequired = this.engineeringExperienceRequired;
            RAttributes.gadgetryExperienceRequired = this.gadgetryExperienceRequired;
            RAttributes.smithingExperience = this.smithingExperience;
            RAttributes.engineeringExperience = this.engineeringExperience;
            RAttributes.gadgetryExperience = this.gadgetryExperience;
            return new RAttributes();
        }

    } // end life proficiency builder subclass

    public static class PersonalProficiencyBuilder { // start personal proficiency builder

        private byte leadershipProficiency = 1;
        private byte barterProficiency = 1;
        private byte oratoryProficiency = 1;

        private double leadershipGrowthRate = totalProficiencyGrowthRate * leadershipProficiency; // multiplier change to needed experience per level
        private double barterGrowthRate = totalProficiencyGrowthRate * barterProficiency; // multiplier change to needed experience per level
        private double oratoryGrowthRate = totalProficiencyGrowthRate * oratoryProficiency; // multiplier change to needed experience per level

        private short leadershipExperienceRequired = (short) (baseExperienceRequired * leadershipGrowthRate * leadershipProficiency);
        private short barterExperienceRequired = (short) (baseExperienceRequired * barterGrowthRate * barterProficiency);
        private short oratoryExperienceRequired = (short) (baseExperienceRequired * oratoryGrowthRate * oratoryProficiency);

        private short leadershipExperience = 0;
        private short barterExperience = 0;
        private short oratoryExperience = 0;

        public PersonalProficiencyBuilder setLeadershipProficiency(byte leadershipProficiency) {
            if (leadershipProficiency < 1) { // start min/max validation
                leadershipProficiency = 1;
            } // end min validation -- check for max later, when max levels are set
            this.leadershipProficiency = leadershipProficiency;
            return this;
        }

        public PersonalProficiencyBuilder setBarterProficiency(byte barterProficiency) {
            if (barterProficiency < 1) { // start min/max validation
                barterProficiency = 1;
            } // end min validation -- check for max later, when max levels are set
            this.barterProficiency = barterProficiency;
            return this;
        }

        public PersonalProficiencyBuilder setOratoryProficiency(byte oratoryProficiency) {
            if (oratoryProficiency < 1) { // start min/max validation
                oratoryProficiency = 1;
            } // end min validation -- check for max later, when max levels are set
            this.oratoryProficiency = oratoryProficiency;
            return this;
        }

        public PersonalProficiencyBuilder setLeadershipGrowthRate(double leadershipGrowthRate) {
            if (leadershipGrowthRate < totalProficiencyGrowthRate) { // start min/max validation
                leadershipGrowthRate = totalProficiencyGrowthRate;
            } else if (leadershipGrowthRate > totalProficiencyGrowthRate * 10) {
                leadershipGrowthRate = (totalProficiencyGrowthRate * 10);
            } // end min/max validation
            this.leadershipGrowthRate = leadershipGrowthRate;
            return this;
        }

        public PersonalProficiencyBuilder setBarterGrowthRate(double barterGrowthRate) {
            if (barterGrowthRate < totalProficiencyGrowthRate) { // start min/max validation
                barterGrowthRate = totalProficiencyGrowthRate;
            } else if (barterGrowthRate > totalProficiencyGrowthRate * 10) {
                barterGrowthRate = (totalProficiencyGrowthRate * 10);
            } // end min/max validation
            this.barterGrowthRate = barterGrowthRate;
            return this;
        }

        public PersonalProficiencyBuilder setOratoryGrowthRate(double oratoryGrowthRate) {
            if (oratoryGrowthRate < totalProficiencyGrowthRate) { // start min/max validation
                oratoryGrowthRate = totalProficiencyGrowthRate;
            } else if (oratoryGrowthRate > totalProficiencyGrowthRate * 10) {
                oratoryGrowthRate = (totalProficiencyGrowthRate * 10);
            } // end min/max validation
            this.oratoryGrowthRate = oratoryGrowthRate;
            return this;
        }

        public PersonalProficiencyBuilder setLeadershipExperienceRequired(short leadershipExperienceRequired) {
            if (leadershipExperienceRequired < 100) { // start min/max validation
                leadershipExperienceRequired = 100;
            } else if (leadershipExperienceRequired > 32000) {
                leadershipExperienceRequired = 32000;
            } // end min/max validation
            this.leadershipExperienceRequired = leadershipExperienceRequired;
            return this;
        }

        public PersonalProficiencyBuilder setBarterExperienceRequired(short barterExperienceRequired) {
            if (barterExperienceRequired < 100) { // start min/max validation
                barterExperienceRequired = 100;
            } else if (barterExperienceRequired > 32000) {
                barterExperienceRequired = 32000;
            } // end min/max validation
            this.barterExperienceRequired = barterExperienceRequired;
            return this;
        }

        public PersonalProficiencyBuilder setOratoryExperienceRequired(short oratoryExperienceRequired) {
            if (oratoryExperienceRequired < 100) { // start min/max validation
                oratoryExperienceRequired = 100;
            } else if (oratoryExperienceRequired > 32000) {
                oratoryExperienceRequired = 32000;
            } // end min/max validation
            this.oratoryExperienceRequired = oratoryExperienceRequired;
            return this;
        }

        public PersonalProficiencyBuilder setLeadershipExperience(short leadershipExperience) {
            if (leadershipExperience < 0) { // start min/max validation
                leadershipExperience = 0;
            } else if (leadershipExperience > leadershipExperienceRequired) {
                leadershipExperience = leadershipExperienceRequired;
            } // end min/max validation
            this.leadershipExperience = leadershipExperience;
            return this;
        }

        public PersonalProficiencyBuilder setBarterExperience(short barterExperience) {
            if (barterExperience < 0) { // start min/max validation
                barterExperience = 0;
            } else if (barterExperience > barterExperienceRequired) {
                barterExperience = barterExperienceRequired;
            } // end min/max validation
            this.barterExperience = barterExperience;
            return this;
        }

        public PersonalProficiencyBuilder setOratoryExperience(short oratoryExperience) {
            if (oratoryExperience < 0) { // start min/max validation
                oratoryExperience = 0;
            } else if (oratoryExperience > oratoryExperienceRequired) {
                oratoryExperience = oratoryExperienceRequired;
            } // end min/max validation
            this.oratoryExperience = oratoryExperience;
            return this;
        }

        public RAttributes buildPersonal() {
            RAttributes.leadershipProficiency = this.leadershipProficiency;
            RAttributes.barterProficiency = this.barterProficiency;
            RAttributes.oratoryProficiency = this.oratoryProficiency;
            RAttributes.leadershipGrowthRate = this.leadershipGrowthRate;
            RAttributes.barterGrowthRate = this.barterGrowthRate;
            RAttributes.oratoryGrowthRate = this.oratoryGrowthRate;
            RAttributes.leadershipExperienceRequired = this.leadershipExperienceRequired;
            RAttributes.barterExperienceRequired = this.barterExperienceRequired;
            RAttributes.oratoryExperienceRequired = this.oratoryExperienceRequired;
            RAttributes.leadershipExperience = this.leadershipExperience;
            RAttributes.barterExperience = this.barterExperience;
            RAttributes.oratoryExperience = this.oratoryExperience;
            return new RAttributes();
        }

    } // end personal proficiency builder subclass


}
