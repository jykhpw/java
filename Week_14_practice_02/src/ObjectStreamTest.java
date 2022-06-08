import java.io.*;
import java.util.Date;

public class ObjectStreamTest {

	public static void main(String[] args) throws IOException {
		// 14 - p.27~28 ���� �����ϱ� (ObjectInputStream, ObjectOutputStream)
		ObjectInputStream in = null;
		ObjectOutputStream out = null;
		
		try {
			int c;
			out = new ObjectOutputStream(new FileOutputStream("./output/object.dat"));
			out.writeObject(new Date()); // ��ü�� ����ȭ�Ͽ��� ��
			
			out.flush();
			in = new ObjectInputStream(new FileInputStream("./output/object.dat"));
			Date d = (Date) in.readObject();
			System.out.println(d);
		} catch (ClassNotFoundException e) {
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}

	}

}
