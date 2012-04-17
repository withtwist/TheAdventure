package se.chalmers.kangaroo.controller;

import se.chalmers.kangaroo.model.GameModel;

/**
 * A class for handling and running the game.
 * @author twist3r
 *
 */
public class GameController{
	
	private GameModel game;
	
	public GameController() {
		
		game = new GameModel();
		
	}
	/**
	 * Updates the entire GameModel.
	 */
	public void update() {
		
		game.update();
		
	}

}
