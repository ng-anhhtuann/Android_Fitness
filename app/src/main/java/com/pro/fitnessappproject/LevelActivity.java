package com.pro.fitnessappproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class LevelActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private icon_Adapter iconAdapter;
    Button back, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        back = findViewById(R.id.backbtn);
        next = findViewById(R.id.nextbtn);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(LevelActivity.this, GoalWeightActivity.class);
                finish();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(LevelActivity.this, DietActivity.class);
                startActivity(b);
            }
        });

        recyclerView = findViewById(R.id.rcv);
        iconAdapter = new icon_Adapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        iconAdapter.setData(getlist());
        recyclerView.setAdapter((iconAdapter));

    }

    private List<icon> getlist() {
        List<icon> list = new ArrayList<>();
        list.add(new icon(R.drawable.level_firsticon));
        list.add(new icon(R.drawable.level_thirdicon));
        list.add(new icon(R.drawable.level_secondicon));
        list.add(new icon(R.drawable.level_forthicon));
        list.add(new icon(R.drawable.level_fifthicon));
        return list;
    }
}