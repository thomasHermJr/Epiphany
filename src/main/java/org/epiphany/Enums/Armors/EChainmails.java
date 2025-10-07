package org.epiphany.Enums.Armors;

public enum EChainmails {

    /*TODO:
    *      Consider making equip function in a different class, to allow easy verification on every armor type*/

    /* Torso */

    RUINED_CHAINMAIL_SHIRT("Ruined Chainmail Shirt", "Torso", 2, true),
    RUSTY_CHAINMAIL_SHIRT("Rusty Chainmail Shirt", "Torso", 4, false),
    RAGGED_CHAINMAIL_SHIRT("Ragged Chainmail Shirt", "Torso", 6, false),
    CHAINMAIL_SHIRT("Chainmail Shirt", "Torso", 8, false),
    RUSTY_CHAINMAIL_MESH("Rusty Chainmail Mesh", "Torso", 12, false),
    RAGGED_CHAINMAIL_MESH("Ragged Chainmail Mesh", "Torso", 14, false),
    CHAINMAIL_MESH("Chainmail Mesh", "Torso", 16, false),
    RUSTY_HAUBERGON("Rusty Haubergon", "Torso", 20, false),
    RAGGED_HAUBERGON("Ragged Haubergon", "Torso", 23, false),
    HAUBERGON("Haubergon", "Torso", 28, false),
    RUSTY_HAUBERK("Rusty Hauberk", "Torso", 35, false),
    RAGGED_HAUBERK("Ragged Hauberk", "Torso", 42, false),
    HAUBERK("Hauberk", "Torso", 50, false),
    RUSTY_BLACKENED_HAUBERK("Rusty Blackened Hauberk", "Torso", 57, false),
    RAGGED_BLACKENED_HAUBERK("Ragged Blackened Hauberk", "Torso", 64, false),
    BLACKENED_HAUBERK("Blackened Hauberk", "Torso", 75, false);


    private final String name;
    private final String bodyCoverage;
    private final int defense;
    private boolean isEquipped;


    EChainmails(String name, String bodyCoverage, int defense, boolean isEquipped) {
        this.name = name;
        this.bodyCoverage = bodyCoverage;
        this.defense = defense;
        this.isEquipped = isEquipped;
    } // end constructor

    /* Getters */

    public String getName() {
        return name;
    } // end getName

    public String getBodyCoverage() {
        return bodyCoverage;
    } // end getBodyCoverage

    public int getDefense() {
        return defense;
    } // end getDefense

    public boolean isEquipped() {
        return isEquipped;
    } // end isEquipped

    // Can only confirm chainmail equipment - cannot unequip or check other armor types
    public void equipChainmail() {
        for (EChainmails chainmail : EChainmails.values()) {

            if (chainmail.getName().equals(this.name) && chainmail.getBodyCoverage().equals(this.bodyCoverage)) {
                chainmail.isEquipped = true;

                for (EChainmails otherChainmail : EChainmails.values()) {

                    if (!otherChainmail.getName().equals(this.name) && otherChainmail.getBodyCoverage().equals(this.bodyCoverage)) {
                        otherChainmail.isEquipped = false; // Only one chainmail can be equipped at a time

                    } // end inner if

                } // end inner for

            } // end outer if

        } // end outer for

    } // end equipChainmail

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n")
                .append("Body Coverage: ").append(bodyCoverage).append("\n")
                .append("Defense: ").append(defense).append("\n")
                .append("Equipped: ").append(isEquipped ? "Yes" : "No").append("\n");
        return sb.toString();
    }

}
