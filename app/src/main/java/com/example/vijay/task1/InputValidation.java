package com.example.vijay.task1;

import android.app.Activity;
import android.content.Context;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/**
 * Created by Dell on 1/29/2018.
 */

public class InputValidation {
    private Context context;

    public InputValidation(Context context) {
        this.context = context;
    }

    public boolean InputEDitTextfilling(EditText editText, TextInputLayout textInputLayout, String message){
        String s1 = editText.getText().toString().trim();
        if (s1.isEmpty()) {
            textInputLayout.setError(message);
            hideKeyboardFrom(editText);
            return false;
        }
        else {
            textInputLayout.setErrorEnabled(false);
        }

        return true;
    }


    public void hideKeyboardFrom(View view){
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }
}
