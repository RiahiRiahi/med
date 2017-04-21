package com.example.med.accueil;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by MED on 22/03/2017.
 */

public class Contact extends Fragment /*implements OnMapReadyCallback*/{
    View myview;
    private GoogleMap mMap;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View myView = inflater.inflate(R.layout.contactinst, container, false);

     /*   SupportMapFragment mapFragment;
        mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
  */
        return myView;

    }

}/*



    
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(36.8532989,11.0575763);
        mMap.addMarker(new MarkerOptions().position(sydney).title("ISET Kelibia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        goToLocationZoom(36.8532989,11.0575763, (float) 17.72);

    }

    private void foToLocation(double lat,double lng){
        LatLng ll = new LatLng(lat,lng);
        CameraUpdate update = CameraUpdateFactory.newLatLng(ll);
        mMap.moveCamera(update);
    }

    private void goToLocationZoom(double lat, double lng,float zoom) {
        LatLng ll = new LatLng(lat,lng);
        CameraUpdate update=CameraUpdateFactory.newLatLngZoom(ll,zoom);
        mMap.moveCamera(update);
    }


}


*/

















