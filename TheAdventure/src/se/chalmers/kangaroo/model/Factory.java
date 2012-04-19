package se.chalmers.kangaroo.model;

/**
 * Creates tiles or interactiveTiles depending on ID.
 * 
 * @author alburgh
 * 
 */
public class Factory {
	private static String INTERACTIVE_TILES = "ABCDEFGH"; // TODO: CHANGE
	/**
	 * Creates a simple factory.
	 */
	public Factory() {
		super();
	}

	/**
	 * Creates Tiles (or interactiveTiles) based on ID.
	 * 
	 * @param i, the id of the tile
	 * @return the tile created
	 */
	public Tile createTile(int i) {
		if (INTERACTIVE_TILES.contains("" + i)) {
			return null; // <-interactivetile TODO
		} else {
			return new Tile(i);
		}
	}
	/**
	 * Creates different items depending on the ID.
	 * @param i, the id of the item
	 * @return the item created
	 */
	public Item createItem(int i){
		switch(i){
		case 101:
			return new DoubleJumpItem();
		default:
			return null;
		}
	}
	/**
	 * Creates different creatures depending on the ID.
	 * @param i, the id of the creature
	 * @return the creature created
	 */
	public Creature createCreature(int i, Position p){
		switch(i){
		case 81:
			return new CrabCreature(p, Direction.DIRECTION_WEST);
		default:
			return null;
		}
	}
	
	/**
	 * 
	 * @param i, the id of the creature
	 * @return the interactive object created
	 */
	public InteractiveObject createIObjects(int i, GameMap gm){
		switch(i){
		case 121:
			return new RedBlueButtonInteractiveObject(true, gm);
		default:
			return null;
		}
	}
}
