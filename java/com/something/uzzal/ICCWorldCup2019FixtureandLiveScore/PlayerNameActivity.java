package com.something.uzzal.ICCWorldCup2019FixtureandLiveScore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class PlayerNameActivity extends AppCompatActivity  {

   // private InterstitialAd mInterstitialAd;

    private ImageView imageView;
    private Button btnTeam, btn1, btn2, btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,
          btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,
         btn21,btn22,btn23,btn24,btn25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_name);

        imageView = (ImageView) findViewById(R.id.imageView_id);

         btnTeam = (Button) findViewById(R.id.teamName_id);
         btn1 = (Button) findViewById(R.id.button1_id);
         btn2 = (Button) findViewById(R.id.button2_id);
         btn3 = (Button) findViewById(R.id.button3_id);
         btn4 = (Button) findViewById(R.id.button4_id);
         btn5 = (Button) findViewById(R.id.button5_id);
         btn6 = (Button) findViewById(R.id.button6_id);
         btn7 = (Button) findViewById(R.id.button7_id);
         btn8 = (Button) findViewById(R.id.button8_id);
         btn9 = (Button) findViewById(R.id.button9_id);
         btn10 = (Button) findViewById(R.id.button10_id);
         btn11 = (Button) findViewById(R.id.button11_id);
         btn12 = (Button) findViewById(R.id.button12_id);
         btn13 = (Button) findViewById(R.id.button13_id);
         btn14 = (Button) findViewById(R.id.button14_id);
         btn15 = (Button) findViewById(R.id.button15_id);
         btn16 = (Button) findViewById(R.id.button16_id);
         btn17 = (Button) findViewById(R.id.button17_id);
         btn18 = (Button) findViewById(R.id.button18_id);
         btn19 = (Button) findViewById(R.id.button19_id);
         btn20 = (Button) findViewById(R.id.button20_id);
         btn21 = (Button) findViewById(R.id.button21_id);
        // btn22 = (Button) findViewById(R.id.button22_id);
        // btn23 = (Button) findViewById(R.id.button23_id);
        // btn24 = (Button) findViewById(R.id.button24_id);
         //btn25 = (Button) findViewById(R.id.button25_id);

//         btnTeam.setOnClickListener(this);
//         btn1.setOnClickListener(this);
//         btn2.setOnClickListener(this);
//         btn3.setOnClickListener(this);
//         btn4.setOnClickListener(this);
//         btn5.setOnClickListener(this);
//         btn6.setOnClickListener(this);
//         btn7.setOnClickListener(this);
//         btn8.setOnClickListener(this);
//         btn9.setOnClickListener(this);
//         btn10.setOnClickListener(this);
//         btn11.setOnClickListener(this);
//         btn12.setOnClickListener(this);
//         btn13.setOnClickListener(this);
//         btn14.setOnClickListener(this);
//         btn15.setOnClickListener(this);
//         btn16.setOnClickListener(this);
//         btn17.setOnClickListener(this);
//         btn18.setOnClickListener(this);
//         btn19.setOnClickListener(this);
//         btn20.setOnClickListener(this);
//         btn21.setOnClickListener(this);
//         btn22.setOnClickListener(this);
//         btn23.setOnClickListener(this);
//         btn24.setOnClickListener(this);
//         btn25.setOnClickListener(this);
//
//         imageView.setOnClickListener(this);



         //data reciveing ,getIntent and get Extras
        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){
            String pName = bundle.getString("key");
              showPlayerName(pName);
        }





    }

     void showPlayerName(String pName){

        if(pName.equals("bangladesh")){
            imageView.setImageResource(R.drawable.bcb);
            btnTeam.setText(R.string.bang);

            btn1.setText(R.string.mashrafee);
            btn2.setText(R.string.tamim);
            btn3.setText(R.string.shakib);
            btn4.setText(R.string.imrul);
            btn5.setText(R.string.summay);
            btn6.setText(R.string.mahmudulla);
            btn7.setText(R.string.mushfik);
            btn8.setText(R.string.sabbir);
            btn9.setText(R.string.liton);
            btn10.setText(R.string.mehedi);
            btn11.setText(R.string.nasir);
            btn12.setText(R.string.mosadesk);
            btn13.setText(R.string.ariful);
            btn14.setText(R.string.mustafiz);
            btn15.setText(R.string.taskin);
            btn16.setText(R.string.abu);
            btn17.setText(R.string.rubel);
            btn18.setText(R.string.mosharaf);
            btn19.setText(R.string.mithun);
            btn20.setText(R.string.saifuddin);
            btn21.setText(R.string.safiul);



        }

        if (pName.equals("england")){

            imageView.setImageResource(R.drawable.engboard);
            btnTeam.setText(R.string.engg);

            btn1.setText(R.string.morgan );
            btn2.setText(R.string.ali);
            btn3.setText(R.string.bairstow);
            btn4.setText(R.string.buttler);
            btn5.setText(R.string.curran);
            btn6.setText(R.string.currann);
            btn7.setText(R.string.hales);
            btn8.setText(R.string.plunkett);
            btn9.setText(R.string.rashid);
            btn10.setText(R.string.root);
            btn11.setText(R.string.roy );
            btn12.setText(R.string.stokes);
            btn13.setText(R.string.stone);
            btn14.setText(R.string.woakes);
            btn15.setText(R.string.wood);
            btn16.setText(R.string.denly);
            btn17.setText(R.string.jordan);
            btn18.setText(R.string.dawson);
            btn19.setText(R.string.broad);
            btn20.setText(R.string.leach);
            btn21.setText(R.string.anderson);


        }

         if (pName.equals("india")){

             imageView.setImageResource(R.drawable.icb);
             btnTeam.setText(R.string.ind);

             btn1.setText(R.string.Kohli );
             btn2.setText(R.string.Karthik);
             btn3.setText(R.string.Dhoni);
             btn4.setText(R.string.Dhawan);
             btn5.setText(R.string.Jadeja);
             btn6.setText(R.string.Sharma);
             btn7.setText(R.string.Sharmaa);
             btn8.setText(R.string.Rahane);
             btn9.setText(R.string.Rayudu);
             btn10.setText(R.string.Pandey);
             btn11.setText(R.string.Jadhav );
             btn12.setText(R.string.Ashwin);
             btn13.setText(R.string.Kumar);
             btn14.setText(R.string.Yadav);
             btn15.setText(R.string.Chaha);
             btn16.setText(R.string.Shami);
             btn17.setText(R.string.Bumrah);
             btn18.setText(R.string.Thakur);
             btn19.setText(R.string.Pandya);
             btn20.setText(R.string.Pant);
             btn21.setText(R.string.Rahul);


         }


         if (pName.equals("newzeland")){

             imageView.setImageResource(R.drawable.nzcbbb);
             btnTeam.setText(R.string.newze);

             btn1.setText(R.string.Williamson );
             btn2.setText(R.string.Taylor);
             btn3.setText(R.string.Southee);
             btn4.setText(R.string.Anderson);
             btn5.setText(R.string.Boult);
             btn6.setText(R.string.Worker);
             btn7.setText(R.string.Guptill);
             btn8.setText(R.string.Watling);
             btn9.setText(R.string.Wagner);
             btn10.setText(R.string.Latham);
             btn11.setText(R.string.Grandhomme );
             btn12.setText(R.string.Astle);
             btn13.setText(R.string.Munro);
             btn14.setText(R.string.Milne);
             btn15.setText(R.string.Wheeler);
             btn16.setText(R.string.Phillips);
             btn17.setText(R.string.Ferguson);
             btn18.setText(R.string.Henry);
             btn19.setText(R.string.Sodhi);
             btn20.setText(R.string.Raval);
             btn21.setText(R.string.Niusm);


         }

         if (pName.equals("southafrica")){

             imageView.setImageResource(R.drawable.southafbest);
             btnTeam.setText(R.string.south);

             btn1.setText(R.string.Plessis);
             btn2.setText(R.string.Steyn);
             btn3.setText(R.string.Duminy);
             btn4.setText(R.string.Amla);
             btn5.setText(R.string.Villiers);
             btn6.setText(R.string.Philander);
             btn7.setText(R.string.Tahir);
             btn8.setText(R.string.Miller);
             btn9.setText(R.string.Elgar);
             btn10.setText(R.string.Frylinck);
             btn11.setText(R.string.Bavuma );
             btn12.setText(R.string.Kock);
             btn13.setText(R.string.Behardien);
             btn14.setText(R.string.Pretorius);
             btn15.setText(R.string.Morris);
             btn16.setText(R.string.Paterson);
             btn17.setText(R.string.Olivier);
             btn18.setText(R.string.Bruyn);
             btn19.setText(R.string.Morkel);
             btn20.setText(R.string.Hendricks);
             btn21.setText(R.string.Rabada);


         }

         if (pName.equals("pakistan")){

             imageView.setImageResource(R.drawable.pcb);
             btnTeam.setText(R.string.pakis);

             btn1.setText(R.string.Ahmed );
             btn2.setText(R.string.Hafeez);
             btn3.setText(R.string.Malik);
             btn4.setText(R.string.Riaz);
             btn5.setText(R.string.Amir);
             btn6.setText(R.string.Ali);
             btn7.setText(R.string.Masood);
             btn8.setText(R.string.Shafiq);
             btn9.setText(R.string.Shah);
             btn10.setText(R.string.Sohail);
             btn11.setText(R.string.jKhan );
             btn12.setText(R.string.Wasim);
             btn13.setText(R.string.Zaman);
             btn14.setText(R.string.Azam);
             btn15.setText(R.string.Alii);
             btn16.setText(R.string.Ashraf);
             btn17.setText(R.string.Khan);
             btn18.setText(R.string.Afridi);
             btn19.setText(R.string.Akmal);
             btn20.setText(R.string.Talat);
             btn21.setText(R.string.ale);


         }


         if (pName.equals("australia")){

             imageView.setImageResource(R.drawable.ausboard);
             btnTeam.setText(R.string.australia);

             btn1.setText(R.string.Finch );
             btn2.setText(R.string.Marsh);
             btn3.setText(R.string.Siddle);
             btn4.setText(R.string.Hazlewood);
             btn5.setText(R.string.Paine);
             btn6.setText(R.string.Holland);
             btn7.setText(R.string.Khawaja);
             btn8.setText(R.string.Lyon  );
             btn9.setText(R.string.Marshh);
             btn10.setText(R.string.Maddinson);
             btn11.setText(R.string.Agar );
             btn12.setText(R.string.Stoinis);
             btn13.setText(R.string.Handscomb);
             btn14.setText(R.string.Stanlake);
             btn15.setText(R.string.Zampa);
             btn16.setText(R.string.Wildermuth);
             btn17.setText(R.string.Maxwell);
             btn18.setText(R.string.Tye);
             btn19.setText(R.string.Richardson);
             btn20.setText(R.string.Short);
             btn21.setText(R.string.Starc);


         }

         if (pName.equals("srilanka")){

             imageView.setImageResource(R.drawable.scb);
             btnTeam.setText(R.string.srilanka);

             btn1.setText(R.string.Chandimal );
             btn2.setText(R.string.Herath);
             btn3.setText(R.string.Malinga);
             btn4.setText(R.string.Tharanga);
             btn5.setText(R.string.Perera);
             btn6.setText(R.string.Pereraa);
             btn7.setText(R.string.Thirimanne);
             btn8.setText(R.string.Mathews);
             btn9.setText(R.string.Mendis);
             btn10.setText(R.string.Lakmal);
             btn11.setText(R.string.Silva );
             btn12.setText(R.string.Karunaratne);
             btn13.setText(R.string.Pereraaa);
             btn14.setText(R.string.Pradeep);
             btn15.setText(R.string.Dananjaya);
             btn16.setText(R.string.Pushpakumara);
             btn17.setText(R.string.Jayasuriya);
             btn18.setText(R.string.Silvar);
             btn19.setText(R.string.Dickwella);
             btn20.setText(R.string.Shanaka);
             btn21.setText(R.string.Mendish);


         }

         if (pName.equals("westindies")){

             imageView.setImageResource(R.drawable.westboard);
             btnTeam.setText(R.string.westindies);

             btn1.setText(R.string.Brathwaite );
             btn2.setText(R.string.Fletcher);
             btn3.setText(R.string.Walton);
             btn4.setText(R.string.Badree);
             btn5.setText(R.string.Holder);
             btn6.setText(R.string.Bishoo);
             btn7.setText(R.string.Russell);
             btn8.setText(R.string.Nurse);
             btn9.setText(R.string.Brathwaites);
             btn10.setText(R.string.Gabriel);
             btn11.setText(R.string.Lewis );
             btn12.setText(R.string.Pooran);
             btn13.setText(R.string.Dowrich);
             btn14.setText(R.string.Chase);
             btn15.setText(R.string.Ambris);
             btn16.setText(R.string.Williams);
             btn17.setText(R.string.Hope);
             btn18.setText(R.string.Powell);
             btn19.setText(R.string.Sami);
             btn20.setText(R.string.Polard);
             btn21.setText(R.string.Hemraj);


         }


         if (pName.equals("afghanistan")){

             imageView.setImageResource(R.drawable.afgaboard);
             btnTeam.setText(R.string.afghanistan);

             btn1.setText(R.string.Afghan );
             btn2.setText(R.string.Nabi);
             btn3.setText(R.string.Shafiqullah);
             btn4.setText(R.string.Ahmadi);
             btn5.setText(R.string.Shahzad);
             btn6.setText(R.string.Alam);
             btn7.setText(R.string.Zadran);
             btn8.setText(R.string.Naib);
             btn9.setText(R.string.Zadrann);
             btn10.setText(R.string.Zazai);
             btn11.setText(R.string.Shahidi );
             btn12.setText(R.string.Shahi);
             btn13.setText(R.string.Ghani);
             btn14.setText(R.string.Ihsanullah);
             btn15.setText(R.string.Janat);
             btn16.setText(R.string.Khanil);
             btn17.setText(R.string.Ashrafi);
             btn18.setText(R.string.Khanne);
             btn19.setText(R.string.Rasooli);
             btn20.setText(R.string.Momand);
             btn21.setText(R.string.Ahmad);


         }

     }
}
