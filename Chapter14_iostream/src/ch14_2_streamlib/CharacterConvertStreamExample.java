package ch14_2_streamlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {
	
	public static String path = "C:/Temp/doc1.txt";
	
	public static void main(String[] args) {

		try {
			write("문자 변환 스트립을 사용합니다.");
			String data = read();
			System.out.println(data);
		} catch(Exception ex) {}
	}

	private static String read() throws IOException {
		FileInputStream fis = new FileInputStream(path);
		Reader rd = new InputStreamReader(fis);

		char[] buffer = new char[100];
		int readCharNum = rd.read(buffer);
		rd.close();
		String data = new String(buffer, 0, readCharNum);

		return data;
	}

	private static void write(String str) throws IOException {
		FileOutputStream fos = new FileOutputStream(path);
		Writer wt = new OutputStreamWriter(fos);
		
		wt.write(str);
		wt.flush();
		wt.close();
	}
}
