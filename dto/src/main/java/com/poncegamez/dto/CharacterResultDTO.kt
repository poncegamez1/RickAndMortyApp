package com.poncegamez.dto

import com.google.gson.annotations.SerializedName

data class CharacterResultDTO(
    @SerializedName("info")
    val info: InfoResultDTO,
    @SerializedName("results")
    val results: List<ItemResultDTO>
)
