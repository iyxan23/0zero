package com.iyxan23.gianxddddd.zerozero;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.iyxan23.gianxddddd.zerozero.Zero;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Initialize game & config
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new Zero(), config);
	}
}
