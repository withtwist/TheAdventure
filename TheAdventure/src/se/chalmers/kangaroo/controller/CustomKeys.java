package se.chalmers.kangaroo.controller;

import java.awt.event.KeyEvent;

import javax.swing.*;

public class CustomKeys {
	private int jumpKey, leftKey, rightKey, itemKey;

	public CustomKeys(){
		jumpKey = 38;
		leftKey = 37;
		rightKey = 39;
		itemKey = 67;
	}
	
	public void setJumpKey(int jumpKey){
		this.jumpKey = jumpKey;
	}
	
	public int getJumpKey(){
		return 28;
	}


}
