package com.example.android.tourguideapp;

import java.util.Date;

/**
 * Created by RutiglianoL on 18/05/2018.
 * Represents an Event held by the Organization/Company
 */
public class Event {

    private int id;
    private String name;
    private String description;
    private String locationAddress;
    private String locationCity;
    private int eventRawId;
    private int eventContatctPersonId;
    private Date eventDate;
    private int duration;

    /**
     * Constructs a new Event with  values for in, name, description, address, city, rawId, ContactPerson, date, duration in hours of the Event
     */
    public Event(int mId, String mName, String mDescription, String mLocationAddress, String mLocationCity, int mEventRawId, int mEventContatctPersonId, Date mEventDate, int mDuration) {
        id = mId;
        name = mName;
        description = mDescription;
        locationAddress = mLocationAddress;
        locationCity = mLocationCity;
        eventRawId = mEventRawId;
        eventContatctPersonId = mEventContatctPersonId;
        eventDate = mEventDate;
        duration = mDuration;
    }

    /**
     * Gets the City of the ContactPerson of the Event
     */
    public int getEventContatctPersonId() {
        return eventContatctPersonId;
    }

    /**
     * Gets the ID of the Event
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the Description of the Event
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the Name of the Event
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the Location of the Event
     */
    public String getLocationAddress() {
        return locationAddress;
    }

    /**
     * Gets the City of the Event
     */
    public String getLocationCity() {
        return locationCity;
    }

    /**
     * Gets the RawId of the Event
     */
    public int getEventRawId() {
        return eventRawId;
    }

    /**
     * Gets the Date of the Event
     */
    public Date getEventDate() {
        return eventDate;
    }

    /**
     * Gets the Duration in hours of the Event
     */
    public int getDuration() {
        return duration;
    }
}
