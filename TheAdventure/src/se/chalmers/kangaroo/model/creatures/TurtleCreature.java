package se.chalmers.kangaroo.model.creatures;

import java.awt.Polygon;

import se.chalmers.kangaroo.model.Creature;
import se.chalmers.kangaroo.model.Direction;
import se.chalmers.kangaroo.model.Position;
import se.chalmers.kangaroo.utils.Waiter;

public class TurtleCreature extends Creature {

	private Polygon creaturePoly;
	private boolean inShell = false;
	private Waiter w;

	protected TurtleCreature(Position spawnPos, Direction direction) {
		super(spawnPos, direction);
		creaturePoly.npoints = 12;
		int polyX[] = { 0, 14, 14, 20, 20, 44, 44, 50, 50, 64, 64, 54, 54, 10,
				10, 0 };
		int polyY[] = { 2, 2, 0, 0, 6, 6, 0, 0, 2, 2, 16, 16, 32, 32, 16, 16 };
		for (int i = 0; i < polyX.length; i++) {
			creaturePoly.addPoint(polyX[i], polyY[i]);
		}
		w = new Waiter();
	}

	@Override
	public void updateCreature() {
		int i = (int) ((11) * Math.random() * 1000);
		if (i == 5)
			changeState();
		this.move();
	}

	/**
	 * A class that change the state of the turtle. The turtle will be in its
	 * shell for a random amount of time between 1 and 5 seconds.
	 */
	public void changeState() {
		this.goInShell();
		w.waitTime((int) ((6) * Math.random()) * 1000);
		this.goOutOfShell();

	}

	/**
	 * A method to make the turtle go into its shell.
	 */
	public void goInShell() {
		inShell = true;
	}

	/**
	 * A method to make the turtle go out of its shell.
	 */
	public void goOutOfShell() {
		inShell = false;
	}

	/**
	 * Will change if the Turtle is killable or not. If the Turtle is in its
	 * shell, the creature shall be invurnable, and the Kangaroo will die if
	 * they collides.
	 */
	@Override
	public boolean isKillable() {
		if (inShell) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Will move the Turtle. If the turtle is in its shell, the Turtle will stay
	 * in its place.
	 */
	@Override
	public void move() {
		if (!inShell) {
			super.move();
		}
	}

}
