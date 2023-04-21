package com.example.csi;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.w3c.dom.Text;


public class About_fragment extends Fragment {
    TextView t1;

    //TextView tvsample;
    //FirebaseUser currentUser;
    //FirebaseAuth mAuth;


    public About_fragment() {
        // Required empty public constructor
    }


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_about_fragment, container, false);
        t1=(TextView) v.findViewById(R.id.txtmarq);
        t1.setSelected(true);
        //mAuth=FirebaseAuth.getInstance();
        //currentUser=mAuth.getCurrentUser();
        //tvsample=(TextView)v.findViewById(R.id.tvsample);
        //tvsample.setText(currentUser.getEmail());


        return v;
    }
}