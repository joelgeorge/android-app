package com.baabtra.joelgeorge.login2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button signup;
    Button signin;
    EditText phno;
    EditText pass;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signin=(Button)findViewById(R.id.bt_signin);
        signup=(Button)findViewById(R.id.bt_signup);
        phno=(EditText)findViewById(R.id.editphno);
        pass=(EditText)findViewById(R.id.editpass);
        t1=(TextView)findViewById(R.id.fgpass);

        signin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String st1 = phno.getText().toString();
                String st2 = pass.getText().toString();


                Toast.makeText(MainActivity.this, "phno " + st1 + " password" + st2, Toast.LENGTH_SHORT).show();







            }
                                  });

                signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);






            }
        });

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            Intent intent=new Intent(MainActivity.this,Main22Activity.class);
                startActivity(intent);

            }
        });









        ; };};
