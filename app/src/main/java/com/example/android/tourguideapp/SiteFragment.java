package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass to display a list of Sites.
 */
public class SiteFragment extends Fragment {

    // gets the ArrayList of People created in the SplashActivity
    ArrayList<Site> sites = SplashActivity.MSITE.getList();

    public SiteFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        SiteAdapter adapter = new SiteAdapter(getActivity(), sites);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;

    }
}
