package com.example.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView myListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView=findViewById(R.id.myListView);

        ArrayList<String> myStringArrayList = new ArrayList<>();

        myStringArrayList.add("AAAAAAAA");
        myStringArrayList.add("BBBBBBBB");
        myStringArrayList.add("CCCCCCCC");
        myStringArrayList.add("DDDDDDDD");
        myStringArrayList.add("F");
        myStringArrayList.add("G");
        myStringArrayList.add("H");
        myStringArrayList.add("I");
        myStringArrayList.add("J");
        myStringArrayList.add("K");

        ArrayAdapter<String> myArrayAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, myStringArrayList);
        myListView.setAdapter(myArrayAdapter);
    }
}