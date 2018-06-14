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

    //Creates an ArrayList of Event Objects used throughout the whole App
    // This is a workaround to solve the lack of a different way to get the information needed to instantiate the objects, for example from a local database
    // or through a HTTP Request using JSON or a similar data structure. That's the reason while Strings are hardcoded in this part of the code.
    // These Strings are not part of the Business Intelligence of the app, they are just a mockup of real data
    public EventList() {

        /*EventArrayList.add(new Event(0, "Webinar on ISO 45001", "Our ISO 45001:2018 Overview course delivered by webinar will provide details of the new terms, definitions and key requirements of ISO 45001:2018.\n" +
                "\n" +
                "The session will offer an in-depth insight into the origins of the standard, the main changes compared to OHSAS 18001, the High Level Structure and details of how to interpret and apply stakeholder requirements with regards to risk management.\n" +
                "\n" +
                "The course will provide world class instruction on how to understand ISO 45001:2018 delivered using an interactive online, live tutor led webinar.", "Via delle Fornaci 2", "Roma", R.drawable.img45001, 0, Utility.convertStringToDate("23-06-2018 15:00", "dd-MM-yyyy H:mm"), 2));
        EventArrayList.add(new Event(1, "Conference on Chemical Risk", "You are invited to share your experience with others by submitting a paper for the Hazards Australasia 2018 technical programme.\n" +
                "\n" +
                "The technical programme will be constructed around a compelling line-up of invited keynote speakers, who will provide a strategic view from industry, academe and the regulator. Technical presentations should review best practice and latest research in the functional areas that are fundamental to managing process safety effectively. Papers are encouraged from a range of industry sectors on the themes listed opposite.\n" +
                "\n" +
                "Hazards is an international event and whilst the conference is primarily focused on the Australasian chemical and process industries, contributions are welcomed from all regions where the process safety challenge is being addressed.", "Via della Maglianella 65", "Milano", R.drawable.convegno_rischio_chimico, 0, Utility.convertStringToDate("12-07-2018 09:00","dd-MM-yyyy H:mm"), 4));
  */
    }

    //Returns the whole EventList
    public ArrayList<Event> getList() {
        return EventArrayList;
    }
}
