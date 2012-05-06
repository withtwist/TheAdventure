package se.chalmers.kangaroo.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;

import javax.swing.*;

import se.chalmers.kangaroo.controller.CustomKeys;
import se.chalmers.kangaroo.constants.*;
import se.chalmers.kangaroo.utils.KeyList;

public class OptionView extends JPanelWithBackground implements ActionListener,
		KeyListener, MouseListener {
	private JLabel currentLeft;
	private JLabel currentRight;
	private JLabel currentJump;
	private JLabel currentItem;
	private JButton left = new JButton("GO LEFT");
	private JButton right = new JButton("GO RIGHT");
	private JButton jump = new JButton("JUMP");
	private JButton item = new JButton("USE ITEM");
	private CustomKeys ck;
	private Menuebutton back;
	private ChangeView cv;
	private Key pressedKey;
	private KeyEvent keyEvent;
	JTextField txt = new JTextField();
	
	private enum Key {
		 LEFT, RIGHT, JUMP, ITEM, NONE;
	}

	public OptionView(String imagepath, ChangeView cv) {
		super(imagepath);
		this.cv = cv;
		this.setFocusable(true);
		this.addKeyListener(this);
		ck = CustomKeys.getInstance();
		back = new Menuebutton("resources/images/buttons/back.png");
		back.addMouseListener(this);
		addKeyListener(this);
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
		JLabel title = new JLabel(Constants.TITLE_START + "Option"
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

		// Key Binding
		JPanel kBindingPanel = new JPanel(new BorderLayout());
		contentPanel.add(kBindingPanel, BorderLayout.WEST);
		kBindingPanel.setMinimumSize(new Dimension(
				Constants.RESOLUTION_WIDTH / 3, Constants.RESOLUTION_HEIGHT
						- titleHeight));
		kBindingPanel.setMaximumSize(new Dimension(
				Constants.RESOLUTION_WIDTH / 3, Constants.RESOLUTION_HEIGHT
						- titleHeight));
		kBindingPanel.setPreferredSize(new Dimension(
				Constants.RESOLUTION_WIDTH / 3, Constants.RESOLUTION_HEIGHT
						- titleHeight));

		// Key Binding - Title
		JLabel kbLabel = new JLabel("Custom Keys");
		kBindingPanel.add(kbLabel, BorderLayout.NORTH);
		kbLabel.setMinimumSize(new Dimension(Constants.RESOLUTION_WIDTH/3, subTitleHeight));
		kbLabel.setMaximumSize(new Dimension(Constants.RESOLUTION_WIDTH/3, subTitleHeight));
		kbLabel.setPreferredSize(new Dimension(Constants.RESOLUTION_WIDTH/3, subTitleHeight));

		// Key Binding - Grid
		JPanel kbGridPanel = new JPanel(new GridLayout(4, 2));
		Dimension buttonPanelDimension= new Dimension(Constants.BUTTON_RESOLUTION_WIDTH + 20, Constants.BUTTON_RESOLUTION_HEIGHT + 40);

		//Left
		JPanel leftButtonPanel = new JPanel();
		left.addActionListener(this);
		left.setFocusable(false);
		leftButtonPanel.add(left);
		kbGridPanel.add(leftButtonPanel);
		currentLeft = new JLabel(ck.getLeftKeyName(keyEvent));
		kbGridPanel.add(currentLeft);
		leftButtonPanel.setMinimumSize(buttonPanelDimension);
		leftButtonPanel.setMaximumSize(buttonPanelDimension);
		leftButtonPanel.setPreferredSize(buttonPanelDimension);
		left.setMinimumSize(Constants.BUTTON_RESOLUTION);
		left.setMaximumSize(Constants.BUTTON_RESOLUTION);
		left.setPreferredSize(Constants.BUTTON_RESOLUTION);

		//Right
		JPanel rightButtonPanel = new JPanel();
		right.addActionListener(this);
		right.setFocusable(false);
		rightButtonPanel.add(right);
		kbGridPanel.add(rightButtonPanel);
		currentRight = new JLabel(ck.getRightKeyName(keyEvent));
		kbGridPanel.add(currentRight);
		rightButtonPanel.setMinimumSize(buttonPanelDimension);
		rightButtonPanel.setMaximumSize(buttonPanelDimension);
		rightButtonPanel.setPreferredSize(buttonPanelDimension);
		right.setMinimumSize(Constants.BUTTON_RESOLUTION);
		right.setMaximumSize(Constants.BUTTON_RESOLUTION);
		right.setPreferredSize(Constants.BUTTON_RESOLUTION);

		//Jump
		JPanel jumpButtonPanel = new JPanel();
		jump.addActionListener(this);
		jump.setFocusable(false);
		jumpButtonPanel.add(jump);
		kbGridPanel.add(jumpButtonPanel);
		currentJump = new JLabel(ck.getJumpKeyName(keyEvent));
		kbGridPanel.add(currentJump);
		jumpButtonPanel.setMinimumSize(buttonPanelDimension);
		jumpButtonPanel.setMaximumSize(buttonPanelDimension);
		jumpButtonPanel.setPreferredSize(buttonPanelDimension);
		jump.setMinimumSize(Constants.BUTTON_RESOLUTION);
		jump.setMaximumSize(Constants.BUTTON_RESOLUTION);
		jump.setPreferredSize(Constants.BUTTON_RESOLUTION);
		
		//Item
		JPanel itemButtonPanel = new JPanel();
		item.addActionListener(this);
		item.setFocusable(false);
		itemButtonPanel.add(item);
		kbGridPanel.add(itemButtonPanel);
		currentItem = new JLabel(ck.getItemKeyName(keyEvent));
		kbGridPanel.add(currentItem);
		itemButtonPanel.setMinimumSize(buttonPanelDimension);
		itemButtonPanel.setMaximumSize(buttonPanelDimension);
		itemButtonPanel.setPreferredSize(buttonPanelDimension);
		item.setMinimumSize(Constants.BUTTON_RESOLUTION);
		item.setMaximumSize(Constants.BUTTON_RESOLUTION);
		item.setPreferredSize(Constants.BUTTON_RESOLUTION);

		kBindingPanel.add(kbGridPanel, BorderLayout.SOUTH);
		
		//Placeholder
		JPanel ph = new JPanel();
		ph.setMinimumSize(new Dimension(
				Constants.RESOLUTION_WIDTH / 3 * 2, Constants.RESOLUTION_HEIGHT
						- titleHeight));
		ph.setMaximumSize(new Dimension(
				Constants.RESOLUTION_WIDTH / 3 * 2, Constants.RESOLUTION_HEIGHT
						- titleHeight));
		ph.setPreferredSize(new Dimension(
				Constants.RESOLUTION_WIDTH / 3 * 2, Constants.RESOLUTION_HEIGHT
						- titleHeight));
		
		contentPanel.add(ph, BorderLayout.CENTER);
		
	}

	@Override
	public void paintComponent(java.awt.Graphics g) {
		super.paintComponent(g);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == left) {
			pressedKey = Key.LEFT;
			this.requestFocus();
			new Thread() {
				@Override
				public void run() {
					try {
						while(pressedKey == Key.LEFT){
							currentLeft.setText("Press a key...");
							sleep(700);
							currentLeft.setText("");
							sleep(700);
						}
						currentLeft.setText(ck.getLeftKeyName(keyEvent));
					} catch (InterruptedException ie) {

					}
				}
			}.start();
			

		} else if (src == right) {
			pressedKey = Key.RIGHT;
			this.requestFocus();
			new Thread() {
				@Override
				public void run() {
					try {
						while(pressedKey == Key.RIGHT){
							currentRight.setText("Press a key...");
							sleep(700);
							currentRight.setText("");
							sleep(700);
						}
						currentRight.setText(ck.getRightKeyName(keyEvent));
					} catch (InterruptedException ie) {

					}
				}
			}.start();

		} else if (src == jump) {
			pressedKey = Key.JUMP;
			this.requestFocus();
			new Thread() {
				@Override
				public void run() {
					try {
						while(pressedKey == Key.JUMP){
							currentJump.setText("Press a key...");
							sleep(700);
							currentJump.setText("");
							sleep(700);
						}
						currentJump.setText(ck.getJumpKeyName(keyEvent));
					} catch (InterruptedException ie) {

					}
				}
			}.start();

		} else if (src == item) {
			pressedKey = Key.ITEM;
			this.requestFocus();
			new Thread() {
				@Override
				public void run() {
					try {
						while(pressedKey == Key.ITEM){
							currentItem.setText("Press a key...");
							sleep(700);
							currentItem.setText("");
							sleep(700);
						}
						currentItem.setText(ck.getItemKeyName(keyEvent));
					} catch (InterruptedException ie) {

					}
				}
			}.start();
		}

	}

	public void keyPressed(KeyEvent key) {
		if(pressedKey == Key.LEFT){
			ck.setLeftKey(key.getKeyCode());
			pressedKey = Key.NONE;
		}else if(pressedKey == Key.RIGHT){
			ck.setRightKey(key.getKeyCode());
			pressedKey = Key.NONE;
		}else if(pressedKey == Key.JUMP){
			ck.setJumpKey(key.getKeyCode());
			pressedKey = Key.NONE;
		}else if(pressedKey == Key.ITEM){
			ck.setItemKey(key.getKeyCode());
			pressedKey = Key.NONE;
		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {

	}

	@Override
	public void keyTyped(KeyEvent key) {
		

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
			cv.menuView();
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.getSource() == back) {
			back.setIcon(new ImageIcon("resources/images/buttons/back.png"));
			cv.menuView();
		}

	}

}

