package se.chalmers.kangaroo.model.creatures;

import java.awt.Polygon;

import se.chalmers.kangaroo.model.utils.Position;

/**
 * This abstract class represents all the different hostile creatures in the
 * game.
 * 
 * @author simonal
 * @modified by arvidk
 * 
 */
public interface Creature{
	/**
	 * Returns true of the creature is killable and false if it isn't.
	 * 
	 * @return killable
	 */
	public boolean isKillable();

	/**
	 * Returns the specified creatures polygon.
	 * 
	 * @return
	 */
	public Polygon getPolygon();

	/**
	 * Moves the creature according to what direction it is moving in and its
	 * speed.
	 * 
	 * @param dy
	 * @param dx
	 */
	public void move();

	/**
	 * Updates the Creature.
	 */
	public void updateCreature();

	public int getId();

	public Position getPosition();

	public void changeDirection();

}
