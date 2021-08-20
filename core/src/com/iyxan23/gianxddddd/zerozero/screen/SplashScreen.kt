package com.iyxan23.gianxddddd.zerozero.screen

import com.badlogic.gdx.*
import com.badlogic.gdx.Gdx.app
import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.GlyphLayout
import com.badlogic.gdx.utils.ScreenUtils
import com.badlogic.gdx.utils.TimeUtils
import com.iyxan23.gianxddddd.zerozero.MIN_HEIGHT
import com.iyxan23.gianxddddd.zerozero.MIN_WIDTH
import com.iyxan23.gianxddddd.zerozero.NAME
import com.iyxan23.gianxddddd.zerozero.Zero

/**
 * In this SplashScreen, we are going to wait for the AssetManager to load all assets.
 *
 * This will splash for a fixed amount 5s, if we loaded assets too fast, it will delay until 5s. If we passed the time,
 * the loading time will get extended until all assets are loaded
 */
class SplashScreen(gameRaw: Game) : ScreenAdapter() {
    private val game = gameRaw as Zero
    private val assetManager = AssetManager()

    private val font by lazy {
        BitmapFont().apply { setColor(1f, 1f, 1f, 1f) }
    }

    private val mainTextGlyph = GlyphLayout(font, NAME)

    private val camera by lazy {
        OrthographicCamera().apply { setToOrtho(false, MIN_WIDTH.toFloat(), MIN_HEIGHT.toFloat()) }
    }

    private val startTime = System.currentTimeMillis()
    private val waitAmount = 10_000 // 10s (10000ms)

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

        // Update the camera and set the game batch's projection matrix to the camera
        camera.update()
        game.batch.projectionMatrix = camera.combined

        // Show a simple text
        // TODO: 8/20/21 Use an image instead
        game.batch.begin()

        font.draw(
            game.batch,
            mainTextGlyph,
            (MIN_WIDTH - mainTextGlyph.width) / 2,
            (MIN_HEIGHT - mainTextGlyph.width) / 2
        )

        game.batch.end()

        // Check if the assets are loaded and if we have passed the waiting amount
        if (assetManager.update() && TimeUtils.timeSinceMillis(startTime) > waitAmount) {
            // TODO: 8/20/21 Show the home screen
            println("Show the screen!")
            app.exit()
        }
    }

    override fun hide() {
        // TODO: Do input stuff here
    }

    override fun dispose() {
        // Should dispose splash image, after screen no longer used
        font.dispose()
    }
}