package com.pro.fitnessappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BodyAimActivity extends AppCompatActivity {
    Button back, leg, arm, chest, abs, legline, armline, chestline, absline, next;
    int a = 0, b = 0, c = 0, d = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_aim);

        back = findViewById(R.id.btn_back);
        next = findViewById(R.id.btn_next);

        arm = findViewById(R.id.btn_arm);
        leg = findViewById(R.id.btn_legs);
        chest = findViewById(R.id.btn_chest);
        abs = findViewById(R.id.btn_abs);

        armline = findViewById(R.id.armline);
        legline = findViewById(R.id.legline);
        chestline = findViewById(R.id.chestline);
        absline = findViewById(R.id.absline);

        arm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a % 2 == 0) {
                    arm(true);
                    a++;
                } else {
                    arm(false);
                    a++;
                }
            }
        });
        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b % 2 == 0) {
                    chest(true);
                    b++;
                } else {
                    chest(false);
                    b++;
                }
            }
        });
        leg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c % 2 == 0) {
                    leg(true);
                    c++;
                } else {
                    leg(false);
                    c++;
                }
            }
        });
        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (d % 2 == 0) {
                    abs(true);
                    d++;
                } else {
                    abs(false);
                    d++;
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(BodyAimActivity.this, SexChoosingActivity.class);
                finish();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(BodyAimActivity.this, MotivateActivity.class);
                startActivity(b);
            }
        });
    }

    public void arm(boolean a) {
        if (a) {
            arm.setBackgroundResource(R.drawable.body_purple_arms);
            armline.setBackgroundResource(R.drawable.body_purple_armline);
        } else {
            arm.setBackgroundResource(R.drawable.body_grey_arm);
            armline.setBackgroundResource(R.drawable.body_grey_armline);
        }
    }

    public void chest(boolean b) {
        if (b) {
            chest.setBackgroundResource(R.drawable.body_purple_chest);
            chestline.setBackgroundResource(R.drawable.body_purple_chestline);
        } else {
            chest.setBackgroundResource(R.drawable.body_grey_chest);
            chestline.setBackgroundResource(R.drawable.body_grey_chestline);
        }
    }

    public void leg(boolean c) {
        if (c) {
            leg.setBackgroundResource(R.drawable.body_purple_legs);
            legline.setBackgroundResource(R.drawable.body_purple_legsline);
        } else {
            leg.setBackgroundResource(R.drawable.body_grey_leg);
            legline.setBackgroundResource(R.drawable.body_grey_legsline);
        }
    }

    public void abs(boolean d) {
        if (d) {
            abs.setBackgroundResource(R.drawable.body_purple_abs);
            absline.setBackgroundResource(R.drawable.body_purple_absline);
        } else {
            abs.setBackgroundResource(R.drawable.body_grey_abs);
            absline.setBackgroundResource(R.drawable.body_grey_absline);
        }
    }
}