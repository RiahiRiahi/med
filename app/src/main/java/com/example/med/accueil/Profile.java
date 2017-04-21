package com.example.med.accueil;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by MED on 21/03/2017.
 */

public class Profile extends Fragment{
    View myview;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View myView = inflater.inflate(R.layout.profile, container, false);

        return myView;
    }
    }
