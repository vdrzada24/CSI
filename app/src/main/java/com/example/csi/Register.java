package com.example.csi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Register extends AppCompatActivity {
    EditText e3,e4;
    Button b2;
    TextView tv2;

    FirebaseAuth mAuth;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        e3=(EditText) findViewById(R.id.edittext3);
        e4=(EditText) findViewById(R.id.edittext4);
        b2=(Button) findViewById(R.id.button2);
        tv2=(TextView) findViewById(R.id.txt2);
        mAuth=FirebaseAuth.getInstance();

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Register.this,Home.class));
                finish();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userid=e3.getText().toString();
                String password=e4.getText().toString();
                if(userid.isEmpty())
                {
                    e3.setError("Email id can't be empty");
                }
                if(password.isEmpty())
                {
                    e4.setError("Password can't be empty");
                }
                else
                {
                    createuseraccount(userid,password);
                }
            }
        });


    }

    private void createuseraccount(String userid,String password)
    {
        mAuth.createUserWithEmailAndPassword(userid,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                    Toast.makeText(Register.this, "Signup Successful", Toast.LENGTH_SHORT).show();
                    Intent l1=new Intent(Register.this,Home.class);
                    startActivity(l1);


                }
                else {
                    Toast.makeText(Register.this, "Signup not successful", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}