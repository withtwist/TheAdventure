package se.chalmers.kangaroo.main;

import javax.swing.JFrame;

import se.chalmers.kangaroo.controller.GameController;
import se.chalmers.kangaroo.utils.Sound;
import se.chalmers.kangaroo.view.ChangeView;
import se.chalmers.kangaroo.view.MenuView;
/**
 * 
 * @author simonal (?)
 * @modifiedby alburgh
 * @modifiedby arvidk
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChangeView cv = new ChangeView();

		
		
//		GameController gc = new GameController();
//		//jf.add(gc.getGameView());
		//gw.revalidate();
		cv.gameView();
		cv.setVisible(true);
		//gw.setVisible(true);
//		cf.addKeyListener(gc);
		//gc.start();
		


		

	}

}
