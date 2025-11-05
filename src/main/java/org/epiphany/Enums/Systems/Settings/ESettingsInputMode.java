package org.epiphany.Enums.Systems.Settings;

/**
 * ESettingsInputMode enum represents different input modes for the application.
 * It includes methods to toggle between modes and validate their states.
 *
 * Modes:
 * - KEYBOARD_MOUSE: Represents keyboard and mouse input mode.
 * - GAMEPAD: Represents gamepad input mode.
 *
 * Only one input mode can be active at a time.
 *
 * Methods:
 * - toggleInputMode(): Toggles between the two input modes.
 * - validateInputMode(): Ensures that only one mode is active at a time.
 *
 * Test Method:
 * - testESettingsInputMode(): Tests the functionality of the enum.
 */

public enum ESettingsInputMode { // start enum

    KEYBOARD_MOUSE("Keyboard & Mouse", true),
    GAMEPAD("Gamepad", false);

    private final String inputName;
    private boolean isOn;


    ESettingsInputMode(String inputName, boolean isOn) {

            this.inputName = inputName;
            this.isOn = isOn;

    } // end constructor

    public String getInputName() {
        return inputName;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public static void validateInputMode() {

        // cannot use .equals in static context, so we check the boolean states directly

        if ((ESettingsInputMode.KEYBOARD_MOUSE.isOn && ESettingsInputMode.GAMEPAD.isOn) ||
            (!ESettingsInputMode.KEYBOARD_MOUSE.isOn && !ESettingsInputMode.GAMEPAD.isOn)) {

            // If both modes are on or both are off, default to KEYBOARD_MOUSE
            System.out.println("\nInvalid input mode detected. Defaulting to Keyboard & Mouse.\n");
            ESettingsInputMode.KEYBOARD_MOUSE.isOn = true;
            ESettingsInputMode.GAMEPAD.isOn = false;
        }
    }

    public static void toggleInputMode() {

                // Only one input mode can be active at a time, so toggle both modes

                ESettingsInputMode.GAMEPAD.isOn = !ESettingsInputMode.GAMEPAD.isOn;
                ESettingsInputMode.KEYBOARD_MOUSE.isOn = !ESettingsInputMode.KEYBOARD_MOUSE.isOn;
                validateInputMode();

    } // end method

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(inputName).append(": ").append(isOn ? "On" : "Off");
        return sb.toString();

    }

    // keeping test method within enum to simplify access to private members



} // end enum
