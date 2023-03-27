package com.example.csi;

import android.content.Intent;
import android.os.Bundle;

import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Assign_fragment extends Fragment {
    EditText e5,e6,e7;
    Button b3;

    // TODO: Rename parameter arguments, choose names that match

    public Assign_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_assign_fragment, container, false);
        e5=(EditText)v.findViewById(R.id.edittext5);
        e6=(EditText)v.findViewById(R.id.edittext6);
        e7=(EditText)v.findViewById(R.id.edittext7);
        b3=(Button)v.findViewById(R.id.button3);



        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMail();
            }
        });

        return v;
    }

    private void sendMail()
    {
        String recipientList= e5.getText().toString();
        String[] recipients = recipientList.split(",");
        String subject= e6.getText().toString();
        String message= e7.getText().toString();
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL,recipients);
        intent.putExtra(Intent.EXTRA_SUBJECT,subject);
        intent.putExtra(Intent.EXTRA_TEXT,message);

        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, "Choose an email client"));



    }
}