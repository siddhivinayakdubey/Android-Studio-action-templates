package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;
    Button btn;
    String[] arr ={"item 1","item 2","item 3","item 4","item 5","item 6","item 7","item 8","item 9"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=findViewById(R.id.list);
        btn=findViewById(R.id.textbutton);
//        Using Built-in Adapter
//        ArrayAdapter<String> ad=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arr);
//        list.setAdapter(adapter);


//        Using Custom Adapter
        SiddhiAdapter ad=new SiddhiAdapter(this,R.layout.siddhi_adapter,arr);
        list.setAdapter(ad);



    }
}
