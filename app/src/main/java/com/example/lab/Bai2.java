package com.example.lab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.lab.adapter.MySpinnerAdapter;
import com.example.lab.model.Part;

import java.util.ArrayList;

public class Bai2 extends AppCompatActivity {
    private AppCompatSpinner spnCustom;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        spnCustom = (AppCompatSpinner) findViewById(R.id.spnCustom);
        final ArrayList<Part> partArrayList = new ArrayList<>();
        Part part = new Part();
        part.setId("-1");
        part.setName("Select One");
        partArrayList.add(part);
        for (int i = 0; i <20 ; i++) {
            Part part1 = new Part();
            part1.setId(String.valueOf(i));
            part1.setName("Linh".concat(String.valueOf(i)));
            partArrayList.add(part1);
        }
        MySpinnerAdapter mySpinnerAdapter = new MySpinnerAdapter(this,partArrayList);
        spnCustom.setAdapter(mySpinnerAdapter);
        spnCustom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Part part1 = partArrayList.get(position);
                Toast.makeText(Bai2.this, part1.getName(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
    public void ShowSelectedItem(View view){
        Part part = (Part) spnCustom.getSelectedItem();
        Toast.makeText(this, part.getName(), Toast.LENGTH_SHORT).show();
    }
}
