package ch14_1_iostream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public class WriterExample3 {
	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Temp\\test10.txt";
		
		String str = "KOREA";
		
		Writer wr = new FileWriter(path);
		
		wr.write(str);
		
		wr.close();
		
	}
}
