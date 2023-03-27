package com.example.csi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class About_fragment extends Fragment {

    //TextView tvsample;
    //FirebaseUser currentUser;
    //FirebaseAuth mAuth;


    public About_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_about_fragment, container, false);
        //mAuth=FirebaseAuth.getInstance();
        //currentUser=mAuth.getCurrentUser();
        //tvsample=(TextView)v.findViewById(R.id.tvsample);
        //tvsample.setText(currentUser.getEmail());


        return v;
    }
}