package com.example.vijay.task1;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class Main2Activity extends AppCompatActivity {

   private EditText username,email,password,confirmpassword,phonenumber;
     private Button save_btn;
    private final AppCompatActivity activity = Main2Activity.this;
    private LinearLayout linearLayout1;
    private InputValidation inputValidation;
    private Helper helper;
    private BeanClass beanClass;
    private TextInputLayout textInputLayoutusername,textInputLayoutemailid,textInputLayoutpassword,textInputLayoutconfirmpassword,textInputLayoutphonenumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initViews();
        initListeners();
        initObjects();

    private void initViews() {

        username = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.enterpassword);
        confirmpassword = (EditText) findViewById(R.id.confirmpassword);
        phonenumber = (EditText) findViewById(R.id.phonenumber);
        textInputLayoutusername = (TextInputLayout) findViewById(R.id.enterusername_TIL);
        textInputLayoutemailid = (TextInputLayout) findViewById(R.id.enterEmailid_TIL);
        textInputLayoutpassword = (TextInputLayout) findViewById(R.id.enterPassword_TIL);
        textInputLayoutconfirmpassword = (TextInputLayout) findViewById(R.id.enterConfirmpassword_TIL);
        textInputLayoutphonenumber = (TextInputLayout) findViewById(R.id.enterPhoneNumber_TIL);
        save_btn = (Button) findViewById(R.id.save);
        linearLayout1 = (LinearLayout) findViewById(R.id.linear2);
    }
    private void initListeners(){
        save_btn.setOnClickListener(this);
    }

    private void initObjects() {
        inputValidation = new InputValidation(activity);
        helper = new Helper(activity);
        beanClass = new BeanClass();

    }



    }
}
