package com.example.multiscreentryout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView displayname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        displayname=findViewById(R.id.displayname);

        String name=getIntent().getStringExtra(MainActivity.extraName);
        displayname.setText(name);
    }
}