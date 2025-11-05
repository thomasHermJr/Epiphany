package org.epiphany.Enums.Equipment;

/**
 * Enumeration representing different quality levels of equipment. <br>
 * Each quality level has a name and a modifier that affects the equipment's performance.
 */

public enum EEquipmentQuality {

    RUINED("Ruined", 0.5),
    RUSTY("Rusty", 0.75),
    RAGGED("Ragged", 0.85),
    STANDARD("Standard", 1.0),
    FINE("Fine", 1.15),
    EXCELLENT("Excellent", 1.25),
    HARDENED("Hardened", 1.5),
    MASTERWORK("Masterwork", 2.0);

    private final String qualityName;
    private final double qualityModifier;

    EEquipmentQuality (String qualityName, double qualityModifier) {
        this.qualityName = qualityName;
        this.qualityModifier = qualityModifier;
    }

    public String getQualityName() {
        return qualityName;
    }

    public double getQualityModifier() {
        return qualityModifier;
    }

}
