package org.epiphany;


import org.epiphany.Enums.Systems.Settings.ESettingsInputMode;
import org.epiphany.Enums.Systems.Settings.ESettingsToggles;

public class Main {

    public static void main(String[] args) {

        // Test ESettingsToggles enum

        System.out.println("Testing ESettingsToggles enum...\n");
        ESettingsToggles settingsToggle = ESettingsToggles.FULLSCREEN;
        System.out.println(settingsToggle);

        settingsToggle.toggleSetting(settingsToggle.getSettingName());
        StringBuilder sb = new StringBuilder();
        sb.append("\ntoggling...\n\n").append(settingsToggle);
        System.out.println(sb);

        // Test ESettingsInputMode enum
        System.out.println("\n\nTesting ESettingsInputMode enum...\n");
        ESettingsInputMode GameInputMode = ESettingsInputMode.GAMEPAD;
        ESettingsInputMode MenuInputMode = ESettingsInputMode.KEYBOARD_MOUSE;
        System.out.println(GameInputMode);
        System.out.println(MenuInputMode);

        GameInputMode.toggleInputMode(GameInputMode.getInputName());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\ntoggling...\n\n").append(GameInputMode);
        System.out.println(sb2);
        System.out.println(MenuInputMode);


    } // end main method

} // end class definition