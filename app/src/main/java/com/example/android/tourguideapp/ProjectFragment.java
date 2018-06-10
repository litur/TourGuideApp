package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass to display a list of Projects.
 */
public class ProjectFragment extends Fragment {

    // gets the ArrayList of People created in the SplashActivity
    ArrayList<Project> projects = SplashActivity.MPROJECT.getList();

    public ProjectFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        ProjectAdapter adapter = new ProjectAdapter(getActivity(), projects);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Since we use cardview in this Fragment we hide the Divider in the listView
        listView.setDividerHeight(0);

        listView.setAdapter(adapter);
        return rootView;
    }

}
