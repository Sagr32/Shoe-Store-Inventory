package com.sagr.shoestoreinventory.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.sagr.shoestoreinventory.databinding.FragmentInstructionBinding

class InstructionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentInstructionBinding.inflate(inflater)
        // Inflate the layout for this fragment
        binding.startButton.setOnClickListener {
            this.findNavController()
                .navigate(InstructionFragmentDirections.actionInstructionFragmentToShoeList())
        }
        return binding.root
    }


}