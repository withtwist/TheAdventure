package se.chalmers.kangaroo.model.item;

import se.chalmers.kangaroo.model.Item;
import se.chalmers.kangaroo.model.Kangaroo;

/**
 * A class representing an item that makes the kangaroo immortal for 5 seconds.
 * @author simonal
 *
 */
public class ImmortalItem extends Thread implements Item, Runnable  {
	
	Kangaroo kangaroo;
	/**
	 * Doesnt do anything on pickup.
	 */
	@Override
	public void onPickup(Kangaroo k) {
		kangaroo = k;
		
	}
	/**
	 * Doesnt do anything if the item is dropped.
	 */
	@Override
	public void onDrop(Kangaroo k) {
		;
		
	}
	/**
	 * Makes the kangaroo immortal and starts the thread.
	 */
	@Override
	public void onUse(Kangaroo k) {
		k.setImmortal(true);
		start();
		
	}
	/**
	 * Waits for 5 seconds and then changes the kangaroo to a mere mortal again.
	 */
	@Override
	public void run() {
		try {
		this.sleep(5000);
		} catch(InterruptedException e) {}
		kangaroo.setImmortal(false);
		
	}

}
