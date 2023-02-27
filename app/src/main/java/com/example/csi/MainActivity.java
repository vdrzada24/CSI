package com.example.csi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Flushable;

public class MainActivity extends AppCompatActivity {

    ImageView i1;
    TextView t1;
    private static int DELAY=3000;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);



        t1=(TextView) findViewById(R.id.tv1);
        i1=(ImageView) findViewById(R.id.img1);

        i1.animate().translationY(-1195).setDuration(2000).setStartDelay(0);
        t1.animate().translationY(1195).setDuration(2000).setStartDelay(0);

        
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(MainActivity.this,Home.class);

                Pair[] pairs=new Pair[2];
                pairs[0]=new Pair(i1,"splash_img");
                pairs[1]=new Pair(t1,"splash_text");

                ActivityOptions options=ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
                startActivity(i,options.toBundle());


            }
        },DELAY);


    }
}