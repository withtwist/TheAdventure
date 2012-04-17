package se.chalmers.kangaroo.model;

/**
 * A class for representing a tile. Every tile has an ID representing the
 * collidable state.
 * 
 * @author alburgh
 * 
 */
public class Tile {
	static final String COLLIDE_IDS = "ABCDEFG";
	private String id;
	private boolean collidable;

	/**
	 * Creates a tile with the given id.
	 * 
	 * @param a
	 */
	public Tile(String s) {
		this.id = s;
		collidable = COLLIDE_IDS.contains("" + s);
	}

	/**
	 * Returns whether the tile is collidable or not.
	 * 
	 * @return true if the tile is collidable
	 */
	public boolean isCollidable() {
		return collidable;
	}

	/**
	 * Returns the char which represents the id of the tile.
	 * 
	 * @return the id of the tile
	 */
	public String getId() {
		return id;
	}
	/**
	 * Make it possible for extensions to change ID.
	 * @param s, the new ID
	 */
	protected void changeId(String s){
		id = s;
	}
	/**
	 * Make it possible for extensions to toggle collidable.
	 */
	protected void toggleCollidable(){
		collidable = !collidable;
	}
	/**
	 * @return an int representing the hashCode
	 */
	@Override
	public int hashCode() {
		return super.hashCode() * 7 * id.hashCode() * 37;
	}
	/**
	 * @return true if obj is a Tile and the id is the same. 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tile other = (Tile) obj;
		if (id != other.id)
			return false;
		return true;
	}

	/**
	 * A string representing a tile.
	 */
	@Override
	public String toString() {
		return "Id: " + id + " Collidable: " + collidable;
	}

}
