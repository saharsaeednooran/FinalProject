package com.example.sahar.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button activityTrackerButton = (Button) findViewById(R.id.activityTrackerButton);
        activityTrackerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityTrackerActivity.class);
                startActivityForResult(intent, 10);
            }
        });

        Button nutritionTrackerButton = (Button) findViewById(R.id.nutritionTrackerButton);
        nutritionTrackerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NutritionTrackerActivity.class);
                startActivityForResult(intent, 10);
            }
        });

        Button houseThermostatButton = (Button) findViewById(R.id.houseThermostatButton);
        houseThermostatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HouseThermostatActivity.class);
                startActivityForResult(intent, 10);
            }
        });

        Button automobileButton = (Button) findViewById(R.id.automobileButton);
        automobileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AutomobileActivity.class);
                startActivityForResult(intent, 10);
            }
        });
    }
}
