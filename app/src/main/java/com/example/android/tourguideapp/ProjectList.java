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

        ProjectArrayList.add(new Project(0, "Virtual Reality Training", "Although virtual reality is receiving a lot of attention these days thanks to devices such as Oculus Rift and Gear VR, VR based training has been used by companies, academia, and military for a long time. Essentially VR based training puts the trainee in a 3D environment relevant to the subject matter via a specially designed audio-visual headset.\n" +
                "\n" +
                "The advantages of such an approach should be readily apparent. Not only can it cut out distractions, but it can totally immerse the trainee in the simulation, to the point where they begin to respond to it just as they would in a real-life situation.\n" +
                "\n" +
                "In other words, not only will trainees acquire information relevant to their job, but they can start practicing their skills right from day one.", R.drawable.project_vr_trainer, 0, Utility.convertStringToDate("30-09-2018", "dd-MM-yyyy"), ""));

        ProjectArrayList.add(new Project(1, "MSDS Software", "Manage your organization's library of safety data sheets using Chemical Safety's cloud-based SDS management software. Employees can easily search and print manufacturer specific SDS's.", R.drawable.project_sirios_chem, 0, Utility.convertStringToDate("30-10-2018", "dd-MM-yyyy"), "http://www.sirios-chem.igeam.it/"));

    }

    //Returns the whole ProjectList
    public ArrayList<Project> getList() {
        return ProjectArrayList;
    }
}
