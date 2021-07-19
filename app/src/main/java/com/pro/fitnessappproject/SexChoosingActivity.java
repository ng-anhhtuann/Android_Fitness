package com.pro.fitnessappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SexChoosingActivity extends AppCompatActivity {
    Button btnfemale, btnmale, btnnext;
    boolean a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sex_choosing);

        btnfemale = findViewById(R.id.btn_female);
        btnmale = findViewById(R.id.btn_male);
        btnnext = findViewById(R.id.btn_next);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(SexChoosingActivity.this, BodyAimActivity.class);
                startActivity(c);
            }
        });

        btnfemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = true;
                female(true);
                if (b) {
                    b = false;
                    male(false);
                }
            }
        });
        btnmale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = true;
                male(true);
                if (a) {
                    a = false;
                    female(false);
                }
            }
        });
    }

    public void female(boolean a) {
        if (a) {
            btnfemale.setBackgroundResource(R.drawable.sexchoose_chosefemale);
        } else {
            btnfemale.setBackgroundResource(R.drawable.sexchoose_nochosefemale);
        }
    }

    public void male(boolean b) {
        if (b) {
            btnmale.setBackgroundResource(R.drawable.sexchoose_chosemale);
        } else {
            btnmale.setBackgroundResource(R.drawable.sexchoose_nochosemale);
        }
    }

}