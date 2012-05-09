package se.chalmers.kangaroo.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import se.chalmers.kangaroo.model.creatures.Creature;
import se.chalmers.kangaroo.model.creatures.TurtleCreature;
import se.chalmers.kangaroo.model.utils.Direction;

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
	private boolean inShell;

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
		this.inShell = turtle.isKillable();

	}

	@Override
	public void drawSprite(Graphics g, int x, int y) {
		if(turtle.isKillable()){
			if(inShell){
				currentSprite = (turtle.getDirection() == Direction.DIRECTION_WEST) ? 0 : 6;
				tick = 0; 
				inShell = !inShell;
			}
			if(tick == 10){
				currentSprite++;
				tick = 0;
				if(currentSprite % 3 == 0)
					currentSprite -= 3;
			}
			tick++;	
			
		}else{
			if(!inShell){
				currentSprite = (turtle.getDirection() == Direction.DIRECTION_WEST) ? 4 : 10;
				tick = 0;
				inShell = !inShell;
			}
			if(tick == 10){
				currentSprite++;
			}
			tick++;
		}
	}

	/**
	 * Returns the string showing the current animationstate of this creature.
	 */
	@Override
	public String toString() {
		return "TurtleAnimation: " + tick + " " + currentSprite;
	}
}
