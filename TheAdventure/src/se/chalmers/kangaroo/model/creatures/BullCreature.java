package se.chalmers.kangaroo.model.creatures;

import java.awt.Polygon;

import se.chalmers.kangaroo.model.Creature;
import se.chalmers.kangaroo.model.Direction;
import se.chalmers.kangaroo.model.Position;

/**
 * An enemy in the form of a bull. These creatures has health, so it takes 4
 * strikes to kill them.
 * 
 * @author Arvid
 * 
 */
public class BullCreature extends Creature {
	
	private Position position;
	private int health;
	private Polygon bullPolygon;

	/**
	 * Creates a bull at the given position and direction.
	 * 
	 * @param spawnPos
	 * @param direction
	 */
	public BullCreature(Position spawnPos, Direction direction) {
		super(direction);
		this.position = spawnPos;
		health = 100;
		int polyX[] = { 0, 14, 14, 20, 20, 44, 44, 50, 50, 64, 64, 54, 54, 10,
				10, 0 };
		int polyY[] = { 2, 2, 0, 0, 6, 6, 0, 0, 2, 2, 16, 16, 32, 32, 16, 16 };
		for (int i = 0; i < polyX.length; i++) {
			bullPolygon.addPoint(polyX[i], polyY[i]);
		}
	}

	/**
	 * Desides if the creature is killable. The bull is.
	 */
	@Override
	public boolean isKillable() {
		return true;
	}

	/**
	 * A method that remove the bulls health. if the bulls health goes below
	 * zero, it will be removed from the field.
	 */
	@Override
	public void remove() {
		health = health - 25;
		if (health >= 0)
			super.remove();
	}

	/**
	 * Returns the polygin of the bull.
	 */
	@Override
	public Polygon getPolygon() {
		return bullPolygon;
	}

	/**
	 * Returns the ammount of health the bull has left.
	 * 
	 * @return
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * Returns the hashCode of the bulls.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bullPolygon == null) ? 0 : bullPolygon.hashCode());
		result = prime * result + health;
		return result;
	}

	/**
	 * The overrided equals. A method to see of two bulls are equally.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BullCreature other = (BullCreature) obj;
		if (bullPolygon == null) {
			if (other.bullPolygon != null)
				return false;
		} else if (!bullPolygon.equals(other.bullPolygon))
			return false;
		if (health != other.health)
			return false;
		return true;
	}

	/**
	 * The overridet toString method. Returns the data from the bull in the form
	 * of health remaining.
	 */
	@Override
	public String toString() {
		return super.toString() + "health left: " + health;
	}
}
