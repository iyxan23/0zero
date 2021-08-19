package com.iyxan23.gianxddddd.zerozero.desktop

import kotlin.jvm.JvmStatic
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.iyxan23.gianxddddd.zerozero.Zero

object DesktopLauncher {
    @JvmStatic
    fun main(arg: Array<String>) {
        // Initialize game config & set values
        val config = Lwjgl3ApplicationConfiguration()
        config.setWindowSizeLimits(600, 480, -1, -1)
        config.setTitle("0zero")
        config.setForegroundFPS(5)
        config.setMaximized(true)

        // Initialize game
        Lwjgl3Application(Zero(), config)
    }
}