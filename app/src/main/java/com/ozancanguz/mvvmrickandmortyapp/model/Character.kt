package com.ozancanguz.mvvmrickandmortyapp.model


import com.google.gson.annotations.SerializedName

data class Character(


    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("species")
    val species: String,


)