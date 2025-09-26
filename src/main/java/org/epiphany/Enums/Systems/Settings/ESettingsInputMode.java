package org.epiphany.Enums.Systems.Settings;

public enum ESettingsInputMode { // start enum

    KEYBOARD_MOUSE("Keyboard & Mouse"),
    GAMEPAD("Gamepad");

    private final String inputName;

    ESettingsInputMode(String inputName) {
        
        if (inputName != "Keyboard & Mouse" && inputName != "Gamepad") { // validate input mode
            inputName = "Keyboard & Mouse"; // default to Keyboard & Mouse if invalid
        } // end if

        this.inputName = inputName;

    } // end constructor

    public String getInputName() {
        return inputName;
    }

} // end enum
