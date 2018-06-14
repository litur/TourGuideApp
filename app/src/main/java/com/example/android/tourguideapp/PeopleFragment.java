package com.example.android.tourguideapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass to display a list of People.
 */
public class PeopleFragment extends Fragment {

    Context mContext;
    // gets the ArrayList of People created in the SplashActivity

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public PeopleFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mContext = getContext();

        // gets the ArrayList of People created in the SplashActivity
        final ArrayList<People> people = new ArrayList<>();

        people.add(new People(0, getString(R.string.people_name_1), getString(R.string.people_surname_1), getString(R.string.people_role_1), getString(R.string.siteName1), getString(R.string.people_email_1), 333333333, Constants.GENDER_MALE, R.drawable.ph0));
        people.add(new People(1, getString(R.string.people_name_2), getString(R.string.people_surname_2), getString(R.string.people_role_2), getString(R.string.siteName2), getString(R.string.people_email_2), 333333333, Constants.GENDER_MALE));
        people.add(new People(2, getString(R.string.people_name_3), getString(R.string.people_surname_3), getString(R.string.people_role_3), getString(R.string.siteName2), getString(R.string.people_email_3), 333333333, Constants.GENDER_FEMALE));
        people.add(new People(3, getString(R.string.people_name_4), getString(R.string.people_surname_4), getString(R.string.people_role_4), getString(R.string.siteName2), getString(R.string.people_email_4), 333333333, Constants.GENDER_MALE));
        people.add(new People(4, getString(R.string.people_name_5), getString(R.string.people_surname_5), getString(R.string.people_role_5), getString(R.string.siteName1), getString(R.string.people_email_5), 333333333, Constants.GENDER_FEMALE));
        people.add(new People(5, getString(R.string.people_name_6), getString(R.string.people_surname_6), getString(R.string.people_role_6), getString(R.string.siteName1), getString(R.string.people_email_6), 333333333, Constants.GENDER_FEMALE));
        people.add(new People(6, getString(R.string.people_name_7), getString(R.string.people_surname_7), getString(R.string.people_role_7), getString(R.string.siteName2), getString(R.string.people_email_7), 2222222, Constants.GENDER_MALE));
        people.add(new People(7, getString(R.string.people_name_8), getString(R.string.people_surname_8), getString(R.string.people_role_8), getString(R.string.siteName2), getString(R.string.people_email_8), 2222222, Constants.GENDER_MALE));
        people.add(new People(8, getString(R.string.people_name_9), getString(R.string.people_surname_9), getString(R.string.people_role_9), getString(R.string.siteName2), getString(R.string.people_email_9), 2222222, Constants.GENDER_FEMALE));

        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        PeopleAdapter adapter = new PeopleAdapter(getActivity(), people);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
