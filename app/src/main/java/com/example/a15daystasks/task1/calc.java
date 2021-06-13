package com.example.a15daystasks.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.a15daystasks.R;

public class calc extends AppCompatActivity {
    EditText num1,num2,ans;
    Button btn_add,btn_sub,btn_mul,btn_div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
        ans=(EditText)findViewById(R.id.ans);
        btn_add=(Button)findViewById(R.id.add);
        btn_sub=(Button)findViewById(R.id.sub);
        btn_mul=(Button)findViewById(R.id.mul);
        btn_div=(Button)findViewById(R.id.div);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1,number2;
                number1=num1.getText().toString();
                number2=num2.getText().toString();

                int a =Integer.parseInt(number1);
                int b =Integer.parseInt(number2);
                int sum =a+b;
                ans.setText(String.valueOf(sum));
                Toast.makeText(calc.this,"sum is: "+sum,Toast.LENGTH_SHORT).show();
            }
        });
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1,number2;
                number1=num1.getText().toString();
                number2=num2.getText().toString();

                int a =Integer.parseInt(number1);
                int b =Integer.parseInt(number2);
                int sub =a-b;
                ans.setText(String.valueOf(sub));
                Toast.makeText(calc.this,"subtraction is: "+sub,Toast.LENGTH_SHORT).show();
            }
        });
        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1,number2;
                number1=num1.getText().toString();
                number2=num2.getText().toString();

                int a =Integer.parseInt(number1);
                int b =Integer.parseInt(number2);
                int mul =a*b;
                ans.setText(String.valueOf(mul));
                Toast.makeText(calc.this,"multiplication is: "+mul,Toast.LENGTH_SHORT).show();
            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1,number2;
                number1=num1.getText().toString();
                number2=num2.getText().toString();

                int a =Integer.parseInt(number1);
                int b =Integer.parseInt(number2);
                int div =a/b;
                ans.setText(String.valueOf(div));
                Toast.makeText(calc.this,"division is: "+div,Toast.LENGTH_SHORT).show();
            }
        });
    }
}