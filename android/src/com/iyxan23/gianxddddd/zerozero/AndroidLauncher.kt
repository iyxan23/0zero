package com.iyxan23.gianxddddd.zerozero

import com.badlogic.gdx.backends.android.AndroidApplication
import android.os.Bundle
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration
import com.iyxan23.gianxddddd.zerozero.Zero

class AndroidLauncher : AndroidApplication() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Initialize game & config
        val config = AndroidApplicationConfiguration()
        initialize(Zero(), config)
    }
}