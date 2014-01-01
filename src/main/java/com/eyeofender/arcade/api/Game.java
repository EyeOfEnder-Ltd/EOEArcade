package com.eyeofender.arcade.api;

/**
 * Represents an arcade game implementation
 */
public abstract class Game {

	/**
	 * The name of the arcade game
	 */
	protected final String name;

	/**
	 * The production version of this instance of the game
	 */
	private final String version;

	/**
	 * The {@link Genre genres} of gameplay offered by the arcade game
	 */
	protected final Genre[] genres;

	/**
	 * Whether the game introduces a highscore leaderboard
	 */
	private final boolean leaderboard;

	/**
	 * A list containing the titles of the leaderboard columns
	 */
	private final String[] trackedStats;

	/**
	 * Whether the arcade game is currently available for play
	 */
	private boolean enabled;

	/**
	 * Abbreviated constructor for arcade games that do not incorporate a leaderboard
	 * 
	 * @param name The name of the arcade game
	 * @param genres The applicable {@link #genres}
	 */
	public Game(String name, String version, Genre[] genres) {
		this(name, version, genres, null);
	}

	/**
	 * Complete constructor
	 * 
	 * @param name The name of the arcade game
	 * @param genres The applicable {@link #genres}
	 * @param leaderboardStats The {@link #trackedStats stats being tracked}
	 */
	public Game(String name, String version, Genre[] genres, String[] leaderboardStats) {
		this.name = name;
		this.version = version;
		this.genres = genres;
		if (leaderboardStats == null || leaderboardStats.length == 0) {
			leaderboard = false;
			trackedStats = new String[0];
		} else {
			leaderboard = true;
			trackedStats = leaderboardStats;
		}
		enabled = true;
	}

	/**
	 * Specifies the default loading behavior, used to initialize the arcade game instance during a hard boot.
	 */
	public abstract void load();

	/**
	 * Specifies an unload-load sequence designed to mitigate adverse in-game effects of a hard reload by saving
	 * pertinent data without requiring a persistence engine.
	 */
	public abstract void reload();

	/**
	 * Specifies the default unloading behavior, used to handle a shutdown or hard reload of the arcade game.
	 */
	public abstract void unload();

	@Override
	public String toString() {
		return name;
	}

	public String getVersion() {
		return version;
	}

	public Genre[] getGenres() {
		return genres;
	}

	public boolean hasLeaderboard() {
		return leaderboard;
	}

	public String[] getLeaderboardStats() {
		return trackedStats;
	}

	public boolean isEnabled() {
		return enabled;
	}
}
