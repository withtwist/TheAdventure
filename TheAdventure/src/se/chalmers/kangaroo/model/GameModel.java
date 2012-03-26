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

	/**
	 * A method to update the game.
	 */
	public void update() {
		// TODO implement update
	}

	/**
	 * 
	 * @return the time that has elapsed for the player.
	 */
	public int getTime() {
		return time;
	}
}
