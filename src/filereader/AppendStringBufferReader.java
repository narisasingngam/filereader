package filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * The class that implements Runnable and read file by StringBuilder.
 * @author Narisa Singngam
 */
public class AppendStringBufferReader implements Runnable{
	
	private String result = "";
	
	/**
	 * Run this method to read file by BufferedReader
	 * @throws IOException.
	 */
	@Override
	public void run() {
		
		FileReader reader;
		BufferedReader br ;
		
		try {
			reader = new FileReader("src/filereader/Alice-in-Wonderland.txt");
			br = new BufferedReader((reader));
			String line;
			while((line = br.readLine())!= null){
				result = result + line + '\n';
			}
			if(br != null)try{
				br.close();
			}catch(IOException ex){	}
		} catch (IOException e) {}
		
	}
		
	public String toString(){
		return String.format("Read %d chars in",result.length());
	}
		
	

}
