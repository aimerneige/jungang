package com.aimerneige.huawu.jungang.ui.welcome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.aimerneige.huawu.jungang.R
import com.aimerneige.huawu.jungang.ui.welcome.screen.FirstScreen
import com.aimerneige.huawu.jungang.ui.welcome.screen.SecondScreen
import com.aimerneige.huawu.jungang.ui.welcome.screen.ThirdScreen
import com.aimerneige.huawu.jungang.ui.welcome.sign.SignPage
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )

        val adapter = WelcomeAdapter(
            fragmentList,
            supportFragmentManager,
            lifecycle
        )

        // You can add the ViewPager2 in a fragment and switch to sign page

        welcome_pager.adapter = adapter
    }

}