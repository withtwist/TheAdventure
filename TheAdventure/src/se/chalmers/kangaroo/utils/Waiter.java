package se.chalmers.kangaroo.utils;
import se.chalmers.kangaroo.constants.*;

public class Waiter {
	private long startTime;
	
	public Waiter(){
		startTime = System.nanoTime();
	}
	
	private double getElapsedTime(){
		return (System.nanoTime()-startTime)*Constants.NANO_TO_MILLI;
	}
	
	public void waitTime(int milliseconds){
		boolean isLess = true;
		while(isLess){
			if(getElapsedTime() >= (double) milliseconds){
				isLess = !isLess;
			}
		}
	}

}
