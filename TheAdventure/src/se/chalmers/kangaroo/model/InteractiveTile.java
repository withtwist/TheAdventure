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
// InteractiveTile ska få ett state från en klass som implementerar
// InteractiveObject
/**
 * @author Sean
 *
 */
/**
 * @author Sean
 *
 */
/**
 * @author Sean
 *
 */
public class InteractiveTile extends Tile {
	private final char id;
	private boolean collideable;
	private InteractiveObject intObj;

	/**
	 * 
	 * The constructor sets all variables.
	 * 
	 * @param a
	 *            is the tile-ID.
	 * 
	 * @param intObj
	 *            is the InteractiveObject that the InteractiveTile is referring
	 *            to
	 * 
	 */
	public InteractiveTile(char a, InteractiveObject intObj) {
		super(a);
		this.id = a;
		this.intObj = intObj;
		collideable = intObj.isCollideable(a);
	}

	/**
	 * Method that makes changes when InterObject is triggered. 
	 */
	public void onTrigger() {
		// Reminder for myself, how to write this method
		if (collideable == true) {
			collideable = false;
		} else {
			collideable = true;
		}

	}

	@Override
	public boolean isCollidable() {
		return super.isCollidable();
	}
	
	@Override
	public char getId() {
		return super.getId();
	}

	@Override
	public int hashCode() {
		return super.hashCode() * 19 * (int) id * 47;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return super.toString() + "InteractiveTile";
	}
}
