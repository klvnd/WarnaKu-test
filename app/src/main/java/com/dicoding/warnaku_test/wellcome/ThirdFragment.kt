package com.dicoding.warnaku_test.wellcome

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dicoding.warnaku_test.LoginActivity
import com.dicoding.warnaku_test.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ThirdFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_third, container, false)

        val fabNext: FloatingActionButton = view.findViewById(R.id.fab_next)
        fabNext.setOnClickListener {
            val intent = Intent(requireContext(), LoginActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}

