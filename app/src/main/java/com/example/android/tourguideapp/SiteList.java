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


//We create an ArrayList of Site Objects

    public SiteList() {

        siteArrayList.add(new Site(0, "Ufficio di Roma", "Rome", "Via Francesco Benaglia 13", "Gli uffici di Roma.."));
        siteArrayList.add(new Site(1, "Ufficio di Milano", "Milan", "Via Tolentino 2/A", "Gli uffici di Milano.."));
    }

    public String getName(int id) {
        return siteArrayList.get(id).getName();
    }

    public ArrayList<Site> getList() {
        return siteArrayList;
    }

    public String getAddress(int id) {
        return siteArrayList.get(id).getAddress();
    }

    public String getCity(int id) {
        return siteArrayList.get(id).getCity();
    }

    public String getDescritpion(int id) {
        return siteArrayList.get(id).getDescription();
    }

    public int getId(int id) {
        return siteArrayList.get(id).getId();
    }
}