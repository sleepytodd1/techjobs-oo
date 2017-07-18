package org.launchcode.models;

/**
 * Created by LaunchCode
 */
public enum JobFieldType {

    //something a user might do
    //represents the certain things we can search by

    EMPLOYER ("Employer"),
    LOCATION ("Location"),
    CORE_COMPETENCY ("Skill"),
    POSITION_TYPE ("Position Type"),
    ALL ("All");

    private final String name;

    JobFieldType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
