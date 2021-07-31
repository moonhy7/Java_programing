package Step03_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Buffered {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//		String s = bf.readLine();
		
		int n = Integer.parseInt(br.readLine());
			
		
		
//		for(int i=0;i<n;i++) {
//			int x = Integer.parseInt(bf.readLine());
//			int y = Integer.parseInt(bf.readLine());
//			System.out.println(x+y);
//		}
		
//		StringTokenizer st = new StringTokenizer(bf.readLine()," ");
////		int n = Integer.parseInt(st.nextToken());
//		while(st.hasMoreTokens()) {
//			for(int i=0;i<n;i++) {
//				int x = Integer.parseInt(st.nextToken());
//				int y = Integer.parseInt(st.nextToken());
//				
//				//  java.util.NoSuchElementException 에러
//					//	next~가 중복
//				System.out.println(x+y);
//			}
//		}
	}
}
