package com.example.multiscreentryout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String extraName="com.example.multiscreentryout.name";
    EditText writename;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        writename=findViewById(R.id.writename);
    }
    public void openActivity(View view){

        Toast.makeText(this, "dabb gaya bhai", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,MainActivity2.class);

        String name=writename.getText().toString();
        intent.putExtra(extraName,name);

        startActivity(intent);

    }

}