package com.example.newqalrapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.Toast;
import android.window.SplashScreen;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class splashScreen extends AppCompatActivity {
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); // used for removing toolbar ( strip )
//        getSupportActionBar().hide(); use only when you have not do Noactionbar in theme section

        mAuth = FirebaseAuth.getInstance();
        DbQuery.g_firestore = FirebaseFirestore.getInstance();

        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(2000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }

                if(mAuth.getCurrentUser() != null){

                    DbQuery.loadData(new MyCompleteListener() {
                        @Override
                        public void onSuccess() {
                            Intent intent = new Intent(splashScreen.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }

                        @Override
                        public void onFailure() {
                            Toast.makeText(splashScreen.this, "Something went wrong ! Please Try Again Later !", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
                else{
                    Intent intent = new Intent(splashScreen.this,LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };thread.start();


    }
}

//        new Handler().postDelayed(new Runnable() {
//@Override
//public void run() {
//        Intent intent = new Intent(splashScreen.this,MainActivity.class);
//        startActivity(intent);
//        finish();
//        }
//        },4000);