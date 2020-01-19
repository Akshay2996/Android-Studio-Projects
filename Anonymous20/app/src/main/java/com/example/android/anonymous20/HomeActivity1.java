package com.example.android.anonymous20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity1 extends AppCompatActivity {
    TextView t1;
    TextView t2;
    Button Continue;
    Animation animFadeIn,animFadeOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home1);

        ImageView iv;
        iv = findViewById(R.id.iv);
        iv.setImageResource(R.drawable.asd);

        t1 = findViewById(R.id.TextView1);
        t2 = findViewById(R.id.TextView2);
        Continue = findViewById(R.id.button);

        animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        t1.startAnimation(animFadeIn);
        t2.startAnimation(animFadeIn);


        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
        Continue.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Continue.setVisibility(View.VISIBLE);
                Continue.startAnimation(animFadeOut);
                Intent i = new Intent(HomeActivity1.this, WelcomeActivity.class);
                startActivity(i);
            }
        });
    }
}
