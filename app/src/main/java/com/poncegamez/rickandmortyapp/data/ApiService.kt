package com.poncegamez.rickandmortyapp.data

import com.poncegamez.rickandmortyapp.model.CharacterResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("character")
    suspend fun getCharacters (@Query("page") page: String) : Call<CharacterResponse>
}