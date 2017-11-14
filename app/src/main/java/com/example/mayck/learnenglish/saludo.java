package com.example.mayck.learnenglish;


import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class saludo extends AppCompatActivity {
    private ImageView img;
    private MediaPlayer m1;
    private MediaPlayer m2;
    private MediaPlayer m3;
    private MediaPlayer m4;
    private MediaPlayer m5;
    private MediaPlayer m6;
    private MediaPlayer m8;
    private MediaPlayer m7;
    private MediaPlayer m9;
    private MediaPlayer m10;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        img=(ImageView)findViewById(R.id.imgsaludo);
        i1=this.getResources().getDrawable(R.drawable.n1);
        i2=this.getResources().getDrawable(R.drawable.n2);
        i3=this.getResources().getDrawable(R.drawable.n3);
        i4=this.getResources().getDrawable(R.drawable.n4);
        i5=this.getResources().getDrawable(R.drawable.n5);
        i6=this.getResources().getDrawable(R.drawable.n6);
        i7=this.getResources().getDrawable(R.drawable.n7);
        i8=this.getResources().getDrawable(R.drawable.n8);
        i9=this.getResources().getDrawable(R.drawable.n9);
        i10=this.getResources().getDrawable(R.drawable.n10);


        m1=MediaPlayer.create(saludo.this,R.raw.s1);
        m2=MediaPlayer.create(saludo.this,R.raw.s2);
        m3=MediaPlayer.create(saludo.this,R.raw.s3);
        m4=MediaPlayer.create(saludo.this,R.raw.s4);
        m5=MediaPlayer.create(saludo.this,R.raw.s5);
        m6=MediaPlayer.create(saludo.this,R.raw.s6);
        m8=MediaPlayer.create(saludo.this,R.raw.s8);
        m7=MediaPlayer.create(saludo.this,R.raw.s7);
        m9=MediaPlayer.create(saludo.this,R.raw.s9);
        m10=MediaPlayer.create(saludo.this,R.raw.s10);
    }
    public void a1(View view) {
        img.setImageDrawable(i1);
        m1.start();
    }
    public void a2(View view) {
        img.setImageDrawable(i2);
        m2.start();
    }
    public void a3(View view) {
        img.setImageDrawable(i3);
        m3.start();
    }
    public void a4(View view) {
        img.setImageDrawable(i4);
        m4.start();
    }
    public void a5(View view) {
        img.setImageDrawable(i5);
        m5.start();
    }
    public void a6(View view) {
        img.setImageDrawable(i6);
        m6.start();
    }
    public void a7(View view) {
        img.setImageDrawable(i9);
        m9.start();
    }
    public void a8(View view) {
        img.setImageDrawable(i10);
        m10.start();
    }
    public void a9(View view) {
        img.setImageDrawable(i7);
        m7.start();
    }


}
