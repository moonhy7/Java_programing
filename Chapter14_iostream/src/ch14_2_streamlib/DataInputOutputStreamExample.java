package ch14_2_streamlib;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {
	public static void main(String[] args) {

		String path = "C:/Temp/primitive.db";

		try {
			FileOutputStream fos = new FileOutputStream(path);
			DataOutputStream dos = new DataOutputStream(fos);

			dos.writeUTF("ȫ�浿");
			dos.writeDouble(95.5);
			dos.writeInt(1);

			dos.writeUTF("���ڹ�");
			dos.writeDouble(90.3);
			dos.writeInt(2);

			dos.flush();
			dos.close();

			FileInputStream fis = new FileInputStream(path);
			DataInputStream dis = new DataInputStream(fis);

			for(int i=0; i<2; i++) {
				String name = dis.readUTF();
				double score = dis.readDouble();
				int order = dis.readInt();
				System.out.println(name + ":" + score + ":" + order);
			}
			dis.close();
		} catch(Exception ex) {

		}

	}
}
