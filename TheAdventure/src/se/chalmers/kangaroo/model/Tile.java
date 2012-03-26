package se.chalmers.kangaroo.model;

/**
 * A class for representing a tile. Every tile has an ID representing
 * the collidable state.
 * 
 * @author alburgh
 * 
 */
public class Tile {
	static final String COLLIDE_IDS = "ABCDEFG";
	private final char id;
	private boolean collideable;

	/**
	 * Creates a tile with the given id.
	 * @param a
	 */
	public Tile(char a) {
		this.id = a;
		collideable = COLLIDE_IDS.contains("" + a);
	}

	/**
	 * Returns if the tile is collideable or not.
	 * @return true if the tile is collideable
	 */
	public boolean isCollidable() {
		return collideable;
	}

	/**
	 * Returns the char which represents the id of the tile.
	 * 
	 * @return the id of the tile
	 */
	public char getId() {
		return id;
	}
}
