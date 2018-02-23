package filereader;
/**
 * The class that will compute and print the elapsed time for any task, 
 * without any duplicate code.
 * @author Narisa Singngam
 */
public class TaskTimer {

	private static Stopwatch watch = new Stopwatch();
	/**
	 * measure the elapsed time
	 * @param time 
	 */
	public static void runTime(Runnable time){
		watch.start();
		time.run();
		watch.stop();
		System.out.printf("%s sec %.6f\n",time.toString(),watch.getElapsed());
	
	}
	

}
