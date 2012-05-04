package se.chalmers.kangaroo.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import se.chalmers.kangaroo.model.Direction;
import se.chalmers.kangaroo.model.GameModel;
import se.chalmers.kangaroo.view.ChangeView;
import se.chalmers.kangaroo.view.GameView;
import se.chalmers.kangaroo.view.HighscoreView;
import se.chalmers.kangaroo.view.MenuView;
//import se.chalmers.kangaroo.view.OptionView;

/**
 * A class for handling and running the game.
 * 
 * @author simonal
 * @modifiedby pavlov
 * 
 */
public class GameController implements KeyListener {

	private GameModel gm;
	private GameView gv;
	//private OptionView ov;
	private HighscoreView hv;
	// TODO fix so you can go back to the menu
	private MenuView mv;

	private CustomKeys ck;

	public GameController() {
		ck = CustomKeys.getInstance();
		gm = new GameModel();
		gv = new GameView("resources/images/background.gif", gm);
	}

	public GameView getGameView() {
		return gv;
	}

	public MenuView getMenuView() {
		return mv;
	}

	public void start() {
		new Thread(new PlayModel()).start();
	}

	class PlayModel implements Runnable {
		private long diff;

		public void run() {
			while (true) {
				long time = System.currentTimeMillis();
				gm.update();
				gv.repaint();
				gv.revalidate();
				try {
					diff = System.currentTimeMillis() - time;
					if (diff < 1000 / 60)
						Thread.sleep(1000 / 60 - diff);
				} catch (InterruptedException e) {
				}
			}
		}

	}

	private void pressedKey(KeyEvent e) {
		int code = e.getKeyCode();

		// Jump
		if (code == ck.getJumpKey()) {
			if (gm.getKangaroo().getStillJumping() == false) {
				gm.getKangaroo().setStillJumping(true);
				gm.getKangaroo().jump();
			}

			// Left
		} else if (code == ck.getLeftKey()) {
			gm.getKangaroo().setDirection(Direction.DIRECTION_WEST);

			// Right
		} else if (code == ck.getRightKey()) {
			gm.getKangaroo().setDirection(Direction.DIRECTION_EAST);
		} else if (code == ck.getItemKey()) {
			if (gm.getKangaroo().getItem() != null)
				gm.getKangaroo().getItem().onUse(gm.getKangaroo());

		} else {
			// If any other keys are pressed, restarts the level.
			gm.restartLevel();
		}

	}

	public void releaseKey(KeyEvent e) {
		int code = e.getKeyCode();
		// TODO Fix so jump is key sensitive
		if (code == ck.getJumpKey()) {
			gm.getKangaroo().setStillJumping(false);
		}
		switch (code) {
		case KeyEvent.VK_LEFT:
			gm.getKangaroo().setDirection(Direction.DIRECTION_NONE);
			break;

		case KeyEvent.VK_RIGHT:
			gm.getKangaroo().setDirection(Direction.DIRECTION_NONE);
			break;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		pressedKey(e);

	}

	@Override
	public void keyReleased(KeyEvent e) {
		releaseKey(e);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO add nothing here

	}

}
