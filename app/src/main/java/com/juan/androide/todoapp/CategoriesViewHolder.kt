package com.juan.androide.todoapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.juan.androide.R

class CategoriesViewHolder(view:View):RecyclerView.ViewHolder(view) {
    private val tvCategories:TextView = view.findViewById(R.id.tvCategoryName)
    fun render(taskCategory: TaskCategory) {

    }
}