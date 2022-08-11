package com.example.top_bank.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.top_bank.R;

//splashscreen is inheriting the properties of  AppCompatActivity
public class SplashScreen extends AppCompatActivity {
    //the 5000 represents 5 seconds
    private static int SPLASH_TIMER =5000;

    //variables
    ImageView logo;
    LottieAnimationView loading;

    //animations
    Animation sideAnim,bottomAnim;


    //default function displaying what should happen once the splashscreen is created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //layout of the splashscreen; full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_screen);

        //hooks
        logo = findViewById(R.id.logo);
        loading = findViewById(R.id.loadinganimation);

        //animations
        sideAnim = AnimationUtils.loadAnimation(this,R.anim.slide_anim);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_anim);

        //set Animations on elements
        logo.setAnimation(sideAnim);
        loading.setAnimation(bottomAnim);
//creating a new activity(new page)
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(getApplicationContext(), Boarding.class);
                startActivity(intent);
                finish();


            }
        },SPLASH_TIMER);



    }
}

