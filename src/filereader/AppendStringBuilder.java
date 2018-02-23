package filereader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AppendStringBuilder implements Runnable{
	public static String readFile2(String filename){
		StringBuilder b = new StringBuilder();
		InputStream in = null;
		try{

			in = new FileInputStream(filename);
			InputStreamReader read = new InputStreamReader(in);
			int c;
			while((c = read.read())>0){
				b.append((char) c );
			}
			if(read != null)try{
				read.close();
			}catch(IOException ex){	}
		
		}catch(IOException ex){
		}
		return b.toString();
	}

	@Override
	public void run() {
		String read = readFile2("src/filereader/Alice-in-Wonderland.txt");	
		System.out.printf("Read %d chars in",read.length());
		
	}
}
