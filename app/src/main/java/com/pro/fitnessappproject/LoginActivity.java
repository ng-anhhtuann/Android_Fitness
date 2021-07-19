package com.pro.fitnessappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText user, pw;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = findViewById(R.id.user);
        pw = findViewById(R.id.pw);
        login = findViewById(R.id.signinbtn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.getText().toString().equals("admin") && pw.getText().toString().equals("admin")) {
                    Intent a = new Intent(LoginActivity.this, SexChoosingActivity.class);
                    startActivity(a);
                } else {
                    Toast.makeText(LoginActivity.this, "Username or password is wrong\nPlease try again", Toast.LENGTH_SHORT).show();
                    user.getText().clear();
                    pw.getText().clear();
                }
            }
        });
    }
}