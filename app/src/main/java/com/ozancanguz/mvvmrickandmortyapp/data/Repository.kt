package com.ozancanguz.mvvmrickandmortyapp.data

import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class Repository @Inject constructor(private val remoteDataSource: RemoteDataSource)


{

    val remote=remoteDataSource
}