package com.iyxan23.gianxddddd.zerozero.data

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Preferences

class Preferences {
    private val preferences: Preferences = Gdx.app.getPreferences("preferences")

    fun setMusicVolume(volume: Float) {
        preferences.putFloat("musicVolume", volume).flush()
    }

    fun setSFXVolume(volume: Float) {
        preferences.putFloat("sfxVolume", volume).flush()
    }

    fun setWindowResolution(width: Int, height: Int) {
        preferences.putInteger("resolutionX", width)
        preferences.putInteger("resolutionY", height)
        preferences.flush()
    }

    fun setWindowFullscreen(boolean: Boolean) {
        preferences.putBoolean("fullscreen", boolean).flush()
    }

    fun shouldBeFullscreen(): Boolean {
        if (!preferences.contains("fullscreen")) {
            return false
        }

        return preferences.getBoolean("fullscreen")
    }

    fun getMusicVolume(): Float {
        if (!preferences.contains("musicVolume")) {
            return 1.0f
        }

        return preferences.getFloat("musicVolume")
    }

    fun getSFXVolume(): Float {
        if (!preferences.contains("sfxVolume")) {
            return 1.0f
        }

        return preferences.getFloat("sfxVolume")
    }

    fun getWindowResolutionWidth(): Int {
        if (!preferences.contains("resolutionX")) {
            return 1280
        }

        return preferences.getInteger("resolutionX")
    }

    fun getWindowResolutionHeight(): Int {
        if (!preferences.contains("resolutionY")) {
            return 720
        }

        return preferences.getInteger("resolutionY")
    }
}