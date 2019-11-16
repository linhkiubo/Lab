package com.example.lab.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.lab.R;
import com.example.lab.model.Students;

import java.util.List;

public class StudentAdapter extends BaseAdapter {
    public Context context;
    public List<Students> studentsList;
    public StudentAdapter(Context context,List<Students> studentsList){
        this.context=context;
        this.studentsList=studentsList;
    }
    @Override
    public int getCount() {
        return studentsList.size();
    }

    @Override
    public Object getItem(int position) {
        return studentsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(R.layout.row2,parent,false);
         TextView tvName;
         TextView tvNumber;

        tvName = (TextView) convertView.findViewById(R.id.tvName);
        tvNumber = (TextView) convertView.findViewById(R.id.tvNumber);
        Students students = studentsList.get(position);
        tvName.setText(students.getName());
        tvNumber.setText(students.getNumber());
        return convertView;
    }
}
