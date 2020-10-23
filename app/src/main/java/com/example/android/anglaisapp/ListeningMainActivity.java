package com.example.android.anglaisapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListeningMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listening_activity_main);


        //create arrow to go back in title bar.
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //We start buttonNumber from 0 just so that it matches with the arrays in ListeningAudioActivity.java
        Button Audio1=  findViewById(R.id.button_audio1);

        Audio1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent Audio1Intent = new Intent(ListeningMainActivity.this, ListeningAudioActivity.class);
                Audio1Intent.putExtra("buttonNumber",0);
                startActivity(Audio1Intent);

            }
        });

        Button Audio2= findViewById(R.id.button_audio2);

        Audio2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent Audio2Intent = new Intent(ListeningMainActivity.this, ListeningAudioActivity.class);
                Audio2Intent.putExtra("buttonNumber", 1);
                startActivity(Audio2Intent);



            }
        });
        Button Audio3=  findViewById(R.id.button_audio3);

        Audio3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent Audio3Intent = new Intent(ListeningMainActivity.this, ListeningAudioActivity.class);
                Audio3Intent.putExtra("buttonNumber", 2);
                startActivity(Audio3Intent);
            }
        });
        Button Audio4=  findViewById(R.id.button_audio4);

        Audio4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent Audio4Intent = new Intent(ListeningMainActivity.this, ListeningAudioActivity.class);
                Audio4Intent.putExtra("buttonNumber", 3);
                startActivity(Audio4Intent);
            }
        });
        Button Audio5=  findViewById(R.id.button_audio5);

        Audio5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent Audio5Intent = new Intent(ListeningMainActivity.this, ListeningAudioActivity.class);
                Audio5Intent.putExtra("buttonNumber", 4);
                startActivity(Audio5Intent);
            }
        });
        Button Audio6=  findViewById(R.id.button_audio6);

        Audio6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent Audio6Intent = new Intent(ListeningMainActivity.this, ListeningAudioActivity.class);
                Audio6Intent.putExtra("buttonNumber", 5);
                startActivity(Audio6Intent);
            }
        });
        Button Audio7=  findViewById(R.id.button_audio7);

        Audio7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent Audio7Intent = new Intent(ListeningMainActivity.this, ListeningAudioActivity.class);
                Audio7Intent.putExtra("buttonNumber", 6);
                startActivity(Audio7Intent);
            }
        });
        Button Audio8=  findViewById(R.id.button_audio8);

        Audio8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent Audio8Intent = new Intent(ListeningMainActivity.this, ListeningAudioActivity.class);
                Audio8Intent.putExtra("buttonNumber", 7);
                startActivity(Audio8Intent);
            }
        });
        Button Audio9=  findViewById(R.id.button_audio9);

        Audio9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent Audio9Intent = new Intent(ListeningMainActivity.this, ListeningAudioActivity.class);
                Audio9Intent.putExtra("buttonNumber", 8);
                startActivity(Audio9Intent);
            }
        });
        Button Audio10= findViewById(R.id.button_audio10);

        Audio10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent Audio10Intent = new Intent(ListeningMainActivity.this, ListeningAudioActivity.class);
                Audio10Intent.putExtra("buttonNumber", 9);
                startActivity(Audio10Intent);
            }
        });
        Button Audio11= findViewById(R.id.button_audio11);

        Audio11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent Audio11Intent = new Intent(ListeningMainActivity.this, ListeningAudioActivity.class);
                Audio11Intent.putExtra("buttonNumber", 10);
                startActivity(Audio11Intent);
            }
        });
        Button Audio12= findViewById(R.id.button_audio12);

        Audio12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent Audio12Intent = new Intent(ListeningMainActivity.this, ListeningAudioActivity.class);
                Audio12Intent.putExtra("buttonNumber", 11);
                startActivity(Audio12Intent);
            }
        });
        Button Audio13=  findViewById(R.id.button_audio13);

        Audio13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent Audio13Intent = new Intent(ListeningMainActivity.this, ListeningAudioActivity.class);
                Audio13Intent.putExtra("buttonNumber", 12);
                startActivity(Audio13Intent);
            }
        });
        Button Audio14=  findViewById(R.id.button_audio14);

        Audio14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent Audio14Intent = new Intent(ListeningMainActivity.this, ListeningAudioActivity.class);
                Audio14Intent.putExtra("buttonNumber", 13);
                startActivity(Audio14Intent);
            }
        });
        Button Audio15=  findViewById(R.id.button_audio15);

        Audio15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent Audio15Intent = new Intent(ListeningMainActivity.this, ListeningAudioActivity.class);
                Audio15Intent.putExtra("buttonNumber", 14);
                startActivity(Audio15Intent);
            }
        });
        Button Audio16=  findViewById(R.id.button_audio16);

        Audio16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent Audio16Intent = new Intent(ListeningMainActivity.this, ListeningAudioActivity.class);
                Audio16Intent.putExtra("buttonNumber", 15);
                startActivity(Audio16Intent);
            }
        });
        Button Audio17=  findViewById(R.id.button_audio17);

        Audio17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent Audio17Intent = new Intent(ListeningMainActivity.this, ListeningAudioActivity.class);
                Audio17Intent.putExtra("buttonNumber", 16);
                startActivity(Audio17Intent);
            }
        });
        Button Audio18=  findViewById(R.id.button_audio18);

        Audio18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent Audio18Intent = new Intent(ListeningMainActivity.this, ListeningAudioActivity.class);
                Audio18Intent.putExtra("buttonNumber", 17);
                startActivity(Audio18Intent);
            }
        });
        Button Audio19= findViewById(R.id.button_audio19);

        Audio19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent Audio19Intent = new Intent(ListeningMainActivity.this, ListeningAudioActivity.class);
                Audio19Intent.putExtra("buttonNumber", 18);
                startActivity(Audio19Intent);
            }
        });
        Button Audio20= findViewById(R.id.button_audio20);

        Audio20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent Audio20Intent = new Intent(ListeningMainActivity.this, ListeningAudioActivity.class);
                Audio20Intent.putExtra("buttonNumber", 19);
                startActivity(Audio20Intent);
            }
        });
    }

}
