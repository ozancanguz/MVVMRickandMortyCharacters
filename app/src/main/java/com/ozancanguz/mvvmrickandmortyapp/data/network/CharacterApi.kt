package com.ozancanguz.mvvmrickandmortyapp.data.network

import com.ozancanguz.mvvmrickandmortyapp.model.Character
import retrofit2.Response
import retrofit2.http.GET

interface CharacterApi {

    @GET("character/1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20")
    suspend fun getAllCharacters(): Response<List<Character>>


}