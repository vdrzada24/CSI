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
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class After_login extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    FirebaseUser currentUser;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);
        drawerLayout=findViewById(R.id.drawerLayout);
        navigationView=findViewById(R.id.navigationView);
        toolbar=findViewById(R.id.toolbar);
        mAuth=FirebaseAuth.getInstance();
        currentUser=mAuth.getCurrentUser();

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.Open_drawer,R.string.Close_drawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        loadfragment(new Home_fragment());
        updateNavHeader();

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
                    loadfragment(new Assign_fragment());
                }
                else if(id==R.id.review){
                    loadfragment(new Review_fragment());
                }
                else if(id==R.id.calendar){
                    loadfragment(new Calendar_fragment());
                }
                else if(id==R.id.version){
                    Toast.makeText(After_login.this, "Version", Toast.LENGTH_SHORT).show();
                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;

            }
        });

    }
    public void updateNavHeader()
    {
        navigationView=findViewById(R.id.navigationView);
        View headerview=navigationView.getHeaderView(0);
        TextView nav_usermail=headerview.findViewById(R.id.nav_usermail);
        nav_usermail.setText(currentUser.getEmail());

    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);


        }
        else{

            loadfragment(new Home_fragment());


        }
    }

    private void loadfragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        ft.add(R.id.container,fragment);
        ft.commit();

    }
}