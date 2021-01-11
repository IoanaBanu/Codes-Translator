package com.example.codestranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityROT13 extends AppCompatActivity {
    private TextView txt2;
    private TextView result2;
    private Button toROT13Btn;
    private Button toAlphaBtn2;
    private TextView ROT13dyk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_o_t13);
        txt2 = (TextView) findViewById(R.id.txt2);
        result2 = (TextView) findViewById(R.id.result2);
        toROT13Btn = (Button) findViewById(R.id.toROT13Btn);
        toAlphaBtn2 = (Button) findViewById(R.id.toAlphaBtn2);
        ROT13dyk = (TextView) findViewById(R.id.ROT13dyk);

        toROT13Btn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                String txtToConvert = txt2.getText().toString();
                String convertedTxt = ROT13Cipher.rot13encode(txtToConvert);
                result2.setText(convertedTxt);
            }
        });
     toAlphaBtn2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             String txtToConvert = txt2.getText().toString();
             String convertedTxt = ROT13Cipher.rot13decode(txtToConvert);
             result2.setText(convertedTxt);
         }
     });
        ROT13dyk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ActivityROT13.this, DidYouKnowROT13.class);
                startActivity(myIntent);
            }
        });
    }
    }
