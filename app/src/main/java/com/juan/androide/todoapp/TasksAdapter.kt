package com.juan.androide.todoapp

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TasksAdapter(private val tasks: List<Task>) :
    RecyclerView.Adapter<CategoriesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = tasks.size

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
    }
}