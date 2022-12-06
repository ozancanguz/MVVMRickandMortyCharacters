package com.ozancanguz.mvvmrickandmortyapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ozancanguz.mvvmrickandmortyapp.R
import com.ozancanguz.mvvmrickandmortyapp.model.Character
import com.ozancanguz.mvvmrickandmortyapp.util.loadImage
import kotlinx.android.synthetic.main.char_row_layout.view.*

class CharactersAdapter:RecyclerView.Adapter<CharactersAdapter.MyviewHolder>() {

    var characterList= emptyList<Character>()


    fun setData(newData:List<Character>){
        this.characterList=newData.toMutableList()
        notifyDataSetChanged()
    }

    class MyviewHolder(view: View):RecyclerView.ViewHolder(view) {



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
       var inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.char_row_layout,parent,false)
        return MyviewHolder(view)
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
          var currentChar=characterList[position]
         holder.itemView.char_name.text=currentChar.name
        holder.itemView.char_gender.text=currentChar.gender
        //glide ile sonradan ekledik
        holder.itemView.char_image.loadImage(currentChar.image)

    }

    override fun getItemCount(): Int {
        return characterList.size
    }


}