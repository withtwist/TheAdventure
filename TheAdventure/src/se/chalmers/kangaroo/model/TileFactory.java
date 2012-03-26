package se.chalmers.kangaroo.model;

/**
 * Creates tiles or interactiveTiles depending on ID.
 * 
 * @author alburgh
 * 
 */
public class TileFactory {
	private static String INTERACTIVE_TILES = "ABCDEFGH"; // TODO: CHANGE

	public TileFactory() {

	}

	/**
	 * Creates Tiles (or interactiveTiles) based on ID.
	 * 
	 * @param c, the id of the tile
	 * @return the tile created
	 */
	public Tile createTile(char c) {
		if (INTERACTIVE_TILES.contains("" + c)) {
			return null; // <-interactivetile TODO
		} else {
			return new Tile(c);
		}
	}
}
