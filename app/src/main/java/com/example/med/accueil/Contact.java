package com.example.med.accueil;

import android.app.Fragment;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by MED on 22/03/2017.
 */

public class Contact extends Fragment {
    MapView mMapView;
    private GoogleMap googleMap;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View myView = inflater.inflate(R.layout.contactinst, container, false);
            mMapView = (MapView) myView.findViewById(R.id.mapView);
            mMapView.onCreate(savedInstanceState);
            mMapView.onResume();
        try {
            MapsInitializer.initialize(getActivity().getApplicationContext());
        } catch (Exception e) {
            e.printStackTrace();
        }
        mMapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap mMap) {
                googleMap = mMap;
                // For showing a move to my location button
                if (ActivityCompat.checkSelfPermission(getActivity(), android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getActivity(), android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                 } else {LatLng Kelibia = new LatLng(36.8532989, 11.0575763);
                    mMap.addMarker(new MarkerOptions().position(Kelibia).title("ISET Kelibia"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Kelibia));
                    goToLocationZoom(36.8532989, 11.0575763, (float) 17.72);
                    // For zooming automatically to the location of the marker
                    CameraPosition cameraPosition = new CameraPosition.Builder().target(Kelibia).zoom(12).build();
                    googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                }
            }
            private void goToLocation(double lat,double lng){
                LatLng ll = new LatLng(lat,lng);
                CameraUpdate update = CameraUpdateFactory.newLatLng(ll);
                googleMap.moveCamera(update);
            }
            private void goToLocationZoom(double lat, double lng,float zoom) {
                        LatLng ll = new LatLng(lat,lng);
                        CameraUpdate update=CameraUpdateFactory.newLatLngZoom(ll,zoom);
                googleMap.moveCamera(update);
                    }
        });

        return myView; }

    @Override
    public void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mMapView.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mMapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mMapView.onLowMemory();
    }
}















