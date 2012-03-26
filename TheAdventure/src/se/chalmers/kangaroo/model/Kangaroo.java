package se.chalmers.kangaroo.model;

/**
 * This class represents the Kangaroo controlled by the player.
 * 
 * @author simonal
 * 
 */
public class Kangaroo implements Movable {

	private Item item;
	private Position pos;

	/**
	 * The constructor for Kangaroo.
	 * 
	 * @param spawnPos
	 * @return
	 */
	public Kangaroo(Position spawnPos) {
		// TODO
	}

	/**
	 * Returns the item currently in use of the Kangaroo.
	 * 
	 * @return currentItem
	 */
	public Item getItem() {
		//TODO
		return null;
	}

	/**
	 * Sets and if possible replaces the old item with a new one.
	 * 
	 * @param newItem
	 */
	public void setItem(Item newItem) {
		// TODO
	}
	/**
	 * Moves the Kangaroo with the specified delta-y and delta-x.
	 */
	public void move(int dy, int dx) {
		//TODO
	}
	/**
	 * Moves the Kangaroo to the specified position.
	 * @param p
	 */
	public void move(Position p) {
		//TODO
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pos == null) ? 0 : pos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kangaroo other = (Kangaroo) obj;
		if (pos == null) {
			if (other.pos != null)
				return false;
		} else if (!pos.equals(other.pos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Kangaroo [pos=" + pos + "]";
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

}
