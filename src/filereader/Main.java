package filereader;

public class Main {

	public static void main(String[] args) {
		TaskTimer time = new TaskTimer();
		
		AppendStringTask read = new AppendStringTask();
		AppendStringBuilder read2 = new AppendStringBuilder();
		AppendStringBufferReader read3 = new AppendStringBufferReader();
		
		time.runTime(read);
		time.runTime(read2);
		time.runTime(read3);
	}
}
