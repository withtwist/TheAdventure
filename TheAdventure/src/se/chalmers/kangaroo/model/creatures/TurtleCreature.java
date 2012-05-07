package se.chalmers.kangaroo.model.creatures;

import java.awt.Polygon;

import se.chalmers.kangaroo.model.utils.Direction;
import se.chalmers.kangaroo.model.utils.Position;
import se.chalmers.kangaroo.utils.Waiter;

/**
 * An enemy in the form of a turtle. Will go into its shell at random times and
 * will then be impossible to kill.
 * 
 * @author arvidk
 * 
 */
public class TurtleCreature implements Creature {
	
	private static final int id = 111;
	private Position pos;
	private Direction direction;
	private int speed = 1;
	private boolean inShell = false;

	public TurtleCreature(Position spawnPos) {
		pos = spawnPos;
	}

	@Override
	public void updateCreature() {
		int i = (int) ((6) * Math.random() * 100);
		if (i == 5)
			changeState();
		if (direction == Direction.DIRECTION_WEST) {
			pos = new Position(pos.getX() - speed, pos.getY());
		} else {
			pos = new Position(pos.getX() + speed, pos.getY());
		}
	}

	/**
	 * A class that change the state of the turtle. The turtle will be in its
	 * shell for a random amount of time between 1 and 5 seconds.
	 */
	public void changeState() {
		this.goInShell();
		new Thread() {
			@Override
			public void run() {
				while (true)
					try {
						sleep((int) ((5) * Math.random() * 1000));
					} catch (InterruptedException e) {
					}

			};
		}.start();
		this.goOutOfShell();

	}

	/**
	 * A method to make the turtle go into its shell.
	 */
	private void goInShell() {
		inShell = true;
	}

	/**
	 * A method to make the turtle go out of its shell.
	 */
	private void goOutOfShell() {
		inShell = false;
	}

	/**
	 * Will change if the Turtle is killable or not. If the Turtle is in its
	 * shell, the creature shall be invurnable, and the Kangaroo will die if
	 * they collides.
	 */
	@Override
	public boolean isKillable() {
		return !inShell;
	}

	/**
	 * Will move the Turtle. If the turtle is in its shell, the Turtle will stay
	 * in its place.
	 */
	@Override
	public void move() {
	
	}

	@Override
	public Polygon getPolygon() {
		int xs[] = { pos.getX() + 0, pos.getX() + 14, pos.getX() + 14,
				pos.getX() + 20, pos.getX() + 20, pos.getX() + 44,
				pos.getX() + 44, pos.getX() + 50, pos.getX() + 50,
				pos.getX() + 64, pos.getX() + 64, pos.getX() + 54,
				pos.getX() + 54, pos.getX() + 10, pos.getX() + 10,
				pos.getX() + 0 };
		int ys[] = { pos.getY() + 2, pos.getY() + 2, pos.getY() + 0,
				pos.getY() + 0, pos.getY() + 6, pos.getY() + 6, pos.getY() + 0,
				pos.getY() + 0, pos.getY() + 2, pos.getY() + 2,
				pos.getY() + 16, pos.getY() + 16, pos.getY() + 32,
				pos.getY() + 32, pos.getY() + 16, pos.getY() + 16 };
		return new Polygon(xs, ys, 16);

	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public Position getPosition() {
		return pos;
	}

	@Override
	public void changeDirection() {
		if (direction == Direction.DIRECTION_WEST) {
			direction = Direction.DIRECTION_EAST;
		} else {
			direction = Direction.DIRECTION_WEST;
		}

	}
	

}
