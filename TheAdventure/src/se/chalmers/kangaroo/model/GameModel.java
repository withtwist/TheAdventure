package se.chalmers.kangaroo.model;
/**
 * A class to represent the model of a platform game.
 * @author arvidk
 *
 */
public class GameModel {

	private Kangaroo kangaroo;
	private GameMap map;
	private int deathCount;
	private int time;
	
	/**
	 * A method to update the game.
	 */
	public void update(){
		//TODO implement update
	}
	/**
	 * 
	 * @return the time that has elapsed for the player.
	 */
	public int getTime(){
		return time;
	}
}
