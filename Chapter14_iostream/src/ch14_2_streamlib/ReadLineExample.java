package ch14_2_streamlib;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineExample {
	public static void main(String[] args) {
		String path = ReadLineExample.class.getResource("language.txt").getPath();
		
		try {
			Reader reader = new FileReader(path);
			BufferedReader br = new BufferedReader(reader);
			
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				System.out.println(data);
			}
			br.close();
		} catch(Exception ex) {
			
		}
	}
}

