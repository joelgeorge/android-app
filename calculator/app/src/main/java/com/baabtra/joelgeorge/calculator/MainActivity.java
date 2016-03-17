package com.baabtra.joelgeorge.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView out;
    EditText et1;
    EditText et2;
    Button plus;
    Button min;
    Button mul;
    Button div;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        out=(TextView)findViewById(R.id.out1);
        et1=(EditText)findViewById(R.id.no1);
        et2=(EditText)findViewById(R.id.no2);
        plus=(Button)findViewById(R.id.btplus);
        min=(Button)findViewById(R.id.btmin);
        mul=(Button)findViewById(R.id.btmul);
        div=(Button)findViewById(R.id.btdiv);




        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ett1=et1.getText().toString();
                String ett2=et2.getText().toString();
                if (ett1.length()==0|| ett2.length()==0)
                {
                    if (ett1.length()==0&& ett2.length()==0)
                    {
                        int et1=0;
                        int et2=0;
                        out.setText("0");

                    }
                    else {


                if(ett1.length()==0)
                {
                    int et_1=0;
                    int et_2 = Integer.parseInt(et2.getText().toString());
                    int et_3 = et_1 + et_2;
                    String st3 = String.valueOf(et_3);
                    out.setText(st3);
                }
                    else
                if (ett2.length()==0) {
                    int et_2 = 0;
                    int et_1 = Integer.parseInt(et1.getText().toString());
                    int et_3 = et_1 + et_2;
                    String st3 = String.valueOf(et_3);
                    out.setText(st3);
                }
                }


                }

                else {

                    int et_1 = Integer.parseInt(et1.getText().toString());
                    int et_2 = Integer.parseInt(et2.getText().toString());
                    int et_3 = et_1 + et_2;
                    String st3 = String.valueOf(et_3);
                    out.setText(st3);
                }


            }
        });


        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ett1 = et1.getText().toString();
                String ett2 = et2.getText().toString();
                if (ett1.length() == 0 || ett2.length() == 0) {
                    if (ett1.length() == 0 && ett2.length() == 0) {
                        int et1 = 0;
                        int et2 = 0;
                        out.setText("0");

                    }
                    else
                    {


                    if (ett1.length() == 0) {
                        int et_1 = 0;
                        int et_2 = Integer.parseInt(et2.getText().toString());
                        int et_3 = et_1 - et_2;
                        String st3 = String.valueOf(et_3);
                        out.setText(st3);
                    } else if (ett2.length() == 0) {
                        int et_2 = 0;
                        int et_1 = Integer.parseInt(et1.getText().toString());
                        int et_3 = et_1-et_2;
                        String st3 = String.valueOf(et_3);
                        out.setText(st3);

                    }}


                } else {

                    int et_1 = Integer.parseInt(et1.getText().toString());
                    int et_2 = Integer.parseInt(et2.getText().toString());
                    int et_3 = et_1-et_2;
                    String st3 = String.valueOf(et_3);
                    out.setText(st3);
                }


            }
        });




        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ett1=et1.getText().toString();
                String ett2=et2.getText().toString();
                if (ett1.length()==0|| ett2.length()==0)
                {
                    if (ett1.length()==0&& ett2.length()==0)
                    {
                        int et1=0;
                        int et2=0;
                        out.setText("0");

                    }
                    else
                    {



                    if(ett1.length()==0)
                    {
                        int et_1=0;
                        int et_2 = Integer.parseInt(et2.getText().toString());
                        int et_3 = et_1*et_2;
                        String st3 = String.valueOf(et_3);
                        out.setText(st3);
                    }
                    else
                    if (ett2.length()==0)
                    {
                        int et_2=0;
                        int et_1 = Integer.parseInt(et1.getText().toString());
                        int et_3 = et_1 * et_2;
                        String st3 = String.valueOf(et_3);
                        out.setText(st3);

                    }}


                }
                else {

                    int et_1 = Integer.parseInt(et1.getText().toString());
                    int et_2 = Integer.parseInt(et2.getText().toString());
                    int et_3 = et_1 * et_2;
                    String st3 = String.valueOf(et_3);
                    out.setText(st3);
                }


            }
        });


        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ett1 = et1.getText().toString();
                String ett2 = et2.getText().toString();
                if (ett1.length() == 0 || ett2.length() == 0) {
                    if (ett1.length() == 0 && ett2.length() == 0) {
                        int et1 = 0;
                        int et2 = 0;
                        out.setText("haven't findouted yet");

                    }
                    else
                    {


                    if (ett1.length() == 0) {
                        int et_1 = 0;
                        int et_2 = Integer.parseInt(et2.getText().toString());
                        int et_3 = et_1/et_2;
                        String st3 = String.valueOf(et_3);
                        out.setText(st3);
                    } else if (ett2.length() == 0) {
                        int et_2 = 0;
                       // int et_1 = Integer.parseInt(et1.getText().toString());
                        //int et_3 = et_1 / et_2;
                        String st3 = String.valueOf("infinity");
                        out.setText(st3);

                    }}


                } else {

                    int et_1 = Integer.parseInt(et1.getText().toString());
                    int et_2 = Integer.parseInt(et2.getText().toString());
                    int et_3 = et_1 / et_2;
                    String st3 = String.valueOf(et_3);
                    out.setText(st3);
                }


            }
        });







    }
}
