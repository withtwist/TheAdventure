package se.chalmers.kangaroo.model;

import java.awt.Polygon;

public class TurtleCreature extends Creature {

	private Polygon creaturePoly;
	private boolean inShell = false;
	
	protected TurtleCreature(Position spawnPos, Direction direction) {
		super(spawnPos, direction);
		creaturePoly.npoints = 12;
		int polyX[] = {0,14,14,20,20,44,44,50,50,64,64,54,54,10,10,0};
		int polyY[] = {2,2,0,0,6,6,0,0,2,2,16,16,32,32,16,16};
		for(int i = 0; i < polyX.length; i++){
			creaturePoly.addPoint(polyX[i], polyY[i]);
		}
	}
	
	@Override
	public void updateCreature() {
		this.move();
	}
	
	/**
	 * A class to toggle the state of the Turtle.
	 * Not sure how to implement.
	 */
	public void changeState() {
		Thread thread = new Thread();
		
	}
	
	public void goInShell() {
		inShell = true;
	}
	
	public void goOutOfShell() {
		inShell = false;
	}
	
	@Override
	public void move() {
		if(!inShell){
			super.move();
		}
	}
	
}
