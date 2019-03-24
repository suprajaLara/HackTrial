package com.google.hacktrial;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NewsActivity extends AppCompatActivity {

    android.support.v7.widget.CardView cdv_news1,cdv_news2,cdv_news3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        cdv_news1 = findViewById(R.id.cdv_news1);
        cdv_news2 = findViewById(R.id.cdv_news2);
        cdv_news3 = findViewById(R.id.cdv_news3);

        cdv_news1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NewsActivity.this,NewsActivity1.class);
                startActivity(i);
            }
        });

        cdv_news2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NewsActivity.this,NewsActivity2.class);
                startActivity(i);
            }
        });

        cdv_news3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NewsActivity.this,NrewsActivity3.class);
                startActivity(i);
            }
        });

    }
}
