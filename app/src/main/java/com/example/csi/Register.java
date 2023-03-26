package com.example.csi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {
    EditText e1,e2;
    Button b1;
    TextView tv2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        e1=(EditText) findViewById(R.id.edittext3);
        e2=(EditText) findViewById(R.id.edittext4);
        b1=(Button) findViewById(R.id.button2);
        tv2=(TextView) findViewById(R.id.txt2);

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Register.this,Home.class));
                finish();
            }
        });

    }
}