package com.example.lab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void bai1(View view) {
        startActivity(new Intent(Main2Activity.this,MainActivity.class));
    }
    public void bai2(View view) {
        startActivity(new Intent(Main2Activity.this,Bai2.class));
    }
    public void bai3(View view) {
        startActivity(new Intent(Main2Activity.this,Bai3.class));
    }
}
