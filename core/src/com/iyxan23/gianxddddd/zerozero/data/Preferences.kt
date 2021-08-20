package com.iyxan23.gianxddddd.zerozero.data

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Preferences

class Preferences {
    private val preferences: Preferences = Gdx.app.getPreferences("preferences")

    fun setMusicVolume(volume: Float) {
        preferences.putFloat("musicVolume", volume)
        preferences.flush()
    }

    fun setSFXVolume(volume: Float) {
        preferences.putFloat("sfxVolume", volume)
        preferences.flush()
    }

    fun setWindowFullscreen(boolean: Boolean) {
        preferences.putBoolean("fullscreen", boolean)
        preferences.flush()
    }

    fun shouldBeFullscreen(): Boolean {
        return preferences.getBoolean("maximized")
    }

    fun getMusicVolume(): Float {
        return preferences.getFloat("musicVolume")
    }

    fun getSFXVolume(): Float {
        return preferences?.getFloat("sfxVolume")!!
    }
}