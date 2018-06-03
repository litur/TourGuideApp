package com.example.android.tourguideapp;

import java.util.ArrayList;

/**
 * Created by RutiglianoL on 18/05/2018.
 * Represents a List of People of the Organization/Company
 */
public class PeopleList extends ArrayList {

    private ArrayList<People> peopleArrayList;

    {
        peopleArrayList = new ArrayList<People>();
    }

    //We create an ArrayList of People Objects used throughout the whole App

    public PeopleList() {

        peopleArrayList.add(new People(0, "Lorenzo", "Rutigliano", "RD Manager", 0, "l.rutigliano@igeam.it", 333333333, Constants.GENDER_MALE, R.drawable.ph0));
        peopleArrayList.add(new People(1, "Piero", "Blasetti", "HS Project Manager", 1, "p.blasetti@igeam.it", 333333333, Constants.GENDER_MALE));
        peopleArrayList.add(new People(2, "Carol", "Brown", "Training Project Manager", 1, "c.brown@igeam.it", 333333333, Constants.GENDER_FEMALE));
        peopleArrayList.add(new People(3, "Frank", "Blaze", "HS Consultant", 1, "f.blaze@igeam.it", 333333333, Constants.GENDER_MALE));
        peopleArrayList.add(new People(4, "Michelle", "Black", "HS Project Manager", 0, "m.black@igeam.it", 333333333, Constants.GENDER_FEMALE));
        peopleArrayList.add(new People(5, "Laura", "Filmore", "Human Resources", 0, "l.filmore@igeam.it", 333333333, Constants.GENDER_FEMALE));
        peopleArrayList.add(new People(6, "Alex", "Del Grande", "Finance", 1, "a.delgrande@igeam.it", 2222222, Constants.GENDER_MALE));
        peopleArrayList.add(new People(7, "Michael", "Giacchino", "Marketing", 1, "m.gioacchino@igeam.it", 2222222, Constants.GENDER_MALE));
        peopleArrayList.add(new People(8, "Anna", "Graemes", "Marketing", 1, "a.graemes@igeam.it", 2222222, Constants.GENDER_FEMALE));
    }

    //Returns the whole PeopleList
    public ArrayList<People> getList() {
        return peopleArrayList;
    }

    public String getPeopleName(int id) {
        return peopleArrayList.get(id).getName();
    }

    public String getPeopleRole(int id) {
        return peopleArrayList.get(id).getRole();
    }

    public String getPeopleSurname(int id) {
        return peopleArrayList.get(id).getSurname();
    }

    public int getPeoplePhone(int id) {
        return peopleArrayList.get(id).getPhone();
    }

    public int getPeopleGender(int id) {
        return peopleArrayList.get(id).getGender();
    }

    public int getPeoplePhotoId(int id) {
        return peopleArrayList.get(id).getPhotoId();
    }

    public String getPeopleNameAndSurname(int id) { return peopleArrayList.get(id).getNameAndSurname(); }
}


