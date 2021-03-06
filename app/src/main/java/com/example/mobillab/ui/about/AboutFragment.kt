package com.example.mobillab.ui.about

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mobillab.R

class AboutFragment : Fragment() {

    companion object{
        const val NAME = "About"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_about, container, false)
    }

    override fun onStart() {
        super.onStart()

        crashTest()
    }

    private fun crashTest(){
        throw Exception("App Crash Test!")
    }
}