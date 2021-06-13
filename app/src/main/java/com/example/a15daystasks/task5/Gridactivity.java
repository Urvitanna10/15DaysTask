package com.example.a15daystasks.task5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import com.example.a15daystasks.R;

public class Gridactivity extends AppCompatActivity {
    GridView gv1;
    String course[]={"PHP","ANDROID","JAVA","IOS","ANGULAR","C#","C++","DBMS"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridactivity);
        gv1 = findViewById(R.id.gv1);

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, course);
        gv1.setAdapter(arrayAdapter);

    }
}