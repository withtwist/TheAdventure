package se.chalmers.kangaroo.model;
import se.chalmers.kangaroo.constants.*;

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
		if (a == Constants.TILE_IOBJECT_RED) {
			return isRed;
		} else if (a == Constants.TILE_IOBJECT_BLUE) {
			return !isRed;
		} else {
			return false;
		}
	}
	
	@Override
	public void onCollision(){
		int x = gameMap.getTileWidth();
		int y = gameMap.getTileHeight();
		for(int i = 0; i <= y; i++){
			for(int j = 0; j <= x; j++){
				if(gameMap.getTile(x, y).getId() >= Constants.TILE_IOBJECT_BLUE || gameMap.getTile(x, y).getId() <= Constants.TILE_IOBJECT_RED+1){
					((InteractiveTile) gameMap.getTile(x, y)).onTrigger();
					if(gameMap.getTile(x, y).getId() >= Constants.TILE_IOBJECT_RED){
						
					}
				}
			}
		}
	}

}
