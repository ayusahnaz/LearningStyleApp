package com.example.ayusahnaz.learningstyleapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ayusahnaz on 8/31/16.
 */
public class DisplayMessageActivity extends Activity {
    private int [] value = new int[45];
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        for(int i=1; i< 45;  i++){
            addListenerOnButton(i);
        }
    }

    private void addListenerOnButton(final int i) {
        Resources r = getResources();
        String name = getPackageName();
        String cad = "radiogroup";
        String cat= Integer.toString(i);
        cad=cad.concat(cat);
        final int idResource = r.getIdentifier(cad, "id", name);
        RadioGroup radioGroup= (RadioGroup)findViewById(idResource);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                Resources res = getResources();
                String pname = getPackageName();
                String con = "radioButton";
                String cat= Integer.toString(i);
                String cona = con.concat(cat + "a");
                String conb = con.concat(cat + "b");
                int idResourcea = res.getIdentifier(cona, "id", pname);
                int idResourceb = res.getIdentifier(conb, "id", pname);
                if(idResourcea == checkedId){
                    value[i] = 1;
                }
                if(idResourceb == checkedId){
                    value[i] = -1;
                }
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int total1 = 0;
                int total2 = 0;
                int total3 = 0;
                int total4 = 0;

                for(int i=1; i<value.length; i++){
                    if(i%4==1){
                        total1 += value[i];
                    }
                    if(i%4==2){
                        total2 += value[i];
                    }
                    if(i%4==3){
                        total3 += value[i];
                    }
                    if(i%4==0){
                        total4 += value[i];
                    }
                }
                Intent searchIntent=new Intent(DisplayMessageActivity.this, ResultActivity.class);
                searchIntent.putExtra("REST1", total1);
                searchIntent.putExtra("REST2", total2);
                searchIntent.putExtra("REST3", total3);
                searchIntent.putExtra("REST4", total4);
                startActivity(searchIntent);
            }
        });
    }
}
