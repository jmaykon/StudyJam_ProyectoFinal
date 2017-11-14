package com.example.mayck.learnenglish;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }
    public void frases(View view) {
        Intent i=new Intent(getApplicationContext(),frases.class);
        startActivity(i);
    }
    public void pais(View view) {
        Intent i=new Intent(getApplicationContext(),enotropais.class);
        startActivity(i);
    }

    public void escuela(View view) {
        Intent i=new Intent(getApplicationContext(),ESCUELA.class);
        startActivity(i);
    }
    public void emerge(View view) {
        Intent i=new Intent(getApplicationContext(),emergencia.class);
        startActivity(i);
    }
    public void saludo(View view) {
        Intent i=new Intent(getApplicationContext(),saludo.class);
        startActivity(i);
    }

}
