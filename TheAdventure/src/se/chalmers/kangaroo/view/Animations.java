package se.chalmers.kangaroo.view;

import org.newdawn.slick.Animation;
import org.newdawn.slick.SpriteSheet;

/**
 * A class for handling all the different animations.
 * @author twist3r
 *
 */
public class Animations {
	
	private Animation kangarooAnimation = new Animation();
	
	private Animation crabAnimation = new Animation();
	
	private SpriteSheet kangarooSheet;
	
	private SpriteSheet crabSheet;
	/**
	 * The constructor for animation initializes all the different animations used.
	 */
	public Animations() {
		try {
			kangarooSheet = new SpriteSheet("data/crab_256x32.png",64,32);
			crabSheet = new SpriteSheet("crab",64,32);
		} catch (Exception e) {
			System.out.println("A"+e+"when loading sheets for animation");
		}
		System.out.println("Exception when loading sheets for animation");
		kangarooAnimation.setAutoUpdate(false);
		crabAnimation.setAutoUpdate(true);

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
