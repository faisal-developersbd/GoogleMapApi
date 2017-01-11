package com.faisal.googlemapapi;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng bubt = new LatLng(23.811805, 90.357025);


        LatLng loc = new LatLng(26.157195, 88.606423);
        LatLng loc2 = new LatLng(24.920543, 88.733297);
        LatLng loc3 = new LatLng(24.787454, 91.992941);
        LatLng loc4 = new LatLng(24.659166, 90.752540);

        mMap.addMarker(new MarkerOptions().position(bubt).title("1").snippet("First order from here")).showInfoWindow();



        mMap.addMarker(new MarkerOptions().position(loc).title("3").snippet("Third order from here"));



        mMap.addMarker(new MarkerOptions().position(loc2).title("2").snippet("Second order from here"));



        mMap.addMarker(new MarkerOptions().position(loc3).title("5").snippet("Fifth order from here"));



        mMap.addMarker(new MarkerOptions().position(loc4).title("4").snippet("Fourth order from here"));


        mMap.setMinZoomPreference(6.0f);
        mMap.setMaxZoomPreference(14.0f);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bubt));
        // Set a preference for minimum and maximum zoom.
//        mMap.setMinZoomPreference(6.0f);
//        mMap.setMaxZoomPreference(14.0f);
//        mMap.setBuildingsEnabled(true);
//        LatLng aus=new LatLng(-44, 113);
//         LatLngBounds AUSTRALIA = new LatLngBounds(
//                new LatLng(-44, 113), new LatLng(-10, 154));
//        mMap.addMarker(new MarkerOptions().position(aus).title("Marker in Sydney").snippet("Population: 4,137,400"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(AUSTRALIA.getCenter(), 10));
    }
}
