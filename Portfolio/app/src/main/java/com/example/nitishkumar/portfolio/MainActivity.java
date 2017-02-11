package com.example.nitishkumar.portfolio;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText messagetext;
    public final static String MESSAGEKEY = "demoapp.messagekey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface myTypeface =Typeface.createFromAsset(getAssets(),"robotol.ttf");
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setTypeface(myTypeface);
        TextView name = (TextView) findViewById(R.id.name);
        TextView roll = (TextView) findViewById(R.id.roll);
        TextView dept = (TextView) findViewById(R.id.dept);
        TextView insti = (TextView) findViewById(R.id.insti);
        TextView w = (TextView) findViewById(R.id.w);
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.fadein);
        Animation animn = AnimationUtils.loadAnimation(this, R.anim.name);
        Animation animr = AnimationUtils.loadAnimation(this, R.anim.roll);
        Animation animd = AnimationUtils.loadAnimation(this, R.anim.dept);
        Animation animi = AnimationUtils.loadAnimation(this, R.anim.insti);
        textView.setAnimation(anim);
        w.setAnimation(anim);
        name.setAnimation(animn);
        roll.setAnimation(animr);
        dept.setAnimation(animd);
        insti.setAnimation(animi);
    }

    public void clicktocontinue(View view) {
        String button_text;


        button_text = ((Button) view).getText().toString();
            if (button_text.equals("Click to Continue")) {
                messagetext = (EditText) findViewById(R.id.messagetext);
                String message = messagetext.getText().toString();
                Intent intent = new Intent(this, featurepage.class);
                intent.putExtra(MESSAGEKEY, message);
                startActivity(intent);
            }
        }
    };
