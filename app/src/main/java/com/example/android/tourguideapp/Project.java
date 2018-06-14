package com.example.android.tourguideapp;

import java.util.Date;

/**
 * Created by RutiglianoL on 28/05/2018.
 * Represents a Project of the Organization/Company
 */
public class Project {

    private int id;
    private String name;
    private String description;
    private int projectRawId;
    private String projectContatctPerson;
    private Date dueDate;
    private String url; // the url of a website with the details for the Project

    /**
     * Constructs a new Project with values for name, description, rawId, contactPerson
     */
    public Project(int mId, String mName, String mDescription, int mProjectRawId, String mProjectContatctPerson, Date mDueDate, String mUrl) {

        id = mId;
        name = mName;
        description = mDescription;
        projectRawId = mProjectRawId;
        projectContatctPerson = mProjectContatctPerson;
        dueDate = mDueDate;
        url = mUrl;

    }

    /**
     * Gets the Name of the Project
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the Description of the Project
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the id of the Contact Person of the Project
     */
    public String getProjectContatctPerson() {
        return projectContatctPerson;
    }

    /**
     * Gets the id of the Raw image for the Project
     */
    public int getProjectRawId() {
        return projectRawId;
    }

    /**
     * Gets the due Date of the Project
     */
    public Date getDueDate() { return dueDate;  }

    /**
     * Gets the due url with the details of the  of the Project
     */
    public String getUrl() {
        return url;
    }
}
