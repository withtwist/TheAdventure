package se.chalmers.kangaroo.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import se.chalmers.kangaroo.model.Direction;
import se.chalmers.kangaroo.model.GameModel;
import se.chalmers.kangaroo.view.GameView;

/**
 * A class for handling and running the game.
 * @author simonal
 *
 */
public class GameController implements KeyListener{
	
	private GameModel gm;
	private GameView gv; 
	
	public GameController() {
		
		gm = new GameModel();
		gv = new GameView("resources/images/background.gif", gm);
		gv.addKeyListener(this);
	}
	
	public GameView getGameView(){
		return gv;
	}

	public void start(){
		new PlayModel().run();
	}
	
	class PlayModel implements Runnable{
		private long lastTime;
		public void run() {
			while (true) {
				if(System.currentTimeMillis()-lastTime>16) {

					gm.update();
					gv.repaint();
					gv.revalidate();
					lastTime = System.currentTimeMillis();
				}
			}
		}

	}
	
	public void pressedKey(KeyEvent e) {
		
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

	@Override
	public void keyPressed(KeyEvent e) {
		pressedKey(e);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//TODO add nothing here
		
	}


	
	
	
}
