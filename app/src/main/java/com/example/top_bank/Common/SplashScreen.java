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

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIMER =5000;

    //variables
    ImageView logo;
    LottieAnimationView loading;

    //animations
    Animation sideAnim,bottomAnim;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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