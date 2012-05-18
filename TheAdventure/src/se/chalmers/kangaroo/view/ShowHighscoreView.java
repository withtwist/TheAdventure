package se.chalmers.kangaroo.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import se.chalmers.kangaroo.constants.Constants;
import se.chalmers.kangaroo.io.Highscore;

/**
 * This is the view that show you who has the best score on a specific level. It
 * specifically show the level you have chosen in HighscoreView.
 * 
 * @author pavlov
 * 
 */
public class ShowHighscoreView extends JPanelWithBackground implements
		MouseListener {
	private Menubutton back;
	private ChangeView cv;
	private String[] names;
	private int[] times;
	private int[] deaths;
	private Highscore hs;
	private int level;

	/**
	 * Constructor that sets the design that is used.
	 * 
	 * @param imagepath
	 *            is the background used for this view.
	 * @param cv
	 *            is the class for changing view.
	 * @param level
	 *            is the level that you want to show highscore for.
	 */
	public ShowHighscoreView(String imagepath, ChangeView cv, int level) {
		super(imagepath);
		this.cv = cv;
		hs = Highscore.getInstance();
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
		JLabel title = new JLabel(Constants.TITLE_START + "Highscore - Level "
				+ level + Constants.TITLE_END);
		titlePanel.add(title);
		headerPanel.add(title, BorderLayout.CENTER);

		headerPanel.setMinimumSize(new Dimension(Constants.RESOLUTION_WIDTH,
				titleHeight));
		headerPanel.setMaximumSize(new Dimension(Constants.RESOLUTION_WIDTH,
				titleHeight));
		headerPanel.setPreferredSize(new Dimension(Constants.RESOLUTION_WIDTH,
				titleHeight));

		// Content
		JPanel contentPanel = new JPanel(new GridLayout(6, 1));

		this.level = level;
		names = hs.getNames(level);
		times = hs.getTimes(level);
		deaths = hs.getDeaths(level);
		
		// Information Labels
		JPanel topHead = new JPanel(new GridLayout(1, 6));
		for (int i = 0; i < 2; i++) {
			topHead.add(new JLabel(
					"<html><body><h1><b>Name</b></h1></body></html>"));
			topHead.add(new JLabel(
					"<html><body><h1><b>Time</b></h1></body></html>"));
			topHead.add(new JLabel(
					"<html><body><h1><b>Deaths</b></h1></body></html>"));
		}
		contentPanel.add(topHead);
		
		int j = 1;
		JPanel top1 = new JPanel(new GridLayout(1, 6));
		top1.setBackground(Color.PINK);
		for (int i = 0; i < 2; i++) {
			top1.add(new JLabel("0" + (j) + ". " + names[j-1]));
			top1.add(new JLabel("" + times[j-1] / 1000.0));
			top1.add(new JLabel("" + deaths[j-1]));
			j += 5;
		}
		contentPanel.add(top1);

		j = 2;
		JPanel top2 = new JPanel(new GridLayout(1, 6));
		for (int i = 0; i < 2; i++) {
			top2.add(new JLabel("0" + (j) + ". " + names[j-1]));
			top2.add(new JLabel("" + times[j-1] / 1000.0));
			top2.add(new JLabel("" + deaths[j-1]));
			j += 5;
		}
		contentPanel.add(top2);
		
		j = 3;
		JPanel top3 = new JPanel(new GridLayout(1, 6));
		top3.setBackground(Color.PINK);
		for (int i = 0; i < 2; i++) {
			top3.add(new JLabel("0" + (j) + ". " + names[j-1]));
			top3.add(new JLabel("" + times[j-1] / 1000.0));
			top3.add(new JLabel("" + deaths[j-1]));
			j += 5;
		}
		contentPanel.add(top3);

		j = 4;
		JPanel top4 = new JPanel(new GridLayout(1, 6));
		for (int i = 0; i < 2; i++) {
			top4.add(new JLabel("0" + (j) + ". " + names[j-1]));
			top4.add(new JLabel("" + times[j-1] / 1000.0));
			top4.add(new JLabel("" + deaths[j-1]));
			j += 5;
		}
		contentPanel.add(top4);

		j = 5;
		JPanel top5 = new JPanel(new GridLayout(1, 6));
		top5.setBackground(Color.PINK);
		for (int i = 0; i < 2; i++) {
			if(j == 10){
				top5.add(new JLabel((j) + ". " + names[j-1]));
			}else{
				top5.add(new JLabel("0" + (j) + ". " + names[j-1]));
			}
			top5.add(new JLabel("" + times[j-1] / 1000.0));
			top5.add(new JLabel("" + deaths[j-1]));
			j += 5;
		}
		contentPanel.add(top5);
		
		this.add(contentPanel, BorderLayout.SOUTH);

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == back)
			back.setIcon(new ImageIcon(
					"resources/images/buttons/back_onHover.png"));

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
			cv.highscoreView();
		}

	}

}
