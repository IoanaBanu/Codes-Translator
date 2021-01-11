package com.example.codestranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
public class ActivityA1Z26 extends AppCompatActivity {
    private TextView txt6;
    private TextView result6;
    private Button toA1Z26Btn;
    private Button toAlphaBtn6;

    private TextView A1Z26dyk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1_z26);
        txt6 = (TextView) findViewById(R.id.txt6);
        result6 = (TextView) findViewById(R.id.result6);
        toA1Z26Btn = (Button) findViewById(R.id.toA1Z26Btn);
        toAlphaBtn6 = (Button) findViewById(R.id.toAlphaBtn6);
        A1Z26dyk = (TextView) findViewById(R.id.A1Z26dyk);

        toA1Z26Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String txtToConvert = txt6.getText().toString();
                String convertedTxt = A1Z26.alphaToA1Z26(txtToConvert);
                result6.setText(convertedTxt);
            }
        });
        toAlphaBtn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String txtToConvert = txt6.getText().toString();
                String convertedTxt = A1Z26.a1Z26ToAlpha(txtToConvert);
                result6.setText(convertedTxt);
            }
        });

        A1Z26dyk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ActivityA1Z26.this, DidYouKnowA1Z26.class);
                startActivity(myIntent);
            }
        });
    }

    }
