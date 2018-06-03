package com.example.android.tourguideapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.CalendarContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

public class EventAdapter extends ArrayAdapter {
    public EventAdapter(@NonNull Activity context, ArrayList<Event> Event) {
        super(context, 0, Event);
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
    @SuppressLint("SetTextI18n")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fragment_event, parent, false);
        }

        // Gets the {@link People} object located at this position in the list
        final Event currentEvent = (Event) getItem(position);

        // Finds the TextView for the Event Title  and sets the value
        TextView eventTitle = listItemView.findViewById(R.id.eventTitle);
        eventTitle.setText(currentEvent.getName());

        // Finds the TextView for the Event Description and sets the value
        TextView eventDescription = listItemView.findViewById(R.id.eventDescription);
        eventDescription.setText(currentEvent.getDescription());

        // Finds the TextView for the Event Location and sets the value
        TextView eventLocation = listItemView.findViewById(R.id.eventLocation);
        eventLocation.setText(currentEvent.getLocationAddress() + " - " + currentEvent.getLocationCity());

        //Finds the ImageButton for the map and sets an onClickListener to open the Map for the EventLocation
        ImageButton mapButton = listItemView.findViewById(R.id.eventMapButton);
        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mapAddress = Utility.formatStringforMapIntent("", currentEvent.getLocationAddress(), currentEvent.getLocationCity());

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(mapAddress));

                // Checks if an app to handle the intent Exists
                PackageManager packageManager = getContext().getPackageManager();
                List<ResolveInfo> activities = packageManager.queryIntentActivities(browserIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                boolean isIntentSafe = activities.size() > 0;
                // If at least a proper App exists, the Activity is started

                Log.d("CLICK ON EVENT MAP", (String.valueOf(isIntentSafe)));
                if (isIntentSafe) {
                    getContext().startActivity(browserIntent);
                }
            }
        });

        // Finds the TextView for the Event date and sets the value
        TextView eventDate = listItemView.findViewById(R.id.eventDate);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYYY H.mm");
        String myEventDate = formatter.format(currentEvent.getEventDate());
        eventDate.setText(myEventDate);

        // Finds the TextView for the Event contact and sets the value
        TextView eventContact = listItemView.findViewById(R.id.projectContact);
        eventContact.setText(SplashActivity.MPEOPLE.getPeopleNameAndSurname(currentEvent.getEventContatctPersonId()));

        // Finds the ImageView for the Event Image and sets the value for the resource
        ImageView eventImage = listItemView.findViewById(R.id.projectImg);
        eventImage.setImageResource(currentEvent.getEventRawId());

        //Finds the ImageButton for the calendar and sets an onClickListener to create a Calendar event for the Event
        ImageButton calButton = listItemView.findViewById(R.id.eventCalendarBtn);

        calButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Long mDateinmillis = currentEvent.getEventDate().getTime();

                Log.d("CLICK ON CALENDAR BTN", String.valueOf(mDateinmillis));
                Intent calendarIntent = new Intent(Intent.ACTION_EDIT);
                calendarIntent.setType("vnd.android.cursor.item/event");
                
                calendarIntent.putExtra(CalendarContract.Events.TITLE, currentEvent.getName());
                calendarIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, currentEvent.getLocationCity() + ", " + currentEvent.getLocationAddress());
                calendarIntent.putExtra(CalendarContract.Events.ORGANIZER,"l.rutigliano@igeam.it");
                calendarIntent.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY,"false");
                calendarIntent.putExtra(CalendarContract.Events.EVENT_TIMEZONE, TimeZone.getDefault());
                calendarIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, mDateinmillis);
                calendarIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME, mDateinmillis + currentEvent.getDuration() * 1000 * 3600);

                // Making it private and shown as busy
                calendarIntent.putExtra(CalendarContract.Events.ACCESS_LEVEL, CalendarContract.Events.ACCESS_PRIVATE);
                calendarIntent.putExtra(CalendarContract.Events.AVAILABILITY, CalendarContract.Events.AVAILABILITY_BUSY);

                // Checks if an app to handle the intent Exists
                PackageManager packageManager = getContext().getPackageManager();
                List<ResolveInfo> activities = packageManager.queryIntentActivities(calendarIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                boolean isIntentSafe = activities.size() > 0;
                // If at least a proper App exists, the Activity is started

                Log.d("CLICK ON EVENT MAP", (String.valueOf(isIntentSafe)));
                if (isIntentSafe) {
                    getContext().startActivity(calendarIntent);
                }
            }
        });
        return listItemView;
    }
}
