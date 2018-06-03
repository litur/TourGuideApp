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

    /**
     * Constructs a new Site with values for id, name, city, address, description of the Site
     */
    public Site(int mId, String mName, String mCity, String mAddress, String mDescription) {

        id = mId;
        name = mName.trim();
        city = mCity.trim();
        address = mAddress.trim();
        description = mDescription.trim();
    }

    /**
     * Gets the Name of the site of the Company
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the Address of the site of the Company
     */
    public String getAddress() {
        return address;
    }

    /**
     * Gets the City of the site of the Company
     */
    public String getCity() {
        return city;
    }

    /**
     * Gets the Id of the site of the Company
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the description of the Site of the Company
     */
    public String getDescription() {
        return description;
    }
}


