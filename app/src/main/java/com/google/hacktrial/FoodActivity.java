package com.google.hacktrial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FoodActivity extends AppCompatActivity {

    android.support.v7.widget.CardView cdv_food1,cdv_food2,cdv_food3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        cdv_food1 = findViewById(R.id.cdv_food1);
        cdv_food2 = findViewById(R.id.cdv_food2);
        cdv_food3 = findViewById(R.id.cdv_food3);

        cdv_food1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FoodActivity.this,FoodActivity1.class);
                startActivity(i);
            }
        });

        cdv_food2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FoodActivity.this,FoodActivity2.class);
                startActivity(i);
            }
        });

        cdv_food3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FoodActivity.this,FoodActivity3.class);
                startActivity(i);
            }
        });

    }
}
