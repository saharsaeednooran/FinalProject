package com.example.sahar.finalproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AddActivity extends Activity {
    protected static final String ACTIVITY_NAME = "AddActivity";
    ImageButton runningImgBtn, walkingImgBtn, skatingImgBtn, bikingImgBtn, swimmingImgBtn;
    SeekBar seekBar;
    TextView progressTextView;
    EditText commentEditText;
    Button addActivityBtn;
    String exerciseType;
    String comment;
    int progress;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        runningImgBtn=(ImageButton)findViewById(R.id.runningImageButton);
        walkingImgBtn=(ImageButton) findViewById(R.id.walkingImageButton);
        swimmingImgBtn=(ImageButton) findViewById(R.id.swimmingImageButton);
        skatingImgBtn=(ImageButton)findViewById(R.id.skatingImageButton);
        bikingImgBtn=(ImageButton)findViewById(R.id.bikingImageButton);
        seekBar=(SeekBar)findViewById(R.id.seekBar);
        progressTextView=(TextView)findViewById(R.id.progressTextView);
        commentEditText=(EditText)findViewById(R.id.commentsEditText);
        addActivityBtn=(Button)findViewById(R.id.addActivityButton);


        runningImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                runningImgBtn.setSelected(!runningImgBtn.isSelected());
                if (runningImgBtn.isSelected()){
                    bikingImgBtn.setSelected(false);
                    walkingImgBtn.setSelected(false);
                    swimmingImgBtn.setSelected(false);
                    skatingImgBtn.setSelected(false);
                }
                exerciseType="Run";
            }
        });

        walkingImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                walkingImgBtn.setSelected(!walkingImgBtn.isSelected());
                if (walkingImgBtn.isSelected()){
                    bikingImgBtn.setSelected(false);
                    runningImgBtn.setSelected(false);
                    swimmingImgBtn.setSelected(false);
                    skatingImgBtn.setSelected(false);
                }
                exerciseType="Walk";
            }
        });

        swimmingImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swimmingImgBtn.setSelected(!swimmingImgBtn.isSelected());
                if (swimmingImgBtn.isSelected()){
                    bikingImgBtn.setSelected(false);
                    runningImgBtn.setSelected(false);
                    walkingImgBtn.setSelected(false);
                    skatingImgBtn.setSelected(false);
                }
                exerciseType="Swim";
            }
        });

        skatingImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skatingImgBtn.setSelected(!skatingImgBtn.isSelected());
                if (skatingImgBtn.isSelected()){
                    bikingImgBtn.setSelected(false);
                    runningImgBtn.setSelected(false);
                    walkingImgBtn.setSelected(false);
                    swimmingImgBtn.setSelected(false);
                }
                exerciseType="Skate";
            }
        });


        bikingImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bikingImgBtn.setSelected(!bikingImgBtn.isSelected());
                if (bikingImgBtn.isSelected()){
                    runningImgBtn.setSelected(false);
                    walkingImgBtn.setSelected(false);
                    swimmingImgBtn.setSelected(false);
                    skatingImgBtn.setSelected(false);
                }
                exerciseType="Bike";
            }
        });

        //Progress bar toset the Duration
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                progressTextView.setText(i+" min");
                progress=i;
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });




        addActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Process the comments
                comment=commentEditText.getText().toString();
                Log.i(ACTIVITY_NAME, "comment= "+comment);
                Log.i(ACTIVITY_NAME, "progress= "+progress);
                Log.i(ACTIVITY_NAME, "exerciseType= "+exerciseType);



            }
        });








    }

}