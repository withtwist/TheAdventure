package se.chalmers.kangaroo.controller;

import java.awt.event.KeyEvent;

import se.chalmers.kangaroo.model.Direction;
import se.chalmers.kangaroo.model.GameModel;
import se.chalmers.kangaroo.view.GameView;

/**
 * A class for handling and running the game.
 * @author simonal
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
	
	public void isKeyPressed(KeyEvent e) {
		
		int code = e.getKeyCode();
		
		switch( code ) {
		
		case KeyEvent.VK_UP:
			gm.getKangaroo().jump();
			break;
			
		case KeyEvent.VK_X:
			gm.getKangaroo().jump();
			break;
			
		case KeyEvent.VK_LEFT:
			gm.getKangaroo().setDirection(Direction.DIRECTION_WEST);
			break;
			
		case KeyEvent.VK_RIGHT:
			gm.getKangaroo().setDirection(Direction.DIRECTION_EAST);
			break;
			
		case KeyEvent.VK_C:
			if(gm.getKangaroo().getItem()!=null) {
				gm.getKangaroo().getItem().onUse(gm.getKangaroo());
			}
			break;
		
		
		}
		
	}
	
	
	
	
}
