package com.pro.fitnessappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MotivateActivity extends AppCompatActivity {

    Button back, next;
    Button first, second, third, forth;
    boolean a, b, c, d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivate);

        back = findViewById(R.id.back);
        next = findViewById(R.id.next);
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.third);
        forth = findViewById(R.id.forth);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = true;
                first(true);
                if (b || c || d) {
                    b = false;
                    second(false);
                    c = false;
                    third(false);
                    d = false;
                    forth(false);
                }
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = true;
                second(true);
                if (a || c || d) {
                    a = false;
                    first(false);
                    c = false;
                    third(false);
                    d = false;
                    forth(false);
                }
            }
        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c = true;
                third(true);
                if (b || a || d) {
                    b = false;
                    second(false);
                    a = false;
                    first(false);
                    d = false;
                    forth(false);
                }
            }
        });
        forth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = true;
                forth(true);
                if (b || c || a) {
                    b = false;
                    second(false);
                    c = false;
                    third(false);
                    a = false;
                    first(false);
                }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MotivateActivity.this, BodyAimActivity.class);
                finish();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MotivateActivity.this, AgeActivity.class);
                startActivity(a);
            }
        });
    }

    public void first(boolean a) {
        if (a) {
            first.setBackgroundResource(R.drawable.motivate_purple_1stbtn);
        } else {
            first.setBackgroundResource(R.drawable.motivate_grey_1stbtn);
        }
    }

    public void second(boolean a) {
        if (a) {
            second.setBackgroundResource(R.drawable.motivate_purple_2ndbtn);
        } else {
            second.setBackgroundResource(R.drawable.motivate_grey_2ndbtn);
        }
    }

    public void third(boolean a) {
        if (a) {
            third.setBackgroundResource(R.drawable.motivate_purple_3rdbtn);
        } else {
            third.setBackgroundResource(R.drawable.motivate_grey_3rdbtn);
        }
    }

    public void forth(boolean a) {
        if (a) {
            forth.setBackgroundResource(R.drawable.motivate_purple_4thbtn);
        } else {
            forth.setBackgroundResource(R.drawable.motivate_grey_4thbtn);
        }
    }
}