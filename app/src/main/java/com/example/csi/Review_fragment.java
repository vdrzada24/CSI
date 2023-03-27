package com.example.csi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Review_fragment extends Fragment {
    EditText e8,e9,e10;
    Button b4;


    public Review_fragment() {
        // Required empty public constructor
    }




    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_review_fragment, container, false);
        e8=(EditText)v.findViewById(R.id.edittext8);
        e9=(EditText)v.findViewById(R.id.edittext9);
        e10=(EditText)v.findViewById(R.id.edittext10);
        b4=(Button)v.findViewById(R.id.button4);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMail();
            }
        });


        return v;
    }
    private void sendMail()
    {
        String recipientList= e8.getText().toString();
        String[] recipients = recipientList.split(",");
        String subject= e9.getText().toString();
        String message= e10.getText().toString();
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL,recipients);
        intent.putExtra(Intent.EXTRA_SUBJECT,subject);
        intent.putExtra(Intent.EXTRA_TEXT,message);

        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, "Choose an email client"));



    }
}