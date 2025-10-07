package org.epiphany.Enums.Systems.Settings;

import java.util.Objects;

public enum ESettingsInputMode { // start enum

    KEYBOARD_MOUSE("Keyboard & Mouse", true),
    GAMEPAD("Gamepad", false);

    private final String inputName;
    private boolean isOn;


    ESettingsInputMode(String inputName, boolean isOn) {

        if (!Objects.equals(inputName, "Keyboard & Mouse") && !Objects.equals(inputName, "Gamepad")) { // validate input mode
            inputName = "Keyboard & Mouse"; // default to Keyboard & Mouse if invalid
        } // end if

        this.inputName = inputName;
        this.isOn = isOn;

    } // end constructor

    public String getInputName() {
        return inputName;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void toggleInputMode() {

                // Only one input mode can be active at a time, so toggle both modes

                ESettingsInputMode.GAMEPAD.isOn = !ESettingsInputMode.GAMEPAD.isOn;
                ESettingsInputMode.KEYBOARD_MOUSE.isOn = !ESettingsInputMode.KEYBOARD_MOUSE.isOn;

        if ((!ESettingsInputMode.KEYBOARD_MOUSE.isOn && !ESettingsInputMode.GAMEPAD.isOn) ||
                (ESettingsInputMode.KEYBOARD_MOUSE.isOn && ESettingsInputMode.GAMEPAD.isOn)) {// ensure Exactly one mode is always active

            System.out.println("Error calculating input mode. Defaulting to Keyboard & Mouse");

            ESettingsInputMode.KEYBOARD_MOUSE.isOn = true; // default to Keyboard & Mouse
            ESettingsInputMode.GAMEPAD.isOn = false;

        } // end if

    } // end method

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(inputName).append(": ").append(isOn ? "On" : "Off");
        return sb.toString();

    }

} // end enum
