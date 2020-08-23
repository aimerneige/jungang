package com.aimerneige.huawu.jungang.ui.welcome.screen

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.aimerneige.huawu.jungang.R
import kotlinx.android.synthetic.main.welcome_third_screen.view.*


class ThirdScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.welcome_third_screen, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.welcome_pager)

//        view.welcome_log_bottom.setOnClickListener {
//            // save stage
//            onWelcomeFinished();
//
//            // TODO: start the log
//        }

        return view
    }

    private fun onWelcomeFinished() {
        val sharedPref = requireActivity().getSharedPreferences("logCheck", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Welcomed", true)
        editor.apply()
    }
}