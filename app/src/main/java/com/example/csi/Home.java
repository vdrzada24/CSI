package com.example.csi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Home extends AppCompatActivity {
    Button b1;
    EditText e1,e2;
    TextView tv;

    FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        b1=(Button)findViewById(R.id.button1);
        e1=(EditText)findViewById(R.id.edittext1);
        e2=(EditText)findViewById(R.id.edittext2);
        tv=(TextView) findViewById(R.id.txt1);
        mAuth=FirebaseAuth.getInstance();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=e1.getText().toString();
                String pass=e2.getText().toString();
                if(user.isEmpty())
                {
                    e1.setError("Email id can't be empty");
                }
                if(pass.isEmpty())
                {
                    e2.setError("Password can't be empty");
                }
                else
                {
                    //after successful login
                    login(user,pass);
                }
            }
        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,Register.class));

            }
        });


    }
    private void login(String user,String pass)
    {
        mAuth.signInWithEmailAndPassword(user,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
               if(task.isSuccessful())
               {
                   Toast.makeText(Home.this, "Login Successful", Toast.LENGTH_SHORT).show();
                   Intent j1=new Intent(Home.this,After_login.class);
                   startActivity(j1);
                   finish();
               }
               else
               {
                   Toast.makeText(Home.this, "Login not Successful", Toast.LENGTH_SHORT).show();
               }
            }
        });
    }

}