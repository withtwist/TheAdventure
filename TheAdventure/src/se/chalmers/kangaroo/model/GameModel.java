package se.chalmers.kangaroo.model;


/**
 * A class to represent the model of a platform game.
 * 
 * @author arvidk
 * 
 */
public class GameModel {

	/*
	 * The kangaroo that the player controlls.
	 */
	private Kangaroo kangaroo;

	private Creature creature;
	/*
	 * The current level that the player are playing.
	 */
	private GameMap map;
	/*
	 * The amount of times the player have died.
	 */
	private int deathCount;
	/*
	 * Will keep track of how long the player have played.
	 */
	private int time;
	/*
	 * Will check if the game is running.
	 */
	private boolean isRunning = false;

	private GameMap gameMap;

	private Tile tile;

	private Position oldPos;

	/**
	 * A method to start the game.
	 */
	// public void start() {
	// isRunning = true;
	// while (isRunning) {
	// this.update();
	// }
	// }

	/**
	 * Will make it able to pause the game
	 */
	// public void pause() {
	// if (isRunning = true) {
	// isRunning = false;
	// } else {
	// this.start();
	// }
	// }

	/**
	 * A method to stop the game, and thereby quit it.
	 */
	// public void stop() {
	// isRunning = false;
	// }

	public GameModel() {
		gameMap = new GameMap("../maps/testmap.tmx");
		kangaroo = new Kangaroo(new Position(10, 186));
	}

	/**
	 * A method to update the game.
	 */
	public void update() {
		oldPos = kangaroo.getPosition();
//		checkCollition();
	}

	/**
	 * Checks if a polygon collides with a tile
	 */
	private void checkCollition() {

		if (kangaroo.getPolygon().getBounds2D()
				.intersects(creature.getPolygon().getBounds2D())) {
			if (creature.isKillable() && kangaroo.getVerticalSpeed() > 0) {
				creature.remove();
			} else {
				deathCount++;
				restartLevel();
			}
		}
		Position p = kangaroo.getPosition();
		int x = p.getX();
		int y = p.getY();
		
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 3; j++){
				tile = gameMap.getTile((x + i) / Constants.TILE_SIZE, (y + i) / Constants.TILE_SIZE);
				if (tile.isCollidable()
						&& kangaroo.getPolygon().getBounds2D()
								.intersects(tile.getPolygon().getBounds2D())) {
					if(!(oldPos.getX() < (x+i)*Constants.TILE_SIZE == p.getX() > (x+i)*32)){
						kangaroo.setVerticalSpeed = 0;
					}
					kangaroo.setPosition(oldPos);
				}
			}
		}
	}
	/**
	 * Restarts the level. Will be used when the kangaroo dies.
	 */
	private void restartLevel() {
		// TODO implement restartLevel
	}

	/**
	 * 
	 * @return the amount of times the player has died.
	 */
	public int getDeathCount() {
		return deathCount;
	}

	/**
	 * 
	 * @return the kangaroo
	 */
	public Kangaroo getKangaroo() {
		return kangaroo;
	}

	/**
	 * 
	 * @return the gameMap
	 */
	public GameMap getGameMap() {
		return gameMap;
	}

	/**
	 * 
	 * @return the time that has elapsed for the player.
	 */
	public int getTime() {
		return time;
	}

}
