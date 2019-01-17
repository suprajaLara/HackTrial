package com.google.hacktrial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CardViewActivity extends AppCompatActivity {

    android.support.v7.widget.CardView cdv_1,cdv_2,cdv_3,cdv_4,cdv_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);

        cdv_1 = findViewById(R.id.cdv_1);
        cdv_2 = findViewById(R.id.cdv_2);
        cdv_3 = findViewById(R.id.cdv_3);
        cdv_4 = findViewById(R.id.cdv_4);
        cdv_5 = findViewById(R.id.cdv_5);

        cdv_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CardViewActivity.this,Maps.class);
                startActivity(i);
            }
        });

        cdv_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CardViewActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
