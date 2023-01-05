package com.example.sjcet.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText Name,Surname,mark;
    Button insert;
   MyDatabase database=new MyDatabase();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = (EditText) findViewById(R.id.Et1);
        Surname = (EditText) findViewById(R.id.Et2);
        mark = (EditText) findViewById(R.id.Et3);
        insert = (Button) findViewById(R.id.B1);
    }
        public void insert(View view) {
            String userval = Name.getText().toString();
            String surnameval = Surname.getText().toString();
            Integer passval = Integer.parseInt(mark.getText().toString());
           Boolean result = database.insertData(String userval, String surnameval, Integer passval);
            if (result == true) {
               Toast.makeText(getApplicationContext(), "inserted successfully", Toast.LENGTH_SHORT).show();

           } else {
               Toast.makeText(getApplicationContext(), "insertion failed", Toast.LENGTH_SHORT).show();
            }
        }

    }

