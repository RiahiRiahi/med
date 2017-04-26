package com.example.med.accueil;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by MED on 21/03/2017.
 */

public class CompteEtudiant extends Fragment {

    View myView;
    private Button button_profile;
    private Button button_emploi;
    private Button button_discussion;
    private Button button_cours;
    private Button button_examens;
    private Button button_resultat;
    private Button button_absence;
    private Button button_alert;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View myView = inflater.inflate(R.layout.compteetd, container, false);

        button_profile= (Button) myView.findViewById(R.id.button_profile);
        button_emploi= (Button) myView.findViewById(R.id.button_emploi);
        button_discussion= (Button) myView.findViewById(R.id.button_discussion);
        button_cours= (Button) myView.findViewById(R.id.button_cours);
        button_examens= (Button) myView.findViewById(R.id.button_examens);
        button_absence= (Button) myView.findViewById(R.id.button_absence);
        button_resultat= (Button) myView.findViewById(R.id.button_resultat);
        button_alert= (Button) myView.findViewById(R.id.button_alert);
        button_profile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Profile nextFrag = new Profile();
                getActivity().getFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, nextFrag, "TAG_FRAGMENT")
                        .addToBackStack(null)
                        .commit();
            }
        });

        button_emploi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                EmploiEtd nextFrag = new EmploiEtd();
                getActivity().getFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, nextFrag, "TAG_FRAGMENT")
                        .addToBackStack(null)
                        .commit();
            }
        });
        button_discussion.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Discussion nextFrag = new Discussion();
                getActivity().getFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, nextFrag, "TAG_FRAGMENT")
                        .addToBackStack(null)
                        .commit();
            }
        });
        button_cours.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                CoursEtd nextFrag = new CoursEtd();
                getActivity().getFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, nextFrag, "TAG_FRAGMENT")
                        .addToBackStack(null)
                        .commit();
            }
        });
        button_examens.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Examens nextFrag = new Examens();
                getActivity().getFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, nextFrag, "TAG_FRAGMENT")
                        .addToBackStack(null)
                        .commit();
            }
        });
        button_absence.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Note nextFrag = new Note();
                getActivity().getFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, nextFrag, "TAG_FRAGMENT")
                        .addToBackStack(null)
                        .commit();
            }
        });
        button_alert.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Addreclamation nextFrag = new Addreclamation();
                getActivity().getFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, nextFrag, "TAG_FRAGMENT")
                        .addToBackStack(null)
                        .commit();
            }
        });
        button_resultat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www6.inscription.tn/fr"));
                getActivity().startActivity(i);
            }
        });

        return myView;


    }}

