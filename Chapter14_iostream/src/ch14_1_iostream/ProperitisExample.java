package ch14_1_iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Properties;

public class ProperitisExample {
	public static void main(String[] args){
	/* [Properties] �ܺμ������� �о����
	 * 
	 * - '=' �Ǵ� ':' �� ����� �����̾�� �Ѵ�.
	 * - �ּ������� ù ��° ���ڰ� '#' �̾�� �Ѵ�.
	 * - ��� '/'
	 */
		String path = "src/input.txt";
		
		Properties settings = new Properties();
		
		try {
			settings.load(new FileInputStream(path));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
			System.exit(0);
		}
		
		String eName = settings.getProperty("eng_name");
		System.out.println(eName);
		
		
		String kName = settings.getProperty("kor_name");
		try {
			kName = new String(kName.getBytes("8859_1"), "EUC-KR");
		} catch (UnsupportedEncodingException e) {}
		System.out.println(kName);
		
		String[] data = settings.getProperty("data").split(",");
		System.out.println(Arrays.toString(data));
		
		settings.list(System.out);
		
		
	}
}
