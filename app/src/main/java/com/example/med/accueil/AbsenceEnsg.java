package com.example.med.accueil;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by MED on 22/03/2017.
 */

public class AbsenceEnsg extends Fragment {
    private Button butti;
    private Button butgp;
    private Button butem;
    View myview;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View myView = inflater.inflate(R.layout.absenceensg, container, false);
            butti = (Button) myView.findViewById(R.id.buttonti);
            butgp = (Button) myView.findViewById(R.id.buttongp);
            butem = (Button) myView.findViewById(R.id.buttonem);
            butti.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    AbsenceTI nextFrag = new AbsenceTI();
                    getActivity().getFragmentManager().beginTransaction()
                            .replace(R.id.content_frame, nextFrag, "TAG_FRAGMENT")
                            .addToBackStack(null)
                            .commit();
                }
            });
   butgp.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    AbsenceGP nextFrag = new AbsenceGP();
                    getActivity().getFragmentManager().beginTransaction()
                            .replace(R.id.content_frame, nextFrag, "TAG_FRAGMENT")
                            .addToBackStack(null)
                            .commit();
                }
            });
   butem.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    AbsenceEM nextFrag = new AbsenceEM();
                    getActivity().getFragmentManager().beginTransaction()
                            .replace(R.id.content_frame, nextFrag, "TAG_FRAGMENT")
                            .addToBackStack(null)
                            .commit();
                }
            });


            return myView;

        }    }

