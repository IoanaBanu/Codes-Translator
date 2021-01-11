package com.example.codestranslator;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;
        import android.widget.Button;
public class ActivityMorse extends AppCompatActivity {
    private TextView txt;
    private TextView result;
    private Button toMorseBtn;
    private Button toAlphaBtn;
    private TextView MorseCodedyk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.txt);
        result = (TextView) findViewById(R.id.result);
        toMorseBtn = (Button) findViewById(R.id.toMorseBtn);
        toAlphaBtn = (Button) findViewById(R.id.toAlphaBtn);
        MorseCodedyk = (TextView) findViewById(R.id.MorseCodedyk);

        toMorseBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                String txtToConvert = txt.getText().toString();
                String convertedTxt = MorseCode.alphaToMorse(txtToConvert);
                result.setText(convertedTxt);
            }
        });
        toAlphaBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                String txtToConvert = txt.getText().toString();
                String convertedTxt = MorseCode.morseToAlpha(txtToConvert);
                result.setText(convertedTxt);
            }
        });

        MorseCodedyk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ActivityMorse.this, DidYouKnowMorse.class);
                startActivity(myIntent);
            }
        });
    }


}