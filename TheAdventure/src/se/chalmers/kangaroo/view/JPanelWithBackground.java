package se.chalmers.kangaroo.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelWithBackground extends JPanel {
	ImageIcon background;
	
	public JPanelWithBackground(String imagepath) {
		super();
		background = new ImageIcon(imagepath);
		
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		background.paintIcon(this,g,0,0);
		
	}

}
