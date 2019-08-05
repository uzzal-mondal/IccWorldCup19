package com.something.uzzal.ICCWorldCup2019FixtureandLiveScore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
//import com.google.android.gms.ads.InterstitialAd;

public class ShowFiledActivity extends AppCompatActivity {

   // private InterstitialAd mInterstitialAd;

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_filed);

        imageView = findViewById(R.id.bangladesh_image);
       // textView = findViewById(R.id.text_id);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String countryName = (String) bundle.get("cric");
            showData(countryName);
        }


    }

    public void showData(String countryName) {

        if (countryName.equals("Bangladesh")) {
            imageView.setImageResource(R.drawable.lords);
            //textView.setText(R.string.bangladesh_text);
            //textView.setTextColor(R.color.bangladesh_color);

        }

        if (countryName.equals("Pakistan")) {
            imageView.setImageResource(R.drawable.najmul);
           // textView.setText(R.string.pakistan_text);
        }

        if (countryName.equals("India")) {
            imageView.setImageResource(R.drawable.icb);
            //textView.setText(R.string.indian_text);
        }

        if(countryName.equals("Srilanka")){
            imageView.setImageResource(R.drawable.scb);
            //textView.setText(R.string.srilanka_text);

        }
    }

}
