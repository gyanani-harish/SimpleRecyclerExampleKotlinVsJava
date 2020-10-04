package com.example.simplerecyclerviewexample.smallexpandableexample;

import android.os.Parcelable;

import com.example.simplerecyclerviewexample.StudentData;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class TeacherData extends ExpandableGroup<StudentData> implements Parcelable {
    String teacherName;

    public TeacherData(String teacherName, List<StudentData> studentDataList) {
        super(teacherName, studentDataList);
        this.teacherName = teacherName;

    }
}
