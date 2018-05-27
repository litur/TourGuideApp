package com.example.android.tourguideapp;

/**
 * Created by RutiglianoL on 18/05/2018.
 * Represents a People of the Organization/Company
 */

public class People {

    private int id;
    private String name;
    private String surname;
    private String role;
    private String email;
    private int locationId;
    private int phone;
    private int gender;
    private int photoId;

    /**
     * Constructs a new People with values for name, surname, role, locationId, Email, phone, gender
     */
    public People(int mId, String mName, String mSurname, String mRole, int mLocationId, String mEmail, int mPhone, int mGender, int mPhotoid) {

        id = mId;
        name = mName;
        surname = mSurname;
        role = mRole;
        locationId = mLocationId;
        email = mEmail;
        phone = mPhone;
        gender = mGender;
        photoId = mPhotoid;
    }

    /**
     * Constructs a new People with values for name, surname, role, locationId, Email, phone, gender
     */
    public People(int mId, String mName, String mSurname, String mRole, int mLocationId, String mEmail, int mPhone, int mGender) {

        id = mId;
        name = mName;
        surname = mSurname;
        role = mRole;
        locationId = mLocationId;
        email = mEmail;
        phone = mPhone;
        gender = mGender;
        photoId = -1;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getNameAndSurname() {
        return name + " " + surname;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public int getLocationId() {
        return locationId;
    }

    public int getPhone() {
        return phone;
    }

    public int getGender() {
        return gender;
    }

    public int getPhotoId() {
        return photoId;
    }
}
