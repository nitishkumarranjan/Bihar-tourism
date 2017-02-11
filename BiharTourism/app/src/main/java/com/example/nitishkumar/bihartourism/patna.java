package com.example.nitishkumar.bihartourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class patna extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patna);

        CardView golghar = (CardView) findViewById(R.id.Card_View);
        CardView meuseum = (CardView) findViewById(R.id.Card_View2);
        CardView planeterium = (CardView) findViewById(R.id.Card_View3);
        CardView zoo = (CardView) findViewById(R.id.Card_View4);
        CardView patandevi = (CardView) findViewById(R.id.Card_View5);
        CardView mahavirmandir = (CardView) findViewById(R.id.Card_View6);
        CardView takhtsri = (CardView) findViewById(R.id.Card_View7);
        CardView smritipark = (CardView) findViewById(R.id.Card_View8);
        CardView ecopark = (CardView) findViewById(R.id.Card_View9);
        CardView fantasia = (CardView) findViewById(R.id.Card_View10);
        golghar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(patna.this, golghar.class);
                startActivity(intent);
            }
        });

        meuseum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(patna.this, patnameuseum.class);
                startActivity(intent);
            }
        });

        planeterium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(patna.this, planeterium.class);
                startActivity(intent);
            }
        });

        zoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(patna.this, patnazoo.class);
                startActivity(intent);
            }
        });

        patandevi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(patna.this, patandevi.class);
                startActivity(intent);
            }
        });

        mahavirmandir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(patna.this, mahavirmandir.class);
                startActivity(intent);
            }
        });

        takhtsri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(patna.this, takhtsripatnasaheb.class);
                startActivity(intent);
            }
        });

        smritipark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(patna.this, buddhasmritipark.class);
                startActivity(intent);
            }
        });

        ecopark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(patna.this, ecopark.class);
                startActivity(intent);
            }
        });

        fantasia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(patna.this,fantasia.class);
                startActivity(intent);
            }
        });

    }
};
