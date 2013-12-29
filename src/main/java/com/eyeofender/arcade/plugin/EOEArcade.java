package com.eyeofender.arcade.plugin;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class EOEArcade extends JavaPlugin {

	private Logger log;

	@Override
	public void onLoad() {
		log = getLogger();
		// TODO: Initialize game manager and load game plugins
		// TODO: Poll games for world operations and execute them
	}
	@Override
	public void onEnable() {
		// TODO: Load listeners and command executors
	}

	@Override
	public void onDisable() {
		// TODO: kill references for garbage collection
	}

	public void log(Level level, String msg) {
		log.log(level, msg);
	}
}
