package com.damso.quiz.riddles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class result extends AppCompatActivity {
    TextView txt;
    String data4;
    Button hint;
    String sol[];
    TextView hintt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        txt= findViewById(R.id.txt);
        getData();
        setData();
    }

    private void getData(){
        if(getIntent().hasExtra("data4")){
            data4= getIntent().getStringExtra("data4");


        }else{
            Toast.makeText(this, "No Data", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData(){

        txt.setText(data4);
    }
}

