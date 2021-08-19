package com.iyxan23.gianxddddd.zerozero

import android.os.Bundle
import android.view.View
import com.badlogic.gdx.backends.android.AndroidApplication
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration

class AndroidLauncher : AndroidApplication() {
    @Suppress("DEPRECATION")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set System Ui visibilities
        window.decorView.apply {
            // Hide navigation bar
            systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        }

        // Initialize game & config
        val config = AndroidApplicationConfiguration()
        initialize(Zero(), config)
    }
}