package WriteExample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriterExample2 {
	public static void main(String[] args) throws IOException {
		byte[] array = {10, 20, 30};
		
		String path = "C:/temp/test2.db";
		
		OutputStream out = new FileOutputStream(path);
				
		out.write(array);
		
		out.flush();
		out.close();
		
	}
}
