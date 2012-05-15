package se.chalmers.kangaroo.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import se.chalmers.kangaroo.constants.Constants;
import se.chalmers.kangaroo.io.FileToMap;

/**
 * A class representing the a view of all the different highscores of every level in the game. 
 * @author pavlov
 * 
 */
public class HighscoreView extends JPanelWithBackground implements
		MouseListener {
	private ChangeView cv;
	private FileToMap ftm;
	private Menubutton back;
	private JLabel title;
	private Menubutton lv1;
	private Menubutton lv2;
	private Menubutton lv3;
	private Menubutton lv4;
	private Menubutton lv5;
	private Menubutton lv6;
	private Menubutton lv7;
	private Menubutton lv8;
	/**
	 * The default constructor taking an imagepath and a changeview.
	 * @param imagepath
	 * @param cv
	 */
	public HighscoreView(String imagepath, ChangeView cv) {
		super(imagepath);
		this.ftm = new FileToMap();
		this.cv = cv;
		this.setFocusable(true);
		back = new Menubutton("resources/images/buttons/back.png");
		back.addMouseListener(this);
		this.setLayout(new BorderLayout());

		// Header
		JPanel headerPanel = new JPanel();
		headerPanel.setLayout(new BorderLayout());
		int titleHeight = 100;

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

		title = new JLabel(
				"<html><body><font size='45'>Highscore - Choose Level</font></body></html>");

		titlePanel.add(title);
		headerPanel.add(title, BorderLayout.CENTER);

		title.setMinimumSize(new Dimension(Constants.RESOLUTION_WIDTH,
				titleHeight));
		title.setMaximumSize(new Dimension(Constants.RESOLUTION_WIDTH,
				titleHeight));
		title.setPreferredSize(new Dimension(Constants.RESOLUTION_WIDTH,
				titleHeight));

		// Content
		JPanel levelPanel = new JPanel();
		levelPanel.setLayout(new GridLayout(2, 5));
		levelPanel.setMinimumSize(new Dimension(Constants.RESOLUTION_WIDTH,
				Constants.RESOLUTION_HEIGHT - titleHeight));
		levelPanel.setMaximumSize(new Dimension(Constants.RESOLUTION_WIDTH,
				Constants.RESOLUTION_HEIGHT - titleHeight));
		levelPanel.setPreferredSize(new Dimension(Constants.RESOLUTION_WIDTH,
				Constants.RESOLUTION_HEIGHT - titleHeight));

		// Level 1
		lv1 = new Menubutton("resources/images/levels/level_1.png");
		lv1.setName("1");
		lv1.addMouseListener(this);
		levelPanel.add(lv1);

		// Level 2
		lv2 = new Menubutton("resources/images/levels/level_2.png");
		lv2.setName("2");
		lv2.addMouseListener(this);
		levelPanel.add(lv2);

		// Level 3
		lv3 = new Menubutton("resources/images/levels/level_3.png");
		lv3.setName("3");
		lv3.addMouseListener(this);
		levelPanel.add(lv3);

		// Level 4
		lv4 = new Menubutton("resources/images/levels/level_3.png");
		lv4.setName("4");
		lv4.addMouseListener(this);
		levelPanel.add(lv4);

		// Level 5
		lv5 = new Menubutton("resources/images/levels/level_3.png");
		lv5.setName("5");
		lv5.addMouseListener(this);
		levelPanel.add(lv5);

		// Level 6
		lv6 = new Menubutton("resources/images/levels/level_3.png");
		lv6.setName("6");
		lv6.addMouseListener(this);
		levelPanel.add(lv6);

		// Level 7
		lv7 = new Menubutton("resources/images/levels/level_3.png");
		lv7.setName("7");
		lv7.addMouseListener(this);
		levelPanel.add(lv7);

		// Level 8
		lv8 = new Menubutton("resources/images/levels/level_3.png");
		lv8.setName("8");
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
		//Not needed
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == back)
			back.setIcon(new ImageIcon(
					"resources/images/buttons/back_onHover.png"));
		if (e.getSource() == lv1)
			lv1.setIcon(new ImageIcon(
					"resources/images/level_1_onHover.png"));
		if (e.getSource() == lv2)
			lv2.setIcon(new ImageIcon(
					"resources/images/level_2_onHover.png"));
		if (e.getSource() == lv3)
			lv3.setIcon(new ImageIcon(
					"resources/images/level_3_onHover.png"));
		if (e.getSource() == lv4)
			lv4.setIcon(new ImageIcon(
					"resources/images/level_4_onHover.png"));
		if (e.getSource() == lv5)
			lv5.setIcon(new ImageIcon(
					"resources/images/level_5_onHover.png"));
		if (e.getSource() == lv6)
			lv6.setIcon(new ImageIcon(
					"resources/images/level_6_onHover.png"));
		if (e.getSource() == lv7)
			lv7.setIcon(new ImageIcon(
					"resources/images/level_7_onHover.png"));
		if (e.getSource() == lv8)
			lv8.setIcon(new ImageIcon(
					"resources/images/level_8_onHover.png"));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == back) {
			back.setIcon(new ImageIcon("resources/images/buttons/back.png"));
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getSource() == back) {
			back.setIcon(new ImageIcon(
					"resources/images/buttons/back_onSelect.png"));
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.getSource() == back) {
			back.setIcon(new ImageIcon("resources/images/buttons/back.png"));
			// TODO Delete this syso later
			cv.back();
		}
		//TODO: Fix crypt
//		for(int i = 1; i<=8; i++){
//			if(e.getSource() instanceof JButton) {
//				if(((JButton)e.getSource()).getName() == ("" + i)){
//					cv.showHighscoreView(i);
//				}
//			}
//
//		}

	}

}
