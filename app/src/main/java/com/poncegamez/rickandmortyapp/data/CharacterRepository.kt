package com.poncegamez.rickandmortyapp.data

class CharacterRepository {
    suspend fun getCharacter() = ApiFactory.retrofit.getCharacters("1")
}