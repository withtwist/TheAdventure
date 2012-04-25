package se.chalmers.kangaroo.view;

import javax.swing.JFrame;

import se.chalmers.kangaroo.controller.GameController;
import se.chalmers.kangaroo.utils.Sound;

public class ChangeView extends JFrame{
	
	
 
	
	public ChangeView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1024,576);
		setResizable(false);
		
	}
	
	public void menuView() {
		Sound s = new Sound("resources/music/menuemusic.wav");
		s.play();
		MenuView mv = new MenuView("resources/images/background.gif");
		add(mv);
		mv.revalidate();
		mv.setVisible(true);
	}
	
	public void gameView() {
		int i = 0;
		GameController gc = new GameController();
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
