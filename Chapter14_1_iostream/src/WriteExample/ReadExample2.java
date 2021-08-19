package WriteExample;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample2 {
	public static void main(String[] args) throws IOException {
		
		String path = "C:/temp/test8.txt";
		
		char[] buffer = new char[100];
		
		// Reader rd = new FileReader(path);
		
//		while(true) {
//			int readCharNum = rd.read(buffer);
//			System.out.println(readCharNum);
//			
//			if(readCharNum == -1) break;
//			
//			for(int i=0; i<readCharNum; i++) {
//				System.out.println(buffer[i]);
//			}
//		}
	}
}
