package com.example.simplerecyclerviewexample.java;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
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
    public void onBindViewHolder(@NonNull ABCHolder holder, final int position) {
        final StudentData studentData = students.get(position);
        holder.txtFullName.setText(studentData.getFirstName()+" "+studentData.getLastName());
        if(studentData.isSelected()) {
            holder.checkBox.setChecked(true);
        }else{
            holder.checkBox.setChecked(false);
        }
        holder.checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                students.get(position).setSelected(!students.get(position).isSelected());
            }
        });
        /*holder.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean value) {
                //studentData.setSelected(b);
                Log.d("check","position="+position+" value"+value);

                //notifyItemChanged(position);
                //notifyDataSetChanged();
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    class ABCHolder extends RecyclerView.ViewHolder{
        TextView txtFullName;
        CheckBox checkBox;
        public ABCHolder(View itemView){
            super(itemView);
            txtFullName = itemView.findViewById(R.id.txt);
            checkBox = itemView.findViewById(R.id.chk);
        }
    }
}
