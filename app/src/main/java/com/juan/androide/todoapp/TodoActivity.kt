package com.juan.androide.todoapp

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.juan.androide.R
import com.juan.androide.todoapp.TaskCategory.*

class TodoActivity : AppCompatActivity() {
    private lateinit var rvCategories: RecyclerView
    private lateinit var categoriesAdapter: CategoriesAdapter
    private lateinit var rvTasks: RecyclerView

    private lateinit var tasksAdapter: TasksAdapter

    private lateinit var fabAddTask: FloatingActionButton

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
        Task("Recoger el recogedor", Other, false),
        Task("Subir de subidón", Business, false),
        Task("Gestionar el maquineo", Personal, false),
        Task("Vivir la vier el recogedor", Other, false),
        Task("Subir de subidón", Business, false),
        Task("Gestionar el maquineo", Personal, false),
        Task("Vivir la vier el recogedor", Other, false),
        Task("Subir de subidón", Business, false),
        Task("Gestionar el maquineo", Personal, false),
        Task("Vivir la vida loca soñando", Other, false)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)
        initComponents()
        initUI()
        initListeners()
    }

    private fun initComponents() {
        rvCategories = findViewById(R.id.rvCategories)
        rvTasks = findViewById(R.id.rvTasks)
        fabAddTask = findViewById(R.id.fabAddTask)
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

    private fun initListeners() {
        fabAddTask.setOnClickListener {
            showDialog()
        }
    }

    private fun showDialog() {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_task)
        val btnAddTask: Button = dialog.findViewById(R.id.btnAddTask)
        val etTask: EditText = dialog.findViewById(R.id.etTask)
        val rgCategories: RadioGroup = dialog.findViewById(R.id.rgCategories)
        btnAddTask.setOnClickListener {
            val selectedId = rgCategories.checkedRadioButtonId
            val selectedRadioButton: RadioButton = rgCategories.findViewById(selectedId)
            val currentCategory: TaskCategory = when (selectedRadioButton.text) {
                getString(R.string.todo_dialog_business) -> Business
                getString(R.string.todo_dialog_personal) -> Personal
                else -> {
                    Other
                }
            }
            tasks.add(Task(etTask.text.toString(),currentCategory))
            updateTasks()
            dialog.hide()
        }
        dialog.show()
    }
    private fun updateTasks(){
        tasksAdapter.notifyDataSetChanged()
    }
}