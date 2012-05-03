package se.chalmers.kangaroo.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * This is a class that manages the highscore in a file.
 * 
 * @author alburgh
 * 
 */
public class Highscore {
	private static Highscore highscore;
	private static final String FILE_NAME = "resources/highscore.txt";

	private Highscore() {

	}

	/**
	 * Returns the only instance of this class.
	 */
	public static synchronized Highscore getInstance() {
		if (highscore == null)
			highscore = new Highscore();
		return highscore;
	}

	/**
	 * When a level is finished this should be called. Will automatically add
	 * the player to the highscore if the time is low enough.
	 * 
	 * @param playerName
	 *            , the name appearing on the highscore
	 * @param level
	 *            , the number of the level
	 * @param time
	 *            , the time in millis
	 */
	public void setHighscore(String playerName, int level, int time) {
		int[] times = getTimes(level);
		String[] names = getNames(level);

		if (times[4] > time) {
			times[4] = time;
			names[4] = playerName;
		}
		/*
		 * Since it already should be sorted I only need to make one bubbleSort
		 * move
		 */
		for (int i = times.length - 1; i > 0; i--) {
			if (times[i] < times[i - 1]) {
				int tmpTime = times[i];
				times[i] = times[i - 1];
				times[i - 1] = tmpTime;

				String tmpName = names[i];
				names[i] = names[i - 1];
				names[i - 1] = tmpName;
			}
		}
		// TODO: Replace the lines 6*level+1 -> 6*level+6 with
		// names[i]+" "+times[i]
	}

	/**
	 * Returns a string array consisting of the player names in order. If the
	 * file can't be found, an empty array will be returned.
	 * 
	 * @param level
	 *            , the number of the level
	 * @return all the names.
	 */
	public String[] getNames(int level) {
		String[] names = new String[5];
		try {
			InputStream in = new FileInputStream(FILE_NAME);
			Scanner sc = new Scanner(in);
			while (!sc.nextLine().equals("level" + level)) {
				// Loop through all the other rows
			}
			for (int i = 0; i < names.length; i++) {
				names[i] = sc.next();
				sc.next(); // Will skip the time
			}
		} catch (FileNotFoundException e) {
			System.out.println("Could't find the specific file.");
		}
		return names;
	}

	/**
	 * Returns a int array consisting of the player times in order. Will return
	 * an empty array if the file is not found.
	 * 
	 * @param level
	 *            , the number of the level
	 * @return all the times
	 */
	public int[] getTimes(int level) {
		int[] times = new int[5];
		try {
			InputStream in = new FileInputStream(FILE_NAME);
			Scanner sc = new Scanner(in);
			while (!sc.nextLine().equals("level" + level)) {
				// Loop through all the other rows
			}
			for (int i = 0; i < times.length; i++) {
				sc.next(); // Will skip the names
				times[i] = Integer.parseInt(sc.next());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Could't find the specific file.");
		} catch (NumberFormatException e) {
			System.out.println("The times are not numbers.");
		}
		return times;
	}
}
