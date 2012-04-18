package se.chalmers.kangaroo.main;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import se.chalmers.kangaroo.utils.Sound;
import se.chalmers.kangaroo.view.MenuView;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame jf = new JFrame();

		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setSize(1024,576);
		jf.setResizable(false);
		MenuView gw = new MenuView("resources/images/background.gif");

		jf.add(gw);
		gw.revalidate();
		Sound s = new Sound("resources/music/menuemusic.wav");
		s.play();
		jf.setVisible(true);
		gw.setVisible(true);
		


		

	}

}
