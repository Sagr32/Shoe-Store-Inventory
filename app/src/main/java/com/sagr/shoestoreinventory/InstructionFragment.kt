package com.sagr.shoestoreinventory

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.sagr.shoestoreinventory.databinding.FragmentInstructionBinding

class InstructionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentInstructionBinding.inflate(inflater)
        // Inflate the layout for this fragment
        binding.startButton.setOnClickListener {
            Toast.makeText(context, "Start Button Clicked", Toast.LENGTH_SHORT).show()
        }
        return binding.root
    }


}