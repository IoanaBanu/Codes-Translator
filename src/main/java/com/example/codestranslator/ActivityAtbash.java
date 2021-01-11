package com.example.codestranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityAtbash extends AppCompatActivity {
    private TextView txt8;
    private TextView result8;
    private Button toAtbashBtn;
    private Button toAlphaBtn8;
    private TextView Atbashdyk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atbash);
        txt8 = (TextView) findViewById(R.id.txt8);
        result8 = (TextView) findViewById(R.id.result8);
        toAtbashBtn = (Button) findViewById(R.id.toAtbashBtn);
        toAlphaBtn8 = (Button) findViewById(R.id.toAlphaBtn8);
        Atbashdyk = (TextView) findViewById(R.id.Atbashdyk);

        toAtbashBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                String txtToConvert = txt8.getText().toString();
                String convertedTxt = Atbash.alphaToAtbash(txtToConvert);
                result8.setText(convertedTxt);
            }
        });
        toAlphaBtn8.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                String txtToConvert = txt8.getText().toString();
                String convertedTxt = Atbash.alphaToAtbash(txtToConvert);
                result8.setText(convertedTxt);
            }
        });

        Atbashdyk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ActivityAtbash.this, DidYouKnowAtbash.class);
                startActivity(myIntent);
            }
        });
    }

}