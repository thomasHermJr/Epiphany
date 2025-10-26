package org.epiphany.Enums.Armors;

public enum EArmorsTorso {

    /*TODO:
    *      Consider making equip function in a different class, to allow easy verification on every armor type*/

    /* Torso */

    RUINED_CHAINMAIL_SHIRT("Ruined Chainmail Shirt", "Chainmail", 2, true),
    RUSTY_CHAINMAIL_SHIRT("Rusty Chainmail Shirt", "Chainmail", 4, false),
    RAGGED_CHAINMAIL_SHIRT("Ragged Chainmail Shirt", "Chainmail", 6, false),
    CHAINMAIL_SHIRT("Chainmail Shirt", "Chainmail", 8, false),
    RUSTY_CHAINMAIL_MESH("Rusty Chainmail Mesh", "Chainmail", 12, false),
    RAGGED_CHAINMAIL_MESH("Ragged Chainmail Mesh", "Chainmail", 14, false),
    CHAINMAIL_MESH("Chainmail Mesh", "Chainmail", 16, false),
    RUSTY_HAUBERGON("Rusty Haubergon", "Chainmail", 20, false),
    RAGGED_HAUBERGON("Ragged Haubergon", "Chainmail", 23, false),
    HAUBERGON("Haubergon", "Chainmail", 28, false),
    RUSTY_HAUBERK("Rusty Hauberk", "Chainmail", 35, false),
    RAGGED_HAUBERK("Ragged Hauberk", "Chainmail", 42, false),
    HAUBERK("Hauberk", "Chainmail", 50, false),
    RUSTY_BLACKENED_HAUBERK("Rusty Blackened Hauberk", "Chainmail", 57, false),
    RAGGED_BLACKENED_HAUBERK("Ragged Blackened Hauberk", "Chainmail", 64, false),
    BLACKENED_HAUBERK("Blackened Hauberk", "Chainmail", 75, false);


    private final String name;
    private final String armorType;
    private final int defense;
    private boolean isEquipped;


    EArmorsTorso(String name, String armorType, int defense, boolean isEquipped) {
        this.name = name;
        this.armorType = armorType;
        this.defense = defense;
        this.isEquipped = isEquipped;
    } // end constructor

    /* Getters */

    public String getName() {
        return name;
    } // end getName

    public String getArmorType() {
        return armorType;
    } // end getBodyCoverage

    public int getDefense() {
        return defense;
    } // end getDefense

    public boolean isEquipped() {
        return isEquipped;
    } // end isEquipped

    public void unequip() {
        this.isEquipped = false;
    } // end unequip method

    public void equip() {

                this.isEquipped = true;

                for (EArmorsTorso otherTorso : EArmorsTorso.values()) {
                    // force unequip at O(N) efficiency -- Consider better verification method later

                    if (!otherTorso.getName().equals(this.name) && otherTorso.isEquipped) {
                        otherTorso.isEquipped = false; // Only one chainmail can be equipped at a time
                        break;
                    } // end inner if

                } // end inner for

    } // end equip method

    public static void testEArmorsTorso() {

        StringBuilder initTest = new StringBuilder();
        initTest.append("\n--- Testing EArmorsTorso Enum ---\n");
        EArmorsTorso torso1 = EArmorsTorso.RUINED_CHAINMAIL_SHIRT;
        EArmorsTorso torso2 = EArmorsTorso.BLACKENED_HAUBERK;
        EArmorsTorso torso3 = EArmorsTorso.RAGGED_CHAINMAIL_MESH;
        initTest.append(torso1).append("\n")
                .append(torso2).append("\n")
                .append(torso3).append("\n");
        System.out.println(initTest);

        StringBuilder unequipTest = new StringBuilder();
        unequipTest.append("\n--- Testing unequip() method ---\n");
        torso1.unequip();

        unequipTest.append("\nAfter unequipping...\n")
                .append(torso1);
        System.out.println(unequipTest);

        StringBuilder equipTest = new StringBuilder();
        equipTest.append("\n--- Testing equip() method ---\n");
        torso3.equip();
        equipTest.append("\nAfter equipping...\n")
                .append(torso3).append("\n");
        System.out.println(equipTest);

        StringBuilder reEquipTest = new StringBuilder();
        reEquipTest.append("\n--- Testing equip() method with other armor on ---\n");
        torso2.equip();
        reEquipTest.append("\nAfter equipping...\n")
                .append(torso1)
                .append("\n")
                .append(torso2)
                .append("\n")
                .append(torso3);

        System.out.println(reEquipTest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n")
                .append("Body Coverage: ").append(armorType).append("\n")
                .append("Defense: ").append(defense).append("\n")
                .append("Equipped: ").append(isEquipped ? "Yes" : "No").append("\n");
        return sb.toString();
    }

}
