package com.example.android.tourguideapp;

import java.util.ArrayList;

/**
 * Created by RutiglianoL on 18/05/2018.
 * Represents a List of People of the Organization/Company
 */

public class EventList extends ArrayList {

    private ArrayList<Event> EventArrayList;

    {
        EventArrayList = new ArrayList<Event>();
    }

    //Creates an ArrayList of Event Objects

    public EventList() {

        EventArrayList.add(new Event(0, "Webinar on ISO 45001", "Our ISO 45001:2018 Overview course delivered by webinar will provide details of the new terms, definitions and key requirements of ISO 45001:2018.\n" +
                "\n" +
                "The session will offer an in-depth insight into the origins of the standard, the main changes compared to OHSAS 18001, the High Level Structure and details of how to interpret and apply stakeholder requirements with regards to risk management.\n" +
                "\n" +
                "The course will provide world class instruction on how to understand ISO 45001:2018 delivered using an interactive online, live tutor led webinar.", "Via delle Fornaci 2", "Roma", R.drawable.img45001, 0, Utility.convertStringToDate("23-06-2018"), 2));
        EventArrayList.add(new Event(1, "Conference on Chemical Risk", "Bla bla bla", "Via della Maglianella 65", "Milano", R.drawable.ph0, 0, Utility.convertStringToDate("12-07-2018"), 4));
    }

    public ArrayList<Event> getList() {
        return EventArrayList;
    }
}
