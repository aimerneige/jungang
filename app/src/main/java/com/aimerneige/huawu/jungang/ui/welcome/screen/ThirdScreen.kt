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
        val view = inflater.inflate(R.layout.welcome_third_screen, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.welcome_pager)

        view.welcome_log_bottom.setOnClickListener {
            // TODO: start a log view to log in
            // Sign Up / Log In

            // TODO: move this function to log page
            onLoginFinished();

            // 登陆完成后关闭Activity 返回主界面
            activity?.finish()
        }

        return view
    }

    private fun onLoginFinished() {
        val sharedPref = requireActivity().getSharedPreferences("logCheck", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Logged", true)
        editor.apply()
    }
}