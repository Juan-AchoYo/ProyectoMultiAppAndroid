package com.juan.androide.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.juan.androide.R
import com.juan.androide.todoapp.TaskCategory.*

class TodoActivity : AppCompatActivity() {
    private lateinit var rvCategories: RecyclerView
    private lateinit var categoriesAdapter: CategoriesAdapter
    private lateinit var rvTasks:RecyclerView

    private lateinit var tasksAdapter: TasksAdapter

    private val categories = listOf(
        Personal,
        Business,
        Personal,
        Business,
        Personal,
        Business,
        Personal,
        Business,
        Personal,
        Business,
        Other
    )

    private val tasks = mutableListOf(
        Task("Recoger el recogedor", Other,false),
        Task("Subir de subidón", Business,false),
        Task("Gestionar el maquineo", Personal,false),
        Task("Vivir la vier el recogedor", Other,false),
        Task("Subir de subidón", Business,false),
        Task("Gestionar el maquineo", Personal,false),
        Task("Vivir la vier el recogedor", Other,false),
        Task("Subir de subidón", Business,false),
        Task("Gestionar el maquineo", Personal,false),
        Task("Vivir la vida loca soñando", Other,false)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)
        initComponents()
        initUI()
    }

    private fun initComponents() {
        rvCategories = findViewById(R.id.rvCategories)
        rvTasks = findViewById(R.id.rvTasks )
    }

    private fun initUI() {

        categoriesAdapter = CategoriesAdapter(categories)
        rvCategories.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategories.adapter = categoriesAdapter

        tasksAdapter = TasksAdapter(tasks)
        rvTasks.layoutManager = LinearLayoutManager(this)
        rvTasks.adapter = tasksAdapter
    }
}