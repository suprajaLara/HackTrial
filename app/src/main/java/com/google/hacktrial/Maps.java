package com.google.hacktrial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;

public class Maps extends AppCompatActivity implements OnMapReadyCallback {

    com.google.android.gms.maps.MapView mapView;
//    private GoogleMap gmap;
//
//    private static final String MAP_VIEW_BUNDLE_KEY = "MapViewBundleKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

//        Bundle mapView_bundle = null;
//        if(savedInstanceState!=null)
//            mapView_bundle = savedInstanceState.getBundle(MAP_VIEW_BUNDLE_KEY);
//
          mapView = findViewById(R.id.mapView);
//        mapView.onCreate(mapView_bundle);
          mapView.getMapAsync(Maps.this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }
}
