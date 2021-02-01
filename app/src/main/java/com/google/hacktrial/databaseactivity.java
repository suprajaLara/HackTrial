package com.google.hacktrial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.transform.Templates;

public class databaseactivity extends AppCompatActivity {
    EditText ed;
    Button bt;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_databaseactivity);

        ed = findViewById(R.id.ed);
        bt = findViewById(R.id.bt);
        tv = findViewById(R.id.tv);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
                databaseAccess.open();
                String s = ed.getText().toString();
                String d = databaseAccess.getAddress(s);
                tv.setText(d);
                databaseAccess.close();
            }
        });

    }
}
