package com.example.nitishkumar.portfolio;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Nitish kumar on 3/30/2016.
 */
public class featurepage extends Activity {
    public final static String MESSAGEKEY="demoapp.messagekey";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.featurepage);

        Typeface myTypeface =Typeface.createFromAsset(getAssets(),"robotol.ttf");
        TextView subt = (TextView) findViewById(R.id.subtitle);
        subt.setTypeface(myTypeface);
        Intent intent=getIntent();
        String message=intent.getStringExtra(MESSAGEKEY);
        TextView textView =(TextView)findViewById(R.id.pass);
        textView.setText(message);
        Button profile=(Button)findViewById(R.id.profile);
        Button qualification=(Button)findViewById(R.id.qualification);
        Button skill=(Button)findViewById(R.id.skill);
        Button course=(Button)findViewById(R.id.course);
        Button projects=(Button)findViewById(R.id.projects);
        Button pors=(Button)findViewById(R.id.pors);
        Animation animfadein= AnimationUtils.loadAnimation(this, R.anim.fadein);
        Animation anim= AnimationUtils.loadAnimation(this, R.anim.slide);
        Animation animright= AnimationUtils.loadAnimation(this, R.anim.slideright);
        profile.setAnimation(anim);
        qualification.setAnimation(animright);
        skill.setAnimation(anim);
        course.setAnimation(animright);
        projects.setAnimation(anim);
        pors.setAnimation(animright);

    }

    public void Profile(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Profile")) {
            Intent intent = new Intent(this, profile.class);
            startActivity(intent);
        }
    }
    public void Eduqua(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals(" Qualification")) {
            Intent intent = new Intent(this, eduqua.class);
            startActivity(intent);
        }
    }

    public void Skill(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Skills")) {
            Intent intent = new Intent(this, skill.class);
            startActivity(intent);
        }
    }


    public void CoursesCompleted(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Courses Covered")) {
            Intent intent = new Intent(this,CourseCompleted.class);
            startActivity(intent);
        }
    }
    public void Projects(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Projects")) {
            Intent intent = new Intent(this,Projects.class);
            startActivity(intent);
        }
    }

    public void PORs(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("PORs")) {
            Intent intent = new Intent(this,PORs.class);
            startActivity(intent);
        }
    }
};
