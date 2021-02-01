package com.google.hacktrial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CardViewActivity extends AppCompatActivity {

    android.support.v7.widget.CardView cdv_1,cdv_2,cdv_3,cdv_4,cdv_5,cdv_6,cdv_7,cdv_8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);

        cdv_1 = findViewById(R.id.cdv_1);
        cdv_2 = findViewById(R.id.cdv_2);
        cdv_3 = findViewById(R.id.cdv_3);
        cdv_4 = findViewById(R.id.cdv_4);
        cdv_5 = findViewById(R.id.cdv_5);
        cdv_6 = findViewById(R.id.cdv_6);
        cdv_7 = findViewById(R.id.cdv_7);
        cdv_8 = findViewById(R.id.cdv_8);


        cdv_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CardViewActivity.this,MapsActivity.class);
                startActivity(i);
            }
        });

        cdv_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CardViewActivity.this,NewsActivity.class);
                startActivity(i);
            }
        });

        cdv_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CardViewActivity.this,FirstActivity.class);
                startActivity(i);
            }
        });

        cdv_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CardViewActivity.this,AZActivity.class);
                startActivity(i);
            }
        });

        cdv_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CardViewActivity.this,FoodActivity.class);
                startActivity(i);
            }
        });

        cdv_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CardViewActivity.this,FitActivity.class);
                startActivity(i);
            }
        });

        cdv_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CardViewActivity.this,FundActivity.class);
                startActivity(i);
            }
        });

        cdv_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CardViewActivity.this,ChatActivity.class);
                startActivity(i);
            }
        });
    }
}
