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


    public ProjectFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        final ArrayList<Project> projects = new ArrayList<>();

        projects.add(new Project(0, getString(R.string.project_name_1), getString(R.string.project_description_1), R.drawable.project_vr_trainer, getString(R.string.project_1_contact_person), Utility.convertStringToDate("30-09-2018", "dd-MM-yyyy"), ""));

        projects.add(new Project(1, getString(R.string.project_name_2), getString(R.string.project_description_2), R.drawable.project_sirios_chem, getString(R.string.project_2_contact_person), Utility.convertStringToDate("30-10-2018", "dd-MM-yyyy"), getString(R.string.project_url_2)));
        
        ProjectAdapter adapter = new ProjectAdapter(getActivity(), projects);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Since we use cardview in this Fragment we hide the Divider in the listView
        listView.setDividerHeight(0);

        listView.setAdapter(adapter);
        return rootView;
    }

}
