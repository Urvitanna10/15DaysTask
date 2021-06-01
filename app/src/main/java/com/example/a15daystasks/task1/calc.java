package com.example.a15daystasks.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.a15daystasks.R;

public class calc extends AppCompatActivity {
    EditText num1,num2;
    Button btn_add,btn_sub,btn_mul,btn_div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
        btn_add=(Button)findViewById(R.id.add);
        btn_sub=(Button)findViewById(R.id.sub);
        btn_mul=(Button)findViewById(R.id.mul);
        btn_div=(Button)findViewById(R.id.div);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1,number2;

            }
        });
    }
}