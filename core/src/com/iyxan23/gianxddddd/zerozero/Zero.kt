package com.iyxan23.gianxddddd.zerozero

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.utils.ScreenUtils

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
    }
}