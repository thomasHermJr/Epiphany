package org.epiphany.Enums.Systems.Background;

public enum EHometowns {

    /*local towns*/

    SYCIA("Sycia"),
    RENATA("Renata"),
    LUNARIS("Lunaris"),
    PENANCE("Penance"),
    AURORA("Aurora"),
    VESPERA("Vespera"),
    ZYGA("Zyga"),
    VONGARRIS("Vongarris"),
    ABGESCH("Abgesch"), // Full name is "Abgeschiedenheit" - German for "Seclusion" - AbGesch for short

    /*Other lands*/

    DANSK("Dansk"),  // Germanic inspired lands
    VITA("Vita"),    // Viet inspired lands
    MINOR("Minor");  // General Asia inspired lands

    private final String hometownName;

    EHometowns(String hometownName) {
        this.hometownName = hometownName;
    }


}
