package se.chalmers.kangaroo.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import se.chalmers.kangaroo.model.creatures.Creature;
import se.chalmers.kangaroo.model.creatures.TurtleCreature;

/**
 * 
 * @author Arvid
 * 
 */
public class TurtleAnimation implements Animation {
	private TurtleCreature turtle;
	private int tick;
	private int currentSprite;
	private Image sheet;
	private int width;
	private int height;

	public TurtleAnimation(Creature c) {
		if (c instanceof TurtleCreature)
			this.turtle = (TurtleCreature) c;
		tick = 0;
		currentSprite = 0;
		// Fix the imagepath
		this.sheet = Toolkit.getDefaultToolkit().getImage(
				"resources/sheets/crab_256x32.png");
		this.width = 64;
		this.height = 32;

	}

	@Override
	public void drawSprite(Graphics g, int x, int y) {
		if (tick == 10) {
			tick = 0;
			currentSprite++;
			currentSprite = currentSprite % 4;
		}
		g.drawImage(sheet, x, y, x + width, y + height, currentSprite * 64, 0,
				currentSprite * 64 + width, height, null, null);
		tick++;
	}

	/**
	 * Returns the string showing the current animationstate of this creature.
	 */
	@Override
	public String toString() {
		return "TurtleAnimation: " + tick + " " + currentSprite;
	}
}
