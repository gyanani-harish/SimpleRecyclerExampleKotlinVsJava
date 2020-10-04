package com.example.simplerecyclerviewexample.smallexpandableexample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.TextView
import com.example.simplerecyclerviewexample.R
import com.example.simplerecyclerviewexample.expandable.Genre
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder


class ExpandableAdapter(private val context: Context, private val teachers: List<TeacherData>) : ExpandableRecyclerViewAdapter<ExpandableAdapter.TeacherViewHolder, ExpandableAdapter.StudentViewHolder>(
    teachers
) {
    class TeacherViewHolder(itemView: View) : GroupViewHolder(itemView) {
        var teacherNameTxt: TextView = itemView.findViewById(R.id.teacherNameTxt)
    }
    class StudentViewHolder(itemView: View) : ChildViewHolder(itemView) {
        var fullNameTxt: TextView = itemView.findViewById(R.id.txt)
        var checkBox: CheckBox = itemView.findViewById(R.id.chk)
    }

    override fun onCreateGroupViewHolder(parent: ViewGroup?, viewType: Int): TeacherViewHolder {
        return TeacherViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.teacher_row,
                parent,
                false
            )
        )
    }

    override fun onCreateChildViewHolder(parent: ViewGroup?, viewType: Int): StudentViewHolder {
        return StudentViewHolder(LayoutInflater.from(context).inflate(R.layout.row, parent, false))
    }

    override fun onBindChildViewHolder(
        holder: StudentViewHolder?,
        flatPosition: Int,
        group: ExpandableGroup<*>?,
        childIndex: Int
    ) {
        val student = (group as TeacherData).items[childIndex]
        holder?.fullNameTxt?.text = student.firstName+ ' '+student.lastName
        // holder.fullNameTxt.text = "$student.firstName $student.lastName"
        holder?.checkBox?.isChecked = student.isSelected
        holder?.checkBox?.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
                student.isSelected = p1
            }
        })
    }

    override fun onBindGroupViewHolder(
        holder: TeacherViewHolder?,
        flatPosition: Int,
        group: ExpandableGroup<*>?
    ) {
        holder?.teacherNameTxt?.text = group?.title;
    }
}