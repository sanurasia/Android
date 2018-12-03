package com.example.sanjaykumarchaurasia.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.content.Intent;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String info = intent.getStringExtra("name");
        Toast.makeText(this, "" +
                "" +
                info, Toast.LENGTH_SHORT).show();

        TextView txtView = (TextView) findViewById(R.id.textView2);
        txtView.setText(info);

    }

}