package com.example.simplerecyclerviewexample.java;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.simplerecyclerviewexample.Adapter;
import com.example.simplerecyclerviewexample.R;
import com.example.simplerecyclerviewexample.StudentData;

import java.util.ArrayList;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<StudentData> list = new ArrayList<>();
        list.add(new StudentData("Harish","Gyanani", false));
        list.add(new StudentData("Ritika","Gyanani", false));
        list.add(new StudentData("Vijay","Kamlani", false));

        for (int i = 1; i<=20;i++){
            list.add(new StudentData("Vijay"+i,"Kamlani", false));
        }

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new JavaAdapter(this, list));
    }
}
