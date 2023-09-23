package com.example.practica2eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.location.GnssAntennaInfo;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity{


    Button B;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B= findViewById(R.id.btn);

        View.OnClickListener listener= new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        };
        B.set OnClickListener(Listener);

        B.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });
    }





}