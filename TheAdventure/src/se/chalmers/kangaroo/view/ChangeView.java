package se.chalmers.kangaroo.view;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import se.chalmers.kangaroo.controller.GameController;
import se.chalmers.kangaroo.utils.Sound;

/**
 * A class that lets you change between the different views in the game. The
 * changeview is a JFrame.
 * 
 * @author Arvid
 * 
 */
public class ChangeView extends JFrame implements KeyListener {

	private JPanel jp;
	private GameController gc;
	private OptionView ov;
	private HighscoreView hv;
	private MenuView mv;
	private ShowHighscoreView shv;
	private String prevView;

	/**
	 * Adds a panel to itself and places the diffrent views in itself. The
	 * ChangeView frame contains a JPanel that has a cardlayout. ChangeView then
	 * swwitches between these cards when the right metods are called upon.
	 */

	public ChangeView() {
		gc = new GameController(this);
		ov = new OptionView("resources/images/background.gif", this);
		hv = new HighscoreView("resources/images/background.gif", this);
		mv = new MenuView("resources/images/background.gif", this);
		//TODO: Fix crypt
//		shv = new ShowHighscoreView("resources/images/background.gif", this);

		jp = new JPanel(new CardLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1024, 576);
		setResizable(false);
		Dimension win = Toolkit.getDefaultToolkit().getScreenSize();
		int width = getSize().width;
		int height = getSize().height;
		int xPos = (win.width - width) / 2;
		int yPos = (win.height - height) / 2;
		setLocation(xPos, yPos);
		jp.add(mv, "menuview");
		jp.add(gc.getGameView(), "gameview");
		jp.add(ov, "optionview");
		jp.add(hv, "highscoreview");
		//TODO: Fix crypt
//		jp.add(shv, "showHighscoreView");
		add(jp);
		addKeyListener(this);
		setVisible(true);
		jp.setVisible(true);
	}

	/**
	 * A method to change to the previous view.
	 */
	public void back() {
		CardLayout cl = (CardLayout) jp.getLayout();
		cl.show(jp, prevView);
	}

	/**
	 * A method to change to the MenuView.
	 */
	public void menuView() {
		CardLayout cl = (CardLayout) jp.getLayout();
		cl.show(jp, "menuview");
	}

	/**
	 * A method to change to the GameView. Also starts the game.
	 */
	public void gameView() {
		gc.start();
		CardLayout cl = (CardLayout) jp.getLayout();
		cl.show(jp, "gameview");

	}

	/**
	 * A method to change to the OptionView. Takes a String as a parameter so
	 * the ChangeView knows where the request to change the view is coming from.
	 * 
	 * @param prevView
	 */
	public void optionView(String prevView) {
		this.prevView = prevView;
		CardLayout cl = (CardLayout) jp.getLayout();
		cl.show(jp, "optionview");
	}

	/**
	 * A method to change to the HighscoreView. Takes a String as a parameter so
	 * the ChangeView knows where the request to change the view is coming from.
	 * 
	 * @param prevView
	 */
	public void highscoreView(String prevView) {
		this.prevView = prevView;
		CardLayout cl = (CardLayout) jp.getLayout();
		cl.show(jp, "highscoreview");
	}
	
	//TODO: Fix crypt
//	public void showHighscoreView(int level) {
//		shv.setLevel(level);
//		CardLayout cl = (CardLayout) jp.getLayout();
//		cl.show(jp, "showhighscoreview");
//	}

	/**
	 * Listen to when the keys are pressed. makles you able to move in the game.
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		gc.keyPressed(e);

	}

	/**
	 * Listen when the keys are released. makes you able to controll the game.
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		gc.keyReleased(e);

	}

	/**
	 * Unused method
	 */
	@Override
	public void keyTyped(KeyEvent e) {
		// Do nothing really
	}
}
