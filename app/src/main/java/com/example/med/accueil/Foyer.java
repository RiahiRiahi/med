package com.example.med.accueil;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import com.example.med.accueil.*;

public class Foyer extends Fragment {

    private Button buttonFoyer;
    private Button buttonFoyer1;
    View myView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View myView = inflater.inflate(R.layout.activity_foyer, container, false);


        buttonFoyer= (Button) myView.findViewById(R.id.Foyer);
        buttonFoyer1= (Button) myView.findViewById(R.id.Foyer1);
        buttonFoyer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://www.ooun.rnu.tn/web/ar/details.php?code_anc=153"));
                getActivity().startActivity(i);
            }
        });





        buttonFoyer1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://www.ooun.rnu.tn/web/ar/details.php?code_anc=152"));
                getActivity().startActivity(i);
            }
        });
        return myView;
    }
}
