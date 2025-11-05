package org.epiphany.Enums.Systems.Settings;

public enum ESettingsToggles { // start enum

    /*TODO: Add more toggle settings later*/

    /** Toggle Settings Enum
     * Each enum constant represents a toggleable setting in the application.
     * The setting can be either "On" (true) or "Off" (false).

     * Methods:
     * - getSettingName(): Returns the name of the setting.
     * - getIsOn(): Returns the current state of the setting.
     * - toggleSetting(): Toggles the state of the setting.
     * - toString(): Returns a string representation of the setting and its state.

     * Test Method:
     * - testESettingsToggles(): Tests the functionality of the enum.
     */


    FULLSCREEN("Fullscreen", false),
    VSYNC("VSync", false),
    SHOW_FPS("Show FPS", false),
    SHOW_SUBTITLES("Subtitles", true),
    MUTE_MUSIC("Mute Music", false),
    MUTE_SFX("Mute SFX", false);


    private final String settingName;
    private boolean isOn;

    ESettingsToggles(String settingName, boolean isOn) {
        this.settingName = settingName;
        this.isOn = isOn;
    } // end constructor

    public String getSettingName() {
        return settingName;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void toggleSetting() {
                this.isOn = !this.isOn;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(settingName).append(": ").append(isOn ? "On" : "Off");
        return sb.toString();

    }

} // end enum
