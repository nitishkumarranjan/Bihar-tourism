package com.example.nitishkumar.bihartourism;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Nitish kumar on 9/18/2016.
 */
public class district extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.district);
    }



    public void Patna(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Patna")) {
            Intent intent = new Intent(this, patna.class);
            startActivity(intent);
        }
    }

    public void Nalanda(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Nalanda")) {
            Intent intent = new Intent(this, rajgir.class);
            startActivity(intent);
        }
    }

    public void Gaya(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Gaya")) {
            Intent intent = new Intent(this, gaya.class);
            startActivity(intent);
        }
    }


    public void Vaishali(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Vaishali")) {
            Intent intent = new Intent(this, vaishali.class);
            startActivity(intent);
        }
    }

    public void Rohtas(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Rohtas")) {
            Intent intent = new Intent(this, rohtas.class);
            startActivity(intent);
        }
    }
};