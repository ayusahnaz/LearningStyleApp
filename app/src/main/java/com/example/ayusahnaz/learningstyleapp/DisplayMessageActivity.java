package com.example.ayusahnaz.learningstyleapp;

import android.app.Activity;
import android.app.Application;
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
        final RadioGroup radioGroup = (RadioGroup)findViewById(idResource);

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

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
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

                RadioGroup rg1 = (RadioGroup) findViewById(R.id.radiogroup1);
                RadioGroup rg2 = (RadioGroup) findViewById(R.id.radiogroup2);
                RadioGroup rg3 = (RadioGroup) findViewById(R.id.radiogroup3);
                RadioGroup rg4 = (RadioGroup) findViewById(R.id.radiogroup4);
                RadioGroup rg5 = (RadioGroup) findViewById(R.id.radiogroup5);
                RadioGroup rg6 = (RadioGroup) findViewById(R.id.radiogroup6);
                RadioGroup rg7 = (RadioGroup) findViewById(R.id.radiogroup7);
                RadioGroup rg8 = (RadioGroup) findViewById(R.id.radiogroup8);
                RadioGroup rg9 = (RadioGroup) findViewById(R.id.radiogroup9);
                RadioGroup rg10 = (RadioGroup) findViewById(R.id.radiogroup10);
                RadioGroup rg11 = (RadioGroup) findViewById(R.id.radiogroup11);
                RadioGroup rg12 = (RadioGroup) findViewById(R.id.radiogroup12);
                RadioGroup rg13 = (RadioGroup) findViewById(R.id.radiogroup13);
                RadioGroup rg14 = (RadioGroup) findViewById(R.id.radiogroup14);
                RadioGroup rg15 = (RadioGroup) findViewById(R.id.radiogroup15);
                RadioGroup rg16 = (RadioGroup) findViewById(R.id.radiogroup16);
                RadioGroup rg17 = (RadioGroup) findViewById(R.id.radiogroup17);
                RadioGroup rg18 = (RadioGroup) findViewById(R.id.radiogroup18);
                RadioGroup rg19 = (RadioGroup) findViewById(R.id.radiogroup19);
                RadioGroup rg20 = (RadioGroup) findViewById(R.id.radiogroup20);
                RadioGroup rg21 = (RadioGroup) findViewById(R.id.radiogroup21);
                RadioGroup rg22 = (RadioGroup) findViewById(R.id.radiogroup22);
                RadioGroup rg23 = (RadioGroup) findViewById(R.id.radiogroup23);
                RadioGroup rg24 = (RadioGroup) findViewById(R.id.radiogroup24);
                RadioGroup rg25 = (RadioGroup) findViewById(R.id.radiogroup25);
                RadioGroup rg26 = (RadioGroup) findViewById(R.id.radiogroup26);
                RadioGroup rg27 = (RadioGroup) findViewById(R.id.radiogroup27);
                RadioGroup rg28 = (RadioGroup) findViewById(R.id.radiogroup28);
                RadioGroup rg29 = (RadioGroup) findViewById(R.id.radiogroup29);
                RadioGroup rg30 = (RadioGroup) findViewById(R.id.radiogroup30);
                RadioGroup rg31 = (RadioGroup) findViewById(R.id.radiogroup31);
                RadioGroup rg32 = (RadioGroup) findViewById(R.id.radiogroup32);
                RadioGroup rg33 = (RadioGroup) findViewById(R.id.radiogroup33);
                RadioGroup rg34 = (RadioGroup) findViewById(R.id.radiogroup34);
                RadioGroup rg35 = (RadioGroup) findViewById(R.id.radiogroup35);
                RadioGroup rg36 = (RadioGroup) findViewById(R.id.radiogroup36);
                RadioGroup rg37 = (RadioGroup) findViewById(R.id.radiogroup37);
                RadioGroup rg38 = (RadioGroup) findViewById(R.id.radiogroup38);
                RadioGroup rg39 = (RadioGroup) findViewById(R.id.radiogroup39);
                RadioGroup rg40 = (RadioGroup) findViewById(R.id.radiogroup40);
                RadioGroup rg41 = (RadioGroup) findViewById(R.id.radiogroup41);
                RadioGroup rg42 = (RadioGroup) findViewById(R.id.radiogroup42);
                RadioGroup rg43 = (RadioGroup) findViewById(R.id.radiogroup43);
                RadioGroup rg44 = (RadioGroup) findViewById(R.id.radiogroup44);

                boolean b1 = rg1.getCheckedRadioButtonId() == -1;
                boolean b2 = rg2.getCheckedRadioButtonId() == -1;
                boolean b3 = rg3.getCheckedRadioButtonId() == -1;
                boolean b4 = rg4.getCheckedRadioButtonId() == -1;
                boolean b5 = rg5.getCheckedRadioButtonId() == -1;
                boolean b6 = rg6.getCheckedRadioButtonId() == -1;
                boolean b7 = rg7.getCheckedRadioButtonId() == -1;
                boolean b8 = rg8.getCheckedRadioButtonId() == -1;
                boolean b9 = rg9.getCheckedRadioButtonId() == -1;
                boolean b10 = rg10.getCheckedRadioButtonId() == -1;
                boolean b11 = rg11.getCheckedRadioButtonId() == -1;
                boolean b12 = rg12.getCheckedRadioButtonId() == -1;
                boolean b13 = rg13.getCheckedRadioButtonId() == -1;
                boolean b14 = rg14.getCheckedRadioButtonId() == -1;
                boolean b15 = rg15.getCheckedRadioButtonId() == -1;
                boolean b16 = rg16.getCheckedRadioButtonId() == -1;
                boolean b17 = rg17.getCheckedRadioButtonId() == -1;
                boolean b18 = rg18.getCheckedRadioButtonId() == -1;
                boolean b19 = rg19.getCheckedRadioButtonId() == -1;
                boolean b20 = rg20.getCheckedRadioButtonId() == -1;
                boolean b21 = rg21.getCheckedRadioButtonId() == -1;
                boolean b22 = rg22.getCheckedRadioButtonId() == -1;
                boolean b23 = rg23.getCheckedRadioButtonId() == -1;
                boolean b24 = rg24.getCheckedRadioButtonId() == -1;
                boolean b25 = rg25.getCheckedRadioButtonId() == -1;
                boolean b26 = rg26.getCheckedRadioButtonId() == -1;
                boolean b27 = rg27.getCheckedRadioButtonId() == -1;
                boolean b28 = rg28.getCheckedRadioButtonId() == -1;
                boolean b29 = rg29.getCheckedRadioButtonId() == -1;
                boolean b30 = rg30.getCheckedRadioButtonId() == -1;
                boolean b31 = rg31.getCheckedRadioButtonId() == -1;
                boolean b32 = rg32.getCheckedRadioButtonId() == -1;
                boolean b33 = rg33.getCheckedRadioButtonId() == -1;
                boolean b34 = rg34.getCheckedRadioButtonId() == -1;
                boolean b35 = rg35.getCheckedRadioButtonId() == -1;
                boolean b36 = rg36.getCheckedRadioButtonId() == -1;
                boolean b37 = rg37.getCheckedRadioButtonId() == -1;
                boolean b38 = rg38.getCheckedRadioButtonId() == -1;
                boolean b39 = rg39.getCheckedRadioButtonId() == -1;
                boolean b40 = rg40.getCheckedRadioButtonId() == -1;
                boolean b41 = rg41.getCheckedRadioButtonId() == -1;
                boolean b42 = rg42.getCheckedRadioButtonId() == -1;
                boolean b43 = rg43.getCheckedRadioButtonId() == -1;
                boolean b44 = rg44.getCheckedRadioButtonId() == -1;

                if(b1 || b2 || b3 || b4 || b5 || b6 || b7 || b8 || b9 || b10 || b11 || b12 || b13
                        || b14 || b15 || b16 || b17 || b18 || b19 || b20 || b21 || b22 || b23 || b24 || b25
                        || b26 || b27 || b28 || b29 || b30 || b31 || b32 || b33 || b34 || b35 || b36 || b37
                        || b38 || b39 || b40 || b41 || b42 || b43 || b44){
                    Toast.makeText(DisplayMessageActivity.this, "You must fill all numbers", Toast.LENGTH_SHORT).show();
                }else{
                    Intent searchIntent=new Intent(DisplayMessageActivity.this, ResultActivity.class);
                    searchIntent.putExtra("REST1", total1);
                    searchIntent.putExtra("REST2", total2);
                    searchIntent.putExtra("REST3", total3);
                    searchIntent.putExtra("REST4", total4);
                    startActivity(searchIntent);
                }


            }
        });
    }
}
