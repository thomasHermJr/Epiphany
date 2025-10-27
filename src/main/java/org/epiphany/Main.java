package org.epiphany;


import org.epiphany.Classes.Character.Entity;
import org.epiphany.Enums.Armors.EArmorsTorso;
import org.epiphany.Enums.Systems.Settings.ESettingsInputMode;
import org.epiphany.Enums.Systems.Settings.ESettingsToggles;

public class Main {

    public static void main(String[] args) {

        // Test ESettingsToggles enum
        ESettingsToggles.testESettingsToggles();


        // Test ESettingsInputMode enum
        ESettingsInputMode.testESettingsInputMode();

        // test EArmorsTorso enum

        EArmorsTorso.testEArmorsTorso();

        // character test

        Entity.characterTest();
        Entity.statTest();
        Entity.levelTest();


    } // end main method

} // end class definition