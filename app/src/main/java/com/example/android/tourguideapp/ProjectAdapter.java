package com.example.android.tourguideapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.TextViewCompat;
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

public class ProjectAdapter extends ArrayAdapter {
    public ProjectAdapter(@NonNull Activity context, ArrayList<Project> Project) {
        super(context, 0, Project);
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
                    R.layout.fragment_project, parent, false);
        }

        // Gets the {@link Project} object located at this position in the list
        final Project currentProject = (Project) getItem(position);

        // Finds the ImageView for the project Image and sets the source
        ImageView projectImg = listItemView.findViewById(R.id.projectImg);
        projectImg.setImageResource(currentProject.getProjectRawId());

        // Finds the TextView for the project Name and sets the value
        TextView projectTitle = listItemView.findViewById(R.id.projectTitle);
        projectTitle.setText(currentProject.getName());
        // sets autosize on the title Textview
        TextViewCompat.setAutoSizeTextTypeWithDefaults(projectTitle, 1);

        // Finds the TextView for the project Description and sets the value
        TextView projectDescription = listItemView.findViewById(R.id.projectDescription);
        projectDescription.setText(currentProject.getDescription());

        // Finds the TextView for the project Contact person and sets the value
        TextView projectContact = listItemView.findViewById(R.id.projectContact);
        projectContact.setText(currentProject.getProjectContatctPerson());

        // Finds the TextView for the Project Due date and sets the value
        TextView projectDate = listItemView.findViewById(R.id.projectDueDate);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYYY");
        String myProjectDate = formatter.format(currentProject.getDueDate());
        projectDate.setText(myProjectDate);

        // Finds the ImageButton for the sending emails
        ImageButton mailBtn = listItemView.findViewById(R.id.mailIcon);

        // sets an onClickListener on the mail button to send an email
        mailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // specifying SENDTO for the Intent makes sure that only email apps are selected to handle the intente
                // Creats the intent
                Intent mailIntent = new Intent(Intent.ACTION_SENDTO);
                mailIntent.setData(Uri.parse("mailto:")); // only email apps should handle this
                mailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{currentProject.getProjectContatctPerson()}); // recipients
                mailIntent.putExtra(Intent.EXTRA_SUBJECT, getContext().getString(R.string.Info_about_Project, currentProject.getName()));
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

        // Finds the ImageButton for the web site link
        ImageButton webBtn = listItemView.findViewById(R.id.webIcon);

        // If the project doesn't have a real weblink, we don't render the imageButton
        if (currentProject.getUrl().equals(""))
            webBtn.setVisibility(View.GONE);
            // Else we render the imageButton and set an onClickListener to open the web url for the Project
        else
            webBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent webIntent = new Intent(Intent.ACTION_VIEW);
                    Uri webpage = Uri.parse(currentProject.getUrl());
                    webIntent.setData(webpage);
                    // Checks if an app to handle the intent Exists
                    PackageManager packageManager = getContext().getPackageManager();
                    List<ResolveInfo> activities = packageManager.queryIntentActivities(webIntent, PackageManager.MATCH_DEFAULT_ONLY);
                    boolean isIntentSafe = activities.size() > 0;

                    // If at least a proper App exists, the Activity is started
                    if (isIntentSafe) {
                        getContext().startActivity(webIntent);
                    }

                }
            });
        return listItemView;
    }
}
