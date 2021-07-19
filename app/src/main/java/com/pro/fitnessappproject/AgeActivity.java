package com.pro.fitnessappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.pro.fitnessappproject.R.id.btnnext;

public class AgeActivity extends AppCompatActivity {
    Button next, back;
    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);

        back = findViewById(R.id.btnback);
        next = findViewById(R.id.btnnext);
        edit = findViewById(R.id.edittext);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(AgeActivity.this, MotivateActivity.class);
                finish();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(edit.getText().toString()) < 200 && Integer.parseInt(edit.getText().toString()) >= 0) {
                    Intent b = new Intent(AgeActivity.this, HeightActivity.class);
                    startActivity(b);
                } else {
                    Toast.makeText(AgeActivity.this, "Please try again 0->200 :)", Toast.LENGTH_SHORT).show();
                }
                if (edit.getText().toString().equals("")) {
                    Toast.makeText(AgeActivity.this, "Please try again 0->200 :)", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}