package com.example.android.tourguideapp;

import java.util.ArrayList;

/**
 * Created by RutiglianoL on 18/05/2018.
 * Represents a list of Site of the Organization/Company
 */

public class SiteList extends ArrayList {

    private ArrayList<Site> siteArrayList;

    {
        siteArrayList = new ArrayList<Site>();
    }


//We create an ArrayList of Site Objects used throughout the whole App
// This is a workaround to solve the lack of a different way to get the information needed to instantiate the objects, for example from a local database
// or through a HTTP Request using JSON or a similar data structure. That's the reason while Strings are hardcoded in this part of the code.
// These Strings are not part of the Business Intelligence of the app, they are just a mockup of real data

    public SiteList() {

        siteArrayList.add(new Site(0, "Rome Office", "Rome", "Via Francesco Benaglia 13", "Rome offices are located in..."));
        siteArrayList.add(new Site(1, "Milan Office", "Milan", "Via Tolentino 2/A", "Milan offices are located in..."));
        siteArrayList.add(new Site(2, "Melfi Labs", "Ravenna", "Via Aldo Moro 22", "Melfi Labs are located in"));
    }

    public String getName(int id) {
        return siteArrayList.get(id).getName();
    }

    //Returns the whole SiteList
    public ArrayList<Site> getList() {
        return siteArrayList;
    }

}