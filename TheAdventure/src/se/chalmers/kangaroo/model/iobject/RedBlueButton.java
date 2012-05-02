package se.chalmers.kangaroo.model.iobject;
import se.chalmers.kangaroo.constants.Constants;
import se.chalmers.kangaroo.model.GameMap;
import se.chalmers.kangaroo.model.InteractiveObject;
import se.chalmers.kangaroo.model.InteractiveTile;

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
public class RedBlueButton implements InteractiveObject {
	private boolean isRed;
	private GameMap gameMap;

	
	public RedBlueButton(boolean isRed, GameMap gameMap){
		this.isRed = isRed;
		this.gameMap = gameMap;
	}

	@Override
	public boolean isCollidable(int a) {
		// Right now, 88 is the tile-id for the red interactive tile
		if (a == Constants.TILE_ITILE_RED) {
			return isRed;
		} else if (a == Constants.TILE_ITILE_BLUE) {
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
				if(Constants.INTERACTIVE_TILES_REDBLUE.contains(" "+gameMap.getTile(x, y).getId()+" " )){
					((InteractiveTile)gameMap.getTile(x, y)).onTrigger();
				}
			}
		}
	}
	
	@Override
	public int getChangedId(int currentId){
		if(currentId % 2 == 0){
			return currentId-1;
		}else{
			return currentId+1;
		}
	}

}
