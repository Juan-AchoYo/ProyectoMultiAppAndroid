package com.juan.androide.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.juan.androide.R

class TodoActivity : AppCompatActivity() {
    private lateinit var rvCategories: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)
        initComponents()
        initUI()
    }
    private fun initComponents() {
        rvCategories = findViewById(R.id.rvCategories)
    }
    private fun initUI() {

    }
}