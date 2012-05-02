package se.chalmers.kangaroo.model;

import java.awt.Polygon;

import se.chalmers.kangaroo.model.Creature;
import se.chalmers.kangaroo.model.Direction;
import se.chalmers.kangaroo.model.Position;

/**
 * 
 * @author pavlov
 *
 */
public class CrabCreature extends Creature{
	private int speed = 3;
	private Polygon creaturePoly;
	
	
	protected CrabCreature(int id, Position p, Direction direction) {
		super(id, direction);
		creaturePoly.npoints = 12;
		int polyX[] = {0,14,14,20,20,44,44,50,50,64,64,54,54,10,10,0};
		int polyY[] = {2,2,0,0,6,6,0,0,2,2,16,16,32,32,16,16};
		for(int i = 0; i < polyX.length; i++){
			creaturePoly.addPoint(polyX[i], polyY[i]);
		}
	
	}


	@Override
	public boolean isKillable() {
		return true;
	}


	@Override
	public Polygon getPolygon() {
		return creaturePoly;
	}
}
