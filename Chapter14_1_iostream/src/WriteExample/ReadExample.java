package WriteExample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws IOException {
		
		String path = "C:\\temp\\test3.db";
		byte[] buffer = new byte[100];
		
		InputStream is = new FileInputStream(path);
		
		while(true) {
			int readByteNum = is.read(buffer);
			if(readByteNum == -1) break;
		
			for(int i=0; i<readByteNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close();
	}
}
