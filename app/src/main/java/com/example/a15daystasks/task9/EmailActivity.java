package com.example.a15daystasks.task9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.a15daystasks.R;

public class EmailActivity extends AppCompatActivity {
    EditText edtxt_email,edtxt_sub,edtxt_msg;
    Button sendbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        edtxt_email=(EditText)findViewById(R.id.edtxt_email);
        edtxt_sub=(EditText)findViewById(R.id.edtxt_sub);
        edtxt_msg=(EditText)findViewById(R.id.edtxt_msg);
        sendbtn=(Button)findViewById(R.id.sendbtn);
        sendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String to=edtxt_email.getText().toString();
                String subject=edtxt_sub.getText().toString();
                String message=edtxt_msg.getText().toString();

                Intent email=new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
                email.putExtra(Intent.EXTRA_SUBJECT,subject);
                email.putExtra(Intent.EXTRA_TEXT,message);
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email,"Send Email"));
            }
        });
    }
}