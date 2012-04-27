package se.chalmers.kangaroo.view;

import java.awt.GridLayout;

public class OptionView extends JPanelWithBackground{

	public OptionView(String imagepath) {
		super(imagepath);
	}
	
	public void paintComponent(java.awt.Graphics g) {
		super.paintComponent(g);
		GridLayout gl = new GridLayout(4,2);
		setLayout(gl);
	}

}
