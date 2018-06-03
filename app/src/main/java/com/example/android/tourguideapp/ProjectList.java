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

//We create an ArrayList of People Objects used throughout the whole App
    public ProjectList() {

        ProjectArrayList.add(new Project(0,"Virtual Reality Training", "Bla bla bla", R.drawable.project_vr_trainer, 0, Utility.convertStringToDate("30-09-2018","dd-MM-yyyy")));

    }

    //Returns the whole ProjectList
    public ArrayList<Project> getList() {
        return ProjectArrayList;
    }
}
