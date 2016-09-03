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

        Boolean prowell = getIntent().getExtras().getBoolean("prowell");
        Boolean act = getIntent().getExtras().getBoolean("act");
        Boolean ref = getIntent().getExtras().getBoolean("ref");

        if(prowell){
            tprowell.setVisibility(View.VISIBLE);
            tact.setVisibility(View.GONE);
            tref.setVisibility(View.GONE);
        } else if (act) {
            tprowell.setVisibility(View.GONE);
            tact.setVisibility(View.VISIBLE);
            tref.setVisibility(View.GONE);
        } else {
            tprowell.setVisibility(View.GONE);
            tact.setVisibility(View.GONE);
            tref.setVisibility(View.VISIBLE);
        }
    }
}
