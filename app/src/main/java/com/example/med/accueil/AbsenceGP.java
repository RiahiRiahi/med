package com.example.med.accueil;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;


public class AbsenceGP extends Fragment {
    View myview;
    Spinner spinner;
    Button button1;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View myView = inflater.inflate(R.layout.activity_absence_ti, container, false);
     /*   spinner = (Spinner) myView.findViewById(R.id.spinner);
        ArrayAdapter<CharSequence>  adapter;
        adapter = ArrayAdapter.createFromResource(this,R.array.classe,android.R.layout.simple_spinner_item);
       /* createFromResource(myView.this, R.array.classe,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(),parent.getItemAtPosition(position)+"selected",Toast.LENGTH_LONG).show();
             }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });*/
        button1= (Button) myView.findViewById(R.id.butlist);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ListeEtdGP nextFrag = new ListeEtdGP();
                getActivity().getFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, nextFrag, "TAG_FRAGMENT")
                        .addToBackStack(null)
                        .commit();
            }
        });
    return myView;
}


}