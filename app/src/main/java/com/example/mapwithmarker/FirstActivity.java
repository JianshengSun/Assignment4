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

import com.google.android.gms.maps.model.LatLng;

public class FirstActivity extends AppCompatActivity {

    //Set static variables to pass values
    public static String locationname1;
    public static String locationname2;
    public static String locationname3;
    public static String locationname4;
    public static String locationname5;

    public static LatLng locationLatLng1;
    public static LatLng locationLatLng2;
    public static LatLng locationLatLng3;
    public static LatLng locationLatLng4;
    public static LatLng locationLatLng5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    //BestBuy
    public void onClickBB(View view)  {

        //set variables
        locationname1 = "Best Buy Yorkdale";
        locationLatLng1 = new LatLng(43.724084, -79.453027);

        locationname2 = "Best Buy Eaton Centre";
        locationLatLng2 = new LatLng(43.652793, -79.380724);

        locationname3 = "Best Buy Scarborough";
        locationLatLng3 = new LatLng(43.778734, -79.259979);

        locationname4 = "Best Buy Markville Shopping Centre";
        locationLatLng4 = new LatLng(43.868257, -79.287779);

        locationname5 = "Best Buy Woodbridge";
        locationLatLng5 = new LatLng(43.792230, -79.549070);


        //Creating an intent object
        Intent i=new Intent(FirstActivity.this, SelectActivity.class);

        //Start activity
        startActivity(i);

    }


    //CanadaComputers
    public void onClickCC(View view)  {

        //set variables
        locationname1 = "Canada Computers & Electronics";
        locationLatLng1 = new LatLng(43.785467, -79.415844);

        locationname2 = "Canada Computers Midtown Toronto";
        locationLatLng2 = new LatLng(43.710731, -79.398840);

        locationname3 = "Canada Computers Scarborough";
        locationLatLng3 = new LatLng(43.759264, -79.279371);

        locationname4 = "Canada Computers Markham Unionville";
        locationLatLng4 = new LatLng(43.859123, -79.322487);

        locationname5 = "Canada Computers Vaughan";
        locationLatLng5 = new LatLng(43.831681, -79.534369);


        //Creating an intent object
        Intent i=new Intent(FirstActivity.this, SelectActivity.class);

        //Start activity
        startActivity(i);

    }


    //APPLE
    public void onClickApple(View view)  {

        //set variables
        locationname1 = "Apple Yorkdale";
        locationLatLng1 = new LatLng(43.724084, -79.453027);

        locationname2 = "Apple Eaton Centre";
        locationLatLng2 = new LatLng(43.652793, -79.380724);

        locationname3 = "Apple Fairview";
        locationLatLng3 = new LatLng(43.777831, -79.343579);

        locationname4 = "Apple Markville Shopping Centre";
        locationLatLng4 = new LatLng(43.868257, -79.287779);

        locationname5 = "Apple Sherway Gardens";
        locationLatLng5 = new LatLng(43.612138, -79.556123);

        //Creating an intent object
        Intent i=new Intent(FirstActivity.this, SelectActivity.class);

        //Start activity
        startActivity(i);

    }

}



