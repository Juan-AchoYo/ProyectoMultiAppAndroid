package com.juan.androide.todoapp

import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.juan.androide.R

class TasksViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private var tvTask: TextView = view.findViewById(R.id.tvTask)
    private var cbTask: CheckBox = view.findViewById(R.id.cbTask)
    fun render(task: Task) {
        tvTask.text = task.name
    }
}