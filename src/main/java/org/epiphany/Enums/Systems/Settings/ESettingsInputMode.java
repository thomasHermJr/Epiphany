package org.epiphany.Enums.Systems.Settings;

import java.util.Objects;

public enum ESettingsInputMode { // start enum

    KEYBOARD_MOUSE("Keyboard & Mouse"),
    GAMEPAD("Gamepad");

    private final String inputName;

    ESettingsInputMode(String inputName) {

        if (!Objects.equals(inputName, "Keyboard & Mouse") && !Objects.equals(inputName, "Gamepad")) { // validate input mode
            inputName = "Keyboard & Mouse"; // default to Keyboard & Mouse if invalid
        } // end if

        this.inputName = inputName;

    } // end constructor

    public String getInputName() {
        return inputName;
    }

} // end enum
