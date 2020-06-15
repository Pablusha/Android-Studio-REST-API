package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private TextView txtAciklama,txtİsim,txtOgrenciNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initializeViews();
        executeAnimations();

    }

    private void initializeViews() {
        txtAciklama = findViewById(R.id.ac_splash_aciklama);
        txtİsim = findViewById(R.id.ac_splash_isim);
        txtOgrenciNo = findViewById(R.id.ac_splash_ogrenciNo);
    }

    private void executeAnimations() {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.animation);
        txtAciklama.startAnimation(animation);
        txtİsim.startAnimation(animation);
        txtOgrenciNo.startAnimation(animation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                finish();
            }
        },3000);
    }

}
