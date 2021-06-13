package com.example.a15daystasks.task7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a15daystasks.R;

public class ListViewDetails extends AppCompatActivity {
    ImageView ivimg;
    TextView tvnamedtl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_details);
        ivimg=findViewById(R.id.ivimg);
        tvnamedtl=findViewById(R.id.tvnamedtl);
        Intent intent=getIntent();
        int image=intent.getIntExtra("image",R.drawable.cplus);
        ivimg.setImageResource(image);
        String name=intent.getStringExtra("name");
        tvnamedtl.setText(name);
    }
}