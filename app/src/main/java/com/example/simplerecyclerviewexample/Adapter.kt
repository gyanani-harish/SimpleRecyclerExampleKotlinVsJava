package com.example.simplerecyclerviewexample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val context: Context, private val students: List<StudentData>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
         var fullNameTxt: TextView = itemView.findViewById(R.id.txt)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.row, parent, false))
    }
    override fun getItemCount(): Int {
        return students.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //val student = students.get(position)
        val student = students[position]
        holder.fullNameTxt.text = student.firstName+ ' '+student.lastName
       // holder.fullNameTxt.text = "$student.firstName $student.lastName"
    }
}