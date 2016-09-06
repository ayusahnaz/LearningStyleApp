package com.example.ayusahnaz.learningstyleapp;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;


public class TeacherDisplay extends Activity {

    private String [] value = new String[5];

    private Button btnTeacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_display);

        for(int i=1; i<value.length;  i++){
            addListener(i);
        }
    }

    private void addListener(final int i) {
        Resources r = getResources();
        String name = getPackageName();
        String cad = "teacherGroup";
        String cat= Integer.toString(i);
        cad=cad.concat(cat);
        final int idResource = r.getIdentifier(cad, "id", name);
        System.out.println(idResource);
        final RadioGroup rg = (RadioGroup) findViewById(idResource);

        btnTeacher = (Button) findViewById(R.id.btnTeacher);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {

                Resources res = getResources();
                String pname = getPackageName();
                String con = "teacherButton";
                String cat= Integer.toString(i);
                String cona = con.concat(cat + "a");
                String conb = con.concat(cat + "b");
                int idResourcea = res.getIdentifier(cona, "id", pname);
                int idResourceb = res.getIdentifier(conb, "id", pname);

                checkedId = rg.getCheckedRadioButtonId();

                if(idResourcea == checkedId){
                    value[i] = ((RadioButton) findViewById(idResourcea)).getText().toString();

                }
                if(idResourceb == checkedId){
                    value[i] = ((RadioButton) findViewById(idResourceb)).getText().toString();
                }

            }
        });

        btnTeacher.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Bundle b=new Bundle();
                b.putStringArray("key", value);
                Intent i=new Intent(TeacherDisplay.this, TeacherResult.class);
                i.putExtras(b);

                RadioGroup rg1 = (RadioGroup) findViewById(R.id.teacherGroup1);
                RadioGroup rg2 = (RadioGroup) findViewById(R.id.teacherGroup2);
                RadioGroup rg3 = (RadioGroup) findViewById(R.id.teacherGroup3);
                RadioGroup rg4 = (RadioGroup) findViewById(R.id.teacherGroup4);

                if(rg1.getCheckedRadioButtonId()==-1 || rg2.getCheckedRadioButtonId()==-1 || rg3.getCheckedRadioButtonId()==-1 || rg4.getCheckedRadioButtonId()==-1){
                    Toast.makeText(TeacherDisplay.this, "You must fill all numbers", Toast.LENGTH_SHORT).show();
                }else{
                    startActivity(i);
                }

            }
        });
    }

}
