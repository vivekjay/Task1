package com.example.vijay.task1;

import android.content.Context;
import android.os.Vibrator;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="Login Activity";
    private Vibrator vibrator;
    Animation animshake;
    private EditText editText1,editText2,editText3;
    private TextInputLayout textInputLayout1,textInputLayout2,textInputLayout3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInputLayout1 = (TextInputLayout) findViewById(R.id.tv1);
        textInputLayout2 = (TextInputLayout) findViewById(R.id.tv2);
        textInputLayout3 = (TextInputLayout) findViewById(R.id.tv3);
        editText1 = (EditText) findViewById(R.id.et1);
        editText2 = (EditText) findViewById(R.id.et2);
        editText3 = (EditText) findViewById(R.id.et3);
        button = (Button) findViewById(R.id.btn);
        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

    }
}
