package se.chalmers.kangaroo.model.iobject;

import se.chalmers.kangaroo.constants.*;
import se.chalmers.kangaroo.model.GameMap;
import se.chalmers.kangaroo.model.InteractiveTile;
import se.chalmers.kangaroo.model.utils.Position;

public class OnOffButton implements InteractiveObject {
	private GameMap gameMap;
	private Position pos;
	private int id;

	public OnOffButton(Position p, int id, GameMap gameMap) {
		this.gameMap = gameMap;
		this.pos = p;
		this.id = id;
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
		if (currentId == Constants.TILE_ITILE_ON) {
			return Constants.TILE_INVISIBLE;
		} else {
			return Constants.TILE_ITILE_ON;
		}
	}

	@Override
	public Position getPosition() {
		return pos;
	}

	@Override
	public int getId() {
		return id;
	}
	
	@Override
	public void changeId(){
		id = id % 2 == 0 ? id-1 : id+1;
	}

}
