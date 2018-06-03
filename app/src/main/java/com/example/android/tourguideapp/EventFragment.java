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

    // gets the ArrayList of Event created in the SplashActivity
    ArrayList<Event> events = SplashActivity.MEVENT.getList();

    public EventFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);
        EventAdapter adapter = new EventAdapter(getActivity(), events);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Since we use cardview in this Fragment we hide the Divider in the listView
        listView.setDividerHeight(0);

        listView.setAdapter(adapter);
        return rootView;
    }

}
