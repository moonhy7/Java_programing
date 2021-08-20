package ch14_1_iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriterExample {
	public static void main(String[] args) throws FileNotFoundException {
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		String path = "C:/Temp/test1.db";
		
		OutputStream out = new FileOutputStream(path);
				
		
		
	}
}
