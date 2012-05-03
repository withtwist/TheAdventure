package se.chalmers.kangaroo.model.creatures;

import java.awt.Polygon;

import se.chalmers.kangaroo.model.Creature;
import se.chalmers.kangaroo.model.Direction;
import se.chalmers.kangaroo.model.Position;
import se.chalmers.kangaroo.utils.GameTimer;

public class BlackAndWhiteCreature implements Creature {
	private Position pos;
	private GameTimer timer = new GameTimer();
	private final static int ID = 113;
	private static final int speed = 7;
	private Direction direction;

	public BlackAndWhiteCreature(Position spawnPos) {
		this.pos = spawnPos;
		this.direction = Direction.DIRECTION_WEST;
	}

	/**
	 * Returns the polygon for this creature.
	 */
	public Polygon getPolygon() {
		int[] xs = { pos.getX(), pos.getX() + 31, pos.getX() + 31, pos.getX() };
		int[] ys = { pos.getY(), pos.getY(), pos.getY() + 31, pos.getY() + 31 };
		return new Polygon(xs, ys, 4);
	}

	/**
	 * Return true if the creature is in a killable state.
	 */
	public boolean isKillable() {
		if (timer.getElapsedNanoTime() / 10000 % 2 == 1)
			return false;
		return true;
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
		BlackAndWhiteCreature other = (BlackAndWhiteCreature) obj;
		if (pos == null) {
			if (other.pos != null)
				return false;
		} else if (!pos.equals(other.pos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BlackAndWhiteCreature [pos=" + pos + "]";
	}

	/**
	 * Changes the direction of the creature
	 */
	@Override
	public void changeDirection() {
		direction = direction == Direction.DIRECTION_WEST ? Direction.DIRECTION_EAST
				: Direction.DIRECTION_WEST;
	}

	/**
	 * Moves the creature
	 */
	@Override
	public void move() {
		if (direction == Direction.DIRECTION_WEST) {
			pos = new Position(pos.getX() - speed, pos.getY());
		} else {
			pos = new Position(pos.getX() + speed, pos.getY());
		}
	}

	/**
	 * Updates the creature (moves it and may change speed etc)
	 */
	@Override
	public void updateCreature() {
		move();
	}

	/**
	 * Returns the id of this creature
	 */
	@Override
	public int getId() {
		return ID;
	}

	/**
	 * Returns the position of this creature.
	 */
	@Override
	public Position getPosition() {
		return pos;
	}
}
