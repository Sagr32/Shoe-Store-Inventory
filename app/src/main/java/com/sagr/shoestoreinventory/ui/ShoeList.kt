package com.sagr.shoestoreinventory.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.sagr.shoestoreinventory.R
import com.sagr.shoestoreinventory.databinding.FragmentShoeListBinding


class ShoeList : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentShoeListBinding.inflate(inflater)
        // Inflate the layout for this fragment
        binding.addButton.setOnClickListener {
            Toast.makeText(context, "Add", Toast.LENGTH_SHORT).show()
        }
        return binding.root
    }

}