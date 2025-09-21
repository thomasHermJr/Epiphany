package org.epiphany.Records;

public record RBackground() {

    static byte age;
    static String origin;
    static String race;
    static String job;
    static String earlyLife;
    static String currentLife;
    static String description = "Age: " + age +
                         "\nPlace of Origin: " + origin +
                         "\nRace: " + race +
                         "\nJob: " + job +
                         "\n\n\n" + earlyLife +
                         "\n\n" + currentLife;

    public String toString() {
        return description;
    }
}
