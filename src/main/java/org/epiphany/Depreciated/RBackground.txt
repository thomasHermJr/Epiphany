package org.epiphany.Records;

public record RBackground() {

    static String name;
    static byte age;
    static String Hometown;
    static String Origin;
    static String race;
    static String job;
    static String earlyLife; // Origin story
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

    public String getHometown() {
        return Hometown;
    }

    public void setHometown(String hometown) {
        RBackground.Hometown = hometown;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        RBackground.Origin = origin;
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
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n");
        sb.append("Age: ").append(age).append("\n");
        sb.append("Job: ").append(job).append("\n");
        sb.append("Hometown: ").append(Hometown).append("\n");
        sb.append("Race: ").append(race).append("\n\n\n");
        sb.append(earlyLife).append("\n\n");
        sb.append(currentLife);
        RBackground.description = sb.toString();
    }

    public String toString() {
        return description;
    }
}
