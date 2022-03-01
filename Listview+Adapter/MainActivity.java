package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView list;
    String[] arr ={"item 1","item 2","item 3","item 4","item 5","item 6","item 7","item 8","item 9"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=findViewById(R.id.list);
//        Using Built-in Adapter
//        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arr);
//        list.setAdapter(adapter);


//        Using Custom Adapter
        SiddhiAdapter ad=new SiddhiAdapter(this,R.layout.siddhi_adapter,arr);
        list.setAdapter(ad);

    }
}