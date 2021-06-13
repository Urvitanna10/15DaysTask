package com.example.a15daystasks.task7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.a15daystasks.R;

public class Custom_listview extends AppCompatActivity {
    ListView mylistview;
    int image []={R.drawable.c,R.drawable.cplus,R.drawable.java,R.drawable.python,
            R.drawable.html,R.drawable.css,R.drawable.js};
    String []name={"C Language","C++ Language","Java","Python","HTML","CSS","JavaScript"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_listview);
        mylistview=findViewById(R.id.mylistview);
        MyAdapter myAdapter=new MyAdapter(Custom_listview.this,image,name);
        mylistview.setAdapter(myAdapter);
        mylistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                Intent intent=new Intent(Custom_listview.this,ListViewDetails.class);
                intent.putExtra("image",image[position]);
                intent.putExtra("name",name[position]);
                startActivity(intent);
            }
        });


    }
}