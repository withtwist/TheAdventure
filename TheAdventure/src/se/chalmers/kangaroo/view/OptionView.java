package se.chalmers.kangaroo.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class OptionView extends JPanelWithBackground implements ActionListener, KeyListener{
private boolean isPainted = false;
private int pressedKeyId;
private JButton left = new JButton("GO LEFT");
	public OptionView(String imagepath) {
		super(imagepath);
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
			System.out.println("Hejk");
			
			JLabel currentLeft = new JLabel("LEFT_KEY");
			this.add(currentLeft);
			
			//Right
			JButton right = new JButton("GO RIGHT");
			this.add(right);
			
			JLabel currentRight = new JLabel("RIGHT_KEY");
			this.add(currentRight);
			
			//Jump
			JButton jump = new JButton("JUMP");
			this.add(jump);
			
			JLabel currentJump = new JLabel("UP_KEY");
			this.add(currentJump);
			
			//Item
			JButton item = new JButton("USE ITEM");
			this.add(item);
			
			JLabel currentItem = new JLabel("C");
			this.add(currentItem);
			isPainted = true;
		}
	}
	private void pressedKey(KeyEvent e) {
		pressedKeyId = e.getKeyCode();
	}
	
    public void actionPerformed(ActionEvent e){
    	Object src = e.getSource();
    	if(src == left){
    		System.out.println("You clicked the button");
    	}
        
        
        
    }

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
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
