package com.poncegamez.rickandmortyapp.model


import com.google.gson.annotations.SerializedName

data class Character(
    @SerializedName("name")
    val name: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("species")
    val species: String,
)

data class CharacterResponse(
    @SerializedName("results")
    val result: List<Character>)
