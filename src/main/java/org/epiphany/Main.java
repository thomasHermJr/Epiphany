package org.epiphany;


import org.epiphany.Classes.Person;
import org.epiphany.Enums.Armors.EChainmails;
import org.epiphany.Enums.Systems.Settings.ESettingsInputMode;
import org.epiphany.Enums.Systems.Settings.ESettingsToggles;

public class Main {

    public static void main(String[] args) {

        // Test ESettingsToggles enum
        ESettingsToggles.testESettingsToggles();


        // Test ESettingsInputMode enum
        ESettingsInputMode.testESettingsInputMode();

        // test EChainmails enum

        EChainmails.testEChainmails();

        // character test

        Person.characterTest();
        Person.statTest();


    } // end main method

} // end class definition