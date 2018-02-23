package filereader;

import javax.management.timer.Timer;

public class Stopwatch {
	private final static double NANOSECOUND = 1.0E-9;
	private long startTime;
	private long stopTime;
	private boolean running;
	
	public void start(){
		 if(running) return ;
		 running = true;
		 startTime = System.nanoTime();
	}
	
	public void stop(){
		if(!running) return;
		stopTime = System.nanoTime();
		running = false;
	}
	
	public boolean isRunning(){
		
		return running;
	}
	
	public double getElapsed(){
		if(running) return (System.nanoTime()-startTime)*NANOSECOUND;
		else return (stopTime - startTime)*NANOSECOUND;
		
	}

}
