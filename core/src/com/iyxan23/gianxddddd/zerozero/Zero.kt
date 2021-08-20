package com.iyxan23.gianxddddd.zerozero

import com.badlogic.gdx.Game
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.iyxan23.gianxddddd.zerozero.data.Preferences
import com.iyxan23.gianxddddd.zerozero.screen.SplashScreen

<<<<<<< HEAD
class Zero : ApplicationAdapter() {
    private val batch: SpriteBatch by lazy { SpriteBatch() }
    private val img: Texture by lazy { Texture("badlogic.jpg") }

    override fun create() {}

    override fun render() {
        ScreenUtils.clear(1f, 0f, 0f, 1f)
        batch.begin()
        batch.draw(img, 0f, 0f)
        batch.end()
    }

    override fun dispose() {
        batch.dispose()
        img.dispose()
class Zero : Game() {
    var batch: SpriteBatch? = null
    var preferences: Preferences? = null

    override fun create() {
        // Initialize batch and preferences
        preferences = Preferences()
        batch = SpriteBatch()



        setScreen(SplashScreen(this))
    }

    override fun dispose() {
        // Resources are no longer used, time to dispose
        batch!!.dispose()
    }
}