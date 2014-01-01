package com.eyeofender.arcade.api;

/**
 * An enumeration of the different categories of arcade gameplay, to be edited and updated as the EOE arcade game repertoire grows.
 */
public enum Genre {

	/**
	 * Arcade games feature infinite levels and focus on players' reflexes with the sole objective of achieving a highscore.
	 * Non-Minecraft examples include Doodle Jump, Cube Field, and Pacman.
	 */
	ARCADE,

	/**
	 * Denotes games that revolve around combat, from PvP first person shooters to PvE team survival games
	 */
	COMBAT,

	/**
	 * Denotes games that do not fit into any other genre.
	 */
	MISCELLANEOUS,

	/**
	 * Puzzle games test players' thinking skills and creativity in problem solving.
	 * Multiplayer puzzles can call for collaboration or cunning competition.
	 */
	PUZZLE,

	/**
	 * Racing games pitch players against each other or the clock as they try to reach various objectives.
	 * Examples include parkour and boat races.
	 */
	RACING;
}
