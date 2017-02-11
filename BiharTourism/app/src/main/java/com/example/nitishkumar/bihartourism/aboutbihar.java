

package com.example.nitishkumar.bihartourism;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Nitish kumar on 9/24/2016.
 */
public class aboutbihar extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutbihar);

        ImageButton btn = (ImageButton)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aboutbihar.this, district.class);
                startActivity(intent);
            }
        });
    }
};

