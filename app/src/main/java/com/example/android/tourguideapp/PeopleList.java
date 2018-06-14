package com.example.android.tourguideapp;

import java.util.ArrayList;

/**
 * Created by RutiglianoL on 18/05/2018.
 * Represents a List of People of the Organization/Company
 */
public class PeopleList extends ArrayList {

    private ArrayList<People> peopleArrayList;
    {
        peopleArrayList = new ArrayList<>();
    }

    public PeopleList() {

        //peopleArrayList.add(new People(2,"Pippo","Rossi","Capo",0,"email@email.it",33333333,Constants.GENDER_MALE));

        //peopleArrayList.add(new People(0, Resources.getSystem().getString(R.string.people_name_1), Resources.getSystem().getString(R.string.people_surname_1), Resources.getSystem().getString(R.string.people_role_1), 0, Resources.getSystem().getString(R.string.people_email_1), 333333333, Constants.GENDER_MALE, R.drawable.ph0));
        /*peopleArrayList.add(new People(1, Resources.getSystem().getString(R.string.people_name_2), Resources.getSystem().getString(R.string.people_surname_2), Resources.getSystem().getString(R.string.people_role_2), 1, Resources.getSystem().getString(R.string.people_email_2), 333333333, Constants.GENDER_MALE));
        peopleArrayList.add(new People(2, Resources.getSystem().getString(R.string.people_name_3), Resources.getSystem().getString(R.string.people_surname_3), Resources.getSystem().getString(R.string.people_role_3), 1, Resources.getSystem().getString(R.string.people_email_3), 333333333, Constants.GENDER_FEMALE));
        peopleArrayList.add(new People(3, Resources.getSystem().getString(R.string.people_name_4), Resources.getSystem().getString(R.string.people_surname_4), Resources.getSystem().getString(R.string.people_role_4), 1, Resources.getSystem().getString(R.string.people_email_4), 333333333, Constants.GENDER_MALE));
        peopleArrayList.add(new People(4, Resources.getSystem().getString(R.string.people_name_5), Resources.getSystem().getString(R.string.people_surname_5), Resources.getSystem().getString(R.string.people_role_5), 0, Resources.getSystem().getString(R.string.people_email_5), 333333333, Constants.GENDER_FEMALE));
        peopleArrayList.add(new People(5, Resources.getSystem().getString(R.string.people_name_6), Resources.getSystem().getString(R.string.people_surname_6), Resources.getSystem().getString(R.string.people_role_6), 0, Resources.getSystem().getString(R.string.people_email_6), 333333333, Constants.GENDER_FEMALE));
        peopleArrayList.add(new People(6, Resources.getSystem().getString(R.string.people_name_7), Resources.getSystem().getString(R.string.people_surname_7), Resources.getSystem().getString(R.string.people_role_7), 1, Resources.getSystem().getString(R.string.people_email_7), 2222222, Constants.GENDER_MALE));
        peopleArrayList.add(new People(7, Resources.getSystem().getString(R.string.people_name_8), Resources.getSystem().getString(R.string.people_surname_8), Resources.getSystem().getString(R.string.people_role_8), 1, Resources.getSystem().getString(R.string.people_email_8), 2222222, Constants.GENDER_MALE));
        peopleArrayList.add(new People(8, Resources.getSystem().getString(R.string.people_name_9), Resources.getSystem().getString(R.string.people_surname_9), Resources.getSystem().getString(R.string.people_role_9), 1, Resources.getSystem().getString(R.string.people_email_9), 2222222, Constants.GENDER_FEMALE));
*/
    }

    //Returns the whole PeopleList
    public ArrayList<People> getList() {
        return peopleArrayList;
    }

    public String getPeopleMail(int id) {
        return peopleArrayList.get(id).getEmail();
    }

    public int getPeopleGender(int id) {
        return peopleArrayList.get(id).getGender();
    }

    public int getPeoplePhotoId(int id) {
        return peopleArrayList.get(id).getPhotoId();
    }

    public String getPeopleNameAndSurname(int id) { return peopleArrayList.get(id).getNameAndSurname(); }
}


