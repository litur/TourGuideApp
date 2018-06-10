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