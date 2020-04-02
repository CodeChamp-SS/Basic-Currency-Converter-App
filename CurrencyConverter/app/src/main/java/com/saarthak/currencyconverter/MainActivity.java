package com.saarthak.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.b1);
        Button btn2 = findViewById(R.id.b2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inrAmt = findViewById(R.id.tf1);
                Double amtD = Double.parseDouble(inrAmt.getText().toString());
                Double dollarAmt = amtD*.01404;
                Toast.makeText(MainActivity.this, "$ " + String.format("%.3f",dollarAmt), Toast.LENGTH_LONG).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inrAmt = findViewById(R.id.tf1);
                Double amtD = Double.parseDouble(inrAmt.getText().toString());
                Double poundAmt = amtD*.01070;
                Toast.makeText(MainActivity.this, "£ " + String.format("%.3f",poundAmt), Toast.LENGTH_LONG).show();
            }
        });

    }
}
