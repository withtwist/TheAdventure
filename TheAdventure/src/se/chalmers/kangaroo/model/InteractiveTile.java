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
public class InteractiveTile extends Tile {
	private boolean collidable;
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
	public InteractiveTile(int a, InteractiveObject intObj) {
		super(a);
		this.intObj = intObj;
		collidable = intObj.isCollidable(a);
	}

	/**
	 * Method that change the state of collidable. 
	 */
	public void onTrigger() {
		super.toggleCollidable();
		super.changeId(super.getId());
	}

	@Override
	public int hashCode() {
		return super.hashCode() * 19;
	}

	@Override
	public String toString() {
		return super.toString() + "InteractiveTile";
	}
}
