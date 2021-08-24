package chatting_programming;

import java.io.IOException;

/**
 * 
 * @author bitcamp
 *
 * AppClient의 소켓을 이용하여
 * 서버의 수신 기능을 관리한다. 
 */
public class TcpClientHandler implements Runnable {

	@Override
	public void run() {
		try {
			// 서버로부터 메시지 수신
			String line = null;
			while(true) {
				line = AppClient.br.readLine();
				if(line != null) {
					System.out.println(line);
				}
			}
			
		} catch(IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if(AppClient.keyboard != null) {AppClient.keyboard.close();}
				if(AppClient.pw != null) {AppClient.pw.close();}
				if(AppClient.br != null) {AppClient.br.close();}
				if(AppClient.sSock != null) {AppClient.sSock.close();}				
				
			} catch(IOException ex) {ex.printStackTrace();}
		}
	}

}
