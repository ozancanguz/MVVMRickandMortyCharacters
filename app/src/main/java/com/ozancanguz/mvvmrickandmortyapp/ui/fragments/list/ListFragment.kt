package com.ozancanguz.mvvmrickandmortyapp.ui.fragments.list

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.ozancanguz.mvvmrickandmortyapp.R
import com.ozancanguz.mvvmrickandmortyapp.databinding.FragmentListBinding
import com.ozancanguz.mvvmrickandmortyapp.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class ListFragment : Fragment() {
    private var _binding: FragmentListBinding? = null
    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!

    private lateinit var mainViewModel:MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListBinding.inflate(inflater, container, false)
        val view = binding.root

        mainViewModel=ViewModelProvider(this).get(MainViewModel::class.java)

       observeLiveData()




        return view
    }

    private fun observeLiveData() {
        mainViewModel.requestApiData()
        mainViewModel.charList.observe(viewLifecycleOwner, Observer {
            Log.d("chars","" +it)
        })
    }

}