package filereader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class FileTasks {
	
	public static String readFile(String filename){
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
		
		} catch (FileNotFoundException fex){
			System.out.println("file not found"+filename);
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		return b.toString();
	}
	
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
		} catch (FileNotFoundException fex){
			System.out.println("file not found"+filename);
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		return result;
	}
	
	public static void main(String[] args) {
		Stopwatch sw = new Stopwatch();
		sw.start();
		String alice = readFile("src/filereader/Alice-in-Wonderland.txt");
		sw.stop();
		System.out.printf("Read %d chars in %.6f sec.\n",alice.length(),sw.getElapsed());
		
		sw.start();
		String alice2 = readFile2("src/filereader/Alice-in-Wonderland.txt");
		sw.stop();
		System.out.printf("Read %d chars in %.6f sec.\n",alice2.length(),sw.getElapsed());
		
		sw.start();
		String alice3 = readFile3("src/filereader/Alice-in-Wonderland.txt");
		sw.stop();
		System.out.printf("Read %d chars in %.6f sec.\n",alice3.length(),sw.getElapsed());
		
	}

}
