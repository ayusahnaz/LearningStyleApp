package com.example.ayusahnaz.learningstyleapp;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

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
        System.out.println(Arrays.toString(value));
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

//                if(idResourcea == checkedId){
//                    value[i] = ((RadioButton) findViewById(idResourcea)).getText().toString();
//
//                }
//                if(idResourceb == checkedId){
//                    value[i] = ((RadioButton) findViewById(idResourceb)).getText().toString();
//                }
                if(rg.getCheckedRadioButtonId()!= -1){
                    int id = rg.getCheckedRadioButtonId();
                    View radioButton = rg.findViewById(id);
                    int radioId = rg.indexOfChild(radioButton);
                    RadioButton btn = (RadioButton) rg.getChildAt(radioId);
                    String selection = (String) btn.getText();
                    value[i] = selection;
                }
            }
        });

//        for(int j=0; j<value.length; j++){
//            System.out.println(value[j]);
//        }

        btnTeacher.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent searchIntent=new Intent(TeacherDisplay.this, TeacherResult.class);
                searchIntent.putExtra("ARRVALUE", value);
                startActivity(searchIntent);
            }
        });
    }
}
