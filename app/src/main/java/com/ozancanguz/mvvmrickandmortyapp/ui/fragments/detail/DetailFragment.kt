package com.ozancanguz.mvvmrickandmortyapp.ui.fragments.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozancanguz.mvvmrickandmortyapp.R
import com.ozancanguz.mvvmrickandmortyapp.databinding.FragmentDetailBinding
import com.ozancanguz.mvvmrickandmortyapp.databinding.FragmentListBinding


class DetailFragment : Fragment() {
    private var _binding: FragmentDetailBinding? = null
    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        val view = binding.root

        return view
    }


}