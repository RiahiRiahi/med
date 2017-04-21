package com.example.med.accueil;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.med.accueil.R;

public class ReclamationEnsg extends Fragment {
    Button butrec;
    View myview;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View myView = inflater.inflate(R.layout.reclamation, container, false);
        return myView;

    }    }
