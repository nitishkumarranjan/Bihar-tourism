package com.example.nitishkumar.bihartourism;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

/**
 * Created by Nitish kumar on 9/18/2016.
 */
public class gaya extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gaya);

        CardView mahabodhi = (CardView) findViewById(R.id.Card_View);
        CardView bodhi = (CardView) findViewById(R.id.Card_View2);
        CardView buddha = (CardView) findViewById(R.id.Card_View3);
        CardView vishnupad = (CardView) findViewById(R.id.Card_View4);
        mahabodhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gaya.this, mahabodhitemple.class);
                startActivity(intent);
            }
        });

        bodhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gaya.this, bodhitree.class);
                startActivity(intent);
            }
        });

        buddha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gaya.this, greatbuddhastatue.class);
                startActivity(intent);
            }
        });

        vishnupad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gaya.this, vishnupadtemple.class);
                startActivity(intent);
            }
        });

    }
};