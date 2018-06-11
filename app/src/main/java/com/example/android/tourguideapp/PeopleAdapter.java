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
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.example.android.tourguideapp.SplashActivity.MPEOPLE;


public class PeopleAdapter extends ArrayAdapter<People> {
    public PeopleAdapter(Activity context, ArrayList<People> People) {
        super(context, 0, People);
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
                    R.layout.fragment_people, parent, false);
        }

        // Gets the {@link People} object located at this position in the list
        final People currentPeople = (People) getItem(position);

        Log.d("People Fragment", "Name" + currentPeople.getName());
        // Finds the TextView for the Name and Surname of the people and sets the value
        TextView nameSurnameView = listItemView.findViewById(R.id.people_name_surname);
        assert currentPeople != null;

        nameSurnameView.setText(currentPeople.getNameAndSurname());

        // Finds the TextView for the Role and sets the value
        TextView roleTextView = listItemView.findViewById(R.id.people_role);
        roleTextView.setText(currentPeople.getRole());

        // Finds the TextView for the Site name and sets the value
        TextView siteTextView = listItemView.findViewById(R.id.people_location);
        siteTextView.setText(SplashActivity.MSITE.getName(currentPeople.getLocationId()));

        // Finds the ImageButton for the sending emails
        ImageButton btnMail = listItemView.findViewById(R.id.mailIcon);

        // sets an onClickListener on the mail button to send an email
        btnMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // The code in this method will be executed when the Mail Button is clicked on.
                Log.d("CLICK", "Ho cliccato");

                // specifying SENDTO for the Intent makes sure that only email apps are selected to handle the intente
                // Creats the intent
                Intent mailIntent = new Intent(Intent.ACTION_SENDTO);
                mailIntent.setData(Uri.parse("mailto:")); // only email apps should handle this
                mailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{currentPeople.getEmail()}); // recipients

                // Checks if an app to handle the intent Exists
                PackageManager packageManager = getContext().getPackageManager();
                List<ResolveInfo> activities = packageManager.queryIntentActivities(mailIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                boolean isIntentSafe = activities.size() > 0;

                // If at least a proper App exists, the Activity is started
                Intent chooser = Intent.createChooser(mailIntent, getContext().getString(R.string.mailChooserMsg));
                Log.d("CLICK", (String.valueOf(isIntentSafe)));
                if (isIntentSafe) {
                    getContext().startActivity(chooser);
                }
            }
        });

        //Finds the avatar image and sets the Image Resource
        ImageView avatarImage = listItemView.findViewById(R.id.peopleImage);
        avatarImage.setImageResource(getImageResourceforAvatar(currentPeople.getId()));

        // Finds the phone Icon Button
        ImageButton btnPhone = listItemView.findViewById(R.id.phoneIcon);

        // sets an onClickListener on the phone button to make a call to the phone of the People
        btnPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri number = Uri.parse("tel:" + currentPeople.getPhone());
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL, number);
                getContext().startActivity(phoneIntent);
            }
        });

        // Return the whole list item layout
        // so that it can be shown in the ListView
        return listItemView;
    }

    /**
     * This helper gets the Image ResourceId fot a person/people
     * @param peopleId the id of a People Object
     * @return the id of the asset
     * If the People object doesn't have a valid photo id (photoId equal to -1), the helper gets the id of a default avatar depending on the gender of the people/person
     */
    private int getImageResourceforAvatar(int peopleId) {
        if (MPEOPLE.getPeoplePhotoId(peopleId) == -1) {
            if (MPEOPLE.getPeopleGender(peopleId) == Constants.GENDER_MALE)
                return R.drawable.if_user_male;
            else
                return R.drawable.if_user_female;
        } else
            return MPEOPLE.getPeoplePhotoId(peopleId);
    }
}
