package com.example.nitishkumar.bihartourism;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

/**
 * Created by Nitish kumar on 9/18/2016.
 */
public class rajgir extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rajgir);

        CardView nalanda = (CardView) findViewById(R.id.Card_View);
        CardView gridd = (CardView) findViewById(R.id.Card_View2);
        CardView hieuntsang = (CardView) findViewById(R.id.Card_View3);
        CardView ashokastupa = (CardView) findViewById(R.id.Card_View4);
        CardView sanabhandara = (CardView) findViewById(R.id.Card_View5);
        nalanda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rajgir.this, nalandauniversity.class);
                startActivity(intent);
            }
        });

        gridd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rajgir.this, griddhakutapeak.class);
                startActivity(intent);
            }
        });

        hieuntsang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rajgir.this, hiuentsang.class);
                startActivity(intent);
            }
        });

        ashokastupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rajgir.this, ashokstupapeak.class);
                startActivity(intent);
            }
        });

        sanabhandara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rajgir.this, sanabhandaracaves.class);
                startActivity(intent);
            }
        });

    }
};
