package com.damso.quiz.riddles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class solutions extends AppCompatActivity {
    String s1[], s3[],s4[],sol[];
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solutions);
        recyclerView = findViewById(R.id.rec);
        recyclerView.setHasFixedSize(true);

        s1 = getResources().getStringArray(R.array.Subject);
        s3 = getResources().getStringArray(R.array.Numbers);
        sol = getResources().getStringArray(R.array.Solutions);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        MyAdapter myAdapter = new MyAdapter(this, s1, s3, sol);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
