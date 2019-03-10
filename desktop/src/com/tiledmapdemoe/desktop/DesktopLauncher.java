package com.tiledmapdemoe.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.tiledmapdemoe.TiledMapDemo;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "TiledmapDemo";
		config.width = 1200;
		config.height = 720;
		new LwjglApplication(new TiledMapDemo(), config);
	}
}
