package se.chalmers.kangaroo.model;

/**
 * 
 * InteractiveObject is an object that will interact with the level in some way
 * and make it more dynamic. If Kangaroo trigger the interactive object, an
 * action will occur.
 * 
 * @author pavlov
 * 
 */
public interface InteractiveObject {

	/**
	 * Returns if the InteractiveTile is collidable or not with the input String
	 */
	public boolean isCollidable(int a);

	/**
	 * A method that will be called when Kangaroo collides with an interactive
	 * object.
	 */
	public void onCollision();

	/**
	 * This method will be called to change the current Id to what it will have
	 * after calling onTrigger()-method.
	 * 
	 * @param currentId
	 *            Is the currently used Id
	 * @return Returns the new Id that will be used
	 */
	public int getChangedId(int currentId);
	
	public Position getPosition();
}
