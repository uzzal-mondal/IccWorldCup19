package com.something.uzzal.ICCWorldCup2019FixtureandLiveScore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

//import com.google.android.gms.ads.InterstitialAd;

public class AllTeamActivity extends AppCompatActivity implements View.OnClickListener {

    Button ban,ind,pak,sri,afg,aus,wes,eng,sout,newze;

   // private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_team);


        // *****admob appp to create to project....@@
        MobileAds.initialize(this,
                "ca-app-pub-3101248432749567~3891284990");
        //your app id
        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        ban =(Button) findViewById(R.id.button_bangladesh_id);
        eng = (Button) findViewById(R.id.button_england_id);
        ind = (Button) findViewById(R.id.button_india_id);
        newze = (Button) findViewById(R.id.button_newzeland_id_ne);
        sout =(Button) findViewById(R.id.button_southafrica_id);
        pak = (Button) findViewById(R.id.button_pakistan_id);
        aus = (Button) findViewById(R.id.button_australia_id);
        sri = (Button) findViewById(R.id.button_srilanka_id);
        wes = (Button) findViewById(R.id.button_westIndies_id);
        afg = (Button) findViewById(R.id.button_afghanistan_id_af);


           // button listner  adding

        ban.setOnClickListener(this);
        ind.setOnClickListener(this);
        pak.setOnClickListener(this);
        sri.setOnClickListener(this);
        afg.setOnClickListener(this);
        aus.setOnClickListener(this);
        wes.setOnClickListener(this);
        eng.setOnClickListener(this);
        sout.setOnClickListener(this);
        newze.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.button_bangladesh_id){

            Intent intent = new Intent(AllTeamActivity.this,PlayerNameActivity.class);
            intent.putExtra("key","bangladesh");
            startActivity(intent);
        }


        if(v.getId()==R.id.button_england_id){

            Intent intent = new Intent(AllTeamActivity.this,PlayerNameActivity.class);
            intent.putExtra("key","england");
            startActivity(intent);
        }


        if(v.getId()==R.id.button_india_id){

            Intent intent = new Intent(AllTeamActivity.this,PlayerNameActivity.class);
            intent.putExtra("key","india");
            startActivity(intent);
        }


        if(v.getId()==R.id.button_newzeland_id_ne){

            Intent intent = new Intent(AllTeamActivity.this,PlayerNameActivity.class);
            intent.putExtra("key","newzeland");
            startActivity(intent);
        }


        if(v.getId()==R.id.button_southafrica_id){

            Intent intent = new Intent(AllTeamActivity.this,PlayerNameActivity.class);
            intent.putExtra("key","southafrica");
            startActivity(intent);
        }


        if(v.getId()==R.id.button_pakistan_id){

            Intent intent = new Intent(AllTeamActivity.this,PlayerNameActivity.class);
            intent.putExtra("key","pakistan");
            startActivity(intent);
        }


        if(v.getId()==R.id.button_australia_id){

            Intent intent = new Intent(AllTeamActivity.this,PlayerNameActivity.class);
            intent.putExtra("key","australia");
            startActivity(intent);
        }


        if(v.getId()==R.id.button_srilanka_id){

            Intent intent = new Intent(AllTeamActivity.this,PlayerNameActivity.class);
            intent.putExtra("key","srilanka");
            startActivity(intent);
        }


        if(v.getId()==R.id.button_westIndies_id){

            Intent intent = new Intent(AllTeamActivity.this,PlayerNameActivity.class);
            intent.putExtra("key","westindies");
            startActivity(intent);
        }


        if(v.getId()==R.id.button_afghanistan_id_af){

            Intent intent = new Intent(AllTeamActivity.this,PlayerNameActivity.class);
            intent.putExtra("key","afghanistan");
            startActivity(intent);
        }



    }

}
