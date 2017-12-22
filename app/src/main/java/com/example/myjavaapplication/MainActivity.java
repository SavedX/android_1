package com.example.myjavaapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView helloWorld;
    Button btnShow;
    Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloWorld = (TextView) findViewById(R.id.hello_world);
        btnShow = (Button) findViewById(R.id.btnShow);
        btnClear = (Button) findViewById(R.id.btnClear);

        helloWorld.setTextColor(Color.RED);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helloWorld.setText("Привет, Мир!");

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helloWorld.setText("");

            }
        });

    }
}