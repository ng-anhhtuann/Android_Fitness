package com.pro.fitnessappproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.logintw).setOnClickListener(this::onClick);
        findViewById(R.id.loginfb).setOnClickListener(this::onClick);
        findViewById(R.id.loginapple).setOnClickListener(this::onClick);
    }

    private void onClick(View v) {
        Intent b = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(b);
    }
}