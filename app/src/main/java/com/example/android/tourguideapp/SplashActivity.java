package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    // Initializes the SongList and AlbumList used throughout the whole application
    // Since we don't need to modify them for the scope of the app, they are declared as final
    public static final PeopleList MPEOPLE = new PeopleList();
    public static final SiteList MSITE = new SiteList();
    public static final EventList MEVENT = new EventList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
