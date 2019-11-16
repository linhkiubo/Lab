package com.example.lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.lab.adapter.StudentAdapter;
import com.example.lab.model.Students;

import java.util.ArrayList;

public class Bai3 extends AppCompatActivity {
    private ListView lvList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        lvList = (ListView) findViewById(R.id.lvList);
        ArrayList<Students> studentsArrayList = new ArrayList<>();
        for (int i = 0; i <20 ; i++) {
            Students students = new Students();
            students.setName("Linh KiuBo");
            students.setNumber("0123456789");
            studentsArrayList.add(students);
        }

        StudentAdapter studentAdapter = new StudentAdapter(Bai3.this,studentsArrayList);
        lvList.setAdapter(studentAdapter);
    }
}
