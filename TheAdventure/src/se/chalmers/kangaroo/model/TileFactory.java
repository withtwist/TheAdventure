package se.chalmers.kangaroo.model;

import se.chalmers.kangaroo.constants.Constants;
import se.chalmers.kangaroo.model.creatures.BlackAndWhiteCreature;
import se.chalmers.kangaroo.model.creatures.BullCreature;
import se.chalmers.kangaroo.model.creatures.CrabCreature;
import se.chalmers.kangaroo.model.creatures.Creature;
import se.chalmers.kangaroo.model.creatures.SmurfCreature;
import se.chalmers.kangaroo.model.creatures.SumoCreature;
import se.chalmers.kangaroo.model.creatures.TurtleCreature;
import se.chalmers.kangaroo.model.iobject.InteractiveObject;
import se.chalmers.kangaroo.model.iobject.RedBlueButton;
import se.chalmers.kangaroo.model.kangaroo.DoubleJumpItem;
import se.chalmers.kangaroo.model.kangaroo.ImmortalItem;
import se.chalmers.kangaroo.model.kangaroo.Item;
import se.chalmers.kangaroo.model.kangaroo.StopTimeItem;
import se.chalmers.kangaroo.model.utils.Position;

/**
 * Creates tiles or interactiveTiles depending on ID.
 * 
 * @author alburgh
 * 
 */
public class TileFactory {
	/**
	 * Creates a simple factory.
	 */
	public TileFactory() {
		super();
		//Not needed
	}

	/**
	 * Creates Tiles (or interactiveTiles) based on ID.
	 * 
	 * @param i
	 *            , the id of the tile
	 * @param x, y the position of the tile
	 * @return the tile created
	 */
	public Tile createTile(int i, int x, int y) {
		if (Constants.INTERACTIVE_TILES.contains(" " + i + " ")) {
			return new InteractiveTile(i, x, y);
		} else if (Constants.ITEM_IDS.contains(" " + i + " ")
				|| Constants.IOBJECTS_IDS.contains(" " + i + " ")
				|| Constants.CREATURE_IDS.contains(" " + i + " ")) {
			return new Tile(0, x, y);
		} else {

			return new Tile(i, x, y);
		}
	}
}
