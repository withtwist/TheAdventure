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
	 * @param s, the id of the tile
	 * @return the tile created
	 */
	public Tile createTile(String s) {
		if (INTERACTIVE_TILES.contains("" + s)) {
			return null; // <-interactivetile TODO
		} else {
			return new Tile(s);
		}
	}
	/**
	 * Creates different items depending on the ID.
	 * @param s, the id of the item
	 * @return the item created
	 */
	public Item createItem(String s){
		switch(s){
		case "1":
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
	 * @param s, the id of the creature
	 * @return the creature created
	 */
	public Creature createCreature(String s){
		return null;
	}
}
