package com.iyxan23.gianxddddd.zerozero.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.iyxan23.gianxddddd.zerozero.Zero;

public class DesktopLauncher {
	public static void main (String[] arg) {
		// Initialize game config & set values
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "0zero";
		config.width = 1280;
		config.height = 720;

		// Initialize game
		new LwjglApplication(new Zero(), config);
	}
}
