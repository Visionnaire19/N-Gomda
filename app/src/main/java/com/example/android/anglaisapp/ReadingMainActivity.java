package com.example.android.anglaisapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ReadingMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button Text1 = findViewById(R.id.button_one);
        Text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Text1Intent = new Intent(ReadingMainActivity.this,ReadingActivity.class);
                Text1Intent.putExtra("buttonNumber2", 0);
                startActivity(Text1Intent);
            }
        });

        Button Text2 = findViewById(R.id.button_two);
        Text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Text2Intent = new Intent(ReadingMainActivity.this,ReadingActivity.class);
                Text2Intent.putExtra("buttonNumber2", 1);
                startActivity(Text2Intent);
            }
        });

        Button Text3 = findViewById(R.id.button_three);
        Text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Text3Intent = new Intent(ReadingMainActivity.this,ReadingActivity.class);
                Text3Intent.putExtra("buttonNumber2", 2);
                startActivity(Text3Intent);
            }
        });

        Button Text4 = findViewById(R.id.button_four);
        Text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Text4Intent = new Intent(ReadingMainActivity.this,ReadingActivity.class);
                Text4Intent.putExtra("buttonNumber2", 3);
                startActivity(Text4Intent);
            }
        });

        Button Text5 = findViewById(R.id.button_five);
        Text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Text5Intent = new Intent(ReadingMainActivity.this,ReadingActivity.class);
                Text5Intent.putExtra("buttonNumber2", 4);
                startActivity(Text5Intent);
            }
        });

        Button Text6 = findViewById(R.id.button_six);
        Text6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Text6Intent = new Intent(ReadingMainActivity.this,ReadingActivity.class);
                Text6Intent.putExtra("buttonNumber2", 5);
                startActivity(Text6Intent);
            }
        });

        Button Text7 = findViewById(R.id.button_seven);
        Text7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Text7Intent = new Intent(ReadingMainActivity.this,ReadingActivity.class);
                Text7Intent.putExtra("buttonNumber2", 6);
                startActivity(Text7Intent);
            }
        });

        Button Text8 = findViewById(R.id.button_eight);
        Text8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Text8Intent = new Intent(ReadingMainActivity.this,ReadingActivity.class);
                Text8Intent.putExtra("buttonNumber2", 7);
                startActivity(Text8Intent);
            }
        });
        Button Text9 = findViewById(R.id.button_nine);
        Text9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Text9Intent = new Intent(ReadingMainActivity.this,ReadingActivity.class);
                Text9Intent.putExtra("buttonNumber2", 8);
                startActivity(Text9Intent);
            }
        });

        Button Text10 = findViewById(R.id.button_ten);
        Text10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Text10Intent = new Intent(ReadingMainActivity.this,ReadingActivity.class);
                Text10Intent.putExtra("buttonNumber2", 9);
                startActivity(Text10Intent);
            }
        });

        Button Text11 = findViewById(R.id.button_eleven);
        Text11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Text11Intent = new Intent(ReadingMainActivity.this,ReadingActivity.class);
                Text11Intent.putExtra("buttonNumber2", 10);
                startActivity(Text11Intent);
            }
        });

        Button Text12 = findViewById(R.id.button_twelve);
        Text12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Text12Intent = new Intent(ReadingMainActivity.this,ReadingActivity.class);
                Text12Intent.putExtra("buttonNumber2", 11);
                startActivity(Text12Intent);
            }
        });

        Button Text13 = findViewById(R.id.button_thirteen);
        Text13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Text13Intent = new Intent(ReadingMainActivity.this,ReadingActivity.class);
                Text13Intent.putExtra("buttonNumber2", 12);
                startActivity(Text13Intent);
            }
        });

        Button Text14 = findViewById(R.id.button_fourteen);
        Text14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Text14Intent = new Intent(ReadingMainActivity.this,ReadingActivity.class);
                Text14Intent.putExtra("buttonNumber2", 13);
                startActivity(Text14Intent);
            }
        });

        Button Text15 = findViewById(R.id.button_fifteen);
        Text15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Text15Intent = new Intent(ReadingMainActivity.this,ReadingActivity.class);
                Text15Intent.putExtra("buttonNumber2", 14);
                startActivity(Text15Intent);
            }
        });

        Button Text16 = findViewById(R.id.button_sixteen);
        Text16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Text16Intent = new Intent(ReadingMainActivity.this,ReadingActivity.class);
                Text16Intent.putExtra("buttonNumber2", 15);
                startActivity(Text16Intent);
            }
        });

        Button Text17 = findViewById(R.id.button_seventeen);
        Text17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Text17Intent = new Intent(ReadingMainActivity.this,ReadingActivity.class);
                Text17Intent.putExtra("buttonNumber2", 16);
                startActivity(Text17Intent);
            }
        });

        Button Text18 = findViewById(R.id.button_eighteen);
        Text18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Text18Intent = new Intent(ReadingMainActivity.this,ReadingActivity.class);
                Text18Intent.putExtra("buttonNumber2", 17);
                startActivity(Text18Intent);
            }
        });

        Button Text19 = findViewById(R.id.button_nineteen);
        Text19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Text19Intent = new Intent(ReadingMainActivity.this,ReadingActivity.class);
                Text19Intent.putExtra("buttonNumber2", 18);
                startActivity(Text19Intent);
            }
        });

        Button Text20 = findViewById(R.id.button_twenty);
        Text20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Text20Intent = new Intent(ReadingMainActivity.this,ReadingActivity.class);
                Text20Intent.putExtra("buttonNumber2", 19);
                startActivity(Text20Intent);
            }
        });


    }
}
