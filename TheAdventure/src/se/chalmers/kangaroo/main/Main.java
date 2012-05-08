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
	 * Starts the game
	 * @param args
	 */
	public static void main(String[] args) {

		ChangeView cv = new ChangeView();
		cv.menuView();
		cv.setVisible(true);
	}

}
