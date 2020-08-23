package com.aimerneige.huawu.jungang.ui.welcome.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.aimerneige.huawu.jungang.R
import kotlinx.android.synthetic.main.welcome_first_screen.view.*


class FirstScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.welcome_first_screen, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.welcome_pager)

        view.welcome_page1_next.setOnClickListener {
            viewPager?.currentItem = 1
        }

        return view
    }

}