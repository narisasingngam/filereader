package filereader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * The class that implements Runnable and read file by StringBuilder.
 * @author Narisa Singngam
 */
public class AppendStringBuilder implements Runnable{
	private StringBuilder b = new StringBuilder();
	
	/**
	 * Run this method to read file by StringBuilder 
	 * @throws IOException.
	 */
	@Override
	public void run() {
		InputStream in = null;
		try{
			in = new FileInputStream("src/filereader/Alice-in-Wonderland.txt");
			InputStreamReader read = new InputStreamReader(in);
			int c;
			while((c = read.read())>0){
				b.append((char) c );
			
			}
			if(read != null)try{
				read.close();
			}catch(IOException ex){	}
		
		}catch(IOException ex){}
		
	}
	
	public String toString(){
		return String.format("Read %d chars in",b.length());
	}
}
