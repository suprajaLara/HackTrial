package com.google.hacktrial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    android.support.v7.widget.CardView cdv_first1,cdv_first2,cdv_first3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        cdv_first1 = findViewById(R.id.cdv_first1);
        cdv_first2 = findViewById(R.id.cdv_first2);
        cdv_first3 = findViewById(R.id.cdv_first3);

        cdv_first1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FirstActivity.this,FirstActivity1.class);
                startActivity(i);
            }
        });

        cdv_first2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FirstActivity.this,FirstActivity2.class);
                startActivity(i);
            }
        });

        cdv_first3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FirstActivity.this,FirstActivity3.class);
                startActivity(i);
            }
        });

    }
}
