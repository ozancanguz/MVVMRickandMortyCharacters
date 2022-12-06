package com.ozancanguz.mvvmrickandmortyapp.data.network

import com.ozancanguz.mvvmrickandmortyapp.model.Character
import retrofit2.Response
import retrofit2.http.GET

interface CharacterApi {

    @GET("character/1,183")
    suspend fun getAllCharacters(): Response<List<Character>>


}