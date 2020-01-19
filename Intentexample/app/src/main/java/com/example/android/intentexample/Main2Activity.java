package com.example.android.intentexample;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    String Name;
    String Email;
    String PhoneNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Name = getIntent().getExtras().getString("NAME");
        Email = getIntent().getExtras().getString("EMAIL");
        PhoneNumber = getIntent().getExtras().getString("PHONE_NUMBER");

        TextView textview = (TextView)findViewById(R.id.textView);
        textview.setText("Name:"+" "+Name+"\n"+"Email:"+" "+Email+"\n"+"Phone Number:"+" "+PhoneNumber);

    }
}
