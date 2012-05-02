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
public class CrabCreature implements Creature {
	private int id;
	private Position pos;
	private Direction direction;
	private int speed = 3;
	private Polygon creaturePoly;

	public CrabCreature(int id, Position pos, Direction direction) {
		this.id = id;
		this.pos = pos;
		this.direction = direction;
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

	@Override
	public void changeDirection(Direction newDirection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCreature() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Position getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changeDirection() {
		// TODO Auto-generated method stub
		
	}
}
