package com.example.android.tourguideapp;

import java.util.ArrayList;

/**
 * Created by RutiglianoL on 18/05/2018.
 * Represents a list of Site of the Organization/Company
 */

public class SiteList extends ArrayList {

    private ArrayList<Site> siteArrayList;


    public SiteList(ArrayList<Site> myList) {

        siteArrayList = myList;
    }

    public String getName(int id) {
        return siteArrayList.get(id).getName();
    }

    //Returns the whole SiteList
    public ArrayList<Site> getList() {
        return siteArrayList;
    }

}