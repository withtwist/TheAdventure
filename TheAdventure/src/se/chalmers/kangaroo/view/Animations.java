package se.chalmers.kangaroo.view;

import org.newdawn.slick.Animation;
import org.newdawn.slick.SpriteSheet;

/**
 * A class for handling all the different animations.
 * @author twist3r
 *
 */
public class Animations {
	
	private Animation kangarooAnimation = new Animaiton();
	
	private Animation crabAnimation = new Animation();
	/**
	 * The constructor for animation initializes all the different animations used.
	 */
	public Animations() {
		SpriteSheet kangarooSheet = new SpriteSheet("data/crab_256x32.png",64,32);
		SpriteSheet crabSheet = new SpriteSheet("crab",64,32);
	
		kangarooAnimation.setAutoUpdate(false);
		crabAnimation.setAutoUpdate(false);

		for (int frame=0;frame<3;frame++) {
			kangarooAnimation.addFrame(kangarooSheet.getSprite(frame,0), 150);
			crabAnimation.addFrame(kangarooSheet.getSprite(frame, 0), 150);
		}
	}
	/**
	 * Returns the kangaroos animation.
	 * @return kangarooAnimation
	 */
	public Animation getKangarooAnimation() {
		return kangarooAnimation;
	}
	/**
	 * Returns the crabs animation.
	 * @return crabAnimation
	 */
	public Animation getCrabAnimation() {
		return crabAnimation;
	}
	
	

}
