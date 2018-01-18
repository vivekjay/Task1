package com.example.vijay.task1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText edit11,edit12,edit13,edit14,edit15;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edit11=(EditText) findViewById(R.id.et11);
        edit12=(EditText) findViewById(R.id.et12);
        edit13=(EditText) findViewById(R.id.et13);
        edit14=(EditText) findViewById(R.id.et14);
        edit15=(EditText) findViewById(R.id.et15);
        button2=(Button) findViewById(R.id.bt2);
    }
}
