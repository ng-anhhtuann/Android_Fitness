package com.pro.fitnessappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DietActivity extends AppCompatActivity {
    Button back, next, first, second, third, forth, fifth;
    boolean a, b, c, d, e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

        back = findViewById(R.id.back);
        next = findViewById(R.id.next);
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.third);
        forth = findViewById(R.id.forth);
        fifth = findViewById(R.id.fifth);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(DietActivity.this, DontEatActivity.class);
                startActivity(a);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(DietActivity.this, LevelActivity.class);
                finish();
            }
        });
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = true;
                first(a);
                if (b == true || c == true || d == true || e == true) {
                    b = false; second(b);
                    c = false; third(c);
                    d = false; forth(d);
                    e = false; fifth(e);
                }
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = true;
                second(b);
                if (a == true || c == true || d == true || e == true) {
                    a = false; first(a);
                    c = false; third(c);
                    d = false; forth(d);
                    e = false; fifth(e);
                }
            }
        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c = true;
                third(c);
                if (b == true || a == true || d == true || e == true) {
                    b = false; second(b);
                    a = false; first(a);
                    d = false; forth(d);
                    e = false; fifth(e);
                }
            }
        });
        forth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = true;
                forth(d);
                if (b == true || c == true || a == true || e == true) {
                    b = false; second(b);
                    c = false; third(c);
                    a = false; first(a);
                    e = false; fifth(e);
                }
            }
        });
        fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e = true;
                fifth(e);
                if (b == true || c == true || d == true || a == true) {
                    b = false; second(b);
                    c = false; third(c);
                    d = false; forth(d);
                    a = false; first(a);
                }
            }
        });

    }

    public void first(boolean a) {
        if (a) {
            first.setBackgroundResource(R.drawable.diet_purple_stardard);
        } else {
            first.setBackgroundResource(R.drawable.diet_grey_stardard);
        }
    }

    public void second(boolean b) {
        if (b) {
            second.setBackgroundResource(R.drawable.diet_purple_vegetarian);
        } else {
            second.setBackgroundResource(R.drawable.diet_grey_vegetarian);
        }
    }

    public void third(boolean c) {
        if (c) {
            third.setBackgroundResource(R.drawable.diet_purple_vegan);
        } else {
            third.setBackgroundResource(R.drawable.diet_grey_vegan);
        }
    }

    public void forth(boolean d) {
        if (d) {
            forth.setBackgroundResource(R.drawable.diet_purple_pescatarian);
        } else {
            forth.setBackgroundResource(R.drawable.diet_grey_pescastarian);
        }
    }

    public void fifth(boolean e) {
        if (e) {
            fifth.setBackgroundResource(R.drawable.diet_purple_gluten);
        } else {
            fifth.setBackgroundResource(R.drawable.diet_grey_gluten);
        }
    }

}