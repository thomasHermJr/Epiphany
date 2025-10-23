package org.epiphany.Enums.Systems.Settings;

import java.util.Objects;

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

    private static void validateInputMode() {

        // cannot use .equals in static context, so we check the boolean states directly

        if ((ESettingsInputMode.KEYBOARD_MOUSE.isOn && ESettingsInputMode.GAMEPAD.isOn) ||
            (!ESettingsInputMode.KEYBOARD_MOUSE.isOn && !ESettingsInputMode.GAMEPAD.isOn)) {

            // If both modes are on or both are off, default to KEYBOARD_MOUSE
            System.out.println("Invalid input mode detected. Defaulting to Keyboard & Mouse.");
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

    public static void testESettingsInputMode() { // test method

        System.out.println("\nTesting ESettingsInputMode enum...\n");
        ESettingsInputMode GameInputMode = ESettingsInputMode.GAMEPAD;
        ESettingsInputMode MenuInputMode = ESettingsInputMode.KEYBOARD_MOUSE;
        StringBuilder sb = new StringBuilder();
        sb.append(GameInputMode)
                .append("\n")
                .append(MenuInputMode)
                .append("\n");
         //       .append(InvalidInputMode);
        System.out.println(sb);

        toggleInputMode();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\ntoggling...\n\n")
                .append(GameInputMode).
                append("\n")
                .append(MenuInputMode)
                .append("\n");
           //     .append(InvalidInputMode);
        System.out.println(sb2);

        System.out.println("Testing invalid input mode handling...\n");
        // Simulate invalid input mode

        ESettingsInputMode.KEYBOARD_MOUSE.isOn = true;
        ESettingsInputMode.GAMEPAD.isOn = true;

        // Display states before validation
        StringBuilder whenBothOn = new StringBuilder();
        whenBothOn.append("When both on")
                .append("\n\n")
                .append("Before validation:")
                .append("\n")
                .append(GameInputMode)
                .append("\n")
                .append(MenuInputMode)
                .append("\n");
        System.out.println(whenBothOn);

         // Validate and correct the input modes
        validateInputMode();
        StringBuilder validateBothOn = new StringBuilder();
        validateBothOn.append("After validation:\n")
                .append(GameInputMode)
                .append("\n")
                .append(MenuInputMode)
                .append("\n");
        System.out.println(validateBothOn);

        // Simulate both modes off

        ESettingsInputMode.KEYBOARD_MOUSE.isOn = false;
        ESettingsInputMode.GAMEPAD.isOn = false;

        // Display states before validation
        StringBuilder whenBothOff = new StringBuilder();
        whenBothOff.append("When both off")
                .append("\n\n")
                .append("Before validation:")
                .append("\n")
                .append(GameInputMode)
                .append("\n")
                .append(MenuInputMode)
                .append("\n");
        System.out.println(whenBothOff);

            // Validate and correct the input modes

        validateInputMode();
        StringBuilder validateBothOff = new StringBuilder();
        validateBothOff.append("After validation:\n")
                .append(GameInputMode)
                .append("\n")
                .append(MenuInputMode)
                .append("\n");
        System.out.println(validateBothOff);


    } // end method

} // end enum
