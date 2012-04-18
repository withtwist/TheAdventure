package se.chalmers.kangaroo.view;

import javax.swing.BoxLayout;
/**
 * The view of the game.
 * @author twist3r
 *
 */
public class MenuView extends JPanelWithBackground {
	/**
	 * The constructor for the GameView.
	 * @param bgpath
	 */
	public MenuView(String bgpath) {
		super(bgpath);
		BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(layout);
		this.setSize(1024,576);
		this.add(new Menuebutton("resources/images/menu_logo.gif"));
		this.add(new Menuebutton("resources/images/newgame.png"));
		this.add(new Menuebutton("resources/images/highscore.png"));
		this.add(new Menuebutton("resources/images/options.png"));
		this.add(new Menuebutton("resources/images/exitgame.png"));
	}

}
