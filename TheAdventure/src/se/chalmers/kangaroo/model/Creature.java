package se.chalmers.kangaroo.model;
/**
 * This abstract class represents all the different hostile creatures in the game.
 * @author simonal
 *
 */
public abstract class Creature implements Movable{
	
	private Position spawnPos;
	private boolean killable;
	private Position pos;
	/**
	 * A protected constructor which takes a spawnposition and the direction the creature will be facing.
	 * @param spawnPos
	 * @param direction
	 */
	protected Creature(Position spawnPos, Direction direction) {
		//TODO
	}
	/**
	 * Changes the direction the creature is facing and possible moving.
	 * @param newDirection
	 */
	public void changeDirection(Direction newDirection) {
		//TODO
	}
	/**
	 * Returns true of the creature is killable and false if it isnt.
	 * @return killable
	 */
	public boolean isKillable() {
		return killable;
	}
	/**
	 * Moves the creature according to the delta-y nad delta-x.
	 * @param dy
	 * @param dx
	 */
	public void move(int dy, int dx) {
		//TODO
	}

}
