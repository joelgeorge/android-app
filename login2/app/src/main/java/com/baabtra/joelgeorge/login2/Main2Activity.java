package com.baabtra.joelgeorge.login2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText name;
    EditText email;
    EditText phno;
    EditText pass1;
    EditText pass2;
    Button signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name=(EditText)findViewById(R.id.name);
        email=(EditText)findViewById(R.id.email);
        phno=(EditText)findViewById(R.id.phno);
        pass1=(EditText)findViewById(R.id.pass1);
        pass2=(EditText)findViewById(R.id.pass2);
        signup=(Button)findViewById(R.id.signup);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st1=name.getText().toString();
                String st2=email.getText().toString();
                String st3=phno.getText().toString();
                String st4=pass1.getText().toString();
                String st5=pass2.getText().toString();

                if(st1.length()==0) {
                    Toast.makeText(Main2Activity.this, "enter name", Toast.LENGTH_SHORT).show();}

                    if(st2.length()==0){
                        Toast.makeText(Main2Activity.this, "email", Toast.LENGTH_SHORT).show();}

                        if(st3.length()==0){
                            Toast.makeText(Main2Activity.this, "phno", Toast.LENGTH_SHORT).show();}

                            if(st4.length()==0){
                                Toast.makeText(Main2Activity.this, "password1", Toast.LENGTH_SHORT).show();}

                                if(st5.length()==0){
                                    Toast.makeText(Main2Activity.this, "password2", Toast.LENGTH_SHORT).show();}

                }


                } );

            }
        }





        ;


