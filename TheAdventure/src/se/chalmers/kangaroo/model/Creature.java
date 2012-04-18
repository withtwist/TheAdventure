package se.chalmers.kangaroo.model;

import java.awt.Polygon;

/**
 * This abstract class represents all the different hostile creatures in the game.
 * @author simonal
 * @modified by arvidk
 *
 */
public abstract class Creature implements Movable{
	
	private Position spawnPos;
	private boolean killable;
	private Position pos;
	private Direction direction;
	private int speed;
	private Polygon creaturePoly;
	/**
	 * A protected constructor which takes a spawnposition and the direction the creature will be facing.
	 * @param spawnPos
	 * @param direction
	 */
	protected Creature(Position spawnPos, Direction direction) {
		this.spawnPos = spawnPos;
		this.direction = direction;
	}
	/**
	 * Changes the direction the creature is facing and possible moving.
	 * @param newDirection
	 */
	public void changeDirection(Direction newDirection) {
		this.direction = newDirection;
	}
	/**
	 * Returns true of the creature is killable and false if it isnt.
	 * @return killable
	 */
	public boolean isKillable() {
		return killable;
	}
	/**
	 * Returns the specified creatures polygon.
	 * @return
	 */
	public Polygon getPolygon() {
		return creaturePoly;
	}
	/**
	 * Removes the creature from the game.
	 */
	public void remove() {
		//TODO add code
	}
	/**
	 * Moves the creature according to what direction it is moving in and its speed.
	 * @param dy
	 * @param dx
	 */
	public void move() {
		//TODO more complex movemethod
		if(direction==Direction.DIRECTION_EAST) {
			pos = new Position((int)pos.getX()+speed, pos.getY());
		} else if(direction==Direction.DIRECTION_WEST) {
			pos = new Position((int)pos.getX()-speed, pos.getY());
		}
	}
	/**
	 * Updates the Creature.
	 */
	public void updateCreature() {
		this.move();
		//TODO write more here
	}
	

}
