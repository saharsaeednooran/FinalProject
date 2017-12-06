package com.example.sahar.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTrackerActivity extends Activity {
    private Button startTrackingbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracker);

        startTrackingbutton = (Button) findViewById(R.id.startTrackingButton);
        startTrackingbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ActivityTrackerActivity.this,AddActivity.class);
                startActivity(intent);
            }
        });


    }
}
