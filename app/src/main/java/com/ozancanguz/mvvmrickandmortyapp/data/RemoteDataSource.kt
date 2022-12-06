package com.ozancanguz.mvvmrickandmortyapp.data

import com.ozancanguz.mvvmrickandmortyapp.data.network.CharacterApi
import com.ozancanguz.mvvmrickandmortyapp.model.Character
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource (private val characterApi:CharacterApi) {


         suspend fun getAllChars(): Response<List<Character>> {
             return characterApi.getAllCharacters()
         }

}