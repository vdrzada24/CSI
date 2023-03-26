package com.example.csi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class After_login extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);
        drawerLayout=findViewById(R.id.drawerLayout);
        navigationView=findViewById(R.id.navigationView);
        toolbar=findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.Open_drawer,R.string.Close_drawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        loadfragment(new Home_fragment());

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if(id==R.id.home){
                    loadfragment(new Home_fragment());
                }
                else if(id==R.id.about){
                    loadfragment(new About_fragment());
                }
                else if(id==R.id.leads){
                    Toast.makeText(After_login.this, "Leads", Toast.LENGTH_SHORT).show();
                }
                else if(id==R.id.assign){
                    Toast.makeText(After_login.this, "Assign Task", Toast.LENGTH_SHORT).show();
                }
                else if(id==R.id.review){
                    Toast.makeText(After_login.this, "Review Task", Toast.LENGTH_SHORT).show();
                }
                else if(id==R.id.calendar){
                    Toast.makeText(After_login.this, "Calendar", Toast.LENGTH_SHORT).show();
                }
                else if(id==R.id.version){
                    Toast.makeText(After_login.this, "Version", Toast.LENGTH_SHORT).show();
                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });

    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);

        }
        else{
            super.onBackPressed();
            finish();
        }
    }

    private void loadfragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        ft.add(R.id.container,fragment);
        ft.commit();

    }
}