package com.iyxan23.gianxddddd.zerozero.screen

import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.ScreenAdapter
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.utils.ScreenUtils
import com.iyxan23.gianxddddd.zerozero.Zero

class SplashScreen(game: Game?) : ScreenAdapter() {
    private var game: Game? = null
    private var splashTexture: Texture? = null

    init {
        this.game = game
        this.splashTexture = Texture("badlogic.jpg")
    }

    override fun show() {
        // TODO: Do input stuff here
    }

    override fun render(delta: Float) {
        // Clear the background, then set the background color
        ScreenUtils.clear(0f, 0f, 0f, 0f)

        // Draw splash image
        (game as Zero).batch?.begin()
        (game as Zero).batch?.draw(splashTexture!!,
            0f, 0f)
        (game as Zero).batch?.end()
    }

    override fun hide() {
        // TODO: Do input stuff here
    }

    override fun dispose() {
        // Should dispose splash image, after screen no longer used
        splashTexture!!.dispose()
    }
}