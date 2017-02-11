package com.example.nitishkumar.bihartourism;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

/**
 * Created by Nitish kumar on 9/18/2016.
 */
public class vaishali extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vaishali);

        CardView ashokpillar = (CardView) findViewById(R.id.Card_View);
        CardView abhishek = (CardView) findViewById(R.id.Card_View2);
        CardView bawan = (CardView) findViewById(R.id.Card_View3);
        CardView vishal = (CardView) findViewById(R.id.Card_View4);

        ashokpillar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vaishali.this, ashokpillar.class);
                startActivity(intent);
            }
        });

        abhishek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vaishali.this, abhishekpushkarn.class);
                startActivity(intent);
            }
        });

        bawan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vaishali.this, bawanpokhartemple.class);
                startActivity(intent);
            }
        });

        vishal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vaishali.this, rajavishalkagarh.class);
                startActivity(intent);
            }
        });

    }
};
