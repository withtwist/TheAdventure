package se.chalmers.kangaroo.model;

import io.FileToMap;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a class for representing a map. It consists of a matrix of Tiles.
 * 
 * @author alburgh
 * 
 */
public class GameMap {

	/* The map represented by a matrix of tiles */
	private Tile[][] map;
	private List<InteractiveObject> iObjects = new ArrayList<InteractiveObject>();
	private List<Item> items = new ArrayList<Item>();
	private List<Creature> creatures = new ArrayList<Creature>();

	/**
	 * Creates a GameMap with the level name. 
	 * The level name should be the path to the file. 
	 * Creates all tiles along with items and creatures.
	 */
	public GameMap(String level) {
		super();
		String[][] tiles = FileToMap.readTmxFileToMap(level);
		String itemList = "QWERT"; //<-- FROM CONSTANTS TODO:
		String creatureList = "QWERT"; // -^
		map = new Tile[tiles.length][tiles[0].length];
		Factory tf = new Factory();
		for(int i = 0; i < map.length; i++)
			for(int j = 0; j < map[0].length; j++){
				map[i][j] = tf.createTile((tiles[i][j]));
				if( itemList.contains(tiles[i][j]) )
					items.add(tf.createItem(tiles[i][j]));
				if( creatureList.contains(tiles[i][j]) )
					creatures.add(tf.createCreature(tiles[i][j]));
			}
		
	}

	/**
	 * A getter for InteractiveObjects currently on the map.
	 * 
	 * @return the list of InteractiveObjects
	 */
	public List<InteractiveObject> getIObjects() {
		return iObjects;
	}

	/**
	 * A getter for the items currently on the map.
	 * 
	 * @return a list of the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/**
	 * A getter for the creatures currently on the map.
	 * 
	 * @return a list of creatures
	 */
	public List<Creature> getCreatures() {
		return creatures;
	}
	
}
