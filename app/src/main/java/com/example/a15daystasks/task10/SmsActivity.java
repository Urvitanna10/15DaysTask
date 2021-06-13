package com.example.a15daystasks.task10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.a15daystasks.R;

public class SmsActivity extends AppCompatActivity {
    EditText mobile,msgg;
    Button btnsend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        btnsend=(Button)findViewById(R.id.btnsend);
        mobile=(EditText) findViewById(R.id.mobile);
        msgg=(EditText)findViewById(R.id.msgg);

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String no=mobile.getText().toString();
                String msg=msgg.getText().toString();

                SmsManager sms=SmsManager.getDefault();
                sms.sendTextMessage(no,null,msg,null,null);
                Toast.makeText(getApplicationContext(),"Message Send",Toast.LENGTH_LONG).show();
            }
        });
    }
}