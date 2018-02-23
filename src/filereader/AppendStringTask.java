package filereader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AppendStringTask implements Runnable{
	
	public String readFile(String filename){
		String data = "";
		InputStream in = null;
		
		try {
		
			in = new FileInputStream(filename);
			InputStreamReader reader = new InputStreamReader(in); 
			int c;
			while(true){
				c = reader.read();
				if(c<0) break;
				data = data + (char)c;
			}
		
		} catch (FileNotFoundException fex){
			System.out.println("file not found"+filename);
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		//close file
		if(in != null)try{
			in.close();
		}catch(IOException ex){	}
		return data;

	}
	

	@Override
	public void run() {
		String read = readFile("src/filereader/Alice-in-Wonderland.txt");	
		System.out.printf("Read %d chars in",read.length());
	}
	
	
	
	

}
