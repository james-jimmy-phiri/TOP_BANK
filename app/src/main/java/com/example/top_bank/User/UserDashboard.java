package com.example.top_bank.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.top_bank.R;

public class UserDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void sendMoney(View View){
        startActivity(new Intent(this, SendMoney.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);

    }

}