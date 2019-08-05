package com.something.uzzal.ICCWorldCup2019FixtureandLiveScore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreenActivity extends AppCompatActivity {

    private int SLEEP_TIMER = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);


        getSupportActionBar().hide();




        worldCup worldCup = new worldCup();
        worldCup.start();

    }

    private class worldCup extends Thread{

        public void run(){

            try{
                sleep(1000 * SLEEP_TIMER);

            }catch (InterruptedException e){
                e.printStackTrace();
            }

            Intent intent = new Intent(SplashScreenActivity.this,MainActivity.class);
            startActivity(intent);
            SplashScreenActivity.this.finish();
        }
    }
}
