package ch14_2_streamlib;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class NonBufferVsBufferExample {
	public static void main(String[] args) {
		
		String orgFilePath1 = 
				NonBufferVsBufferExample.class.getResource("orgFile1.org").getPath();
		String tgtFilePath1 = "C:/Temp/tgtFile1.jpg";
		
		String orgFilePath2 = 
				NonBufferVsBufferExample.class.getResource("orgFile2.org").getPath();
		String tgtFilePath2 = "C:/Temp/tgtFile2.jpg";
		
		try {
			FileInputStream fis = new FileInputStream(orgFilePath1);
			FileOutputStream fos = new FileOutputStream(tgtFilePath1);

			FileInputStream fis2 = new FileInputStream(orgFilePath2);
			FileOutputStream fos2 = new FileOutputStream(tgtFilePath2);
			
			BufferedInputStream bis = new BufferedInputStream(fis2);
			BufferedOutputStream bos = new BufferedOutputStream(fos2);
			
			long nonBufferTime = copy(fis, fos);
			System.out.println("버퍼를 사용하지 않았을 때: \t" + nonBufferTime +"ns");
			
			long BufferTime = copy(fis, fos);
			System.out.println("버퍼를 사용했을 때: \t\t" + BufferTime +"ns");
			
			
		} catch(IOException ex) {}
	}
	
	static int data = -1;
	private static long copy(FileInputStream is, FileOutputStream os) throws IOException {
		long start = System.nanoTime();
		while(true) {
			data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		return (end - start);
	}
	
	
}
