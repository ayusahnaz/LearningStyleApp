package com.example.ayusahnaz.learningstyleapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ayusahnaz on 8/31/16.
 */
public class ResultActivity extends Activity {
    private int [] array = new int [45];
    private Boolean prowell, act, ref;
    private Boolean perwell, sen, intv;
    private Boolean inpwell, vis, ver;
    private Boolean undwell, seq, glo;

    TextView text1, text2, text3, text4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        text1 = (TextView) findViewById(R.id.textView3);
        text2 = (TextView) findViewById(R.id.textView4);
        text3 = (TextView) findViewById(R.id.textView5);
        text4 = (TextView) findViewById(R.id.textView6);

        Button pro = (Button) findViewById(R.id.processing);
        final Button per = (Button) findViewById(R.id.perception);
        Button inp = (Button) findViewById(R.id.input);
        Button und = (Button) findViewById(R.id.understanding);


        Bundle extras = getIntent().getExtras();
        int total1  = extras.getInt("REST1");
        int total2  = extras.getInt("REST2");
        int total3  = extras.getInt("REST3");
        int total4  = extras.getInt("REST4");


        if(total1 <= 3 && total1 >= -3){
            text1.setText("You are fairly well balanced on the two dimensions of that scale");
            prowell = true;
        }if(total1 <= 7 && total1 >= 5){
            text1.setText("You have a moderate preference for Active dimension. You will learn more easily in a teaching environment which favors that dimension");
            act = true;
        }if(total1 >= -7 && total1 <= -5){
            text1.setText("You have a moderate preference for Reflective dimension. You will learn more easily in a teaching environment which favors that dimension");
            ref = true;
        }if(total1 <= 11 && total1 >= 9){
            text1.setText("You have a very strong preference for Active dimension. You may have real difficulty learning in an environment which does not support that preference");
            act = true;
        }if(total1 >= -11 && total1 <= -9){
            text1.setText("You have a very strong preference for Reflective dimension. You may have real difficulty learning in an environment which does not support that preference");
            ref = true;
        }

        if(total2 <= 3 && total2 >= -3){
            text2.setText("You are fairly well balanced on the two dimensions of that scale");
            perwell = true;
        }else if(total2 <= 7 && total2 >= 5){
            text2.setText("You have a moderate preference for Sensing dimension. You will learn more easily in a teaching environment which favors that dimension");
            sen = true;
        }else if(total2 >= -7 && total2 <= -5){
            text2.setText("You have a moderate preference for Intuitive dimension. You will learn more easily in a teaching environment which favors that dimension");
            intv = true;
        }else if(total2 <= 11 && total2 >= 9){
            text2.setText("You have a very strong preference for Sensing dimension. You may have real difficulty learning in an environment which does not support that preference");
            sen = true;
        }else if(total2 >= -11 && total2 <= -9){
            text2.setText("You have a very strong preference for Intuitive dimension. You may have real difficulty learning in an environment which does not support that preference");
            intv = true;
        }

        if(total3 <= 3 && total3 >= -3){
            text3.setText("You are fairly well balanced on the two dimensions of that scale");
            inpwell = true;
        }else if(total3 <= 7 && total3 >= 5){
            text3.setText("You have a moderate preference for Visual dimension. You will learn more easily in a teaching environment which favors that dimension");
            vis = true;
        }else if(total3 >= -7 && total3 <= -5){
            text3.setText("You have a moderate preference for Verbal dimension. You will learn more easily in a teaching environment which favors that dimension");
            ver = true;
        }else if(total3 <= 11 && total3 >= 9){
            text3.setText("You have a very strong preference for Visual dimension. You may have real difficulty learning in an environment which does not support that preference");
            vis = true;
        }else if(total3 >= -11 && total3 <= -9){
            text3.setText("You have a very strong preference for Verbal dimension. You may have real difficulty learning in an environment which does not support that preference");
            ver = true;
        }

        if(total4 <= 3 && total4 >= -3){
            text4.setText("You are fairly well balanced on the two dimensions of that scale");
            undwell = true;
        }else if(total4 <= 7 && total4 >= 5){
            text4.setText("You have a moderate preference for Sequential dimension. You will learn more easily in a teaching environment which favors that dimension");
            seq = true;
        }else if(total4 >= -7 && total4 <= -5){
            text4.setText("You have a moderate preference for Global dimension. You will learn more easily in a teaching environment which favors that dimension");
            glo = true;
        }else if(total4 <= 11 && total4 >= 9){
            text4.setText("You have a very strong preference for Sequential dimension. You may have real difficulty learning in an environment which does not support that preference");
            seq = true;
        }else if(total4 >= -11 && total4 <= -9){
            text4.setText("You have a very strong preference for Global dimension. You may have real difficulty learning in an environment which does not support that preference");
            glo = true;
        }

        pro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(ResultActivity.this, Processing.class);
                myIntent.putExtra("prowell", prowell);
                myIntent.putExtra("act", act);
                myIntent.putExtra("ref", ref);
                startActivity(myIntent);
            }
        });

        per.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(ResultActivity.this, Perception.class);
                myIntent.putExtra("perwell", perwell);
                myIntent.putExtra("sen", sen);
                myIntent.putExtra("intv", intv);
                startActivity(myIntent);
            }
        });

        inp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(ResultActivity.this, Input.class);
                myIntent.putExtra("inpwell", inpwell);
                myIntent.putExtra("vis", vis);
                myIntent.putExtra("ver", ver);
                startActivity(myIntent);
            }
        });

        und.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(ResultActivity.this, Understanding.class);
                myIntent.putExtra("undwell", undwell);
                myIntent.putExtra("seq", seq);
                myIntent.putExtra("glo", glo);
                startActivity(myIntent);
            }
        });

    }
}

