package com.example.simplerecyclerviewexample.smallexpandableexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.simplerecyclerviewexample.R
import com.example.simplerecyclerviewexample.StudentData
import com.example.simplerecyclerviewexample.expandable.Genre
import com.example.simplerecyclerviewexample.expandable.expand.GenreAdapter
import kotlinx.android.synthetic.main.activity_expand_example.*


class ExampleActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expand_example)

        val list = ArrayList<StudentData>()
        list.add(StudentData("Harish","Gyanani"))
        list.add(StudentData("Ritika","Gyanani"))
        list.add(StudentData("Vijay","Kamlani"))

        val teacherList = ArrayList<TeacherData>()
        teacherList.add(TeacherData("Lata Madam", list))
        teacherList.add(TeacherData("Anurag Sir", list))

        val layoutManager = LinearLayoutManager(this)

        //instantiate your adapter with the list of genres

        //instantiate your adapter with the list of genres
        val adapter = ExpandableAdapter(this@ExampleActivity, teacherList)
        recycler_view.layoutManager = layoutManager
        recycler_view.adapter = adapter
    }
}