package com.google.hacktrial;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class FoodActivity2 extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food2);

        webView = findViewById(R.id.web_view);

        webView.setWebViewClient(new WebViewClient(){

            ProgressDialog pd = new ProgressDialog(FoodActivity2.this);

            public void onPageStarted(WebView wv, String url, Bitmap b)
            {

                super.onPageStarted(wv,url,b);
                pd.setTitle("Loading.....");
                pd.setMessage("Please wait......");
                pd.setCancelable(false);
                pd.show();

            }

            public void onPageCommitVisible(WebView wv, String url){

                super.onPageCommitVisible(wv,url);
                if(pd!=null)
                    pd.dismiss();

            }

        });// configure the client to use when opening URLs, I'm adding a progress dialog


        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);//allow pinch to zoom
        webView.getSettings().setDisplayZoomControls(false);// disable the default zoom controls on the page
        webView.getSettings().setUseWideViewPort(true);// use responsive layout
        webView.getSettings().setLoadWithOverviewMode(true);// Zoom out if the content width is greater than the width of the viewport
        webView.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        webView.loadUrl("https://www.healthline.com/search?q1=Food");

    }
}
