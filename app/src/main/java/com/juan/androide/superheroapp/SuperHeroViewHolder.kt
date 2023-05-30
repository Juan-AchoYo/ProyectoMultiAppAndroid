package com.juan.androide.superheroapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.juan.androide.databinding.ItemSuperheroBinding
import com.squareup.picasso.Picasso

class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemSuperheroBinding.bind(view)
    fun bind(superHeroItemResponse: SuperHeroItemResponse) {
        binding.tvSuperHeroName.text=superHeroItemResponse.superHeroName
        binding.ivSuperHero

        Picasso.get().load(superHeroItemResponse.image.url).into(binding.ivSuperHero);

    }
}