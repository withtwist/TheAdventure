package se.chalmers.kangaroo.view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import se.chalmers.kangaroo.constants.Constants;
import se.chalmers.kangaroo.utils.Sound;

/**
 * The view of the game.
 * 
 * @author twist3r
 * @modifiedby arvidk
 * 
 */
public class MenuView extends JPanelWithBackground implements MouseListener {
	private Menubutton newGame, highScore, options, exitGame;

	private ChangeView cv;
	private Sound menuMusic, lv1Music;
	private String viewName = "menuview";

	/**
	 * The constructor for the GameView.
	 * 
	 * @param bgpath
	 */
	public MenuView(String bgpath, ChangeView cv) {
		super(bgpath);
		this.cv = cv;
		BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(layout);
		this.setSize(Constants.RESOLUTION_WIDTH, Constants.RESOLUTION_WIDTH);
		menuMusic = new Sound();
		menuMusic.play("resources/music/menumusic.wav", true);
		newGame = new Menubutton("resources/images/newgame.png");
		highScore = new Menubutton("resources/images/highscore.png");
		options = new Menubutton("resources/images/options.png");
		exitGame = new Menubutton("resources/images/exitgame.png");

		this.add(Box.createVerticalGlue());
		this.add(new Menubutton("resources/images/menu_logo.gif"));
		this.add(Box.createVerticalGlue());
		this.add(Box.createVerticalGlue());
		this.add(Box.createVerticalGlue());
		this.add(newGame);
		this.add(Box.createVerticalGlue());
		this.add(highScore);
		this.add(Box.createVerticalGlue());
		this.add(options);
		this.add(Box.createVerticalGlue());
		this.add(exitGame);
		this.add(Box.createVerticalGlue());
		this.add(Box.createVerticalGlue());
		this.add(Box.createVerticalGlue());
		
		
		newGame.addMouseListener(this);
		highScore.addMouseListener(this);
		options.addMouseListener(this);
		exitGame.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == newGame)
			newGame.setIcon(new ImageIcon(
					"resources/images/newgame_onHover.png"));
		if (e.getSource() == highScore)
			highScore.setIcon(new ImageIcon(
					"resources/images/highscore_onHover.png"));
		if (e.getSource() == options)
			options.setIcon(new ImageIcon(
					"resources/images/options_onHover.png"));
		if (e.getSource() == exitGame)
			exitGame.setIcon(new ImageIcon(
					"resources/images/exitgame_onHover.png"));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == newGame)
			newGame.setIcon(new ImageIcon("resources/images/newgame.png"));
		if (e.getSource() == highScore)
			highScore.setIcon(new ImageIcon("resources/images/highscore.png"));
		if (e.getSource() == options)
			options.setIcon(new ImageIcon("resources/images/options.png"));
		if (e.getSource() == exitGame)
			exitGame.setIcon(new ImageIcon("resources/images/exitgame.png"));

	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getSource() == newGame)
			newGame.setIcon(new ImageIcon(
					"resources/images/newgame_onSelect.png"));
		if (e.getSource() == highScore)
			highScore.setIcon(new ImageIcon(
					"resources/images/highscore_onSelect.png"));
		if (e.getSource() == options)
			options.setIcon(new ImageIcon(
					"resources/images/options_onSelect.png"));
		if (e.getSource() == exitGame)
			exitGame.setIcon(new ImageIcon(
					"resources/images/exitgame_onSelect.png"));
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.getSource() == newGame) {
			newGame.setIcon(new ImageIcon("resources/images/newgame.png"));
			menuMusic.stop();
			lv1Music = new Sound();
			lv1Music.play("resources/music/gamemusic.WAV", true);
			cv.gameView();

		}
		if (e.getSource() == highScore) {
			highScore.setIcon(new ImageIcon("resources/images/highscore.png"));
			cv.highscoreView(viewName);
		}

		if (e.getSource() == options) {
			options.setIcon(new ImageIcon("resources/images/options.png"));
			cv.optionView(viewName);

		}
		if (e.getSource() == exitGame) {
			exitGame.setIcon(new ImageIcon("resources/images/exitGame.png"));
			System.exit(0);
		}
	}

}
