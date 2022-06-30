package com.example.top_bank.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.top_bank.R;
import com.example.top_bank.User.UserDashboard;

public class SignOtp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_otp);
    }


    public void verifyButton(View View){
        startActivity(new Intent(this,UserDashboard.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);

    }

}