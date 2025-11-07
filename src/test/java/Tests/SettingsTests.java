package Tests;

import org.epiphany.Enums.Systems.Settings.ESettingsInputMode;
import org.epiphany.Enums.Systems.Settings.ESettingsToggles;

import static org.epiphany.Enums.Systems.Settings.ESettingsInputMode.toggleInputMode;
import static org.epiphany.Enums.Systems.Settings.ESettingsInputMode.validateInputMode;

/**
 * Test class for settings-related enums and functionalities. <br>
 * <br>
 * Methods: <ul>
 * - ESettingsToggles(): Tests togglable settings. <br>
 * <br>
 * - ESettingsInputMode(): Tests valid and invalid input mode handling, including toggling and validation. <br>
 * <br>
 * </ul>
 * Each test method prints the results to the console for verification. <br>
 */

public class SettingsTests {

    public static void testESettingsToggles() { // test method

        System.out.println("\n--- Testing ESettingsToggles enum ---\n");
        ESettingsToggles settingsToggle = ESettingsToggles.FULLSCREEN;
        System.out.println(settingsToggle);

        settingsToggle.toggleSetting();
        StringBuilder sb = new StringBuilder();
        sb.append("\ntoggling...\n\n").append(settingsToggle);
        System.out.println(sb);

    } // end test method



    public static void testESettingsInputMode() { // test method

        // simulate valid input modes

        System.out.println("\n--- Testing ESettingsInputMode enum ---\n\n");
        ESettingsInputMode gamepad = ESettingsInputMode.GAMEPAD;
        ESettingsInputMode keyboardAndMouse = ESettingsInputMode.KEYBOARD_MOUSE;

        StringBuilder sb = new StringBuilder();
        sb.append(gamepad)
                .append("\n")
                .append(keyboardAndMouse)
                .append("\n");
        System.out.println(sb);

        toggleInputMode();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\ntoggling...\n\n")
                .append(gamepad).
                append("\n")
                .append(keyboardAndMouse)
                .append("\n");
        System.out.println(sb2);

        System.out.println("\n--- Testing invalid input mode handling ---\n\n");

      // Simulate invalid input mode

        ESettingsInputMode.KEYBOARD_MOUSE.setIsOn(true);
        ESettingsInputMode.GAMEPAD.setIsOn(true);

        // Display states before validation
        StringBuilder whenBothOn = new StringBuilder();
        whenBothOn.append("When both on")
                .append("\n\n")
                .append("Before validation:")
                .append("\n\n")
                .append(gamepad)
                .append("\n")
                .append(keyboardAndMouse)
                .append("\n");
        System.out.println(whenBothOn);

        // Validate and correct the input modes
        validateInputMode();
        StringBuilder validateBothOn = new StringBuilder();
        validateBothOn.append("After validation:\n\n")
                .append(gamepad)
                .append("\n")
                .append(keyboardAndMouse)
                .append("\n");
        System.out.println(validateBothOn);

        // Simulate both modes off

        ESettingsInputMode.KEYBOARD_MOUSE.setIsOn(false);
        ESettingsInputMode.GAMEPAD.setIsOn(false);

        // Display states before validation
        StringBuilder whenBothOff = new StringBuilder();
        whenBothOff.append("When both off")
                .append("\n\n")
                .append("Before validation:")
                .append("\n\n")
                .append(gamepad)
                .append("\n")
                .append(keyboardAndMouse)
                .append("\n");
        System.out.println(whenBothOff);

        // Validate and correct the input modes

        validateInputMode();
        StringBuilder validateBothOff = new StringBuilder();
        validateBothOff.append("After validation:\n\n")
                .append(gamepad)
                .append("\n")
                .append(keyboardAndMouse)
                .append("\n");
        System.out.println(validateBothOff);


    } // end method


    public static void main(String[] args) {
        testESettingsToggles();
        testESettingsInputMode();
    }
}
