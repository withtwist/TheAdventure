package se.chalmers.kangaroo.model;

/**
 * 
 * A class for the interactive object Red/Blue-button. If the outer part of the
 * button is red, all red tiles will be visible and collidable, while all blue
 * tiles are not visible and not collidable. If Kangaroo collides with the
 * button, it will become blue and all the blue tiles will be visible and
 * collidable instead.
 * 
 * @author pavlov
 * 
 */
public class RedBlueButtonInteractiveObject implements InteractiveObject {
	private boolean isRed;
	private GameMap gameMap;
	
	public RedBlueButtonInteractiveObject(boolean isRed, GameMap gameMap){
		this.isRed = isRed;
		this.gameMap = gameMap;
	}

	@Override
	public boolean isCollidable(int a) {
		// Right now, 88 is the tile-id for the red interactive tile
		if (a == 88) {
			return isRed;
		} else if (a == 89) {
			return !isRed;
		} else {
			return false;
		}
	}
	
	public void onCollision(){
		for(int i = gameMap.getTileHeight(); )
	}

}
