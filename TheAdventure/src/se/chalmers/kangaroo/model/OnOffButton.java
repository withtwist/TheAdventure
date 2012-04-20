package se.chalmers.kangaroo.model;

import se.chalmers.kangaroo.constants.*;

public class OnOffButton implements InteractiveObject {
	private GameMap gameMap;

	public OnOffButton(GameMap gameMap) {
		this.gameMap = gameMap;
	}

	@Override
	public boolean isCollidable(int a) {
		if (a == Constants.TILE_ITILE_ON) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void onCollision() {
		// TODO de fyra raderna under ska läggas in i GameModel för att slippa
		// upprepning av kod och istället återanvända det.
		int x = gameMap.getTileWidth();
		int y = gameMap.getTileHeight();
		for (int i = 0; i <= y; i++) {
			for (int j = 0; j <= x; j++) {
				if (gameMap.getTile(x, y).getId() == Constants.TILE_ITILE_ON
						|| gameMap.getTile(x, y).getId() == Constants.TILE_INVISIBLE) {
					((InteractiveTile) gameMap.getTile(x, y)).onTrigger();
				}
			}
		}

	}

	@Override
	public int getChangedId(int currentId) {
		if(currentId == Constants.TILE_ITILE_ON){
			return Constants.TILE_INVISIBLE;
		}else{
			return Constants.TILE_ITILE_ON;
		}
	}

}
