package se.chalmers.kangaroo.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

import se.chalmers.kangaroo.controller.CustomKeys;
import se.chalmers.kangaroo.constants.*;

public class OptionView extends JPanelWithBackground implements ActionListener, KeyListener{
private boolean isPainted = false;
private int pressedKeyId;
private JButton left = new JButton("GO LEFT");
private JButton right = new JButton("GO RIGHT");
private JButton jump = new JButton("JUMP");
private JButton item = new JButton("USE ITEM");
private boolean isLeftPressed = false;
private boolean isRightPressed = false;
private boolean isJumpPressed = false;
private boolean isItemPressed = false;
private CustomKeys ck;
private JPanel mainPanel;
private JPanel keyGrid;
//TODO give the variable a proper name
private JPanel other;

	public OptionView(String imagepath) {
		super(imagepath);
		ck = CustomKeys.getInstance();
	}
	
	@Override
	public void paintComponent(java.awt.Graphics g) {
		super.paintComponent(g);

		//TODO Ask what to do with the paint-spam
		if(isPainted == false){
			mainPanel = new JPanel();
			mainPanel.setLayout(new BorderLayout());
			this.add(mainPanel);
			JPanel cKeys = new JPanel();
			cKeys.setLayout(new BorderLayout());
			cKeys.add(new JLabel("CUSTOM KEYS"), BorderLayout.NORTH);
			keyGrid = new JPanel();
			keyGrid.setLayout(new GridLayout(4,2));
			cKeys.add(keyGrid, BorderLayout.SOUTH);
			mainPanel.add(cKeys, BorderLayout.WEST);
			mainPanel.add(new JButton("Placeholder"), BorderLayout.EAST);
			
			
			
			//Left
			left.addActionListener(this);
			keyGrid.add(left);
			
			JLabel currentLeft = new JLabel("LEFT_KEY");
			keyGrid.add(currentLeft);
			
			//Right
			right.addActionListener(this);
			keyGrid.add(right);
			
			JLabel currentRight = new JLabel("RIGHT_KEY");
			keyGrid.add(currentRight);
			
			//Jump
			jump.addActionListener(this);
			keyGrid.add(jump);
			
			JLabel currentJump = new JLabel("UP_KEY");
			keyGrid.add(currentJump);
			
			//Item
			item.addActionListener(this);
			keyGrid.add(item);
			
			JLabel currentItem = new JLabel("C");
			keyGrid.add(currentItem);
			isPainted = true;
		}
		this.setVisible(true);
	}
	
    public void actionPerformed(ActionEvent e){
    	Object src = e.getSource();
    	if(src == left){
    		System.out.println("You pressed left.");
    		
    		isLeftPressed = true;
    		isRightPressed = false;
    		isJumpPressed = false;
    		isItemPressed = false;
    	
    	}else if(src == right){
    		System.out.println("You pressed right.");

    	}else if(src == jump){
    		System.out.println("You pressed jump.");

    	}else if(src == item){
    		System.out.println("You pressed item.");
    	}
        
        
        
    }

	@Override
	public void keyPressed(KeyEvent key) {
			System.out.println("In da if");
			System.out.println(ck.getLeftKey());
			ck.setleftKey(key.getKeyCode());
			System.out.println(ck.getLeftKey());
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
