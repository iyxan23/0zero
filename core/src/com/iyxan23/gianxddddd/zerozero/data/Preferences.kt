package com.iyxan23.gianxddddd.zerozero.data

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Preferences

class Preferences {
    private var preferences: Preferences? = null

    init {
        // Init preferences
        TODO("Use Game class")
        preferences = Gdx.app.getPreferences("preferences")
    }

    fun setMusicVolume(volume: Float) {
        preferences?.putFloat("musicVolume", volume)
        preferences?.flush()
    }

    fun setSFXVolume(volume: Float) {
        preferences?.putFloat("sfxVolume", volume)
        preferences?.flush()
    }

    fun setWindowMaximized(boolean: Boolean) {
        preferences?.putBoolean("maximized", boolean)
        preferences?.flush()
    }

    fun shouldBeMaximized(): Boolean {
        return preferences?.getBoolean("maximized")!!
    }

    fun getMusicVolume(): Float {
        return preferences?.getFloat("musicVolume")!!
    }

    fun getSFXVolume(): Float {
        return preferences?.getFloat("sfxVolume")!!
    }
}