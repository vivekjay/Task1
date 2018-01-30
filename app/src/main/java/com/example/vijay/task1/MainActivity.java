package com.example.vijay.task1;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
//ghkhkhkj

    private final AppCompatActivity activity = MainActivity.this;
    //private TextInputLayout textInputLayoutusername;
    private LinearLayout linearLayout;
    private TextInputLayout textInputLayoutemailid;
    private TextInputLayout textInputLayoutpssword;
    private EditText emailid;
    private EditText password;
    private Button login;
    private Button signup;
    private Helper helper;
    private InputValidation inputValidation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = (LinearLayout) findViewById(R.id.linear);
        textInputLayoutemailid = (TextInputLayout) findViewById(R.id.Emailid_TIL);
        textInputLayoutpssword = (TextInputLayout) findViewById(R.id.Password_TIL);
        emailid = (EditText) findViewById(R.id.emailid);
        password = (EditText) findViewById(R.id.pass);
        login = (Button) findViewById(R.id.login);
        signup = (Button) findViewById(R.id.signup);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 /* if (!inputValidation.InputEditTextfilling(emailid, textInputLayoutemailid, getString(R.string.error_message_email))) {
                    return;
                }*/
                if (!inputValidation.InputEditTextEmail(emailid, textInputLayoutemailid, getString(R.string.error_message_email))) {
                    return;
                }
                if (!inputValidation.InputEditTextfilling(password, textInputLayoutpssword, getString(R.string.error_message_email))) {
                    return;
                }

                if (helper.checkUser(emailid.getText().toString().trim()
                        , password.getText().toString().trim())) {


                    Intent accountsIntent = new Intent(activity, Third_Activity.class);
                    accountsIntent.putExtra("EMAIL", emailid.getText().toString().trim());
                    emptyInputEditText();
                    startActivity(accountsIntent);


                } else {
                    // Snack Bar to show success message that record is wrong

                    Snackbar.make(linearLayout, getString(R.string.error_valid_email_password), Snackbar.LENGTH_LONG).show();
                }
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSignUp = new Intent(getApplicationContext(), Third_Activity.class);
                startActivity(intentSignUp);
            }
        });

       }



        //logic
        private void emptyInputEditText()
        {
            emailid.setText(null);
            password.setText(null);
        }
    }


//ufhshfksh
