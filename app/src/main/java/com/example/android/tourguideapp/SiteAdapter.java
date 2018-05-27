package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SiteAdapter extends ArrayAdapter<Site> {

    public SiteAdapter(Activity context, ArrayList<Site> Site) {
        super(context, 0, Site);

    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public android.view.View getView(final int position, @Nullable View convertView, @NonNull android.view.ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fragment_site, parent, false);
        }

        // Gets the {@link Site} object located at this position in the list
        final Site currentSite = getItem(position);

        // Finds the TextView for the Site name and sets the value
        TextView siteNameTextView = listItemView.findViewById(R.id.site_name);
        siteNameTextView.setText(currentSite.getName());

        // Finds the TextView for the Site address and sets the value
        TextView AddressTextView = listItemView.findViewById(R.id.site_address);
        AddressTextView.setText(currentSite.getAddress());

        //Finds the ImageButton for the map and sets an onClickListener to open a Map
        ImageButton mapButton = listItemView.findViewById(R.id.mapIcon);

        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mapAddress = Utility.formatStringforMapIntent(Constants.COMPANY_NAME, currentSite.getAddress(), currentSite.getCity());

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(mapAddress));

                // Checks if an app to handle the intent Exists
                PackageManager packageManager = getContext().getPackageManager();
                List<ResolveInfo> activities = packageManager.queryIntentActivities(browserIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                boolean isIntentSafe = activities.size() > 0;
                // If at least a proper App exists, the Activity is started

                Log.d("CLICK", (String.valueOf(isIntentSafe)));
                if (isIntentSafe) {
                    getContext().startActivity(browserIntent);
                }
            }
        });


        // Return the whole list item layout
        // so that it can be shown in the ListView
        return listItemView;
    }
}