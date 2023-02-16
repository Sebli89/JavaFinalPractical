package javaPractical;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDictionary {

	public static void main(String[] args) throws IOException  {

		doesFileExist( "src\\javaPractical\\dictionary.txt");

	}

	public static void doesFileExist(String path) throws IOException {
		

		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		String line;
		if (f.exists()) {
			System.out.println("File exists");
		}
		
		while ((line = br.readLine()) != null) {
			System.out.println(line); 
			
			
		} 

	}

}