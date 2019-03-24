package com.google.hacktrial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FundActivity extends AppCompatActivity {

    android.support.v7.widget.CardView cdv_fund1,cdv_fund2,cdv_fund3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fund);

        cdv_fund1 = findViewById(R.id.cdv_fund1);
        cdv_fund2 = findViewById(R.id.cdv_fund2);
        cdv_fund3 = findViewById(R.id.cdv_fund3);

        cdv_fund1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FundActivity.this,FundActivity1.class);
                startActivity(i);
            }
        });

        cdv_fund2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FundActivity.this,FundActivity2.class);
                startActivity(i);
            }
        });

        cdv_fund3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FundActivity.this,FundActivity3.class);
                startActivity(i);
            }
        });

    }
}
