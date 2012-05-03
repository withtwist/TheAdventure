package se.chalmers.kangaroo.view;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;



/**
 * An interface for handling all the different animations.
 * @author simonal
 *
 */
public interface Animation {
	/**
	 * Draws the current frame of the sprite in the view.
	 * @param g
	 */
	public void drawSprite(Graphics2D g);
	
		

}
