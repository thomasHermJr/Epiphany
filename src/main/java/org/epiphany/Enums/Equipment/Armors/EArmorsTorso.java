package org.epiphany.Enums.Equipment.Armors;

import org.epiphany.Enums.Equipment.EEquipmentQuality;

/**
 * Armors for the torso body part. Uses EEquipmentQuality for name and stat modification. <br>
 * <br>
 * Attributes: <ul> <br>
 * name: The name of the armor. Made non-final to allow for quality modifications. <br>
 * <br>
 * armorType: The type of armor (e.g., Chainmail). <br>
 * <br>
 * defense: The defense value provided by the armor in int. Made non-final to allow for quality
 * modifications.<br>
 * <br>
 * isEquipped: Boolean indicating if the armor is currently equipped. <br>
 * </ul>
 * <br>
 * Methods: <ul> <br>
 * getName(): Returns the name of the armor. <br>
 * <br>
 * getArmorType(): Returns the type of armor. <br>
 * <br>
 * getDefense(): Returns the defense value of the armor. <br>
 * <br>
 * isEquipped(): Returns whether the armor is currently equipped. <br>
 * <br>
 * equip(): Equips the armor, unequipping any other equipped torso armor. <br>
 * <br>
 * unequip(): Unequips the armor - sets NONE to equipped <br>
 * <br>
 * qualityModifier(EEquipmentQuality quality): Modifies the armor's attributes and name based on the specified quality. <br>
 * <br>
 * toString(): Returns a string representation of the armor's attributes. <br>
 * </ul>
 * <br>
 * Testing moved to org.epiphany.Tests.EquipTests <br>
 * <br>
 * Note: Reused code structure for armors is considered acceptable for maintainability.
 * */

public enum EArmorsTorso {

    /* TODO:
        Consider plausibility of binary search by ordinal position in equip() method to reduce complexity to O(log N) */

    /* No Armor */
    NONE("Nothing Equipped", "None",  0, true),

    /* Chainmail */
    CHAINMAIL_SHIRT("Chainmail Shirt", "Chainmail", 8, false),
    CHAINMAIL_MESH("Chainmail Mesh", "Chainmail", 16, false),
    HAUBERGON("Haubergon", "Chainmail", 28, false),
    HAUBERK("Hauberk", "Chainmail", 50, false),
    BLACKENED_HAUBERK("Blackened Hauberk", "Chainmail", 75, false);


    private String name; // Made non-final to allow quality modification
    private final String armorType;
    private int defense; // Made non-final to allow quality modification
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

        if (!this.isEquipped) {
            return; // end early if already unequipped
        } // end if

        this.isEquipped = false;
        NONE.isEquipped = true;
    } // end unequip method

    public void equip() {

        if (this.isEquipped) {
            return; // end early if already equipped
        } // end if

        if (!NONE.isEquipped) { // if some other armor is equipped - skip if NONE is equipped

            for (EArmorsTorso otherTorso : EArmorsTorso.values()) {
                // force unequip at O(N) efficiency -- Consider better verification method later

                if (!otherTorso.getName().equals(this.name) && otherTorso.isEquipped) {
                    otherTorso.unequip(); // Only one torso piece can be equipped at a time
                    break;
                } // end inner if

            } // end for

        } // end outer if

        this.isEquipped = true;
        NONE.isEquipped = false;

    } // end equip method

    public void qualityModifier(EEquipmentQuality quality) { // Start quality modification method

        if ((this == EArmorsTorso.NONE) || (quality == EEquipmentQuality.STANDARD)) { // No modification for NONE or STANDARD quality
            return;
        } // end if

        this.defense = ((int) (this.defense * quality.getQualityModifier())); // Modify defense based on quality

        // Modify name to include quality descriptor

        StringBuilder modifiedName = new StringBuilder();
        modifiedName.append(quality.getQualityName()).append(" ").append(this.getName());
        this.name = (modifiedName.toString());

    } // end qualityModifier method

    @Override
    public String toString() { // start toString method
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n")
                .append("Armor Type: ").append(armorType).append("\n")
                .append("Defense: ").append(defense).append("\n")
                .append("Equipped: ").append(isEquipped ? "Yes" : "No").append("\n");
        return sb.toString();
    } // end toString method

} // end enum
