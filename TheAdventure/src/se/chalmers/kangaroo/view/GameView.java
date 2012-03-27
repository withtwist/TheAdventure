package se.chalmers.kangaroo.view;

import javax.swing.BoxLayout;

public class GameView extends JPanelWithBackground {
	
	public GameView(String bgpath) {
		super(bgpath);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		this.setSize(1024,576);
	}

}
