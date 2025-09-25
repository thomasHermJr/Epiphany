package org.epiphany.Enums.Systems.Background;

public enum EOrigins {

    NOBLE("Noble"),
    MERCHANT("Merchant"),
    WARRIOR("Warrior"),
    ARTISAN("Artisan"),
    FARMER("Farmer"),
    PRIEST("Priest"),
    HUNTER("Hunter"),
    INFANTRY("Infantry"),
    MEDIC("Medic"),
    ACADEMIC("Academic"),
    DIPLOMAT("Diplomat");

    private final String originName;

    EOrigins(String originName) {
        this.originName = originName;

    }

    public String getOriginName() {
        return originName;
    }
}
