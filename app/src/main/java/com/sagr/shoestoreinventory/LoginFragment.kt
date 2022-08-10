package com.sagr.shoestoreinventory

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.sagr.shoestoreinventory.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentLoginBinding.inflate(inflater)

        binding.loginButton.setOnClickListener {
            Toast.makeText(context, "Login", Toast.LENGTH_SHORT).show()
        }

        binding.registerButton.setOnClickListener {
            Toast.makeText(context, "Registration", Toast.LENGTH_SHORT).show()
        }
        return binding.root
    }


}