package com.example.ayusahnaz.learningstyleapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ayusahnaz on 9/2/16.
 */
public class Perception extends Activity{
    TextView tperwell, tsen, tint;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perception);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width*.8), (int) (height*.8));

        tperwell = (TextView) findViewById(R.id.textView10);
        tsen = (TextView) findViewById(R.id.textView11);
        tint = (TextView) findViewById(R.id.textView12);

        Boolean perwell = getIntent().getExtras().getBoolean("perwell");
        Boolean sen = getIntent().getExtras().getBoolean("sen");
        Boolean intv = getIntent().getExtras().getBoolean("intv");

        if(perwell){
            tperwell.setVisibility(View.VISIBLE);
            tsen.setVisibility(View.GONE);
            tint.setVisibility(View.GONE);
        } else if (sen) {
            tperwell.setVisibility(View.GONE);
            tsen.setVisibility(View.VISIBLE);
            tint.setVisibility(View.GONE);
        } else {
            tperwell.setVisibility(View.GONE);
            tsen.setVisibility(View.GONE);
            tint.setVisibility(View.VISIBLE);
        }
    }
}
