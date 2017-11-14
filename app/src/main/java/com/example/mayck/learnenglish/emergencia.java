package com.example.mayck.learnenglish;

import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class emergencia extends AppCompatActivity {
    private ImageView img;
    private MediaPlayer m1;
    private MediaPlayer m2;
    private MediaPlayer m3;
    private MediaPlayer m4;
    private MediaPlayer m5;
    private MediaPlayer m6;
    private Drawable i1;
    private Drawable i2;
    private Drawable i3;
    private Drawable i4;
    private Drawable i5;
    private Drawable i6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergencia);
        getSupportActionBar().hide();
        img=(ImageView)findViewById(R.id.imgemercia);
        i1=this.getResources().getDrawable(R.drawable.j1);
        i2=this.getResources().getDrawable(R.drawable.j2);
        i3=this.getResources().getDrawable(R.drawable.j3);
        i4=this.getResources().getDrawable(R.drawable.j4);
        i5=this.getResources().getDrawable(R.drawable.j5);
        i6=this.getResources().getDrawable(R.drawable.j6);
        m1=MediaPlayer.create(emergencia.this,R.raw.w1);
        m2=MediaPlayer.create(emergencia.this,R.raw.w2);
        m3=MediaPlayer.create(emergencia.this,R.raw.w3);
        m4=MediaPlayer.create(emergencia.this,R.raw.w4);
        m5=MediaPlayer.create(emergencia.this,R.raw.w5);
        m6=MediaPlayer.create(emergencia.this,R.raw.w6);

    }
    public void a1(View view) {
        img.setImageDrawable(i5);
        m5.start();
    }
    public void a2(View view) {
        img.setImageDrawable(i1);
        m1.start();
    }
    public void a3(View view) {
        img.setImageDrawable(i2);
        m2.start();
    }
    public void a4(View view) {
        img.setImageDrawable(i6);
        m6.start();
    }
    public void a5(View view) {
        img.setImageDrawable(i3);
        m3.start();
    }
    public void a6(View view) {
        img.setImageDrawable(i4);
        m4.start();
    }
}
