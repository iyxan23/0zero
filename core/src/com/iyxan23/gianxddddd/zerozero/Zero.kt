package com.iyxan23.gianxddddd.zerozero

import com.badlogic.gdx.Game
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.utils.ScreenUtils
import com.iyxan23.gianxddddd.zerozero.screen.SplashScreen

class Zero : Game() {
    var batch: SpriteBatch? = null

    override fun create() {
        // Initialize batch
        batch = SpriteBatch()

        setScreen(SplashScreen(this))
    }

    override fun dispose() {
        // Resources are no longer used, time to dispose
        batch!!.dispose()
    }
}