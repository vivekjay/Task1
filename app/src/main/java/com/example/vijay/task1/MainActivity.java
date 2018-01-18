package com.example.vijay.task1;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView1;
    EditText edit1,edit2,edit3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1=(TextView) findViewById(R.id.tv1);
        textView1.setPaintFlags(textView1.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        edit1=(EditText) findViewById(R.id.et1);
        edit2=(EditText) findViewById(R.id.et2);
        edit3=(EditText) findViewById(R.id.et3);
        button=(Button) findViewById(R.id.bt1);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);

            }
        });


    }
}
