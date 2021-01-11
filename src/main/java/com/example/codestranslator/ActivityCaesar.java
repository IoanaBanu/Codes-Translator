package com.example.codestranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityCaesar extends AppCompatActivity {
    private EditText txt3,txt33;
    private TextView result3;
    private Button toCaesarBtn;
    private Button toAlphaBtn3;
    private TextView Caesardyk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caesar_cipher_main);
        txt3 = (EditText) findViewById(R.id.txt3);
        txt33 = (EditText) findViewById(R.id.txt33);
        result3 = (TextView) findViewById(R.id.result3);
        toCaesarBtn = (Button) findViewById(R.id.toCaesarBtn);
        toAlphaBtn3 = (Button) findViewById(R.id.toAlphaBtn3);
        Caesardyk = (TextView) findViewById(R.id.Caesardyk);
        toCaesarBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                String txtToConvert = txt3.getText().toString();
                Integer keyText = Integer.valueOf(txt33.getText().toString());
                String convertedTxt = CaesarCode.encrypter(txtToConvert,keyText);
                result3.setText(convertedTxt);
            }
        });
        toAlphaBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtToConvert = txt3.getText().toString();
                Integer keyText = Integer.valueOf(txt33.getText().toString());
                String convertedTxt = CaesarCode.decrypter(txtToConvert,keyText);
                result3.setText(convertedTxt);
            }
        });
        Caesardyk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ActivityCaesar.this, DidYouKnowCaesar.class);
                startActivity(myIntent);
            }
        });
    }
}