package org.epiphany.Enums.Systems.Character;

/**
 * Enum representing various character backgrounds.
 */

public enum ECharacterBackgrounds {

    NOBLE("Noble"),
    MERCHANT("Merchant"),
    WARRIOR("Warrior"),
    ARTISAN("Artisan"),
    FARMER("Farmer"),
    PRIEST("Priest"),
    HUNTER("Hunter"),
    INFANTRY("Infantry"),
    MEDIC("Medic"),
    ACADEMIC("Academic"),
    DIPLOMAT("Diplomat");

    private final String backgroundName;

    ECharacterBackgrounds(String backgroundName) {
        this.backgroundName = backgroundName;

    }

    public String getBackgroundName() {
        return backgroundName;
    }
}
