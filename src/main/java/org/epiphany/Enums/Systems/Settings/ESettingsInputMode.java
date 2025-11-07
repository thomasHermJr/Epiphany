package org.epiphany.Enums.Systems.Settings;

/**
 * Enum representing different input modes for the application. <br>
 * It includes methods to toggle between modes and validate their states. <br>
 * <br>
 * Modes: <ul> <br>
 * KEYBOARD_MOUSE: Represents keyboard and mouse input mode. <br>
 * <br>
 * GAMEPAD: Represents gamepad input mode. <br>
 * </ul>
 * <br>
 * Only one input mode can be active at a time. <br>
 * <br>
 * Methods: <ul> <br>
 * toggleInputMode(): Toggles between the two input modes. <br>
 * <br>
 * validateInputMode(): Ensures that exactly one mode is active at a time. <br>
 * <br>
 * </ul>
 * <br>
 * Testing moved to org.epiphany.Tests.SettingsTests
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

    public static void validateInputMode() { // start method

        // cannot use .equals in static context, so we check the boolean states directly

        if ((ESettingsInputMode.KEYBOARD_MOUSE.isOn && ESettingsInputMode.GAMEPAD.isOn) ||
            (!ESettingsInputMode.KEYBOARD_MOUSE.isOn && !ESettingsInputMode.GAMEPAD.isOn)) {

            // If both modes are on or both are off, default to KEYBOARD_MOUSE

            System.out.println("\nInvalid input mode detected. Defaulting to Keyboard & Mouse.\n");
            ESettingsInputMode.KEYBOARD_MOUSE.isOn = true;
            ESettingsInputMode.GAMEPAD.isOn = false;

        } // end if

    } // end method

    public static void toggleInputMode() {

                // Only one input mode can be active at a time, so toggle both modes

                ESettingsInputMode.GAMEPAD.isOn = !ESettingsInputMode.GAMEPAD.isOn;
                ESettingsInputMode.KEYBOARD_MOUSE.isOn = !ESettingsInputMode.KEYBOARD_MOUSE.isOn;
                validateInputMode();

    } // end method

    @Override
    public String toString() { // start toString method

        StringBuilder sb = new StringBuilder();
        sb.append(inputName).append(": ").append(isOn ? "On" : "Off");
        return sb.toString();

    } // end toString method

} // end enum
