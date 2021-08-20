package com.iyxan23.gianxddddd.zerozero.screen

import com.badlogic.gdx.*
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
        Gdx.input.inputProcessor = object: InputProcessor {
            override fun keyDown(keycode: Int): Boolean {
                if (keycode == Input.Keys.ESCAPE) {
                    Gdx.app.exit()
                    return true
                }

                return false
            }

            override fun keyUp(keycode: Int): Boolean {
                // DO nothing
                return false
            }

            override fun keyTyped(character: Char): Boolean {
                // DO nothing
                return false
            }

            override fun touchDown(screenX: Int, screenY: Int, pointer: Int, button: Int): Boolean {
                // DO nothing
                return false
            }

            override fun touchUp(screenX: Int, screenY: Int, pointer: Int, button: Int): Boolean {
                // DO nothing
                return false
            }

            override fun touchDragged(screenX: Int, screenY: Int, pointer: Int): Boolean {
                // DO nothing
                return false
            }

            override fun mouseMoved(screenX: Int, screenY: Int): Boolean {
                // DO nothing
                return false
            }

            override fun scrolled(amountX: Float, amountY: Float): Boolean {
                // DO nothing
                return false
            }
        }
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