package com.juan.androide.superheroapp

import com.juan.androide.databinding.ActivitySuperHeroListBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.appcompat.widget.SearchView

class SuperHeroListActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySuperHeroListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuperHeroListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initUI()
    }

    /*La línea "android.widget.SearchView.OnQueryTextListener" no sé lo que hace, en el tutorial
    no le hacía falta pero a mí me ha obligado el android Studio. La ayuda dice
    que está haciendo que el objeto anónimo "object" implemente la interfaz "SearchView.OnQueryTextListener"*/
    private fun initUI() {
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            android.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                searchByName(query.orEmpty())
                return false
            }
            override fun onQueryTextChange(newText: String?) = false
        })
    }

    private fun searchByName(query: String) {

    }
}