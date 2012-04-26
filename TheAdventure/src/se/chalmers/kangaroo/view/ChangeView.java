package se.chalmers.kangaroo.view;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import se.chalmers.kangaroo.controller.GameController;
import se.chalmers.kangaroo.utils.Sound;

public class ChangeView extends JFrame {

	private JPanel jp;
	private GameController gc;
	public ChangeView() {
		gc = new GameController();
		
		jp = new JPanel(new CardLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1024, 576);
		setResizable(false);
		jp.add(new MenuView("resources/images/background.gif", this) , "menuview");
		jp.add(gc.getGameView(), "gameview");
		add(jp);
		setVisible(true);
		jp.setVisible(true);
	}

	public void menuView() {
		Sound s = new Sound("resources/music/menuemusic.wav");
		s.play();
		CardLayout cl = (CardLayout) jp.getLayout();
		cl.show(jp, "menuview");
	}

	public void gameView() {
		CardLayout cl = (CardLayout) jp.getLayout();
		cl.show(jp, "gameview");
		gc.start();
	}
}
