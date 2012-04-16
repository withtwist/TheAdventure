package se.chalmers.kangaroo.model;

/**
 * A class to represent the model of a platform game.
 * 
 * @author arvidk
 * 
 */
public class GameModel {

	/*
	 * The kangaroo that the player controlls.
	 */
	private Kangaroo kangaroo;
	/*
	 * The current level that the player are playing.
	 */
	private GameMap map;
	/*
	 * The amount of times the player have died.
	 */
	private int deathCount;
	/*
	 * Will keep track of how long the player have played.
	 */
	private int time;
	/*
	 * Will check if the game is running.
	 */
	private boolean isRunning = false;

	/**
	 * A method to start the game.
	 */
	public void start() {
		isRunning = true;
		while (isRunning) {
			this.update();
		}
	}

	/**
	 * Will make it able to pause the game
	 */
	public void pause() {
		if (isRunning = true) {
			isRunning = false;
		} else {
			this.start();
		}
	}

	/**
	 * A method to stop the game, and thereby quit it.
	 */
	public void stop() {
		isRunning = false;
	}

	/**
	 * A method to update the game.
	 */
	private void update() {
		// TODO implement update
	}

	/**
	 * Checkt if a polygon collides with a tile
	 */
	private void checkCollition() {
		// TODO implement checkCollition
	}

	/**
	 * 
	 * @return the amount of times the player has died.
	 */
	public int getDeathCount() {
		return deathCount;
	}

	/**
	 * 
	 * @return the time that has elapsed for the player.
	 */
	public int getTime() {
		return time;
	}

}
