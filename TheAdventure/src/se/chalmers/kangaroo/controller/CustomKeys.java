package se.chalmers.kangaroo.controller;

import se.chalmers.kangaroo.io.CustomKeysIO;

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
	private CustomKeysIO io;

	/**
	 * Sets the default scheme for the control.
	 */
	private CustomKeys() {
		io = CustomKeysIO.getInstance();
		loadFromFile();
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
		writeToFile();
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
		writeToFile();
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
		writeToFile();
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
		writeToFile();
	}

	/**
	 * Getter for use item key
	 * @return the key for use item.
	 */
	public static int getItemKey() {
		return itemKey;
	}
	
	private void writeToFile(){
		int[] keys = {leftKey, rightKey, jumpKey, itemKey};
		io.setKeys(keys);
	}
	
	private void loadFromFile(){
		int[] keys = io.getKeys();
		leftKey = keys[0];
		rightKey = keys[1];
		jumpKey = keys[2];
		itemKey = keys[3];
	}

}
