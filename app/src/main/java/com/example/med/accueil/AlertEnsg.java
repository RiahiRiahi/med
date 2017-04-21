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

public class AlertEnsg extends Fragment {
    Button butrec;
    View myview;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View myView = inflater.inflate(R.layout.activity_addreclamationensg, container, false);
        butrec = (Button) myView.findViewById(R.id.addrec);
        butrec.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ReclamationEnsg nextFrag = new ReclamationEnsg();
                getActivity().getFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, nextFrag, "TAG_FRAGMENT")
                        .addToBackStack(null)
                        .commit();
            }
        });

        return myView;

    }
}