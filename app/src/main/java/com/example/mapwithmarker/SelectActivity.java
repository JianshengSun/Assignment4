package com.example.mapwithmarker;
/*
   Author: Jason(Jiansheng Sun) 300997240
   Date: 2019 11 07
   Assignment 4
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class SelectActivity extends AppCompatActivity
        implements OnMapReadyCallback {

    FirstActivity Message = new FirstActivity();
    public static String locationname;
    public static LatLng locationLatLng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Retrieve the content view that renders the map.
        setContentView(R.layout.select_maps);
        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        //set buttons
        Button button1 = (Button)findViewById(R.id.buttonname1);
        //set button name from previous page
        button1.setText(Message.locationname1);
        //button onclicklinstener
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pass name and LatLng to next page
                locationname = Message.locationname1;
                locationLatLng = Message.locationLatLng1;
                //intent method
                MapMaker(v);
            };
        });

        Button button2 = (Button)findViewById(R.id.buttonname2);
        button2.setText(Message.locationname2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                locationname = Message.locationname2;
                locationLatLng = Message.locationLatLng2;
                MapMaker(v);
            };
        });


        Button button3 = (Button)findViewById(R.id.buttonname3);
        button3.setText(Message.locationname3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                locationname = Message.locationname3;
                locationLatLng = Message.locationLatLng3;
                MapMaker(v);
            };
        });


        Button button4 = (Button)findViewById(R.id.buttonname4);
        button4.setText(Message.locationname4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                locationname = Message.locationname4;
                locationLatLng = Message.locationLatLng4;
                MapMaker(v);
            };
        });


        Button button5 = (Button)findViewById(R.id.buttonname5);
        button5.setText(Message.locationname5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                locationname = Message.locationname5;
                locationLatLng = Message.locationLatLng5;
                MapMaker(v);
            };
        });


    }

    //markers and name labels for different locations
    @Override
    public void onMapReady(GoogleMap googleMap) {
        // Add a marker in Sydney, Australia,
        // and move the map's camera to the same location.
        googleMap.addMarker(new MarkerOptions().position(Message.locationLatLng1)
                .title(Message.locationname1));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(Message.locationLatLng1));

        googleMap.addMarker(new MarkerOptions().position(Message.locationLatLng2)
                .title(Message.locationname2));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(Message.locationLatLng2));

        googleMap.addMarker(new MarkerOptions().position(Message.locationLatLng3)
                .title(Message.locationname3));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(Message.locationLatLng3));

        googleMap.addMarker(new MarkerOptions().position(Message.locationLatLng4)
                .title(Message.locationname4));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(Message.locationLatLng4));

        googleMap.addMarker(new MarkerOptions().position(Message.locationLatLng5)
                .title(Message.locationname5));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(Message.locationLatLng5));

        //set camera center and zoom size
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Message.locationLatLng1, 10f));

    }
    public void MapMaker(View view)  {

        //Creating an intent object
        Intent i=new Intent(SelectActivity.this, MapsMarkerActivity.class);

        //Start activity
        startActivity(i);

    }



}
