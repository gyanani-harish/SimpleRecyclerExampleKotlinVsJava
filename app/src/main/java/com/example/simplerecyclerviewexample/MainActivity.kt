package com.example.simplerecyclerviewexample

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list = ArrayList<StudentData>()
        list.add(StudentData("Harish","Gyanani"))
        list.add(StudentData("Ritika","Gyanani"))
        list.add(StudentData("Vijay","Kamlani"))

        recyclerView.layoutManager = LinearLayoutManager(this)
        //recyclerView.setAdapter(Adapter(this, list))
        recyclerView.adapter = Adapter(this, list)
    }
}