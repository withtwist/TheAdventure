package se.chalmers.kangaroo.model;

/**
 * Creates tiles or interactiveTiles depending on ID.
 * @author alburgh
 *
 */
public class TileFactory {
	private static String INTERACTIVE_TILES = "ABCDEFGH";
	
	public TileFactory(){
		
	}
	
	public Tile createTile(char c){
		if( INTERACTIVE_TILES.contains("" + c) ){
			return null; // interactivetile
		}else{
			return new Tile(c);
		}
	}
}
