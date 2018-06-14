package com.example.android.tourguideapp;

/**
 * Created by RutiglianoL on 18/05/2018.
 * Represents a People/Person of the Organization/Company
 */

public class People {

    private int id;
    private String name;
    private String surname;
    private String role;
    private String email;
    private String location;
    private int phone;
    private int gender;
    // assign photoId -1 if you want to use default avatar icons
    private int photoId;

    /**
     * Constructs a new People with values for name, surname, role, location, Email, phone, gender
     */
    public People(int mId, String mName, String mSurname, String mRole, String mLocation, String mEmail, int mPhone, int mGender, int mPhotoid) {

        id = mId;
        name = mName;
        surname = mSurname;
        role = mRole;
        location = mLocation;
        email = mEmail;
        phone = mPhone;
        gender = mGender;
        photoId = mPhotoid;
    }

    /**
     * Constructs a new People with values for name, surname, role, locationId, Email, phone, gender
     */
    public People(int mId, String mName, String mSurname, String mRole, String mLocation, String mEmail, int mPhone, int mGender) {

        id = mId;
        name = mName;
        surname = mSurname;
        role = mRole;
        location = mLocation;
        email = mEmail;
        phone = mPhone;
        gender = mGender;
        photoId = -1;
    }

    /**
     * Gets the id of the People of the Company
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the name the People of the Company
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the Surname of the People of the Company
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Gets the Role of the People of the Company
     */
    public String getRole() {
        return role;
    }

    /**
     * Gets a String formed by the concatenated name and surname of the People of the Company
     */
    public String getNameAndSurname() {
        return name + " " + surname;
    }

    /**
     * Gets the Surname of the People of the Company
     */
    public String getEmail() {
        return email;
    }

    /**
     * Gets the Location of the People of the Company
     */
    public String getLocation() {
        return location;
    }

    /**
     * Gets the Phonr number of the People of the Company
     */
    public int getPhone() {
        return phone;
    }

    /**
     * Gets the Gender of the People of the Company
     */
    public int getGender() {
        return gender;
    }

    /**
     * Gets the Id of the Raw for the Photo of the People
     */
    public int getPhotoId() {
        return photoId;
    }
}
