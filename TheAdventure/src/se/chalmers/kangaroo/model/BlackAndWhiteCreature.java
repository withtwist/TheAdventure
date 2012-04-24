package se.chalmers.kangaroo.model;

import java.awt.Polygon;

import se.chalmers.kangaroo.utils.GameTimer;

public class BlackAndWhiteCreature extends Creature{
	Position pos;
	GameTimer timer = new GameTimer();
	
	public BlackAndWhiteCreature(Position spawnPos, Direction d){
		super(d);
		this.pos = spawnPos;
		timer.start();
	}
	/**
	 * Returns the polygon for this creature.
	 */
	@Override
	public Polygon getPolygon() {
		int[] xs = {pos.getX(), pos.getX()+31, pos.getX()+31, pos.getX()};
		int[] ys = {pos.getY(), pos.getY(), pos.getY()+31, pos.getY()+31};
		return new Polygon(xs,ys,4);
	}
	/**
	 * Return true if the creature is in a killable state.
	 */
	@Override
	public boolean isKillable(){
		if(timer.getElapsedNanoTime()/ 10000 % 2 == 1)
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
	
	
}
