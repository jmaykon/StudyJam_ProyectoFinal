package com.example.mayck.learnenglish;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ESCUELA extends AppCompatActivity {
    private ImageView img;
    private MediaPlayer m1;
    private MediaPlayer m2;
    private MediaPlayer m3;
    private MediaPlayer m4;
    private MediaPlayer m5;
    private Drawable i1;
    private Drawable i2;
    private Drawable i3;
    private Drawable i4;
    private Drawable i5;
    private Button btcolor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_escuel);
        img = (ImageView) findViewById(R.id.imageView);
        i1 = this.getResources().getDrawable(R.drawable.h1);
        i2 = this.getResources().getDrawable(R.drawable.h2);
        i3 = this.getResources().getDrawable(R.drawable.h3);
        i4 = this.getResources().getDrawable(R.drawable.h4);
        i5 = this.getResources().getDrawable(R.drawable.h5);
        m1 = MediaPlayer.create(ESCUELA.this, R.raw.q1);
        m2 = MediaPlayer.create(ESCUELA.this, R.raw.q2);
        m3 = MediaPlayer.create(ESCUELA.this, R.raw.q3);
        m4 = MediaPlayer.create(ESCUELA.this, R.raw.q4);
        m5 = MediaPlayer.create(ESCUELA.this, R.raw.q5);

    }

    public void a1(View v) {
        img.setImageDrawable(i1);
        m1.start();
    }

    public void a2(View v) {
        img.setImageDrawable(i2);
        m2.start();
    }

    public void a3(View v) {
        img.setImageDrawable(i3);
        m3.start();
    }

    public void a4(View v) {
        img.setImageDrawable(i4);
        m4.start();
    }

    public void a5(View v) {
        img.setImageDrawable(i5);
        m5.start();
    }


}
