package com.example.ayusahnaz.learningstyleapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ayusahnaz on 9/2/16.
 */
public class Input extends Activity {
    TextView tinpwell, tvis, tver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .8), (int) (height * .8));

        tinpwell = (TextView) findViewById(R.id.textView13);
        tvis = (TextView) findViewById(R.id.textView14);
        tver = (TextView) findViewById(R.id.textView15);

        Boolean inpwell = getIntent().getExtras().getBoolean("inpwell");
        Boolean vis = getIntent().getExtras().getBoolean("vis");
        Boolean ver = getIntent().getExtras().getBoolean("ver");

        if (inpwell) {
            tinpwell.setVisibility(View.VISIBLE);
            tvis.setVisibility(View.GONE);
            tver.setVisibility(View.GONE);
        } else if (vis) {
            tinpwell.setVisibility(View.GONE);
            tvis.setVisibility(View.VISIBLE);
            tver.setVisibility(View.GONE);
        } else {
            tinpwell.setVisibility(View.GONE);
            tvis.setVisibility(View.GONE);
            tver.setVisibility(View.VISIBLE);
        }
    }
}
