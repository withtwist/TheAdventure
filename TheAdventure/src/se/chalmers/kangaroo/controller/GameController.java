package se.chalmers.kangaroo.controller;

import se.chalmers.kangaroo.model.GameModel;
import se.chalmers.kangaroo.view.GameView;

/**
 * A class for handling and running the game.
 * @author twist3r
 *
 */
public class GameController{
	
	private GameModel gm;
	private GameView gv; 
	
	public GameController(GameModel model, GameView view) {
		
		gm = model;
		gv = view;
	}

	public void start(){
		new PlayModel().run();
	}
	
	class PlayModel implements Runnable {
		public void run() {
			while (true) {
				try {
					Thread.sleep(16);
				} catch (InterruptedException ex) {
					System.out
							.println("Error, you woke the sleeping bear.. o_O");
				}
				gm.update();
				gv.revalidate();
				gv.repaint();
			}
		}
	}
}
