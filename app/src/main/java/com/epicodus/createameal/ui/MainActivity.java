package com.epicodus.createameal.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import com.epicodus.createameal.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     @Bind(R.id.signInButton) Button mSignInButton;
     @Bind(R.id.signUpButton) Button mSignUpButton;
     @Bind(R.id.createAMealTextView) TextView mCreateAMealTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Typeface caviarDreamsFont = Typeface.createFromAsset(getAssets(), "fonts/Caviar_Dreams_Bold.ttf");
        mCreateAMealTextView.setTypeface(caviarDreamsFont);

        mSignInButton.setOnClickListener(this);
        mSignUpButton.setOnClickListener(this);
    }
            @Override
            public void onClick (View v){
                if(v == mSignInButton) {
                    Intent intent = new Intent(MainActivity.this, LogInActivity.class);
                    startActivity(intent);
                } else if (v == mSignUpButton) {
                        Intent intent = new Intent(MainActivity.this, AccountActivity.class);
                        startActivity(intent);
                } else{
                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
                }

    }
}