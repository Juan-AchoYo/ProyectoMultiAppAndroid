package com.juan.androide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.juan.androide.firstapp.FirstAppActivity
import com.juan.androide.imccalculator.ImcCalculatorActivity
import com.juan.androide.todoapp.TodoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnFirstApp = findViewById<Button>(R.id.btnFirstApp)
        val btnIMCApp = findViewById<Button>(R.id.btnImcApp)
        val btnTODOApp = findViewById<Button>(R.id.btnTODOApp)
        btnFirstApp.setOnClickListener { navigateToFirstApp() }
        btnIMCApp.setOnClickListener { navigateToIMCApp() }
        btnTODOApp.setOnClickListener { navitateToTODOApp() }
    }



    private fun navigateToFirstApp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToIMCApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navitateToTODOApp() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }
}