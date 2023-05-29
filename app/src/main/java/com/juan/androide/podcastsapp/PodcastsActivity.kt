package com.juan.androide.podcastsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.juan.androide.R

/**
 *
 * La idea de esta app es probar cosas sin tener un guión previo de lo que voy a hacer
 * y sin seguir ningún tutorial. La iré tocando solamente cuando me apetezca.
 */

class PodcastsActivity : AppCompatActivity() {

    private lateinit var rvPodcasts: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_podcasts)
        initComponents()
        initUI()
        initListeners()

    }

    private fun initComponents() {
        rvPodcasts = findViewById(R.id.rvPodcasts)
    }

    private fun initUI() {
        TODO("Not yet implemented")
    }

    private fun initListeners() {
        TODO("Not yet implemented")
    }


}