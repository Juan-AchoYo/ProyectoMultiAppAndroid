package com.juan.androide.superheroapp

import android.media.Image
import com.google.gson.annotations.SerializedName

data class SuperHeroDataResponse(
    @SerializedName("response") val superHeroResponse: String,
    @SerializedName("results") val superHeroes: List<SuperHeroItemResponse>
)

data class SuperHeroItemResponse(
    @SerializedName("id") val superHeroId: String,
    @SerializedName("name") val superHeroName: String,
    @SerializedName("image") val image: SuperHeroImageResponse
)

data class SuperHeroImageResponse(
    @SerializedName("url") val url: String
)