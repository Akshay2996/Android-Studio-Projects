package com.example.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //Create Fields
    private TextView tvDisplay;

    private Button bCancel,bMinus,bPlus,bMultiply,bDivide,bMod,bEqual,bDot;
    private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;

    private String expression;
    private boolean first=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Findviewbyid
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);

        bCancel= (Button) findViewById(R.id.bCancel);
        bCancel.setOnClickListener(this);
        bMinus= (Button) findViewById(R.id.bMinus);
        bMinus.setOnClickListener(this);
        bPlus= (Button) findViewById(R.id.bPlus);
        bPlus.setOnClickListener(this);
        bMultiply= (Button) findViewById(R.id.bMultiply);
        bMultiply.setOnClickListener(this);
        bDivide= (Button) findViewById(R.id.bDivide);
        bDivide.setOnClickListener(this);
        bMod= (Button) findViewById(R.id.bMod);
        bMod.setOnClickListener(this);
        bEqual= (Button) findViewById(R.id.bEqual);
        bEqual.setOnClickListener(this);
        bDot= (Button) findViewById(R.id.bDot);
        bDot.setOnClickListener(this);

        b0 = (Button) findViewById(R.id.b0);
        b0.setOnClickListener(this);
        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(this);
        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(this);
        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(this);
        b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(this);
        b5 = (Button) findViewById(R.id.b5);
        b5.setOnClickListener(this);
        b6 = (Button) findViewById(R.id.b6);
        b6.setOnClickListener(this);
        b7 = (Button) findViewById(R.id.b7);
        b7.setOnClickListener(this);
        b8 = (Button) findViewById(R.id.b8);
        b8.setOnClickListener(this);
        b9 = (Button) findViewById(R.id.b9);
        b9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bCancel:
                cancelPressed();
                break;
            case R.id.bMinus:
                operatorPressed('-');
                break;
            case R.id.bMod:
                operatorPressed('%');
                break;
            case R.id.bPlus:
                operatorPressed('+');
                break;
            case R.id.bMultiply:
                operatorPressed('*');
                break;
            case R.id.bDivide:
                operatorPressed('/');
                break;
            case R.id.bDot:
                numberPressed('.');
                break;
            case R.id.bEqual:
                onEqualPressed();
                break;
            case R.id.b0:
                numberPressed(0);
                break;
            case R.id.b1:
                numberPressed(1);
                break;
            case R.id.b2:
                numberPressed(2);
                break;
            case R.id.b3:
                numberPressed(3);
                break;
            case R.id.b4:
                numberPressed(4);
                break;
            case R.id.b5:
                numberPressed(5);
                break;
            case R.id.b6:
                numberPressed(6);
                break;
            case R.id.b7:
                numberPressed(7);
                break;
            case R.id.b8:
                numberPressed(8);
                break;
            case R.id.b9:
                numberPressed(9);
                break;
        }
    }

    private void numberPressed(int number) {
        /*if(R.id.bDot==46)
        {
            String s = Integer.toString(46);
        }*/
        if(number==0){
            throw new ArithmeticException("number==0");
        }
        if(!first){
            expression +=number;
        }
        else{
            expression = ""+number;
            first = false;
        }
        tvDisplay.setText(expression);
    }

    private void onEqualPressed() {
        try{
            Expression exp = new ExpressionBuilder(expression).build();
            double answer = exp.evaluate();
            tvDisplay.setText(""+answer);
        }catch (IllegalArgumentException e){
            tvDisplay.setText("Error");
            expression = "0";
        }

    }

    private void operatorPressed(char operator) {
        expression += operator;
        tvDisplay.setText(expression);
    }

    private void cancelPressed() {
        expression = "0";
        tvDisplay.setText(expression);
        first = true;
    }
}
