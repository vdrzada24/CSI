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
    Animation top_animation,bottom_animation;
    ImageView img;
    TextView v;
    private static int DELAY=3000;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        top_animation= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottom_animation=AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        v=(TextView) findViewById(R.id.tv1);
        img=(ImageView) findViewById(R.id.img1);

        img.setAnimation(top_animation);
        v.setAnimation(bottom_animation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(MainActivity.this,Home.class);

                Pair[] pairs=new Pair[2];
                pairs[0]=new Pair(img,"splash_img");
                pairs[1]=new Pair(v,"splash_text");

                ActivityOptions options=ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
                startActivity(i,options.toBundle());


            }
        },DELAY);


    }
}