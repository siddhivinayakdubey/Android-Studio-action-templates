package com.example.listviewapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SiddhiAdapter extends ArrayAdapter<String> {
    public String[] arr;
    public SiddhiAdapter(@NonNull Context context, int resource, @NonNull String[] arr) {
        super(context, resource, arr);
        this.arr=arr;
    }

    @Nullable
    @Override
    public String getItem(int position) {

        return arr[position];

    }

    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.siddhi_adapter,parent,false);
        TextView t=convertView.findViewById(R.id.listtext);
        t.setText(getItem(position));
        return convertView;
    }
}
