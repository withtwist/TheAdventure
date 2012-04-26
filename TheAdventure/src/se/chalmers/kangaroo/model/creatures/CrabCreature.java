package se.chalmers.kangaroo.model.creatures;

import java.awt.Polygon;

import se.chalmers.kangaroo.model.Creature;
import se.chalmers.kangaroo.model.Direction;
import se.chalmers.kangaroo.model.Position;

/**
 * This enemy is the standard enemy, a crab.
 * 
 * @author pavlov
 * 
 */
public class CrabCreature extends Creature {
	private int speed = 3;
	private Position pos;
	private Polygon creaturePoly;

	public CrabCreature(Position pos, Direction direction) {
		super(direction);
		this.pos = pos;

	}

	@Override
	public boolean isKillable() {
		return true;
	}

	@Override
	public Polygon getPolygon() {
		int polyX[] = { pos.getX() + 0, pos.getX() + 14, pos.getX() + 14,
				pos.getX() + 20, pos.getX() + 20, pos.getX() + 44,
				pos.getX() + 44, pos.getX() + 50, pos.getX() + 50,
				pos.getX() + 64, pos.getX() + 64, pos.getX() + 54,
				pos.getX() + 54, pos.getX() + 10, pos.getX() + 10,
				pos.getX() + 0 };
		int polyY[] = { pos.getY() + 2, pos.getY() + 2, pos.getY() + 0,
				pos.getY() + 0, pos.getY() + 6, pos.getY() + 6, pos.getY() + 0,
				pos.getY() + 0, pos.getY() + 2, pos.getY() + 2,
				pos.getY() + 16, pos.getY() + 16, pos.getY() + 32,
				pos.getY() + 32, pos.getY() + 16, pos.getY() + 16 };
		return new Polygon(polyX, polyY, 16);
	}
}
