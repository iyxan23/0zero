package com.iyxan23.gianxddddd.zerozero

import com.badlogic.gdx.Game
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.iyxan23.gianxddddd.zerozero.data.Preferences
import com.iyxan23.gianxddddd.zerozero.screen.SplashScreen

class Zero : Game() {
    val batch: SpriteBatch by lazy { SpriteBatch() }
    private val preferences: Preferences by lazy { Preferences() }

    override fun create() {

        setScreen(SplashScreen(this))
    }

    override fun dispose() {
        // Resources are no longer used, time to dispose
        batch.dispose()
    }
}