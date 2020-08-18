package com.aimerneige.huawu.jungang
import android.app.Application



/**
 * Author: AimerNeige
 * Date:   2020/08/18
 */
class App : Application() {
    companion object {
        lateinit var instance: App
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}