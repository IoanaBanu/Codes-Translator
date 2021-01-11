package com.example.codestranslator;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;




public class ActivityWelcome extends AppCompatActivity {

    private ImageView theimageView;
    private Button getstarted;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        theimageView = (ImageView) findViewById(R.id.theimageView);
        getstarted = (Button) findViewById(R.id.getstarted);
        getstarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openApplication();
            }
        });
        theimageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent myIntent = new Intent(ActivityWelcome.this, MainActivity.class);
                startActivity(myIntent);
            }
        });

    }
    public void openApplication()
    {
        Intent intent = new Intent(this, ActivityMorse.class);
        startActivity(intent);
    }
}