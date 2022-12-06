package com.ozancanguz.mvvmrickandmortyapp.viewmodels

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.ozancanguz.mvvmrickandmortyapp.data.Repository
import com.ozancanguz.mvvmrickandmortyapp.model.Character
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

@HiltViewModel
class MainViewModel(private val repository: Repository,application: Application):AndroidViewModel(application){


    private val charList=MutableLiveData<List<Character>>()

    var job: Job?=null

    suspend fun requestApiData(){

        job= CoroutineScope(Dispatchers.IO).launch {
            val response=repository.remote.getAllChars()
            if(response.isSuccessful){
                charList.postValue(response.body())
            }
            else{
                Log.d("data","no data")
            }
        }


    }






}