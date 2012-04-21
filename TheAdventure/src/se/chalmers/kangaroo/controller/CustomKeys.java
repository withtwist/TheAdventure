package se.chalmers.kangaroo.controller;

import java.awt.event.KeyEvent;

/**
 * This is a singleton that hold the key binding for GameController. it has
 * setters and getters for each function requiring a key-press.
 * 
 * @author pavlov
 * 
 */
public class CustomKeys {
	private static CustomKeys instance;
	static private int jumpKey, leftKey, rightKey, itemKey;

	/**
	 * Sets the default scheme for the control.
	 */
	private CustomKeys() {
		jumpKey = KeyEvent.VK_UP;
		leftKey = KeyEvent.VK_LEFT;
		rightKey = KeyEvent.VK_RIGHT;
		itemKey = KeyEvent.VK_C;
	}

	/**
	 * This is for getting the singleton
	 * @return the singleton
	 */
	public static synchronized CustomKeys getInstance() {
		if (instance == null) {
			instance = new CustomKeys();
		}
		return instance;
	}

	/**
	 * Sets key binding for jump key.
	 * @param jumpKey is the key you perform the action jump with.
	 */
	public void setJumpKey(int jumpKey) {
		CustomKeys.jumpKey = jumpKey;
	}

	/**
	 * Getter for jump key
	 * @return the key for jump.
	 */
	public static int getJumpKey() {
		return jumpKey;
	}

	/**
	 * Sets key binding for left key.
	 * @param leftKey is the key you perform the action go left with.
	 */
	public void setleftKey(int leftKey) {
		CustomKeys.leftKey = leftKey;
	}

	/**
	 * Getter for go left key
	 * @return the key for go left.
	 */
	public static int getLeftKey() {
		return leftKey;
	}

	/**
	 * Sets key binding for right key.
	 * @param rightKey is the key you perform the action go right with.
	 */
	public void setRightKey(int rightKey) {
		CustomKeys.rightKey = rightKey;
	}

	/**
	 * Getter for go right key
	 * @return the key for go right.
	 */
	public static int getRightKey() {
		return rightKey;
	}

	/**
	 * Sets key binding for item key.
	 * @param itemKey is the key you perform the action use item with.
	 */
	public void setItemKey(int itemKey) {
		CustomKeys.itemKey = itemKey;
	}

	/**
	 * Getter for use item key
	 * @return the key for use item.
	 */
	public static int getItemKey() {
		return itemKey;
	}

}
