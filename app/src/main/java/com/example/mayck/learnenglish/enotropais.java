package com.example.mayck.learnenglish;

import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class enotropais extends AppCompatActivity {
    private ImageView img;
    private MediaPlayer m1;
    private MediaPlayer m2;
    private MediaPlayer m3;
    private MediaPlayer m4;
    private MediaPlayer m5;
    private MediaPlayer m6;
    private MediaPlayer m8;
    private MediaPlayer m7;
    private Drawable i1;
    private Drawable i2;
    private Drawable i3;
    private Drawable i4;
    private Drawable i5;
    private Drawable i6;
    private Drawable i7;
    private Drawable i8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enotropais);
        img=(ImageView)findViewById(R.id.imgpais);
        i1=this.getResources().getDrawable(R.drawable.t1);
        i2=this.getResources().getDrawable(R.drawable.t2);
        i3=this.getResources().getDrawable(R.drawable.t3);
        i4=this.getResources().getDrawable(R.drawable.t4);
        i5=this.getResources().getDrawable(R.drawable.t5);
        i6=this.getResources().getDrawable(R.drawable.t6);
        i7=this.getResources().getDrawable(R.drawable.t7);
        i8=this.getResources().getDrawable(R.drawable.t8);
        m1=MediaPlayer.create(enotropais.this,R.raw.z1);
        m2=MediaPlayer.create(enotropais.this,R.raw.z2);
        m3=MediaPlayer.create(enotropais.this,R.raw.z3);
        m4=MediaPlayer.create(enotropais.this,R.raw.z4);
        m5=MediaPlayer.create(enotropais.this,R.raw.z5);
        m6=MediaPlayer.create(enotropais.this,R.raw.z6);
        m8=MediaPlayer.create(enotropais.this,R.raw.z8);
        m7=MediaPlayer.create(enotropais.this,R.raw.z7);
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
        img.setImageDrawable(i4);
        m4.start();
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
        img.setImageDrawable(i7);
        m7.start();
    }
    public void a7(View view) {
        img.setImageDrawable(i8);
        m8.start();
    }

}
