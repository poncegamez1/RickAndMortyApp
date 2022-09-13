package com.poncegamez.dto

import com.google.gson.annotations.SerializedName

data class InfoResultDTO(
    @SerializedName("count")
    val count: Int,
    @SerializedName("pages")
    val pages: Int,
    @SerializedName("next")
    val next: String?,
    @SerializedName("prev")
    val prev: String?
)
