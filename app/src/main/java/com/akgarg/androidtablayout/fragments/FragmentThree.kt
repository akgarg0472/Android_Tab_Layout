package com.akgarg.androidtablayout.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.akgarg.androidtablayout.R

@Suppress("UnnecessaryVariable", "unused")
class FragmentThree : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_three, container, false)
        return view
    }

}