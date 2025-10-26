package org.epiphany.Enums.Systems.Character;

public enum ECharacterJobs {

    PLACEHOLDER_JOB("Placeholder Job");

    private final String jobName;

    ECharacterJobs(String jobName) {
        this.jobName = jobName;
    }

    public String getJobName() {
        return jobName;
    }
}
