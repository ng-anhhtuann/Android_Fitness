package com.pro.fitnessappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HeightActivity extends AppCompatActivity {
    Button back, next, cm, ft;
    TextView textview;
    EditText edittext;
    boolean a, b;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height);

        back = findViewById(R.id.backbtn);
        next = findViewById(R.id.nextbtn);
        cm = findViewById(R.id.cmbtn);
        ft = findViewById(R.id.ftbtn);
        edittext = findViewById(R.id.edittext);
        textview = findViewById(R.id.textview);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(HeightActivity.this, AgeActivity.class);
                finish();
            }
        });

        cm.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textview.setText("Cm");
                a = true;
                setcm(a);
                if (b) {
                    b = false;
                    setft(b);
                }
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (Integer.parseInt(edittext.getText().toString()) >= 50 && Integer.parseInt(edittext.getText().toString()) <= 300) {
                            Intent b = new Intent(HeightActivity.this, WeightActivity.class);
                            startActivity(b);
                        } else {
                            Toast.makeText(HeightActivity.this, "Please try again between 50 vs 300", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
        ft.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textview.setText("Ft");
                b = true;
                setft(b);
                if (a) {
                    a = false;
                    setcm(a);
                }
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (Integer.parseInt(edittext.getText().toString()) >= 1 && Integer.parseInt(edittext.getText().toString()) <= 10) {
                            Intent b = new Intent(HeightActivity.this, WeightActivity.class);
                            startActivity(b);
                        } else {
                            Toast.makeText(HeightActivity.this, "Please try again between 1 vs 10", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });


    }

    public void setcm(boolean a) {
        if (a) {
            cm.setBackgroundResource(R.drawable.height_purple_cm);
        } else {
            cm.setBackgroundResource(R.drawable.height_grey_cm);
        }
    }

    public void setft(boolean b) {
        if (b) {
            ft.setBackgroundResource(R.drawable.height_purple_ft);
        } else {
            ft.setBackgroundResource(R.drawable.height_grey_ft);
        }
    }
}