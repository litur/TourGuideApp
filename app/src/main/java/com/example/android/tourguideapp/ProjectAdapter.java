package com.example.android.tourguideapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

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

        // Finds the TextView for the project Description and sets the value
        TextView projectDescription = listItemView.findViewById(R.id.projectDescription);
        projectDescription.setText(currentProject.getDescription());

        // Finds the TextView for the project Contact person and sets the value
        TextView projectContact = listItemView.findViewById(R.id.projectContact);
        projectContact.setText(SplashActivity.MPEOPLE.getPeopleNameAndSurname(currentProject.getProjectContatctPersonId()));

        // Finds the TextView for the Project Due date and sets the value
        TextView projectDate = listItemView.findViewById(R.id.projectDueDate);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYYY");
        String myProjectDate = formatter.format(currentProject.getDueDate());
        projectDate.setText(myProjectDate);

        return listItemView;
    }
}
