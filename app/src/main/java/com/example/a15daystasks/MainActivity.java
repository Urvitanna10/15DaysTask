package com.example.a15daystasks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.a15daystasks.task1.calc;
import com.example.a15daystasks.task10.SmsActivity;
import com.example.a15daystasks.task11.MusicActivity;
import com.example.a15daystasks.task12.VideoActivity;
import com.example.a15daystasks.task2.Registration;
import com.example.a15daystasks.task3.ScrollActivity;
import com.example.a15daystasks.task4.ListActivity;
import com.example.a15daystasks.task5.Gridactivity;
import com.example.a15daystasks.task6.WebActivity;
import com.example.a15daystasks.task7.Custom_listview;
import com.example.a15daystasks.task8.Callactivity;
import com.example.a15daystasks.task9.EmailActivity;

public class MainActivity extends AppCompatActivity {
    Button task1,task2,task4,task5,task6,task7,task8,task9,task10,task11,task12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        task1=findViewById(R.id.task1);
        task2=findViewById(R.id.task2);
        task4=findViewById(R.id.task4);
        task5=findViewById(R.id.task5);
        task6=findViewById(R.id.task6);
        task7=findViewById(R.id.task7);
        task8=findViewById(R.id.task8);
        task9=findViewById(R.id.task9);
        task10=findViewById(R.id.task10);
        task11=findViewById(R.id.task11);
        task12=findViewById(R.id.task12);


        task1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, calc.class);
                startActivity(i);
            }
        });
        task2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, Registration.class);
                startActivity(i);
            }
        });

        task4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, ListActivity.class);
                startActivity(i);
            }
        });
        task5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, Gridactivity.class);
                startActivity(i);
            }
        });
        task6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, WebActivity.class);
                startActivity(i);
            }
        });

        task7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, Custom_listview.class);
                startActivity(i);
            }
        });
        task8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, Callactivity.class);
                startActivity(i);
            }
        });
        task9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, EmailActivity.class);
                startActivity(i);
            }
        });
        task10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, SmsActivity.class);
                startActivity(i);
            }
        });
        task11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, MusicActivity.class);
                startActivity(i);
            }
        });
        task12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, VideoActivity.class);
                startActivity(i);
            }
        });

    }
}