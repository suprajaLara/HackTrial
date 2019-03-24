package com.google.hacktrial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FitActivity extends AppCompatActivity {

    android.support.v7.widget.CardView cdv_fit1,cdv_fit2,cdv_fit3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fit);

        cdv_fit1 = findViewById(R.id.cdv_fit1);
        cdv_fit2 = findViewById(R.id.cdv_fit2);
        cdv_fit3 = findViewById(R.id.cdv_fit3);

        cdv_fit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FitActivity.this,FitActivity1.class);
                startActivity(i);
            }
        });

        cdv_fit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FitActivity.this,FitActivity2.class);
                startActivity(i);
            }
        });

        cdv_fit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FitActivity.this,FitActivity3.class);
                startActivity(i);
            }
        });

    }
}
