package se.chalmers.kangaroo.model;

/**
 * Creates tiles or interactiveTiles depending on ID.
 * 
 * @author alburgh
 * 
 */
public class Factory {
	private static String INTERACTIVE_TILES = "ABCDEFGH"; // TODO: CHANGE

	public Factory() {

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
		case 1:
			//nothing
		break;
		default:
		//somthing		
		}
		//TODO: When items are made.
		return null;
	}
	/**
	 * Creates different creatures depending on the ID.
	 * @param i, the id of the creature
	 * @return the creature created
	 */
	public Creature createCreature(int i){
		return null;
	}
	
	/**
	 * 
	 * @param i, the id of the creature
	 * @return the interactive object created
	 */
	public InteractiveObject createIObjects(int i){
		return null;
	}
}
