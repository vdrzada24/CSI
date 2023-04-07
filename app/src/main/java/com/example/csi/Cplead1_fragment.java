package com.example.csi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class Cplead1_fragment extends BottomSheetDialogFragment {
    TextView phonenumber;


    public Cplead1_fragment() {
        // Required empty public constructor
    }




    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_cplead1_fragment, container, false);
        phonenumber=(TextView)v.findViewById(R.id.phone_cplead1);
        phonenumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=phonenumber.getText().toString();
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+s));
                startActivity(intent);

            }
        });
        return  v;
    }
}