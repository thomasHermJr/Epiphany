package org.epiphany.Records;

public record RBackground() {

    static String name;
    static byte age;
    static String origin;
    static String race;
    static String job;
    static String earlyLife;
    static String currentLife;
    static String description;

    /*Needs getters and setters*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        RBackground.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        RBackground.age = age;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        RBackground.origin = origin;
    }

    public String getRace() {
        return race;
    }

    public void setRace() {
        RBackground.race = race;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        RBackground.job = job;
    }

    public String getEarlyLife() {
        return earlyLife;
    }

    public void setEarlyLife(String earlyLife) {
        RBackground.earlyLife = earlyLife;
    }

    public String getCurrentLife() {
        return currentLife;
    }

    public void setCurrentLife(String currentLife) {
        RBackground.currentLife = currentLife;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription() {
        RBackground.description = "Name: " + name +
                "\nJob: " + job +
                "\nAge: " + age +
                "\nPlace of Origin: " + origin +
                "\n Race: " + race +
                "\n\n\n" + earlyLife +
                "\n\n" + currentLife;
    }

    public String toString() {
        return description;
    }
}
