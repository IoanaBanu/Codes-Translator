package com.example.codestranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityASCII extends AppCompatActivity {
    private TextView txt7;
    private TextView result7;
    private Button toASCIIBtn;
    private Button toAlphaBtn7;
    private TextView ASCIIdyk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ascii);
        txt7 = (TextView) findViewById(R.id.txt7);
        result7 = (TextView) findViewById(R.id.result7);
        toASCIIBtn = (Button) findViewById(R.id.toASCIIBtn);
        toAlphaBtn7 = (Button) findViewById(R.id.toAlphaBtn7);
        ASCIIdyk = (TextView) findViewById(R.id.ASCIIdyk);
        toASCIIBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                String txtToConvert = txt7.getText().toString();
                String convertedTxt = ASCII.alphaToASCII(txtToConvert);
                result7.setText(convertedTxt);
            }
        });
        toAlphaBtn7.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                String txtToConvert = txt7.getText().toString();
                String convertedTxt = ASCII. asciiToAlpha(txtToConvert);
                result7.setText(convertedTxt);
            }
        });

        ASCIIdyk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ActivityASCII.this, DidYouKnowASCII.class);
                startActivity(myIntent);
            }
        });
    }

    }
