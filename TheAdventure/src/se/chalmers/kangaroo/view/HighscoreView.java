package se.chalmers.kangaroo.view;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
import se.chalmers.kangaroo.constants.*;

public class HighscoreView extends JPanelWithBackground implements
		MouseListener {
	private JLabel title;
	private Menuebutton lv1;
	private Menuebutton lv2;
	private Menuebutton lv3;
	private Menuebutton lv4;
	private Menuebutton lv5;
	private Menuebutton lv6;
	private Menuebutton lv7;
	private Menuebutton lv8;

	public HighscoreView(String imagepath) {
		super(imagepath);
		this.setLayout(new BorderLayout());

		//Header
		JPanel headerPanel = new JPanel();
		headerPanel.setLayout(new BorderLayout());
		
		this.add(headerPanel, BorderLayout.NORTH);
		this.setMinimumSize(Constants.RESOLUTION);
		this.setMaximumSize(Constants.RESOLUTION);
		this.setPreferredSize(Constants.RESOLUTION);
		
		//Back-button
		JPanel backPanel = new JPanel();
		Menuebutton btm = new Menuebutton("resources/images/backtomenu.png");
		backPanel.add(btm);
		headerPanel.add(backPanel, BorderLayout.WEST);
		
		//Title
		JPanel titlePanel = new JPanel();
		title = new JLabel("<html><body><font size='45'>Highscore - Choose Level</font></body></html>");
		titlePanel.add(title);
		headerPanel.add(title, BorderLayout.CENTER);

		int titleHeight = 100;

		headerPanel.setMinimumSize(new Dimension(Constants.RESOLUTION_WIDTH,
				titleHeight));
		title.setMaximumSize(new Dimension(Constants.RESOLUTION_WIDTH,
				titleHeight));
		title.setPreferredSize(new Dimension(Constants.RESOLUTION_WIDTH,
				titleHeight));

		// Content
		JPanel levelPanel = new JPanel();
		levelPanel.setLayout(new GridLayout(2, 4));
		levelPanel.setMinimumSize(new Dimension(Constants.RESOLUTION_WIDTH,
				Constants.RESOLUTION_HEIGHT - titleHeight));
		levelPanel.setMaximumSize(new Dimension(Constants.RESOLUTION_WIDTH,
				Constants.RESOLUTION_HEIGHT - titleHeight));
		levelPanel.setPreferredSize(new Dimension(Constants.RESOLUTION_WIDTH,
				Constants.RESOLUTION_HEIGHT - titleHeight));

		// Level 1
		lv1 = new Menuebutton("resources/images/levels/level_1.png");
		lv1.addMouseListener(this);
		levelPanel.add(lv1);

		// Level 2
		lv2 = new Menuebutton("resources/images/levels/level_-1.png");
		lv2.addMouseListener(this);
		levelPanel.add(lv2);

		// Level 3
		lv3 = new Menuebutton("resources/images/levels/level_inProg.png");
		lv3.addMouseListener(this);
		levelPanel.add(lv3);

		// Level 4
		lv4 = new Menuebutton("resources/images/levels/level_inProg.png");
		lv4.addMouseListener(this);
		levelPanel.add(lv4);

		// Level 5
		lv5 = new Menuebutton("resources/images/levels/level_inProg.png");
		lv5.addMouseListener(this);
		levelPanel.add(lv5);

		// Level 6
		lv6 = new Menuebutton("resources/images/levels/level_inProg.png");
		lv6.addMouseListener(this);
		levelPanel.add(lv6);

		// Level 7
		lv7 = new Menuebutton("resources/images/levels/level_inProg.png");
		lv7.addMouseListener(this);
		levelPanel.add(lv7);

		// Level 8
		lv8 = new Menuebutton("resources/images/levels/level_inProg.png");
		lv8.addMouseListener(this);
		levelPanel.add(lv8);

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
