package ch14_2_streamlib;

import java.text.SimpleDateFormat;

public class ObjectStreamExample {
	public static void main(String[] args) {
		BoardUtil util = new BoardUtil();
		
		//리스트 직렬화
		util.write();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for(Board b : util.read()) {
			System.out.printf("%d\t%s\t%s\t%s\t%s\n", 
					b.getBno(), b.getTitle(), b.getContent(),
					b.getWriter(), sdf.format(b.getDate()));
						
		}
	}
}
