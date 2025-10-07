package org.epiphany;


import org.epiphany.Enums.Armors.EChainmails;
import org.epiphany.Enums.Systems.Settings.ESettingsInputMode;
import org.epiphany.Enums.Systems.Settings.ESettingsToggles;

public class Main {

    public static void main(String[] args) {

        // Test ESettingsToggles enum

        System.out.println("Testing ESettingsToggles enum...\n");
        ESettingsToggles settingsToggle = ESettingsToggles.FULLSCREEN;
        System.out.println(settingsToggle);

        settingsToggle.toggleSetting();
        StringBuilder sb = new StringBuilder();
        sb.append("\ntoggling...\n\n").append(settingsToggle);
        System.out.println(sb);

        // Test ESettingsInputMode enum

        System.out.println("\n\nTesting ESettingsInputMode enum...\n");
        ESettingsInputMode GameInputMode = ESettingsInputMode.GAMEPAD;
        ESettingsInputMode MenuInputMode = ESettingsInputMode.KEYBOARD_MOUSE;
        System.out.println(GameInputMode);
        System.out.println(MenuInputMode);

        GameInputMode.toggleInputMode();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\ntoggling...\n\n").append(GameInputMode);
        System.out.println(sb2);
        System.out.println(MenuInputMode);

        // test EChainmails enum

        System.out.println("\n\nTesting EChainmails enum...\n");
        EChainmails chainmail1 = EChainmails.RUINED_CHAINMAIL_SHIRT;
        EChainmails chainmail2 = EChainmails.BLACKENED_HAUBERK;
        EChainmails chainmail3 = EChainmails.RAGGED_CHAINMAIL_MESH;
        System.out.println(chainmail1);
        System.out.println(chainmail2);
        System.out.println(chainmail3);

        chainmail2.equipChainmail();
        System.out.println("\nAfter equipping...\n");
        System.out.println(chainmail1);
        System.out.println(chainmail2);
        System.out.println(chainmail3);


    } // end main method

} // end class definition