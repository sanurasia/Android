package com.example.sanjaykumarchaurasia.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



// some more code

    public void openMethod(View v) {
        // does something very interesting
        Toast.makeText(this, "This is my first toast message", Toast.LENGTH_SHORT).show();
    }

    public void openNewActivity(View v) {
        // does something very interesting
        //Toast.makeText(this, "This is my second toast message", Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(this, SecondActivity.class);
        myIntent.putExtra("name", "This is the second activity");
        startActivity(myIntent);

    }
// some more code
}
