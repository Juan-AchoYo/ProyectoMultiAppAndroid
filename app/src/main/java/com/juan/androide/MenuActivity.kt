package com.juan.androide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.juan.androide.firstapp.FirstAppActivity
import com.juan.androide.imccalculator.ImcCalculatorActivity
import com.juan.androide.podcastsapp.PodcastsActivity
import com.juan.androide.superheroapp.SuperHeroListActivity
import com.juan.androide.todoapp.TodoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnFirstApp = findViewById<Button>(R.id.btnFirstApp)
        val btnIMCApp = findViewById<Button>(R.id.btnImcApp)
        val btnTODOApp = findViewById<Button>(R.id.btnTODOApp)
        val btnPodcastsApp = findViewById<Button>(R.id.btnPodcastsApp)
        val btnSuperHero = findViewById<Button>(R.id.btnSuperHeroApp)
        btnFirstApp.setOnClickListener { navigateToFirstApp() }
        btnIMCApp.setOnClickListener { navigateToIMCApp() }
        btnTODOApp.setOnClickListener { navitateToTODOApp() }
        btnPodcastsApp.setOnClickListener { navigateToPodcastsApp() }
        btnSuperHero.setOnClickListener { navigateToSuperHeroApp() }
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

    private fun navigateToPodcastsApp() {
        val intent = Intent(this, PodcastsActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSuperHeroApp() {
        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }
}
