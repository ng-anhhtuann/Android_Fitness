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

public class WeightActivity extends AppCompatActivity {

    Button back, next, kg, lb;
    TextView textview;
    EditText edittext;
    boolean a, b;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        back = findViewById(R.id.backbtn);
        next = findViewById(R.id.nextbtn);
        kg = findViewById(R.id.kgbtn);
        lb = findViewById(R.id.lbbtn);
        edittext = findViewById(R.id.edittext);
        textview = findViewById(R.id.textview);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(WeightActivity.this, AgeActivity.class);
                finish();
            }
        });

        kg.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textview.setText("Kg");
                a = true;
                setkg(true);
                if (b) {
                    b = false;
                    setlb(false);
                }
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (Integer.parseInt(edittext.getText().toString()) >= 20 && Integer.parseInt(edittext.getText().toString()) <= 200) {
                            Intent b = new Intent(WeightActivity.this, GoalWeightActivity.class);
                            startActivity(b);
                        } else {
                            Toast.makeText(WeightActivity.this, "Please try again between 20 vs 200", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
        lb.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                textview.setText("Lb");
                b = true;
                setlb(true);
                if (a) {
                    a = false;
                    setkg(false);
                }
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (Integer.parseInt(edittext.getText().toString()) >= 40 && Integer.parseInt(edittext.getText().toString()) <= 400) {
                            Intent b = new Intent(WeightActivity.this, GoalWeightActivity.class);
                            startActivity(b);
                        } else {
                            Toast.makeText(WeightActivity.this, "Please try again between 40 vs 400", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }

    public void setkg(boolean a) {
        if (a) {
            kg.setBackgroundResource(R.drawable.weight_purple_kg);
        } else {
            kg.setBackgroundResource(R.drawable.weight_grey_kg);
        }
    }

    public void setlb(boolean b) {
        if (b) {
            lb.setBackgroundResource(R.drawable.weight_purple_lb);
        } else {
            lb.setBackgroundResource(R.drawable.weight_grey_lb);
        }
    }
}