package ch14_1_iostream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public class WriterExample4 {
	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Temp\\test9.txt";
		
		char[] array = {'A', 'B', 'C', 'D', 'E'};
		
		Writer wr = new FileWriter(path);
		
		wr.write(array, 1, 3);
		
		
	}
}
