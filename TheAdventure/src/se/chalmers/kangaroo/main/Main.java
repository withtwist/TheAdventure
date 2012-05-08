package se.chalmers.kangaroo.main;

import se.chalmers.kangaroo.view.ChangeView;

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
