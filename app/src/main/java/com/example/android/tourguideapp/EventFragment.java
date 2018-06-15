package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass to display a list of Events.
 */
public class EventFragment extends Fragment {

    public EventFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Creates an ArrayList of Event Objects
        final ArrayList<Event> events = new ArrayList<>();
        events.add(new Event(0, getString(R.string.event_name_0), getString(R.string.event_description_0), getString(R.string.event_location_address_0), getString(R.string.event_city_0), R.drawable.img45001, "Frank Pearson", Utility.convertStringToDate("23-06-2018 15:00", "dd-MM-yyyy H:mm"), 2));
        events.add(new Event(1, getString(R.string.event_name_1), getString(R.string.event_description_1), getString(R.string.event_location_address_1), getString(R.string.event_city_1), R.drawable.convegno_rischio_chimico, "Mary Anderson", Utility.convertStringToDate("12-07-2018 09:00", "dd-MM-yyyy H:mm"), 4));

        View rootView = inflater.inflate(R.layout.list_layout, container, false);
        EventAdapter adapter = new EventAdapter(getActivity(), events);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Since we use cardview in this Fragment we hide the Divider in the listView
        listView.setDividerHeight(0);

        listView.setAdapter(adapter);
        return rootView;
    }

}
