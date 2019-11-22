package com.example.mapwithmarker;
/*
   Author: Jason(Jiansheng Sun) 300997240
   Date: 2019 11 07
   Assignment 4
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsMarkerActivity extends AppCompatActivity
        implements OnMapReadyCallback {

    SelectActivity Location = new SelectActivity();
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_maps);
        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.
        SupportMapFragment mapFragment = SupportMapFragment.newInstance();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.map, mapFragment).commit();
        mapFragment.getMapAsync(this);
        Toast.makeText(this,Location.locationname + "   POST CODE: M2K 3C1" + "  PhoneNumber: 6479016363" , Toast.LENGTH_LONG).show();

    }

    //set menu list
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        getMenuInflater().inflate(R.menu.file, menu);
        return true;
    }

    //menu onclicklistener
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            //switch for two kinds of map type
            case R.id.standardMap:
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                return true;
            case R.id.satelliteMap:
                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    //map information
    @Override
    public void onMapReady(GoogleMap googleMap) {
        //*important! if do not have this one, the app will crash when switch the map type!
        mMap = googleMap;

        //marker location and title
        googleMap.addMarker(new MarkerOptions().position(Location.locationLatLng)
                .title(Location.locationname));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(Location.locationLatLng));
        //camera location and zoom size
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Location.locationLatLng, 15f));

        //set zoom button
        UiSettings uiSettings = googleMap.getUiSettings();
        uiSettings.setCompassEnabled(false);
        uiSettings.setZoomControlsEnabled(true);
        uiSettings.setMyLocationButtonEnabled(false);
    }

}


