package filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppendStringBufferReader implements Runnable{
	
	public static String readFile3(String filename){
		String result = "";
		FileReader reader;
		BufferedReader br ;
		
		try {
			reader = new FileReader(filename);
			br = new BufferedReader((reader));
			String line;
			while((line = br.readLine())!= null){
				result = result + line + '\n';
			}
			if(br != null)try{
				br.close();
			}catch(IOException ex){	}
		} catch (IOException e) {}
		return result;
	}

	@Override
	public void run() {
		String read = readFile3("src/filereader/Alice-in-Wonderland.txt");	
		System.out.printf("Read %d chars in",read.length());
		
	}

}
