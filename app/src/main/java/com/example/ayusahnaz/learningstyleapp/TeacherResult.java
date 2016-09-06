package com.example.ayusahnaz.learningstyleapp;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;


public class TeacherResult extends Activity {
    private ArrayList<String> result;
    String active;
    String reflective;
    String sensing;
    String intuitive;
    String visual;
    String verbal;
    String sequential;
    String global;

    TextView txtresultlabel;
    TextView txtresult2label;
    TextView txtresult3label;
    TextView txtresult4label;

    TextView txtresult;
    TextView txtresult2;
    TextView txtresult3;
    TextView txtresult4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_result);

        Bundle b=this.getIntent().getExtras();
        String[] array=b.getStringArray("key");
//        txtteacher = (TextView) findViewById(R.id.txtteacher);
//        txtteacher.setText(Arrays.toString(array));
        //System.out.println(Arrays.toString(array));

        active = "1. Give material that emphasizes practical problem-solving methods.\n" +
                "2. Provide hands-on.\n" +
                "3. Use computer-assisted instruction.\n" +
                "4  Provide opportunities for students to do something active besides transcribing notes. Small-group brainstorming activities that take no more than five minutes are extremely effective for this purpose.\n" +
                "5. Give students the option of cooperating on homework assignments to the greatest possible extent. Active learners generally learn best when they interact with others; if they are denied the opportunity to do so they are being deprived of their most effective learning tool.";

        reflective = "1. Give material that emphasizes fundamental understanding.\n" +
                "2. Do not fill every minute of class time lecturing and writing on the board. Provide intervals—however brief—for students to think about what they have been told.\n" +
                "3. Assign some drill exercises to provide practice in the basic methods being taught, but do not overdo them.\n" +
                "4. Provide some open-ended problems and exercises that call for analysis and synthesis.";

        sensing = "1. Provide concrete information (facts, data, real or hypothetical experiments and their results).\n" +
                "2. Give material that emphasizes practical problem-solving methods.\n" +
                "3. Provide explicit illustrations of sensing patterns (observation of surroundings, empirical experimentation, attention to detail). Do not expect either group to be able to exercise the other group’s processes immediately.\n" +
                "4. Follow the scientific method in presenting theoretical material. Provide concrete examples of the phenomena the theory describes or predicts.\n" +
                "5. Show how the theory and present applications.\n" +
                "6. Use pictures, schematics, graphs, and simple sketches liberally before, during, and after the presentation of verbal material, show films, provide demonstrations.\n" +
                "7. Use computer-assisted instruction—sensors respond very well to it.\n" +
                "8. Assign some drill exercises to provide practice in the basic methods being taught.";

        intuitive = "1. Provide  abstract concepts (principles, theories, mathematical models).\n" +
                "2. Give material that emphasizes fundamental understanding.\n" +
                "3. Provide explicit illustrations of intuitive patterns (logical inference, pattern recognition, generalization). Do not expect either group to be able to exercise the other group’s processes immediately.\n" +
                "4. Follow the scientific method in presenting theoretical material. Provide concrete examples of the phenomena the theory describes or predicts.\n" +
                "5. Develop the theory or formulate the mod.\n" +
                "6. Provide some open-ended problems and exercises that call for analysis and synthesis.\n" +
                "7. Applaud creative solutions, even incorrect ones";

        visual = "Use pictures, schematics, graphs, and simple sketches liberally before, during,";

        verbal = "After the presentation of verbal material, show films, provide demonstrations.";

        sequential = "1. Follow the scientific method in presenting theoretical material. Provide concrete examples of the phenomena the theory describes or predicts; then develop the theory or formulate the mod\n" +
                "2. Show how the theory or mod can be validated and deduce its consequences; and present applications\n" +
                "3. Assign some drill exercises to provide practice in the basic methods being taught";

        global = "1. Motivate learning. As much as possible, relate the material being presented to what has come before and what is still to come in the same course, to material in other courses, and particularly to the students’ personal experience\n" +
                "2. Applaud creative solutions, even incorrect ones";

        for(int i=1; i<array.length; i++){
            if("Active".equalsIgnoreCase(array[i])){
                txtresultlabel = (TextView) findViewById(R.id.label1);
                txtresultlabel.setText("Active");
                txtresult = (TextView) findViewById(R.id.dimensi1);
                txtresult.setText(active);
            } if("Reflective".equalsIgnoreCase(array[i])){
                txtresultlabel = (TextView) findViewById(R.id.label1);
                txtresultlabel.setText("Reflective");
                txtresult = (TextView) findViewById(R.id.dimensi1);
                txtresult.setText(reflective);
            } if("Sensing".equalsIgnoreCase(array[i])){
                txtresult2label = (TextView) findViewById(R.id.label2);
                txtresult2label.setText("Sensing");
                txtresult2 = (TextView) findViewById(R.id.dimensi2);
                txtresult2.setText(sensing);
            } if("Intuitive".equalsIgnoreCase(array[i])){
                txtresult2label = (TextView) findViewById(R.id.label2);
                txtresult2label.setText("Intuitive");
                txtresult2 = (TextView) findViewById(R.id.dimensi2);
                txtresult2.setText(intuitive);
            } if("Visual".equalsIgnoreCase(array[i])) {
                txtresult3label = (TextView) findViewById(R.id.label3);
                txtresult3label.setText("Visual");
                txtresult3 = (TextView) findViewById(R.id.dimensi3);
                txtresult3.setText(visual);
            } if("Verbal".equalsIgnoreCase(array[i])){
                txtresult3label = (TextView) findViewById(R.id.label3);
                txtresult3label.setText("Verbal");
                txtresult3 = (TextView) findViewById(R.id.dimensi3);
                txtresult3.setText(verbal);
            } if("Sequential".equalsIgnoreCase(array[i])){
                txtresult4label = (TextView) findViewById(R.id.label4);
                txtresult4label.setText("Sequential");
                txtresult4 = (TextView) findViewById(R.id.dimensi4);
                txtresult4.setText(sequential);
            } if("Global".equalsIgnoreCase(array[i])){
                txtresult4label = (TextView) findViewById(R.id.label4);
                txtresult4label.setText("Global");
                txtresult4 = (TextView) findViewById(R.id.dimensi4);
                txtresult4.setText(global);
            }
        }

    }
}
