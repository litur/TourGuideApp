package com.example.android.tourguideapp;

import java.util.ArrayList;

/**
 * Created by RutiglianoL on 28/05/2018.
 * Represents a List of Projects of the Organization/Company
 */
public class ProjectList extends ArrayList {

    private ArrayList<Project> ProjectArrayList;

    {
        ProjectArrayList = new ArrayList<Project>();
    }

    //We create an ArrayList of Project Objects used throughout the whole App
    // This is a workaround to solve the lack of a different way to get the information needed to instantiate the objects, for example from a local database
    // or through a HTTP Request using JSON or a similar data structure. That's the reason while Strings are hardcoded in this part of the code.
    // These Strings are not part of the Business Intelligence of the app, they are just a mockup of real data
    public ProjectList() {


    }

    //Returns the whole ProjectList
    public ArrayList<Project> getList() {
        return ProjectArrayList;
    }
}
