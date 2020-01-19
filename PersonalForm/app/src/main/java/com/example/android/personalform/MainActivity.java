package com.example.android.personalform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    String name,email,occupation,gender;
    private Button Submit;
    TextView Name;
    TextView Email;
    RadioGroup Group;
    RadioButton g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.ed1);
        Email = (EditText)findViewById(R.id.ed2);
        Group = findViewById(R.id.rg);
        Group.check(R.id.Male);
        Submit = (Button)findViewById(R.id.button);
        Submit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                name = Name.getText().toString();
                email = Email.getText().toString();
                int selected = Group.getCheckedRadioButtonId();
                g = findViewById(selected);
                gender = g.getText().toString();
                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("Name",name);
                i.putExtra("Email",email);
            }
        });
    }

}
