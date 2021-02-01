package com.google.hacktrial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AZActivity extends AppCompatActivity {

    android.support.v7.widget.CardView cdv_az1,cdv_az2,cdv_az3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_az);

        cdv_az1 = findViewById(R.id.cdv_az1);
        cdv_az2 = findViewById(R.id.cdv_az2);
        cdv_az3 = findViewById(R.id.cdv_az3);

        cdv_az1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AZActivity.this,AZActivity1.class);
                startActivity(i);
            }
        });

        cdv_az2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AZActivity.this,AZActivity2.class);
                startActivity(i);
            }
        });

        cdv_az3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AZActivity.this,AZActivity3.class);
                startActivity(i);
            }
        });

    }
}
