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
	 * This method is used when Kangaroo has triggered the InteractiveObject. It
	 * will call this method and an action will occur.
	 */
	public void onTrigger();

}
