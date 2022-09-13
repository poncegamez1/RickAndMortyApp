package com.poncegamez.api

import com.poncegamez.dto.CharacterResultDTO
import retrofit2.http.GET

interface CharacterApi {

    @GET("character")
    suspend fun getCharacters():CharacterResultDTO

}