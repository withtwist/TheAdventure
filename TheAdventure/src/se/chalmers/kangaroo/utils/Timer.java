package se.chalmers.kangaroo.utils;

import se.chalmers.kangaroo.constants.*;

/**
 * A class used to keep track of the elapsed time in a game level.
 * 
 * @author pavlov
 * 
 */
public class Timer {
	private long startTime, endTime, pausStartTime, totalPausTime;

	/**
	 * An empty constructor.
	 */
	public Timer() {
	}

	public void start() {
		startTime = System.nanoTime();
	}

	public void stop() {
		endTime = System.nanoTime() - (startTime + totalPausTime);

	}

	public void pause() {
		pausStartTime = System.nanoTime();
	}

	public void unpause() {
		totalPausTime = totalPausTime + (System.nanoTime() - pausStartTime);
	}

	public double getTime() {
		// int tempNbr = (int) (getNanoTime()*Constants.NANO_TO_SECOND)*10;

		return ((int) (getNanoTime() * Constants.NANO_TO_SECOND * 100)) / 100.0;
	}

	public long getNanoTime() {
		return System.nanoTime() - (startTime + totalPausTime);
	}

	public double getResult() {
		return ((int) (endTime * Constants.NANO_TO_SECOND * 100)) / 100.0;
	}

	public String toString() {
		return "Your time is: " + getResult();
	}
}
