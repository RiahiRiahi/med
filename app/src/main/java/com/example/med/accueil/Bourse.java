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

public class Bourse extends Fragment {
    View myView;
    private Button buttonBourse;
    private Button buttonBourse1;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View myView = inflater.inflate(R.layout.activity_bourse, container, false);
        buttonBourse= (Button) myView.findViewById(R.id.Bourse);
        buttonBourse1= (Button) myView.findViewById(R.id.bourse);
        buttonBourse.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://www.ooun.rnu.tn/web/ar/bourse.html"));
                getActivity().startActivity(i);
            }
        });





        buttonBourse1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://www.ooun.rnu.tn/web/ar/details.php?code_anc=142"));
                getActivity().startActivity(i);
            }
        });

        return myView;
    }
}
