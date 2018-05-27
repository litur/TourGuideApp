package com.example.android.tourguideapp;

/**
 * Created by RutiglianoL on 18/05/2018.
 * Represents a Site of the Organization/Company
 */

public class Site {

    private int id;
    private String name;
    private String city;
    private String address;
    private String description;

    public Site(int mId, String mName, String mCity, String mAddress, String mDescription) {

        id = mId;
        name = mName.trim();
        city = mCity.trim();
        address = mAddress.trim();
        description = mDescription.trim();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}


