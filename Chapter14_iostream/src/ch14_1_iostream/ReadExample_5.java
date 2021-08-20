package ch14_1_iostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReadExample_5 {
	public static void main(String[] args) throws FileNotFoundException{
		
		String path = "C:\\Temp\\test7.txt";
		
		Reader rd = new FileReader(path);
		
		while(true) {
			
		}
	}
}
