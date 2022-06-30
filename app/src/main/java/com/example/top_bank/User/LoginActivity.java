package com.example.top_bank.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.top_bank.R;
import com.example.top_bank.User.RegisterActivity;
import com.example.top_bank.User.SignOtp;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void onLoginClick(View View){
        startActivity(new Intent(this,RegisterActivity.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);

    }
    public void loginButton(View View){
        startActivity(new Intent(this,SignOtp.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);

    }

}