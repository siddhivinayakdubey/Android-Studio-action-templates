package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] arr ={"item 1","item 2","item 3","item 4","item 5","item 6","item 7","item 8","item 9","item 1","item 2","item 3","item 4","item 5","item 6","item 7","item 8","item 9","item 1","item 2","item 3","item 4","item 5","item 6","item 7","item 8","item 9","item 1","item 2","item 3","item 4","item 5","item 6","item 7","item 8","item 9","item 1","item 2","item 3","item 4","item 5","item 6","item 7","item 8","item 9","item 1","item 2","item 3","item 4","item 5","item 6","item 7","item 8","item 9"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter c=new CustomAdapter(arr);
        recyclerView.setAdapter(c);

    }
}