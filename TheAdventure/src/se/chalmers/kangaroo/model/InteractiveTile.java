package se.chalmers.kangaroo.model;

/**
 * 
 * InteractiveTile is a tile that is related to an InteractiveObject. An
 * InteractiveTile will appear or disappear when the InteractiveObject is
 * triggered.
 * 
 * @author pavlov
 * 
 */
public class InteractiveTile extends Tile implements InteractiveObject {
	private boolean isVisible;

	/**
	 * 
	 * The constructor will call the super-constructor (Tile) and check if the
	 * tile is collideable.
	 * 
	 * @param a
	 *            is the tile-ID.
	 * 
	 */
	public InteractiveTile(char a) {
		super(a);
	}

	/**
	 * When an InteractiveObject is triggered by Kangaroo, the InteractiveTile
	 * will trigger and appear or disappear.
	 */
	public void onTrigger() {
		// Reminder for myself, how to write this method
		// if(this.a == COLLIDE_IDS.contains("0"){
		// this.isVisible = true;
		// InteractiveTile(skicka in annat än luft);
		// }else{
		// ändra tvärtom
		// }

	}

}
