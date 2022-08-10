package com.sagr.shoestoreinventory

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.sagr.shoestoreinventory.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentWelcomeBinding.inflate(inflater)
        // Inflate the layout for this fragment


        binding.nextButton.setOnClickListener {
            Toast.makeText(context, "Next", Toast.LENGTH_SHORT).show()
        }
        return binding.root
    }


}