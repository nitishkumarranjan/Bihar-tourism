package com.example.nitishkumar.bihartourism;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Nitish kumar on 9/27/2016.
 */
public class welcome extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        TextView welcome = (TextView) findViewById(R.id.welcome);
        ImageView bih= (ImageView) findViewById(R.id.bihar);
        Typeface myTypeface =Typeface.createFromAsset(getAssets(),"robotol.ttf");
        welcome.setTypeface(myTypeface);

        TextView b = (TextView) findViewById(R.id.b);
        TextView i = (TextView) findViewById(R.id.i);
        TextView h = (TextView) findViewById(R.id.h);
        TextView a = (TextView) findViewById(R.id.a);
        TextView r = (TextView) findViewById(R.id.r);
        Animation welcomea = AnimationUtils.loadAnimation(this, R.anim.welcome);
        Animation ba = AnimationUtils.loadAnimation(this, R.anim.b);
        Animation biha = AnimationUtils.loadAnimation(this, R.anim.biharimage);
        Animation ia = AnimationUtils.loadAnimation(this, R.anim.i);
        Animation ha = AnimationUtils.loadAnimation(this, R.anim.h);
        Animation aa = AnimationUtils.loadAnimation(this, R.anim.a);
        Animation ra = AnimationUtils.loadAnimation(this, R.anim.r);
        bih.setAnimation(biha);
        welcome.setAnimation(welcomea);
        b.setAnimation(ba);
        i.setAnimation(ia);
        h.setAnimation(ha);
        a.setAnimation(aa);
        r.setAnimation(ra);





    final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startactivity();
            }
        }, 4000);
    }
    void startactivity()
    {
        Intent intent = new Intent(this, aboutbihar.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
};

