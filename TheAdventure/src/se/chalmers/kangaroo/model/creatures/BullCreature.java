package se.chalmers.kangaroo.model.creatures;

import java.awt.Polygon;

import se.chalmers.kangaroo.model.utils.Direction;
import se.chalmers.kangaroo.model.utils.Position;

/**
 * An enemy in the form of a bull. These creatures has health, so it takes 4
 * strikes to kill them.
 * 
 * @author Arvid
 * 
 */
public class BullCreature implements Creature {

	private static final int id = 114;
	private Position pos;
	private Direction direction;
	private int speed = 1;
	private int health;

	/**
	 * Creates a bull at the given position and direction.
	 * 
	 * @param spawnPos
	 * @param direction
	 */
	public BullCreature(Position spawnPos) {
		this.pos = spawnPos;
		health = 100;
	}

	/**
	 * Returns the polygin of the bull.
	 */
	public Polygon getPolygon() {
		int polyX[] = { pos.getX(), pos.getX() + 14, pos.getX() + 14,
				pos.getX() + 20, pos.getX() + 20, pos.getX() + 44,
				pos.getX() + 44, pos.getX() + 50, pos.getX() + 50,
				pos.getX() + 64, pos.getX() + 64, pos.getX() + 54,
				pos.getX() + 54, pos.getX() + 10, pos.getX() + 10, pos.getX() };
		int polyY[] = { pos.getY() + 2, pos.getY() + 2, pos.getY(), pos.getY(),
				pos.getY() + 6, pos.getY() + 6, pos.getY(), pos.getY(),
				pos.getY() + 2, pos.getY() + 2, pos.getY() + 16,
				pos.getY() + 16, pos.getY() + 32, pos.getY() + 32,
				pos.getY() + 16, pos.getY() + 16 };
		return new Polygon(polyX, polyY, 16);
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

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCreature() {
		if (direction == Direction.DIRECTION_WEST) {
			pos = new Position(pos.getX() - speed, pos.getY());
		} else {
			pos = new Position(pos.getX() + speed, pos.getY());
		}

	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public Position getPosition() {
		return pos;
	}

	@Override
	public void changeDirection() {
		if (direction == Direction.DIRECTION_WEST) {
			direction = Direction.DIRECTION_EAST;
		} else {
			direction = Direction.DIRECTION_WEST;
		}
	}

	/**
	 * Desides if the creature is killable. The bull is.
	 */
	public boolean isKillable() {
		return true;
	}

}
