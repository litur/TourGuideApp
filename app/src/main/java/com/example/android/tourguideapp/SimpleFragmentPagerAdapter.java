package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    /**
     * Create a new {@link SimpleFragmentPagerAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {

        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment myFragment = null;
        switch (position) {
            case 0:
                myFragment = new PeopleFragment();
                break;
            case 1:
                myFragment = new SiteFragment();
                break;
            case 2:
                myFragment = new EventFragment();
                break;
            case 3:
                myFragment = new ProjectFragment();
                break;
        }
        return myFragment;
    }

    // Specifies the number of fragments to be handled by the adapter
    @Override
    public int getCount() {
        return 4;
    }

    // Gets the name of the Page/Fragmet to be shown in the Tab header
    @Override
    public String getPageTitle(int position) {
        String mPageTitle = "";
        switch (position) {
            case 0:
                mPageTitle = mContext.getString(R.string.people);
                break;
            case 1:
                mPageTitle = mContext.getString(R.string.sites);
                break;
            case 2:
                mPageTitle = mContext.getString(R.string.events);
                break;
            case 3:
                mPageTitle = mContext.getString(R.string.projects);
                break;
        }
        return mPageTitle;
    }

}
