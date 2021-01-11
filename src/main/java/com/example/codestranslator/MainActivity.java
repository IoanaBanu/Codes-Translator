
package com.example.codestranslator;

        import androidx.appcompat.app.AppCompatActivity;


        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button,button1,button2, button3,button4,button5,button6,button7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button = (Button) findViewById(R.id.buttonmorse);
        button1 = (Button) findViewById(R.id.buttoncaesar);
        button2 = (Button) findViewById(R.id.buttonrot13);
        button3 = (Button) findViewById(R.id.buttonvigenere);
        button4 = (Button) findViewById(R.id.buttonbinary);
        button5 = (Button) findViewById(R.id.buttona1z26);
        button6 = (Button) findViewById(R.id.buttonascii);
        button7 = (Button) findViewById(R.id.buttonatbash);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityCaesar();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           openActivityROT13();
                                       }});
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityVigenere();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityBinary();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityA1Z26();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityASCII();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityAtbash();
            }
        });

    }
        public void openActivityROT13()
        {
            Intent intent = new Intent(this, ActivityROT13.class);
            startActivity(intent);
        }
    public void openMainActivity()
    {
        Intent intent = new Intent(this, ActivityMorse.class);
        startActivity(intent);
    }
    public void openActivityCaesar()
    {
        Intent intent = new Intent(this, ActivityCaesar.class);
        startActivity(intent);
    }
    public void openActivityVigenere()
    {
        Intent intent = new Intent(this, ActivityVigenere.class);
        startActivity(intent);
    }
    public void openActivityBinary()
    {
        Intent intent = new Intent(this, ActivityBinary.class);
        startActivity(intent);
    }
    public void openActivityA1Z26()
    {
        Intent intent = new Intent(this, ActivityA1Z26.class);
        startActivity(intent);
    }
    public void openActivityASCII()
    {
        Intent intent = new Intent(this, ActivityASCII.class);
        startActivity(intent);
    }
    public void openActivityAtbash()
    {
        Intent intent = new Intent(this, ActivityAtbash.class);
        startActivity(intent);
    }
}
