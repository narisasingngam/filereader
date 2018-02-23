package filereader;

import javax.management.timer.Timer;
/**
 * This class elapsed time between a start and stop time.
 * @author Narisa Singngam
 *
 */

public class Stopwatch {
	private final static double NANOSECOUND = 1.0E-9;
	private long startTime;
	private long stopTime;
	private boolean running;
	
	/**
	 * Reset the stopwatch and start if if stopwatch is not running. 
	 * If the stopwatch is already running then start does nothing.
	 */
	public void start(){
		 if(running) return ;
		 running = true;
		 startTime = System.nanoTime();
	}
	
	/**
	 * Stop the stopwatch. If the stopwatch is already stopped, 
	 * then stop does nothing.
	 */
	public void stop(){
		if(!running) return;
		stopTime = System.nanoTime();
		running = false;
	}
	
	/**
	 * 
	 * @return true if the stopwatch is running, false if stopwatch is stopped.
	 */
	public boolean isRunning(){
		return running;
	}
	
	public double getElapsed(){
		if(running) return (System.nanoTime()-startTime)*NANOSECOUND;
		else return (stopTime - startTime)*NANOSECOUND;
		
	}

}
