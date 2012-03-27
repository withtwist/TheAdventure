package se.chalmers.kangaroo.view;

import javax.swing.BoxLayout;

public class GameView extends JPanelWithBackground {
	
	public GameView(String bgpath) {
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
