package com.aimerneige.huawu.jungang.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.aimerneige.huawu.jungang.R
import com.aimerneige.huawu.jungang.ui.welcome.WelcomeActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 如果没有登陆就跳转到欢迎界面
        if (!logCheck()) {
            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent)
        }

        setContentView(R.layout.activity_main)

        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        navView.setupWithNavController(navController)
    }

    private fun logCheck() : Boolean {
        val sharedPref = getSharedPreferences("logCheck", Context.MODE_PRIVATE)
        return sharedPref.getBoolean("Logged", false)
    }
}