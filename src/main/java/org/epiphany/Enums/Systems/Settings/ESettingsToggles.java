package org.epiphany.Enums.Systems.Settings;

public enum ESettingsToggles { // start enum

    /*TODO: Add more toggle settings later*/

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

    public void toggleSetting(String settingName) {

        for (ESettingsToggles toggle : ESettingsToggles.values()) {
            if (toggle.getSettingName().equals(settingName)) {
                isOn = !toggle.isOn;

            } // end if
        } // end for
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(settingName).append(": ").append(isOn ? "On" : "Off");
        return sb.toString();

    }
} // end enum
