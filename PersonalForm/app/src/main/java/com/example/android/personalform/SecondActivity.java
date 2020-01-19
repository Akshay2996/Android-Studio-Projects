package com.example.android.personalform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    String Name;
    String Email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Name = getIntent().getExtras().getString("Name");
        Email = getIntent().getExtras().getString("Email");
    }
}
