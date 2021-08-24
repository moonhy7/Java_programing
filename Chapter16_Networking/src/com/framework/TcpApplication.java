package com.framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * ���������� ������ �о�� �ʱ�ȭ
 * @author ������
 *
 */

public abstract class TcpApplication {
	/*
	 * ���ø����̼ǿ� �ʿ��� �ʵ� ����
	 */
	public static String IP;
	public static int PORT;
	public static String CONFIG = "config/applicationcontext.ini";
	
	/*
	 * ���ø����̼� �ʱ�ȭ
	 */
	public void init() {
		// ���������ͷκ��� �ʿ��� �׸��� ����
		Properties settings = new Properties();
	
		try {
			settings.load(new FileInputStream(CONFIG));
			IP = settings.getProperty("IP");
			PORT = Integer.parseInt(settings.getProperty("PORT"));
			 
			System.out.println("IPAddress : " + IP);
			System.out.println("PORT : " + PORT);
			
			System.out.println(TcpApplication.timeStamp());
			
 		} catch(IOException e) {
			System.out.println("��������(applicationcontext.ini)�� ã�� �� �����ϴ�.");
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
 		}
	}
	

	/*
	 * ���� Ŭ�������� �������̵� �� �߻�޼ҵ�
	 */
	
	public abstract void start();
	
	/*
	 * ����ð��� �������ִ� �޼ҵ�
	 * ��ȯŸ��: String
	 */
	
	public static String timeStamp() {
		SimpleDateFormat format = new SimpleDateFormat("[hh:mm:ss]");
		return format.format(new Date());
	}
	
	
}
