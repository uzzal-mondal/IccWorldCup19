package com.something.uzzal.ICCWorldCup2019FixtureandLiveScore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
//import com.google.android.gms.ads.InterstitialAd;

public class TvActivity extends AppCompatActivity {

    //private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv);



        // *****admob appp to create to project....@@
        MobileAds.initialize(this,
                "ca-app-pub-3101248432749567~3891284990");
        //your app id
        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
