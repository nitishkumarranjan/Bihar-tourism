package com.example.nitishkumar.bihartourism;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

/**
 * Created by Nitish kumar on 9/18/2016.
 */
public class rohtas extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rohtas);


        CardView shershahsuri = (CardView) findViewById(R.id.Card_View);
        CardView rohtasgarh = (CardView) findViewById(R.id.Card_View2);
        CardView maatara = (CardView) findViewById(R.id.Card_View3);
        CardView hasankhansur = (CardView) findViewById(R.id.Card_View4);

        shershahsuri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rohtas.this, tombofshershahsuri.class);
                startActivity(intent);
            }
        });

        rohtasgarh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rohtas.this, rohtasgarhfort.class);
                startActivity(intent);
            }
        });

        maatara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rohtas.this, maatarachanditemple.class);
                startActivity(intent);
            }
        });

        hasankhansur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rohtas.this, tombofhasankhansur.class);
                startActivity(intent);
            }
        });

    }
};
