package com.example.android.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Name;
    EditText Email;
    EditText Number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.name);
        Email = (EditText)findViewById(R.id.email);
        Number = (EditText)findViewById(R.id.number);

        Button Save = (Button)findViewById(R.id.save);

        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = Name.getText().toString();
                String email = Email.getText().toString();
                String phone = Number.getText().toString();

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("NAME",name);
                intent.putExtra("EMAIL",email);
                intent.putExtra("PHONE_NUMBER",phone);

                startActivity(intent);
            }
        });
    }
}
