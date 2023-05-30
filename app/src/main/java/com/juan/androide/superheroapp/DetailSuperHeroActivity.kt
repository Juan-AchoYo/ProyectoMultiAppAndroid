package com.juan.androide.superheroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.juan.androide.R

class DetailSuperHeroActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_ID:String="extra_id"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_super_hero)
    }
}