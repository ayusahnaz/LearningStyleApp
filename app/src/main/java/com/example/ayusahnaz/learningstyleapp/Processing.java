package com.example.ayusahnaz.learningstyleapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ayusahnaz on 9/2/16.
 */
public class Processing extends Activity {
    TextView tprowell, tact, tref;
    TextView tperwell, tsen, tint;
    TextView tinpwell, tvis, tver;
    TextView tundwell, tseq, tglo;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.processing);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width*.8), (int) (height*.8));

        tprowell = (TextView) findViewById(R.id.textView7);
        tact = (TextView) findViewById(R.id.textView8);
        tref = (TextView) findViewById(R.id.textView9);
//        tperwell = (TextView) findViewById(R.id.textView10);
//        tsen = (TextView) findViewById(R.id.textView11);
//        tint = (TextView) findViewById(R.id.textView12);
//        tinpwell = (TextView) findViewById(R.id.textView13);
//        tvis = (TextView) findViewById(R.id.textView14);
//        tver = (TextView) findViewById(R.id.textView15);
//        tundwell = (TextView) findViewById(R.id.textView16);
//        tseq = (TextView) findViewById(R.id.textView17);
//        tglo = (TextView) findViewById(R.id.textView18);

        Boolean prowell = getIntent().getExtras().getBoolean("prowell");
        Boolean act = getIntent().getExtras().getBoolean("act");
        Boolean ref = getIntent().getExtras().getBoolean("ref");

        if(prowell){
            tprowell.setVisibility(View.VISIBLE);
            tact.setVisibility(View.GONE);
            tref.setVisibility(View.GONE);
        }

//        System.out.println(prowell);
//        System.out.println(act);
//        System.out.println(ref);
    }
}
