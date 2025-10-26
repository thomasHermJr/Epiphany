package org.epiphany.Enums.Systems.Lore;

/**
 * Enum representing various lore locations within the game world.
 * This includes continents and local towns that are significant in the game's lore.
 */

public enum ELoreLocations {

    /*Current continent*/

    ELYSIUM("Elysium"),

    /*Continents*/ // Will be referenced in worldbuilding and lore, but not as hometowns

    VIRIDIUM("Viridium"),
    VITREA("Vitrea"),
    ZAYIDA("Zayida"),
    /*local towns*/

    SYCIA("Sycia"),
    RENATA("Renata"),
    LUNARIS("Lunaris"),
    PENANCE("Penance"),
    AURORA("Aurora"),
    VESPERA("Vespera"),
    ZYGA("Zyga"),
    VONGARRIS("Vongarris"),
    ABGESCH("Abgesch"); // Full name is "Abgeschiedenheit" - German for "Seclusion" - Abgesch for short


    private final String locationName;

    ELoreLocations(String locationName) { // Constructor
        // add location verification later
        this.locationName = locationName;
    } // end constructor

    public String getLocationName() {
        return locationName;
    } // end getLocationName


}
