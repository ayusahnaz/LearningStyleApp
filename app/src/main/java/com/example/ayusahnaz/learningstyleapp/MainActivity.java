package com.example.ayusahnaz.learningstyleapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void letsBegin(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        startActivity(intent);
    }

    public void teacherView(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, TeacherDisplay.class);
        startActivity(intent);
    }
    public void aboutView(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }
}
