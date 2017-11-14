package com.example.mayck.learnenglish;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Inicio extends AppCompatActivity {

    private ImageView logo;
    private Animation anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_inicio);
        logo = (ImageView)findViewById(R.id.logo);
        anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.inicio);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i= new Intent(Inicio.this,MainActivity.class);
                logo.startAnimation(anim);
                startActivity(i);
            }
        },2500);

    }
}
