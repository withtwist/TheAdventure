package se.chalmers.kangaroo.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This is a class for representing a map. It consists of a matrix of gametiles.
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
	 * Creates a new empty GameMap.
	 */
	public GameMap(String level) {
		super();
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
	
	/**
	 * A method for reading a tmx-file to a matrix of IDs. It is important that
	 * the layer in the .tmx is called "tiles" and that it is not compressed or
	 * encoded.
	 * 
	 * @param fileName
	 *            , the filename to the map
	 * @return null if unsuccessful, otherwise a matrix of Strings where each
	 *         String is an id.
	 */
	private static String[][] readFileToMap(String fileName) {
		String[][] tileId = null;
		try {
			InputStream in = new FileInputStream(fileName);
			Scanner sc = new Scanner(in);

			while (sc.hasNextLine()) {
				String tmp = sc.nextLine();
				if (tmp.contains("name=\"tiles\"")) {
					String[] split = tmp.split("\"");
					int width = Integer.parseInt(split[3]);
					int height = Integer.parseInt(split[5]);
					tileId = new String[width][height];
					sc.nextLine(); // Jump over the <data> line
					for (int i = 0; i < height; i++) {
						for (int j = 0; j < width; j++) {
							String tiles = sc.nextLine().substring(14);
							tiles = tiles.substring(0, tiles.length() - 3);
							tileId[j][i] = tiles;
						}
					}
				}
			}
			sc.close();
			in.close();

		} catch (IOException e) {
			System.out.println("Wrong filename!");
		}
		return tileId;
	}
}
