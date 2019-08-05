package com.something.uzzal.ICCWorldCup2019FixtureandLiveScore;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

//intertial adds
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

     //InterstitialAd
    private InterstitialAd mInterstitialAd;


    // team and live score
    private Button buttonTeam, buttonLive,buttonICC,buttonLiveTv;



    // all button find item in a here........

    private Button btn_b;
    private Button btn_p;
    private Button btn_i,btn_s;

    private Intent intent;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


           // *****admob appp to create to project....@@
        MobileAds.initialize(this,
                "ca-app-pub-3101248432749567~3891284990");
        //your app id
        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


//                   //InterstitialAd
//        mInterstitialAd = new InterstitialAd(this);
//        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
//        mInterstitialAd.loadAd(new AdRequest.Builder().build());
//        mInterstitialAd.setAdListener(new AdListener() {
//            @Override
//            public void onAdClosed() {
//                // Load the next interstitial.
//                mInterstitialAd.loadAd(new AdRequest.Builder().build());
//            }
//
//        });
//
//
//        //InterstitialAd   end the project





        // team and live score id declear.
        buttonTeam = (Button)findViewById(R.id.buttonTeam_id);
        buttonLive = (Button)findViewById(R.id.button_livescore_id);
        buttonICC = (Button)findViewById(R.id.button_icc_id);
        buttonLiveTv = (Button)findViewById(R.id.button_LiveTv_id);

        buttonTeam.setOnClickListener(this);
        buttonLive.setOnClickListener(this);
        buttonICC.setOnClickListener(this);
        buttonLiveTv.setOnClickListener(this);





        btn_b = findViewById(R.id.bangladesh_button);
        btn_p = findViewById(R.id.pakistan_button);
        btn_i =findViewById(R.id.indian_button);
        btn_s = findViewById(R.id.srilanka_button);
        listView = findViewById(R.id.listView_id);

        btn_b.setOnClickListener(this);
        btn_i.setOnClickListener(this);
        btn_p.setOnClickListener(this);
        btn_s.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {


         //** Team and live score create activity .......@@@


        if(v.getId()==R.id.buttonTeam_id){

            intent = new Intent(MainActivity.this,AllTeamActivity.class);
            startActivity(intent);


        }

        if(v.getId()==R.id.button_livescore_id){

           intent = new Intent(MainActivity.this,LiveScoreActivity.class);
           startActivity(intent);
        }


        if(v.getId()==R.id.button_icc_id){
            intent = new Intent(MainActivity.this,IccActivity.class);
            startActivity(intent);
        }



        if(v.getId()==R.id.button_LiveTv_id){
            intent = new Intent(MainActivity.this,TvActivity.class);
            startActivity(intent);
        }





         //** fixture activity in a here show the picture image.....@@




//        if(v.getId()==R.id.bangladesh_button){
//
//         intent = new Intent(MainActivity.this,ShowFiledActivity.class);
//         intent.putExtra("cric","Bangladesh");
//         startActivity(intent);
//       }
//
//        if(v.getId()==R.id.pakistan_button){
//
//            intent = new Intent(MainActivity.this,ShowFiledActivity.class);
//            intent.putExtra("cric","Pakistan");
//            startActivity(intent);
//        }
//
//        if(v.getId()==R.id.indian_button){
//
//            intent = new Intent(MainActivity.this,ShowFiledActivity.class);
//            intent.putExtra("cric","India");
//            startActivity(intent);
//        }
//
//        if(v.getId()==R.id.srilanka_button){
//           intent = new Intent(MainActivity.this, ShowFiledActivity.class);
//           intent.putExtra("cric","Srilanka");
//           startActivity(intent);
//        }

    }















                // aleret daialog add to the code.....!
    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
        builder.setIcon(R.drawable.question);
        builder.setTitle("Exit");
        builder.setMessage("Do you want to Exit ? ");
        builder.setCancelable(false);

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();

            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();
            }
        });

        builder.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });




        AlertDialog alertDialog = builder.create();
        alertDialog.show();

        //Intertialshow
       // Intertialshow();

    }

        //Intertialshow
//    public void Intertialshow()
//    {
//        if (mInterstitialAd.isLoaded()) {
//            mInterstitialAd.show();
//        } else {
//            finish();
//        }
//    }



}
