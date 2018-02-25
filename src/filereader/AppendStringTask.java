package filereader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * The class that implements Runnable and read file by String
 * @author Narisa Singngam
 */

public class AppendStringTask implements Runnable{
	
	
	private String data = "";
	
	/**
	 * Run this method to read file by String 
	 * @throws FileNotFoundException if it can't read file.
	 */
	@Override
	public void run() {
		
		InputStream in = null;
		
		try {
		
			in = new FileInputStream("src/filereader/Alice-in-Wonderland.txt");
			InputStreamReader reader = new InputStreamReader(in); 
			int c;
			while(true){
				c = reader.read();
				if(c<0) break;
				data = data + (char)c;
			}
		
		} catch (FileNotFoundException fex){
			System.out.println("file not found");
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		//close file
		if(in != null)try{
			in.close();
		}catch(IOException ex){	}
		

	}
	
	@Override
	public String toString(){
		return String.format("Read %d chars in",data.length());
		
	}
	
	
	
	

}
