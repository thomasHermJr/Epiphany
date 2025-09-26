package org.epiphany.Enums.Systems.Settings;

public enum ESettingsToggles { // start enum

    FULLSCREEN("Fullscreen", false),
    VSYNC("VSync", true),
    SHOW_FPS("Show FPS", false);
    /*Add more later*/

    private final String settingName;
    private final boolean toggleState;

    ESettingsToggles(String settingName, boolean toggleState) {
        this.settingName = settingName;
        this.toggleState = toggleState;
    } // end constructor


} // end enum
