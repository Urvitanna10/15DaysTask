package com.example.a15daystasks.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a15daystasks.R;

public class Registration extends AppCompatActivity {
    boolean invalid =false;
    String Colector ="";
    TextView txtalertName;
    EditText UserName, UserPassword , UserContact,UserComment;
    Button SubmitSave;
    RadioButton Malebtn,femalebtn;
    CheckBox html,android,php;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        UserName=findViewById(R.id.username);
        UserPassword=findViewById(R.id.userPassword);
        UserContact=findViewById(R.id.userContact);
        UserComment=findViewById(R.id.userComment);
        txtalertName=findViewById(R.id.userAlert);
        Malebtn=findViewById(R.id.Male);
        femalebtn=findViewById(R.id.Female);
        html=findViewById(R.id.HTML);
        android=findViewById(R.id.Android);
        php=findViewById(R.id.PHP);
        SubmitSave=findViewById(R.id.btnSubmit);
        SubmitSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = UserName.getText().toString();
                String Pascode=UserPassword.getText().toString();
                String contact=UserContact.getText().toString();
                String comment=UserComment.getText().toString();
                if (name.isEmpty()){
                    Toast.makeText(Registration.this,"Please fill the password field",Toast.LENGTH_SHORT).show();
                }
                else if (name.equals("Sameh") ||name.equals("UlHaq")){
                    invalid=true;
                    txtalertName.setText("Name Already exist");
                }

                else if(Pascode.isEmpty()){
                    Toast.makeText(Registration.this,"Pleas fill the password field",Toast.LENGTH_SHORT).show();
                }


                else if (contact.isEmpty()){
                    Toast.makeText(Registration.this,"Pleas fill the Contact field",Toast.LENGTH_SHORT).show();
                }

                else if (comment.isEmpty()){
                    Toast.makeText(Registration.this,"Pleas fill the Comment field",Toast.LENGTH_SHORT).show();
                }



                else{

                    Colector+=name+"\n";
                    Colector+=Pascode+"\n";
                    Colector+=contact+"\n";
                    Colector+=comment+"\n";
                    if (html.isChecked()){
                        Colector+="HTML"+"\n";
                        if (android.isChecked()){
                            Colector+="CSS"+"\n";
                        }
                        if (php.isChecked()){
                            Colector+="PHP"+"\n";
                        }
                    }
                    Toast.makeText(Registration.this,"User Info \n:"+Colector,Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}