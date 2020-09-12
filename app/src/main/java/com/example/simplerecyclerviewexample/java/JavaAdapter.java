package com.example.simplerecyclerviewexample.java;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.simplerecyclerviewexample.R;
import com.example.simplerecyclerviewexample.StudentData;

import java.util.List;

public class JavaAdapter extends RecyclerView.Adapter<JavaAdapter.ABCHolder> {

    private final Context context;
    private final List<StudentData> students;

    public JavaAdapter(Context context, List<StudentData> students){
        this.context = context;
        this.students = students;
    }
    @NonNull
    @Override
    public ABCHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ABCHolder(LayoutInflater.from(context).inflate(R.layout.row, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ABCHolder holder, int position) {
        StudentData studentData = students.get(position);
        holder.txtFullName.setText(studentData.getFirstName()+" "+studentData.getLastName());
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    class ABCHolder extends RecyclerView.ViewHolder{
        TextView txtFullName;
        public ABCHolder(View itemView){
            super(itemView);
            txtFullName = itemView.findViewById(R.id.txt);
        }
    }
}
