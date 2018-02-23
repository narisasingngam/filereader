package filereader;

public class TaskTimer {

	private static Stopwatch watch = new Stopwatch();
	
	public static void runTime(Runnable time){
		watch.start();
		time.run();
		watch.stop();
		System.out.printf("%s sec %.6f\n",time.toString(),watch.getElapsed());
	
	}
	

}
