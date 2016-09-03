package com.example.ayusahnaz.learningstyleapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ayusahnaz on 9/2/16.
 */
public class Understanding extends Activity{
    TextView tundwell, tseq, tglo;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.understanding);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width*.8), (int) (height*.8));

        tundwell = (TextView) findViewById(R.id.textView16);
        tseq = (TextView) findViewById(R.id.textView17);
        tglo = (TextView) findViewById(R.id.textView18);

        Boolean undwell = getIntent().getExtras().getBoolean("tundwell");
        Boolean seq = getIntent().getExtras().getBoolean("seq");
        Boolean glo = getIntent().getExtras().getBoolean("glo");

        if(undwell){
            tundwell.setVisibility(View.VISIBLE);
            tseq.setVisibility(View.GONE);
            tglo.setVisibility(View.GONE);
        } else if (seq) {
            tundwell.setVisibility(View.GONE);
            tseq.setVisibility(View.VISIBLE);
            tglo.setVisibility(View.GONE);
        } else {
            tundwell.setVisibility(View.GONE);
            tseq.setVisibility(View.GONE);
            tglo.setVisibility(View.VISIBLE);
        }
    }
}
