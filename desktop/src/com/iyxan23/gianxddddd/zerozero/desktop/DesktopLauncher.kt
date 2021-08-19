package com.iyxan23.gianxddddd.zerozero.desktop

import kotlin.jvm.JvmStatic
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.iyxan23.gianxddddd.zerozero.Zero

object DesktopLauncher {
    @JvmStatic
    fun main(arg: Array<String>) {
        // Initialize game config & set values
        val config = LwjglApplicationConfiguration()
        config.title = "0zero"
        config.width = 1280
        config.height = 720

        // Initialize game
        LwjglApplication(Zero(), config)
    }
}