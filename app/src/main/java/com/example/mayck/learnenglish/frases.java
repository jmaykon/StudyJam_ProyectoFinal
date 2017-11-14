package com.example.mayck.learnenglish;

import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class frases extends AppCompatActivity {
private ImageView img;
    private Drawable i1;
    private Drawable i2;
    private Drawable i3;
    private Drawable i4;
    private Drawable i5;
    private Drawable i6;
    private Drawable i7;
    private Drawable i8;
    private Drawable i9;
    private Drawable i10;
    private Drawable i11;
    private Drawable i12;
    private Drawable i13;
    private Drawable i14;
    private Drawable i15;
    private MediaPlayer m1;
    private MediaPlayer m2;
    private MediaPlayer m3;
    private MediaPlayer m4;
    private MediaPlayer m5;
    private MediaPlayer m6;
    private MediaPlayer m7;
    private MediaPlayer m8;
    private MediaPlayer m9;
    private MediaPlayer m10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_frases);
        img=(ImageView)findViewById(R.id.frases1);
        i1=this.getResources().getDrawable(R.drawable.a1);
        i2=this.getResources().getDrawable(R.drawable.a2);
        i3=this.getResources().getDrawable(R.drawable.a4);
        i4=this.getResources().getDrawable(R.drawable.a3);
        i5=this.getResources().getDrawable(R.drawable.a5);
        i6=this.getResources().getDrawable(R.drawable.a6);
        i7=this.getResources().getDrawable(R.drawable.a7);
        i8=this.getResources().getDrawable(R.drawable.a8);
        i9=this.getResources().getDrawable(R.drawable.a9);
        i10=this.getResources().getDrawable(R.drawable.a10);
        i11=this.getResources().getDrawable(R.drawable.a11);
        i12=this.getResources().getDrawable(R.drawable.a12);
        i13=this.getResources().getDrawable(R.drawable.a13);
        i14=this.getResources().getDrawable(R.drawable.a14);
        i15=this.getResources().getDrawable(R.drawable.a15);
        m1=MediaPlayer.create(frases.this, R.raw.au1);
        m2=MediaPlayer.create(frases.this, R.raw.au3);
        m3=MediaPlayer.create(frases.this, R.raw.au2);
        m4=MediaPlayer.create(frases.this, R.raw.au13);
        m5=MediaPlayer.create(frases.this, R.raw.au15);
        m6=MediaPlayer.create(frases.this, R.raw.au12);
        m7=MediaPlayer.create(frases.this, R.raw.au10);
        m8=MediaPlayer.create(frases.this, R.raw.au7);
        m9=MediaPlayer.create(frases.this, R.raw.au6);
        m10=MediaPlayer.create(frases.this, R.raw.au4);


    }
    public void a1(View view) {
        img.setImageDrawable(i1);
        m1.start();
    }
    public void a2(View view) {
        img.setImageDrawable(i3);
        m10.start();
    }
    public void a3(View view) {
        img.setImageDrawable(i2);
        m3.start();
    }
    public void a4(View view) {
        img.setImageDrawable(i13);
        m4.start();
    }
    public void a5(View view) {
        img.setImageDrawable(i15);
        m5.start();
    }
    public void a6(View view) {
        img.setImageDrawable(i12);
        m6.start();
    }
    public void a7(View view) {
        img.setImageDrawable(i10);
        m7.start();
    }
    public void a8(View view) {
        img.setImageDrawable(i7);
        m8.start();
    }
    public void a9(View view) {
        img.setImageDrawable(i6);
        m9.start();
    }
    public void a10(View view) {
        img.setImageDrawable(i4);
        m2.start();
    }


}
