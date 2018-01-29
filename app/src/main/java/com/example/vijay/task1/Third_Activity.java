package com.example.vijay.task1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class Third_Activity extends AppCompatActivity {

    private AppCompatActivity activity = Third_Activity.this;
    private AppCompatTextView textViewName;
    private RecyclerView recyclerViewUsers;
    private List<BeanClass> listUsers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_);
    }
}
