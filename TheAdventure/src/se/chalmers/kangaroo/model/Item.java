package se.chalmers.kangaroo.model;

/**
 * 
 * Item-interface is used to represent what all sort of items you can pick up
 * has in common. When Kangaroo is using an Item, it will get a special ability
 * that will be to its advantage.
 * 
 * @author pavlov
 * 
 */
public interface Item {

	/**
	 * This method is used to perform an action immediately after Kangaroo is
	 * picking up an item.
	 */
	public void onPickup();

	/**
	 * When the item is no longer in use, this method will deactivate the item
	 * so you do not have the special abilities left.
	 */
	public void onDrop();

}
