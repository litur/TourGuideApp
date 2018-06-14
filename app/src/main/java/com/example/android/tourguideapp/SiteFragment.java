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
 * A simple {@link Fragment} subclass to display a list of Sites.
 */
public class SiteFragment extends Fragment {

    // gets the ArrayList of People created in the SplashActivity
    SiteList sites;

    Context mContext;

    public SiteFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mContext = getContext();
        final ArrayList<Site> mySiteList = new ArrayList<>();

        mySiteList.add(new Site(0, getString(R.string.siteName1), getString(R.string.siteCity1), getString(R.string.siteAddress1), getString(R.string.siteDescription1)));
        mySiteList.add(new Site(1, getString(R.string.siteName2), getString(R.string.siteCity2), getString(R.string.siteAddress2), getString(R.string.siteDescription2)));
        mySiteList.add(new Site(2, getString(R.string.siteName3), getString(R.string.siteCity3), getString(R.string.siteAddress3), getString(R.string.siteDescription3)));


        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        SiteAdapter adapter = new SiteAdapter(getActivity(), mySiteList);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;

    }
}
