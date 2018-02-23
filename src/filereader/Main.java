package filereader;

public class Main {

	public static void main(String[] args) {
		
		TaskTimer.runTime(new AppendStringTask());
		TaskTimer.runTime(new AppendStringBuilder());
		TaskTimer.runTime(new AppendStringBufferReader());
	}
}
