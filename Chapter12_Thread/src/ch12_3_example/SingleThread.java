package ch12_3_example;

import javax.swing.JOptionPane;

public class SingleThread {
	public static void main(String[] args) {
		
		// swing사용 윈도우 프로그램
	
		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println(10 - i);
					try {
						Thread.sleep(1 * 1000);
					} catch(Exception e) {}
				}
			}	
		});
		th.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은  " + input + " 입니다.");
		
	}
}
