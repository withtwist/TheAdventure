package se.chalmers.kangaroo.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import se.chalmers.kangaroo.constants.Constants;
import se.chalmers.kangaroo.controller.CustomKeys;

public class ShowHighscoreView extends JPanelWithBackground implements MouseListener{
	private Menubutton back;
	private ChangeView cv;
	private int currentLevel;
	
	public ShowHighscoreView(String imagepath, ChangeView cv, int currentLevel) {
		super(imagepath);
		this.cv = cv;
		this.currentLevel = currentLevel;
		this.setFocusable(true);
		back = new Menubutton("resources/images/buttons/back.png");
		back.addMouseListener(this);
		this.setLayout(new BorderLayout());
		
		// Header
			JPanel headerPanel = new JPanel();
			headerPanel.setLayout(new BorderLayout());
			int titleHeight = 100;
			int subTitleHeight = 75;

			this.add(headerPanel, BorderLayout.NORTH);
			this.setMinimumSize(Constants.RESOLUTION);
			this.setMaximumSize(Constants.RESOLUTION);
			this.setPreferredSize(Constants.RESOLUTION);

			// Back-button
			JPanel backPanel = new JPanel(new BorderLayout());
			backPanel.add(back, BorderLayout.WEST);
			backPanel.setMinimumSize(new Dimension(Constants.RESOLUTION_WIDTH / 3,
					titleHeight));
			backPanel.setMaximumSize(new Dimension(Constants.RESOLUTION_WIDTH / 3,
					titleHeight));
			backPanel.setPreferredSize(new Dimension(
					Constants.RESOLUTION_WIDTH / 3, titleHeight));
			headerPanel.add(backPanel, BorderLayout.WEST);

			// Title
			JPanel titlePanel = new JPanel();
			JLabel title = new JLabel(Constants.TITLE_START + "Highscore - Level " + currentLevel
					+ Constants.TITLE_END);
			titlePanel.add(title);
			headerPanel.add(title, BorderLayout.CENTER);

			headerPanel.setMinimumSize(new Dimension(Constants.RESOLUTION_WIDTH,
					titleHeight));
			title.setMaximumSize(new Dimension(Constants.RESOLUTION_WIDTH,
					titleHeight));
			title.setPreferredSize(new Dimension(Constants.RESOLUTION_WIDTH,
					titleHeight));
			
			// Content
			JPanel contentPanel = new JPanel(new BorderLayout());
			this.add(contentPanel, BorderLayout.SOUTH);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
