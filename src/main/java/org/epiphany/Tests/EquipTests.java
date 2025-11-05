package org.epiphany.Tests;

import org.epiphany.Enums.Equipment.Armors.EArmorsTorso;
import org.epiphany.Enums.Equipment.EEquipmentQuality;

/**
 * EquipTests class to test equipment functionalities. <br>
 * <br>
 * Methods included: <ul>
 * testEArmorsTorso - Tests equipping, unequipping, and quality modification of torso armors.
 */

public class EquipTests {

    public static void testEArmorsTorso() { // Start testEArmorsTorso method

        // Initial test

        StringBuilder initTest = new StringBuilder();
        initTest.append("\n--- Testing EArmorsTorso Enum ---\n");
        EArmorsTorso unequipped = EArmorsTorso.NONE;
        EArmorsTorso torso1 = EArmorsTorso.CHAINMAIL_SHIRT;
        EArmorsTorso torso2 = EArmorsTorso.BLACKENED_HAUBERK;
        EArmorsTorso torso3 = EArmorsTorso.CHAINMAIL_MESH;

        initTest.append("\nInitial States...\n")
                .append(unequipped).append("\n")
                .append(torso1).append("\n")
                .append(torso2).append("\n")
                .append(torso3).append("\n");
        System.out.println(initTest);

        // Test unequip method

        StringBuilder unequipTest = new StringBuilder();
        unequipTest.append("\n--- Testing unequip() method ---\n");
        torso1.unequip();

        unequipTest.append("\nAfter unequipping...\n")
                .append(unequipped).append("\n")
                .append(torso1).append("\n")
                .append(torso2).append("\n")
                .append(torso3).append("\n");
        System.out.println(unequipTest);

        // Test equip method

        StringBuilder equipTest = new StringBuilder();
        equipTest.append("\n--- Testing equip() method ---\n");
        torso3.equip();

        equipTest.append("\nAfter equipping...\n")
                .append(unequipped).append("\n")
                .append(torso1).append("\n")
                .append(torso2).append("\n")
                .append(torso3).append("\n");
        System.out.println(equipTest);

        // Test equip method with other armor already equipped

        StringBuilder reEquipTest = new StringBuilder();
        reEquipTest.append("\n--- Testing equip() method with other armor on ---\n");
        torso2.equip();

        reEquipTest.append("\nAfter equipping...\n")
                .append(unequipped).append("\n")
                .append(torso1).append("\n")
                .append(torso2).append("\n")
                .append(torso3).append("\n");

        System.out.println(reEquipTest);

        // Test qualityModifier method

        StringBuilder qualityTest = new StringBuilder();
        qualityTest.append("\n--- Testing qualityModifier() method ---\n");

        EArmorsTorso standardTorso = EArmorsTorso.HAUBERK;

        qualityTest.append("Adding a standard quality armor for control...\n")
                .append(standardTorso).append("\n");

        standardTorso.qualityModifier(EEquipmentQuality.STANDARD); // No change expected
        unequipped.qualityModifier(EEquipmentQuality.EXCELLENT); // No change expected
        torso1.qualityModifier(EEquipmentQuality.FINE);
        torso2.qualityModifier(EEquipmentQuality.RUSTY);
        torso3.qualityModifier(EEquipmentQuality.MASTERWORK);

        qualityTest.append("\nAfter quality modification...\n")
                .append(unequipped).append("\n")
                .append(standardTorso).append("\n")
                .append(torso1).append("\n")
                .append(torso2).append("\n")
                .append(torso3).append("\n");
        System.out.println(qualityTest);

    } // end testEArmorsTorso method

    public static void main(String[] args) {
       testEArmorsTorso();
    }
}
