package org.epiphany.Records;

public record RBackground() {

    static String name;
    static byte age;
    static String origin;
    static String race;
    static String job;
    static String earlyLife;
    static String currentLife;
    static String description = "Name: " + name +
                         "Age: " + age +
                         "\nPlace of Origin: " + origin +
                         "\nRace: " + race +
                         "\nJob: " + job +
                         "\n\n\n" + earlyLife +
                         "\n\n" + currentLife;


    /*Needs getters and setters*/

    public String toString() {
        return description;
    }
}
