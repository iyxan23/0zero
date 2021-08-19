package com.iyxan23.gianxddddd.zerozero

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.utils.ScreenUtils

class Zero : ApplicationAdapter() {
    var batch: SpriteBatch? = null
    var img: Texture? = null

    override fun create() {
        // Initialize batch and img
        batch = SpriteBatch()
        img = Texture("badlogic.jpg")
    }

    override fun render() {
        // Clear the screen and put colors first, then draw the badlogic image
        ScreenUtils.clear(0f, 0f, 0f, 0f)
        batch!!.begin()
        batch!!.draw(img, 0f, 0f)
        batch!!.end()
    }

    override fun dispose() {
        // If the game is going to exit, dispose batch and img
        batch!!.dispose()
        img!!.dispose()
    }
}