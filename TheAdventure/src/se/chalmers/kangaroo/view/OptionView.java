package se.chalmers.kangaroo.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

import se.chalmers.kangaroo.controller.CustomKeys;

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

	public OptionView(String imagepath) {
		super(imagepath);
		ck = CustomKeys.getInstance();
	}
	
	@Override
	public void paintComponent(java.awt.Graphics g) {
		super.paintComponent(g);
		
		GridLayout grl = new GridLayout(4,2);
		this.setLayout(grl);
		grl.setHgap(10);
		grl.setVgap(20);
		
		if(isPainted == false){
			//Left

			left.addActionListener(this);
			this.add(left);
			
			JLabel currentLeft = new JLabel("LEFT_KEY");
			this.add(currentLeft);
			
			//Right
			right.addActionListener(this);
			this.add(right);
			
			JLabel currentRight = new JLabel("RIGHT_KEY");
			this.add(currentRight);
			
			//Jump
			jump.addActionListener(this);
			this.add(jump);
			
			JLabel currentJump = new JLabel("UP_KEY");
			this.add(currentJump);
			
			//Item
			item.addActionListener(this);
			this.add(item);
			
			JLabel currentItem = new JLabel("C");
			this.add(currentItem);
			isPainted = true;
		}
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
		if(isLeftPressed == true){
			System.out.println("In da if");
			System.out.println(ck.getLeftKey());
			ck.setleftKey(key.getKeyCode());
			System.out.println(ck.getLeftKey());
			
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
