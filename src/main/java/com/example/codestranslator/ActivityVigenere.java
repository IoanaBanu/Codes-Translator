package com.example.codestranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityVigenere extends AppCompatActivity {
    private EditText txt4,txt44;
    private TextView result4;
    private Button toVigenereBtn;
    private Button toAlphaBtn4;
    private TextView Vigeneredyk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vigenere);
        txt4 = (EditText) findViewById(R.id.txt4);
        txt44 = (EditText) findViewById(R.id.txt44);
        result4 = (TextView) findViewById(R.id.result4);
        toVigenereBtn = (Button) findViewById(R.id.toVigenereBtn);
        toAlphaBtn4 = (Button) findViewById(R.id.toAlphaBtn4);
        Vigeneredyk = (TextView) findViewById(R.id.Vigeneredyk);
        toVigenereBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                String txtToConvert = txt4.getText().toString();
                String keyText = txt44.getText().toString();
                String convertedTxt = VigenereCode.encrypt(txtToConvert,keyText);
                result4.setText(convertedTxt);
            }
        });
        toAlphaBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtToConvert = txt4.getText().toString();
                String keyText = txt44.getText().toString();
                String convertedTxt = VigenereCode.decrypt(txtToConvert,keyText);
                result4.setText(convertedTxt);
            }
        });
        Vigeneredyk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ActivityVigenere.this, DidYouKnowVigenere.class);
                startActivity(myIntent);
            }
        });
    }
}