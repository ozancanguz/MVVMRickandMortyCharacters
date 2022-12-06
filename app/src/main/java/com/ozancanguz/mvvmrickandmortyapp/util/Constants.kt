package com.ozancanguz.mvvmrickandmortyapp.util

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ozancanguz.mvvmrickandmortyapp.R

class Constants {

    companion object{
        const val BASE_URL="https://rickandmortyapi.com/api/"
    }


}
fun ImageView.loadImage(uri:String?){
    val options= RequestOptions()

        .error(R.mipmap.ic_launcher)
    Glide.with(context)
        .setDefaultRequestOptions(options)
        .load(uri)
        .into(this)

}