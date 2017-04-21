package com.example.med.accueil;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Locale;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override


    public boolean onOptionsItemSelected(MenuItem item) {
        Configuration newconfig = new Configuration();
        switch (item.getItemId()){
            case R.id.languear:
                newconfig.setLocale(new Locale("ar"));
                onConfigurationChanged(newconfig);
                break;
            case R.id.languefr:
                newconfig.setLocale(new Locale("fr"));
                onConfigurationChanged(newconfig);
                break;
            case R.id.langueen:
                newconfig.setLocale(new Locale("en"));
                onConfigurationChanged(newconfig);
                break;

        }
        return super.onOptionsItemSelected(item);
    }
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        getBaseContext().getResources().updateConfiguration(newConfig,getBaseContext().getResources().getDisplayMetrics());
        recreate();
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        android.app.FragmentManager fragmentManager = getFragmentManager();

        if (id == R.id.accueil) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                    ,new accueil())
            .commit();
        } else if (id == R.id.mon_compte) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                    ,new MonCompte())
            .commit();
        } else if (id == R.id.galerie_photos) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            ,new GaleriePhotos())
                    .commit();

        } else if (id == R.id.institut) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            ,new Institut())
                    .commit();

        } else if (id == R.id.contact) {  fragmentManager.beginTransaction()
                .replace(R.id.content_frame
                        ,new Contact())
                .commit();

        } else if (id == R.id.parametres) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            ,new Parametres())
                    .commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void commit() {
    }
}
