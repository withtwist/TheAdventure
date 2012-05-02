package se.chalmers.kangaroo.model.creatures;

import java.awt.Polygon;

import se.chalmers.kangaroo.model.Creature;
import se.chalmers.kangaroo.model.Direction;
import se.chalmers.kangaroo.model.Position;

public class SmurfCreature implements Creature {

	private Polygon poly;
	
	private Position currentPos;
	
	private Direction currentDir;
	
	public SmurfCreature(Position spawnPos) {
		
		this.currentDir = Direction.DIRECTION_EAST;
		
	}
	
	@Override
	public boolean isKillable() {
		return false;
	}

	@Override
	public Polygon getPolygon() {
		return poly;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCreature() {
		this.move();
		
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Position getPosition() {
		return currentPos;
	}

	@Override
	public void changeDirection(Direction d) {
		this.currentDir = d;
		
	}

}
