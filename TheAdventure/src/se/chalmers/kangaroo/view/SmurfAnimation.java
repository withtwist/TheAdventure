package se.chalmers.kangaroo.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import se.chalmers.kangaroo.model.creatures.Creature;
import se.chalmers.kangaroo.model.creatures.SmurfCreature;
import se.chalmers.kangaroo.model.utils.Direction;

/**
 * Represents the animation for a smurfcreature.
 * @author simonal
 *
 */
public class SmurfAnimation implements Animation {
	/* Different sheets for different directions */
	private Image leftSheet;
	private Image rightSheet;
	
	private int tick;
	private int currentSprite;
	
	private int width;
	private int height;
	
	private SmurfCreature sc;
	/**
	 * The default constructor, taking a Creature as parameter.
	 * @param sc
	 */
	public SmurfAnimation(Creature sc) {
		if(sc instanceof SmurfCreature) {
			this.sc = (SmurfCreature)sc;
		}
		leftSheet = Toolkit.getDefaultToolkit().getImage("resources/gfx/sheets/smurf_32x32_left.png");
		rightSheet = Toolkit.getDefaultToolkit().getImage("resources/gfx/sheets/smurf_32x32_right.png");
		this.width = 32;
		this.height = 32;
	}
	/**
	 * Draws a part of the sheet, updates with a new once per 10 updates.
	 */
	@Override
	public void drawSprite(Graphics g, int x, int y) {
		if(tick == 10) {
			tick = 0;
			currentSprite++;
			currentSprite = currentSprite % 3;
		}
		
		if (sc.getDirection() == Direction.DIRECTION_EAST) {
			g.drawImage(rightSheet, x, y, x+width, y+height, currentSprite*32, 0, currentSprite*32+width, height, null, null);
		}
		if (sc.getDirection() == Direction.DIRECTION_WEST) {
			g.drawImage(leftSheet, x, y, x+width, y+height, currentSprite*32, 0, currentSprite*32+width, height, null, null);
		}
		tick++;
		
	}

}
