package se.chalmers.kangaroo.view;

import javax.swing.JFrame;

import se.chalmers.kangaroo.controller.GameController;
import se.chalmers.kangaroo.utils.Sound;

public class ChangeView extends JFrame{
	
	private GameController gc = new GameController();;
	private MenuView mv;
	private Sound s;
	public ChangeView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1024,576);
		setResizable(false);
		
	}
	
	public void menuView() {
		int c = 0;
		s = new Sound("resources/music/menuemusic.wav");
		s.play();
		mv = new MenuView("resources/images/background.gif");
		add(mv);
		mv.revalidate();
		mv.setVisible(true);
		c++;
		System.out.println(c + "menuView");
	}
	
	public void gameView() {
		int i = 0;
		System.out.println("1");
		add(gc.getGameView());
		System.out.println("2");
		System.out.println("3");
		gc.getGameView().setVisible(true);
		System.out.println("4");
		gc.start();
		System.out.println(i + "gameView");
	}
}
