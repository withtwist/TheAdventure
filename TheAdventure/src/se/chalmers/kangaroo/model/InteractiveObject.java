package se.chalmers.kangaroo.model;

/**
 * 
 * InteractiveObject is an object that will interact with the level in some way
 * and make it more dynamic. If Kangaroo makes an InteractiveObject active, and
 * action will occur.
 * 
 * @author pavlov
 * 
 */
public interface InteractiveObject {

	/**
	 * Returns if the InteractiveTile is collideable or not with the input String
	 */
	public boolean isCollideable(String a);

}
