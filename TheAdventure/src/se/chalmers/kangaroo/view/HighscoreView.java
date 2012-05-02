package se.chalmers.kangaroo.view;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
import se.chalmers.kangaroo.constants.*;
public class HighscoreView extends JPanelWithBackground implements MouseListener{
	private JLabel title;
	private Menuebutton lv1;
	private Menuebutton lv2;

	public HighscoreView(String imagepath) {
		super(imagepath);
		this.setLayout(new BorderLayout());
		
		//Headline
		JPanel titlePanel = new JPanel();
		title = new JLabel("Highscore - Choose Level");
		titlePanel.add(title);
		this.add(titlePanel, BorderLayout.NORTH);
		this.setMinimumSize(Constants.RESOLUTION);
		this.setMaximumSize(Constants.RESOLUTION);
		this.setPreferredSize(Constants.RESOLUTION);
		
		int titleHeight = 100;
		
		title.setMinimumSize(new Dimension(Constants.RESOLUTION_WIDTH, titleHeight));
		title.setMaximumSize(new Dimension(Constants.RESOLUTION_WIDTH, titleHeight));
		title.setPreferredSize(new Dimension(Constants.RESOLUTION_WIDTH, titleHeight));
		
		//Content
		JPanel levelPanel = new JPanel();
		levelPanel.setLayout(new GridLayout(2,4));
		levelPanel.setMinimumSize(new Dimension(Constants.RESOLUTION_WIDTH, Constants.RESOLUTION_HEIGHT-titleHeight));
		levelPanel.setMaximumSize(new Dimension(Constants.RESOLUTION_WIDTH, Constants.RESOLUTION_HEIGHT-titleHeight));
		levelPanel.setPreferredSize(new Dimension(Constants.RESOLUTION_WIDTH, Constants.RESOLUTION_HEIGHT-titleHeight));
		
		//Level 1
		lv1 = new Menuebutton("resources/images/levels/level_1.png");
		lv1.addMouseListener(this);
		levelPanel.add(lv1);
		
		//Level 2
		lv2 = new Menuebutton("resources/images/levels/level_-1.png");
		lv2.addMouseListener(this);
		levelPanel.add(lv2);
		
		this.add(levelPanel, BorderLayout.SOUTH);

	}
	
	@Override
	public void paintComponent(java.awt.Graphics g) {
		super.paintComponent(g);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
