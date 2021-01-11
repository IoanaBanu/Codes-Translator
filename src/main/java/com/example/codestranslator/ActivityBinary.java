package com.example.codestranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
public class ActivityBinary extends AppCompatActivity {
    private TextView txt5;
    private TextView result5;
    private Button toBinaryBtn;
    private Button toAlphaBtn5;
    private TextView Binarydyk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary);
        txt5 = (TextView) findViewById(R.id.txt5);
        result5 = (TextView) findViewById(R.id.result5);
        Binarydyk = (TextView) findViewById(R.id.Binarydyk);
        toBinaryBtn = (Button) findViewById(R.id.toBinaryBtn);
        toAlphaBtn5 = (Button) findViewById(R.id.toAlphaBtn5);

        toBinaryBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                String txtToConvert = txt5.getText().toString();
                String convertedTxt = BinaryCode.alphaToBinary(txtToConvert);
                result5.setText(convertedTxt);
            }
        });
        toAlphaBtn5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                String txtToConvert = txt5.getText().toString();
                String convertedTxt = BinaryCode. binaryToAlpha(txtToConvert);
                result5.setText(convertedTxt);
            }
        });
        Binarydyk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ActivityBinary.this, DidYouKnowBinary.class);
                startActivity(myIntent);
            }
        });
    }
}