package com.example.med.accueil;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.med.accueil.*;

public class Addcoursensg extends Fragment {
    View myview;
    Button button1;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View myView = inflater.inflate(R.layout.activity_addcoursensg, container, false);


        button1= (Button) myView.findViewById(R.id.showpdf);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                CoursEnsg nextFrag = new CoursEnsg();
                getActivity().getFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, nextFrag, "TAG_FRAGMENT")
                        .addToBackStack(null)
                        .commit();
            }
        });



        return myView;
    }}