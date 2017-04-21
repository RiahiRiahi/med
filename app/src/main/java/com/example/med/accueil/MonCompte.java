package com.example.med.accueil;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by MED on 17/03/2017.
 */

public class MonCompte extends Fragment {

    private Button button_sub;
    private Button button_ensg;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View myView = inflater.inflate(R.layout.mon_compte, container, false);
        button_sub = (Button) myView.findViewById(R.id.btn_login);
        button_ensg = (Button) myView.findViewById(R.id.btn_login1);
        button_sub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                CompteEtudiant nextFrag = new CompteEtudiant();
                getActivity().getFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, nextFrag, "TAG_FRAGMENT")
                        .addToBackStack(null)
                        .commit();
            }
        });
        button_ensg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
               CompteEnsg nextFrag = new CompteEnsg();
                getActivity().getFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, nextFrag, "TAG_FRAGMENT")
                        .addToBackStack(null)
                        .commit();
            }
        });
        return myView;
    }

}
